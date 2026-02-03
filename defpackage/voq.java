package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class voq implements vdy {
    private final vdy a;
    private final vdy b;
    private final fdpl c;
    private final Set d;

    public voq(vdy vdyVar, vdy vdyVar2, ConversationId conversationId) {
        conversationId.getClass();
        this.a = vdyVar;
        this.b = vdyVar2;
        this.c = conversationId instanceof PenpalBotConversationId ? ((vof) vdyVar).c : conversationId instanceof RbmConversationId ? ((vop) vdyVar2).c : new fdpu(null);
        this.d = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.c;
    }
}
