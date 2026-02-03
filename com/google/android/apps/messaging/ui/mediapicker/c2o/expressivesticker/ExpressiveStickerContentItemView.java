package com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.cvjo;
import defpackage.cyxp;
import defpackage.eifs;
import defpackage.eigp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ExpressiveStickerContentItemView extends cyxp {
    public cvjo a;
    public eigp b;

    public ExpressiveStickerContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView, android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        String str = "com/google/android/apps/messaging/ui/mediapicker/c2o/expressivesticker/ExpressiveStickerContentItemView";
        setOnClickListener(new eifs(this.b, str, "onFinishInflate", 30, "ExpressiveStickerContentItemView::onClick", this.a.a(this.o)));
    }
}
