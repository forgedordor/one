package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FullscreenGalleryItemView extends LinearLayout {
    public FullscreenGalleryItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new View.OnClickListener() { // from class: cyzn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i2, i2);
    }
}
