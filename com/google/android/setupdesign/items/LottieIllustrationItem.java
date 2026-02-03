package com.google.android.setupdesign.items;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.eftq;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class LottieIllustrationItem extends Item {
    LottieIllustrationItem() {
    }

    @Override // com.google.android.setupdesign.items.Item
    protected final int f() {
        return R.layout.sud_lottie_illustration_item;
    }

    public LottieIllustrationItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eftq.l);
        typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }
}
