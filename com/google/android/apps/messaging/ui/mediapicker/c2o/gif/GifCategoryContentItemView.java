package com.google.android.apps.messaging.ui.mediapicker.c2o.gif;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.cvjo;
import defpackage.czdc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GifCategoryContentItemView extends czdc {
    public cvjo a;

    public GifCategoryContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this.a.a(new View.OnClickListener() { // from class: czcr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }));
        setClipToOutline(true);
    }
}
