package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vlg implements vdy {
    public final afzc a;
    private final ConversationId b;
    private final fcsu c;
    private final fdpl d;
    private final Set e;

    public vlg(ConversationId conversationId, fcsu fcsuVar, afzc afzcVar) {
        conversationId.getClass();
        afzcVar.getClass();
        this.b = conversationId;
        this.c = fcsuVar;
        this.a = afzcVar;
        dihq dihqVar = null;
        if ((conversationId instanceof PenpalBotConversationId) && !((Optional) fcsuVar.b()).isEmpty()) {
            dihqVar = new dihq(((cgsa) ((Optional) fcsuVar.b()).get()).g(), null, false, true, true, false, null, false, null, new fdae() { // from class: vlf
                @Override // defpackage.fdae
                public final Object invoke() {
                    this.a.a.h(aggv.a);
                    return fctx.a;
                }
            }, 998);
        }
        this.d = fdvf.a(dihqVar);
        this.e = fcwm.b(zqx.a);
    }

    @Override // defpackage.vdy
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.vdy
    public final fdpl b() {
        return this.d;
    }
}
