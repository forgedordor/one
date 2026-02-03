package com.google.android.setupdesign.items;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class NonActionableItem extends Item {
    public NonActionableItem() {
    }

    @Override // com.google.android.setupdesign.items.Item
    protected final int f() {
        return R.layout.sud_non_actionable_items_default;
    }

    public NonActionableItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
