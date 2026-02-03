package com.google.android.apps.messaging.ui.conversation.richcard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.baea;
import defpackage.baeb;
import defpackage.cwos;
import defpackage.cwox;
import defpackage.cwpd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationRichCardView extends cwos implements cwpd, cwox {
    public baea g;
    public RichCardContentContainer h;
    public baeb i;
    private RichCardMediaAttachmentView j;
    private RichCardMediaAttachmentView k;
    private RichCardMediaAttachmentView n;

    public ConversationRichCardView(Context context) {
        super(context, null, 0);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.g = this.i.a();
        this.j = (RichCardMediaAttachmentView) findViewById(R.id.rich_card_top_media);
        this.k = (RichCardMediaAttachmentView) findViewById(R.id.rich_card_left_media);
        this.n = (RichCardMediaAttachmentView) findViewById(R.id.rich_card_right_media);
        this.h = (RichCardContentContainer) findViewById(R.id.rich_card_content_container);
        this.j.e = this;
        this.k.e = this;
        this.n.e = this;
        this.h.a = this;
    }

    @Override // com.google.android.material.card.MaterialCardView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        int size = View.MeasureSpec.getSize(i);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.rich_card_max_width);
        if (dimensionPixelOffset > 0 && dimensionPixelOffset < size) {
            i = View.MeasureSpec.makeMeasureSpec(dimensionPixelOffset, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
    }

    public ConversationRichCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
