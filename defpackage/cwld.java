package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageTransferView;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwld implements View.OnClickListener {
    final /* synthetic */ ConversationMessageTransferView a;

    public cwld(ConversationMessageTransferView conversationMessageTransferView) {
        this.a = conversationMessageTransferView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ConversationMessageTransferView conversationMessageTransferView = this.a;
        cqaz.l(conversationMessageTransferView.b);
        if (!conversationMessageTransferView.a.Z()) {
            if (conversationMessageTransferView.a.al()) {
                ConversationMessageView conversationMessageView = (ConversationMessageView) conversationMessageTransferView.b;
                cwkt cwktVar = conversationMessageView.l;
                baea baeaVar = conversationMessageView.d;
                throw null;
            }
            ConversationMessageView conversationMessageView2 = (ConversationMessageView) conversationMessageTransferView.b;
            cwkt cwktVar2 = conversationMessageView2.l;
            baea baeaVar2 = conversationMessageView2.d;
            throw null;
        }
        if (conversationMessageTransferView.a.V()) {
            ConversationMessageView conversationMessageView3 = (ConversationMessageView) conversationMessageTransferView.b;
            cwkt cwktVar3 = conversationMessageView3.l;
            baea baeaVar3 = conversationMessageView3.d;
            throw null;
        }
        ConversationMessageView conversationMessageView4 = (ConversationMessageView) conversationMessageTransferView.b;
        if (conversationMessageView4.d == null) {
            return;
        }
        cwkt cwktVar4 = conversationMessageView4.l;
        throw null;
    }
}
