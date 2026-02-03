package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import com.google.android.apps.messaging.R;
import com.google.android.material.radiobutton.MaterialRadioButton;
import defpackage.eftq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class RadioButtonItem extends Item implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    private boolean b;

    public RadioButtonItem() {
        this.b = false;
    }

    @Override // com.google.android.setupdesign.items.Item
    protected final int f() {
        return R.layout.sud_items_radio_button;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.b = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!this.b) {
            this.b = true;
            ((MaterialRadioButton) view.findViewById(R.id.sud_items_radio_button)).setChecked(this.b);
        }
    }

    public RadioButtonItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.q);
        this.b = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
