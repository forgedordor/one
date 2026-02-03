package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.eeuv;
import defpackage.yx;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class TabItem extends View {
    public final CharSequence a;
    public final Drawable b;
    public final int c;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        yx yxVarK = yx.k(context, attributeSet, eeuv.a);
        this.a = yxVarK.m(2);
        this.b = yxVarK.h(0);
        this.c = yxVarK.f(1, 0);
        yxVarK.o();
    }
}
