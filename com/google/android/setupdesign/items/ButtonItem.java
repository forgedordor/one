package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.eftq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ButtonItem extends AbstractItem implements View.OnClickListener {
    public ButtonItem() {
    }

    @Override // com.google.android.setupdesign.items.AbstractItem, defpackage.eftu
    public final int a() {
        return 0;
    }

    public ButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.b);
        typedArrayObtainStyledAttributes.getBoolean(2, true);
        typedArrayObtainStyledAttributes.getText(4);
        typedArrayObtainStyledAttributes.getResourceId(0, R.style.SudButtonItem);
        typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
