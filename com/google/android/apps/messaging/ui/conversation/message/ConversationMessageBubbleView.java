package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationMessageBubbleView extends LinearLayout {
    public ViewGroup a;
    private int b;

    public ConversationMessageBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ViewGroup) findViewById(R.id.message_text_and_info);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.b == 0 && measuredWidth != 0) {
            this.b = measuredWidth;
        }
        this.a.getLayoutParams().width = -2;
        this.a.requestLayout();
    }

    public void setMorphWidth(int i) {
        requestLayout();
    }
}
