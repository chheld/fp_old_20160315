package de.fischerprofil.fp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import de.fischerprofil.fp.AppController;
import de.fischerprofil.fp.R;
import de.fischerprofil.fp.ui.adapter.OrderTabPagerAdapter;
import de.fischerprofil.fp.ui.fragments.AboutFragment;
import de.fischerprofil.fp.ui.fragments.HintFragment;
import de.fischerprofil.fp.ui.fragments.OrderDetailsFragment;

public class OrderDetailsActivity extends AppCompatActivity {

    private int mSearchRequestCounter = 0;
    private Toolbar mToolbar;
    private TabLayout tabLayout;
    private AppController mAppController;

    private final String VOLLEY_TAG = "VOLLEY_TAG_OrderDetailsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        mAppController = AppController.getInstance();

        setContentView(R.layout.activity_orderdetails);

        Intent intent = getIntent();

        //Auftrag auftrag = (Auftrag) intent.getParcelableExtra("auftrag");
        String anr = intent.getStringExtra("anr");

        Toolbar mToolbar = (Toolbar) findViewById(R.id.activity_orderdetails_toolbar);
        if (mToolbar != null) {
            setSupportActionBar(mToolbar);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setTitle("Auftrag " + anr);
            //getSupportActionBar().setSubtitle(a);
            //TODO:  in setupToolbar() auslagern;
        }

        setupTablayout();

        // ######################

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final OrderTabPagerAdapter adapter = new OrderTabPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        Bundle bundle = new Bundle();
        //bundle.putParcelable("auftrag",auftrag); // version 1
        bundle.putString("anr",anr); // version 2
        //bundle.putString("hint",auftrag.getObjectAsString());
        adapter.setArguments(bundle);

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void setupToolbar(){
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        if(mToolbar != null)
            setSupportActionBar(mToolbar);

        // Show menu icon
        final ActionBar ab = getSupportActionBar();
        //ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        //ab.setDisplayHomeAsUpEnabled(true);
    }

    private void setupTablayout(){

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        if(tabLayout == null) return;

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        tabLayout.addTab(tabLayout.newTab().setText("Übersicht"));
        tabLayout.addTab(tabLayout.newTab().setText("Details"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_orderdetails_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
/*
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
*/
        return super.onOptionsItemSelected(item);
    }

    private void showFragment(String key, @Nullable Bundle args) {

        Fragment fragment = null;
        switch (key) {

            case "hint":
                fragment = new HintFragment();
                break;

            case "about":
                fragment = new AboutFragment();
                break;

            case "details":
                fragment = new OrderDetailsFragment();
                fragment.setArguments(args);
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

}
