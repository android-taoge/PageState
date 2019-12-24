package com.tang.pagestate.listener;

import androidx.annotation.IdRes;

public interface OnShowHideListener {
    void onShow(@IdRes int resId);

    void onHide(@IdRes int resId);
}
