package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import defpackage.baea;
import defpackage.cwlz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageAttachmentsView extends cwlz {
    public baea a;
    public ConversationMessageView b;
    public MessageAttachmentContainer c;
    public ConversationMessageTransferView d;

    public MessageAttachmentsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.c = (MessageAttachmentContainer) findViewById(R.id.message_attachments_container);
        this.d = (ConversationMessageTransferView) findViewById(R.id.transfer_state);
    }
}
