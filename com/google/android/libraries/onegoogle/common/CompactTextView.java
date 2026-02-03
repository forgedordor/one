package com.google.android.libraries.onegoogle.common;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ley;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CompactTextView extends AppCompatTextView {
    public CompactTextView(Context context) {
        super(context);
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            float lineWidth = 0.0f;
            for (int i3 = 0; i3 < lineCount; i3++) {
                if (layout.getLineWidth(i3) > lineWidth) {
                    lineWidth = layout.getLineWidth(i3);
                }
            }
            int iCeil = ((int) Math.ceil(lineWidth)) + getCompoundPaddingLeft() + getCompoundPaddingRight();
            int[] iArr = ley.a;
            if (iCeil > getMinimumWidth()) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(iCeil, View.MeasureSpec.getMode(i)), i2);
            }
        }
    }

    public CompactTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompactTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
