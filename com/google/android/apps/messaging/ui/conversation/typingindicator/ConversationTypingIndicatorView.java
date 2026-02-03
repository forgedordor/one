package com.google.android.apps.messaging.ui.conversation.typingindicator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import defpackage.cwuy;
import defpackage.cwva;
import defpackage.pnz;
import defpackage.poe;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationTypingIndicatorView extends cwva {
    public Drawable a;
    pnz b;

    public ConversationTypingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ArrayList(5);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = ((ImageView) findViewById(R.id.typing_dots)).getDrawable();
        cwuy cwuyVar = new cwuy(this);
        this.b = cwuyVar;
        poe.a(this.a, cwuyVar);
    }
}
