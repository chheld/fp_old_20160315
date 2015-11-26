package de.fischerprofil.fp.ui.edittextpreference;

import android.content.Context;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class EditTextPreferenceForPassword extends EditTextPreference {

    public EditTextPreferenceForPassword(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditTextPreferenceForPassword(Context context) {
        super(context);
        init();
    }

    @Override
    protected View onCreateView(ViewGroup parent) {
        updateSummary();
        return super.onCreateView(parent);
    }

    public void updateSummary()
    {
        String value = "";
        int variation = (this.getEditText().getInputType() & InputType.TYPE_MASK_VARIATION);
        Boolean isPassword = ((variation  == InputType.TYPE_NUMBER_VARIATION_PASSWORD)
                ||(variation  == InputType.TYPE_TEXT_VARIATION_PASSWORD)
                ||(variation  == InputType.TYPE_TEXT_VARIATION_WEB_PASSWORD));

        if (isPassword)
        {
            if (this.getText()!=null) {
                if (this.getText().length()!=0) value = "**********";
            }
        }
        else
        {
            value = this.getText();
        }
        this.setSummary(value);
    }

    private void init() {
        setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            @Override
            public boolean onPreferenceChange(Preference preference, Object newValue) {
                EditTextPreferenceForPassword pref = (EditTextPreferenceForPassword) preference;
                pref.updateSummary();
                return true;
            }
        });
    }
}