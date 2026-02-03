package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.google.android.apps.messaging.R;
import defpackage.eftq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class CheckBoxItem extends Item implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private boolean b;

    public CheckBoxItem() {
        this.b = false;
    }

    @Override // com.google.android.setupdesign.items.Item
    protected final int f() {
        return R.layout.sud_items_check_box;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b = !this.b;
        ((CheckBox) view.findViewById(R.id.sud_items_check_box)).setChecked(this.b);
    }

    public CheckBoxItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.c);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
