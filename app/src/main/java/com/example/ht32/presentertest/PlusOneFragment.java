package com.example.ht32.presentertest;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class PlusOneFragment extends Fragment implements PlusOneContract.View {

    private TextView mTitle;
    private PlusOneContract.Presenter mPresenter;

    public static PlusOneFragment newInstance() {
        return new PlusOneFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new PlusOneFragmentPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(com.example.ht32.presentertest.R.layout.fragment_plus_one, container, false);
        mTitle = view.findViewById(com.example.ht32.presentertest.R.id.title);
        Button button = view.findViewById(com.example.ht32.presentertest.R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.showTitle("test");
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void setPresenter(PlusOneContract.Presenter presenter) {
        mPresenter = presenter;
    }

    @Override
    public void setTitle(String title) {
        mTitle.setText(title);
    }

}
