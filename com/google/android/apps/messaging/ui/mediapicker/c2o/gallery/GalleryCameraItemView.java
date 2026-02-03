package com.google.android.apps.messaging.ui.mediapicker.c2o.gallery;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GalleryCameraItemView extends FrameLayout {
    public GalleryCameraItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(new View.OnClickListener() { // from class: cyzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }
}
