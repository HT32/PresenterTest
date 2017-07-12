package com.example.ht32.presentertest;

import android.support.annotation.NonNull;

public class PlusOneFragmentPresenter implements PlusOneContract.Presenter {

    @NonNull
    private final PlusOneContract.View mView;


    PlusOneFragmentPresenter(@NonNull PlusOneContract.View view) {
        mView = view;

        // Daggerを利用する場合は@Injectとするようなので、コンストラクタに書かないっぽい
        setupListeners();
    }

    private void setupListeners() {
        mView.setPresenter(this);
    }

    /**
     * @see PlusOneContract.Presenter
     */
    @Override
    public void showTitle(String title) {
        mView.setTitle(title);
    }
}
