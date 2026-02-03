package com.google.android.apps.messaging.ui.mediapicker.c2o.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.cpch;
import defpackage.cyxj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EmojiContentItemView extends cyxj {
    public cpch a;
    private TextView b;

    public EmojiContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (TextView) findViewById(R.id.emoji_text);
        setOnClickListener(new View.OnClickListener() { // from class: cyxh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
        setClipToOutline(true);
        this.b.setTextColor(this.a.g() ? -1 : getContext().getColor(R.color.google_grey900));
    }
}
