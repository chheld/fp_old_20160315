package de.fischerprofil.fp.ui.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import de.fischerprofil.fp.R;

public  class HintFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_hint, container, false);
        TextView tvHinweis = (TextView) view.findViewById(R.id.tvHinweis);

        if (getArguments() != null) {
            tvHinweis.setText(getArguments().getString("hint", ":-)"));
        }

        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setHasOptionsMenu(false);
    }
}