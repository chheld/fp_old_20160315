package de.fischerprofil.fp.ui;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.SearchRecentSuggestions;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;

import java.lang.reflect.Field;

import de.fischerprofil.fp.AppController;
import de.fischerprofil.fp.R;
import de.fischerprofil.fp.provider.OrderSuggestionProvider;
import de.fischerprofil.fp.ui.fragments.AboutFragment;
import de.fischerprofil.fp.ui.fragments.HintFragment;

public class ReferenceListActivity extends AppCompatActivity {

    private MenuItem searchItem;
    private SearchRecentSuggestions mSuggestions;
    private SearchView mSearchView;
    private TextView mHinweis;
    private AppController mAppController;

    private final String VOLLEY_TAG = "VOLLEY_TAG_ReferenceListActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_referencelist);

        mAppController = AppController.getInstance();

        mHinweis = (TextView) findViewById(R.id.tvHinweis);

        Toolbar toolbar = (Toolbar) findViewById(R.id.activity_references_toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            //getSupportActionBar().setSubtitle(null);
        }

        mSuggestions = new SearchRecentSuggestions(this, OrderSuggestionProvider.AUTHORITY, OrderSuggestionProvider.MODE);

        // Associate searchable configuration with the SearchView
        SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        mSearchView = new SearchView(getSupportActionBar().getThemedContext());
        mSearchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        mSearchView.setIconifiedByDefault(true);
        mSearchView.setImeOptions(EditorInfo.IME_ACTION_SEARCH); // Lupe anzeigen in der Tastatur
        //mSearchView.setSubmitButtonEnabled(true); //OK-Button anzeigen
        SearchView.SearchAutoComplete searchAutoComplete = (SearchView.SearchAutoComplete) mSearchView.findViewById(android.support.v7.appcompat.R.id.search_src_text);

        // Collapse the search menu when the user hits the back key
        searchAutoComplete.setOnFocusChangeListener(new View.OnFocusChangeListener() {

            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) showSearch(false);
            }
        });

        try {
            // This sets the cursor resource ID to 0 or @null which will make it visible on white background
            Field mCursorDrawableRes = TextView.class.getDeclaredField("mCursorDrawableRes");
            mCursorDrawableRes.setAccessible(true);
            mCursorDrawableRes.set(searchAutoComplete, 0);

        } catch (Exception e) {
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_references, menu);

        // Search Icon referenzieren
        searchItem = menu.findItem(R.id.itm_action_search);

        MenuItemCompat.setActionView(searchItem, mSearchView);
        MenuItemCompat.setShowAsAction(searchItem, MenuItemCompat.SHOW_AS_ACTION_ALWAYS | MenuItemCompat.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

         int id = item.getItemId();

        switch (id) {

            case R.id.action_settings:
                showSettings();
                return true;

            case R.id.itm_action_search:
                showSearch(true);
                return true;

            case R.id.action_clear_history:
                clearSuggestions();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onNewIntent(Intent intent) {

        super.onNewIntent(intent);

        if (intent.getAction()== "android.intent.action.SEARCH") {

            showSearch(false); //Suchfeld schliessen

            //Suchbegriff speichern in der Vorschlagsliste
            Bundle extras = intent.getExtras();
            String userQuery = String.valueOf(extras.get(SearchManager.USER_QUERY));
            String query = String.valueOf(extras.get(SearchManager.QUERY));
            mSuggestions.saveRecentQuery(query, "in Referenzen");

            Bundle args = new Bundle(); // Uebergabe-Parameter für Fragment erstellen
            args.putString("search", query);
            getSupportActionBar().setSubtitle("Suche  '" + query + "'");

            showFragment("list", args); // Fragment OrdersList anzeigen
        }
    }

    private void showSearch(boolean visible) {

        if (visible)
            MenuItemCompat.expandActionView(searchItem);
        else
            MenuItemCompat.collapseActionView(searchItem);
    }

    /**
     * Called when the hardware BACK button is pressed
     */
    @Override
    public void onBackPressed() {
        //showSearch(false);
        super.onBackPressed();
    }

    /**
     * Called when the hardware SEARCH button is pressed
     */
    @Override
    public boolean onSearchRequested() {
        super.onSearchRequested();
        showSearch(true);
        // dont show the built-in search dialog
        return false;
    }

    private void showFragment(String key, @Nullable Bundle args) {

        mHinweis.setVisibility(View.GONE);

        Fragment fragment = null;
        switch (key) {

            case "hint": // test
                fragment = new HintFragment();
                Bundle bundle = new Bundle();
                bundle.putString("hint","Hinweis");
                fragment.setArguments(bundle);
                break;

            case "about": // test
                fragment = new AboutFragment();
                break;

            case "list": // ok
                //fragment = new ContactListFragment();
                //fragment.setArguments(args);
                break;

            default:
                break;
        }
        if (fragment != null) {
            FragmentManager frgManager = getSupportFragmentManager();
            frgManager.beginTransaction().replace(R.id.fragment_container, fragment).commit();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        // This will tell to Volley to cancel all the pending requests
        mAppController.cancelPendingRequests(VOLLEY_TAG);
    }

    private void clearSuggestions() {

        mSuggestions.clearHistory();
    }

    private void showSettings(){
        Intent intent = new Intent(this, PreferencesActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
