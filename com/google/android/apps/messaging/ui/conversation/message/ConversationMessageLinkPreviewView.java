package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.cwkc;
import defpackage.cwlv;
import defpackage.eehg;
import defpackage.ehqs;
import defpackage.ejxr;
import defpackage.ekgp;
import defpackage.eksp;
import defpackage.rqi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationMessageLinkPreviewView extends cwlv {
    static final ejxr a = cdag.x("enable_link_preview_view_customization");
    public ConversationMessageView b;
    public ConversationMessageBubbleView c;

    static {
        ekgp.l("photos.google.com", new cwkc());
        eksp.c("BugleLinkPreviews");
    }

    public ConversationMessageLinkPreviewView(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        findViewById(R.id.thumbnail_image_container);
        findViewById(R.id.link_preview_content_container);
        findViewById(R.id.link_preview_tap_to_load_container);
        findViewById(R.id.link_preview_progress);
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
        }
    }

    public ConversationMessageLinkPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ConversationMessageLinkPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ehqs.c(this).c().p(rqi.b());
        if (((Boolean) ((cczi) a.get()).e()).booleanValue()) {
            inflate(context, R.layout.conversation_message_link_preview_view_v2, this);
        } else {
            inflate(context, R.layout.conversation_message_link_preview_view, this);
        }
        eehg.b(this, android.R.attr.colorBackground);
    }
}
