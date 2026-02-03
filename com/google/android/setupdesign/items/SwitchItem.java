package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import com.google.android.apps.messaging.R;
import com.google.android.material.materialswitch.MaterialSwitch;
import defpackage.efsj;
import defpackage.eftq;
import defpackage.efur;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class SwitchItem extends Item implements CompoundButton.OnCheckedChangeListener {
    public SwitchItem() {
    }

    @Override // com.google.android.setupdesign.items.Item
    protected int f() {
        return R.layout.sud_items_switch;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Context context = compoundButton.getContext();
        int i = efur.a;
        if (efsj.r(context) && (compoundButton instanceof MaterialSwitch)) {
            MaterialSwitch materialSwitch = (MaterialSwitch) compoundButton;
            if (z) {
                materialSwitch.j(compoundButton.getContext().getDrawable(R.drawable.sud_ic_switch_selector_expressive));
            } else {
                materialSwitch.j(null);
            }
        }
    }

    public SwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.t);
        typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }
}
