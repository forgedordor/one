package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.baea;
import defpackage.baeb;
import defpackage.cwor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationRichCardCarouselView extends cwor {
    public baea ab;
    public baeb ac;

    public ConversationRichCardCarouselView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        getContext();
        ao(new LinearLayoutManager(0));
        this.ab = this.ac.a();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        getResources().getDimensionPixelOffset(R.dimen.rich_card_margin);
        int i3 = this.ab.o;
        super.onMeasure(i, i2);
        getMeasuredHeight();
        throw null;
    }

    public ConversationRichCardCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
