package com.google.android.apps.messaging.ui.search.resultsview;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.util.DisplayMetrics;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MediaGridLayoutManager extends GridLayoutManager {
    private final Context J;
    private final Rect K;

    public MediaGridLayoutManager(Context context, int i) {
        super(i);
        this.K = new Rect();
        this.J = context;
    }

    public final int bD() {
        int iAy;
        int iAB;
        DisplayMetrics displayMetrics = this.J.getResources().getDisplayMetrics();
        if (this.k == 1) {
            iAy = displayMetrics.widthPixels - aA();
            iAB = az();
        } else {
            iAy = displayMetrics.heightPixels - ay();
            iAB = aB();
        }
        return (iAy - iAB) / ((GridLayoutManager) this).b;
    }

    public final int bE(View view) {
        int iBD;
        int i;
        Rect rect = this.K;
        aK(view, rect);
        if (this.k == 1) {
            iBD = bD() - rect.left;
            i = rect.right;
        } else {
            iBD = bD() - rect.top;
            i = rect.bottom;
        }
        return iBD - i;
    }
}
