package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.eftq;
import defpackage.eftx;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class Item extends AbstractItem implements eftx {
    public CharSequence c;
    public boolean d;

    public Item() {
        this.d = true;
    }

    @Override // com.google.android.setupdesign.items.AbstractItem, defpackage.eftu
    public final int a() {
        return this.d ? 1 : 0;
    }

    protected int f() {
        return R.layout.sud_items_default;
    }

    public final void h(boolean z) {
        if (this.d == z) {
            return;
        }
        this.d = z;
        if (z) {
            e(0);
        } else {
            d(0);
        }
    }

    public Item(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = true;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.o);
        typedArrayObtainStyledAttributes.getBoolean(1, true);
        typedArrayObtainStyledAttributes.getDrawable(0);
        this.c = typedArrayObtainStyledAttributes.getText(4);
        typedArrayObtainStyledAttributes.getText(5);
        typedArrayObtainStyledAttributes.getText(6);
        typedArrayObtainStyledAttributes.getResourceId(2, f());
        this.d = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.getColor(8, 0);
        typedArrayObtainStyledAttributes.getInt(7, 16);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // defpackage.eftx
    public final void i() {
    }
}
