package com.example.ht32.presentertest;

interface PlusOneContract {

    interface View extends BaseView<Presenter> {
        void setTitle(String title);
    }

    interface Presenter extends BasePresenter {
        void showTitle(String title);
    }

}
