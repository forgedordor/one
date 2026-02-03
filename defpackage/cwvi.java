package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.InvalidConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.ui.conversationlist.ForwardMessageActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvi implements cwwj {
    public final ForwardMessageActivity a;
    public final fcsu b;
    public MessageCoreData c;
    public ComposeRowState d;
    private final fcsu e;
    private final fcsu f;

    public cwvi(ForwardMessageActivity forwardMessageActivity, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.a = forwardMessageActivity;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.b = fcsuVar3;
    }

    private final void d(int i, ConversationId conversationId, Integer num, bajg bajgVar) {
        avmp avmpVar = (avmp) this.e.b();
        ComposeRowState composeRowState = this.d;
        ForwardMessageActivity forwardMessageActivity = this.a;
        if (avmpVar.B(forwardMessageActivity, i, conversationId, composeRowState, num, bajgVar)) {
            return;
        }
        ((dakl) this.f.b()).i(R.string.attachment_load_failed_dialog_message);
        forwardMessageActivity.setResult(0);
        forwardMessageActivity.finish();
    }

    @Override // defpackage.cwwj
    public final int a() {
        return R.string.forward_activity_label;
    }

    @Override // defpackage.cwwj
    public final void b(badt badtVar) {
        badtVar.P();
        d(0, badtVar.H(), null, badtVar.g());
    }

    @Override // defpackage.cwwj
    public final void c() {
        d(1, InvalidConversationId.a, 2, null);
    }
}
