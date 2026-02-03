package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.efsj;
import defpackage.eftq;
import defpackage.eftt;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ExpandableSwitchItem extends SwitchItem implements CompoundButton.OnCheckedChangeListener, View.OnClickListener {
    public boolean b;

    public ExpandableSwitchItem() {
        this.b = false;
        new eftt(this);
    }

    @Override // com.google.android.setupdesign.items.SwitchItem, com.google.android.setupdesign.items.Item
    protected final int f() {
        return R.layout.sud_items_expandable_switch;
    }

    public final void g(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        b();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!efsj.r(view.getContext())) {
            g(!this.b);
            return;
        }
        if (view.getId() == R.id.sud_items_summary_container) {
            g(!this.b);
            TextView textView = (TextView) view.findViewById(R.id.sud_items_more_info);
            if (textView != null) {
                if (this.b) {
                    textView.setText(R.string.sud_less_info);
                } else {
                    textView.setText(R.string.sud_more_info);
                }
            }
        }
    }

    public ExpandableSwitchItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = false;
        new eftt(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.f);
        typedArrayObtainStyledAttributes.getText(0);
        typedArrayObtainStyledAttributes.getText(1);
        if (!efsj.r(context)) {
            typedArrayObtainStyledAttributes.getInt(7, 48);
        } else {
            b();
            typedArrayObtainStyledAttributes.getInt(7, 16);
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
