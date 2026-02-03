package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.cwot;
import defpackage.cwox;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RichCardContentContainer extends cwot {
    public cwox a;

    public RichCardContentContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
    }
}
