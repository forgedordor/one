package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vle implements vdy {
    public final fcsu a;
    public final afzc b;
    private final ConversationId c;
    private final fdpl d;
    private final Set e;

    public vle(ConversationId conversationId, fcsu fcsuVar, afzc afzcVar) {
        conversationId.getClass();
        afzcVar.getClass();
        this.c = conversationId;
        this.a = fcsuVar;
        this.b = afzcVar;
        dihq dihqVar = null;
        if ((conversationId instanceof PenpalBotConversationId) && !((Optional) fcsuVar.b()).isEmpty()) {
            dihqVar = new dihq(((cgsa) ((Optional) fcsuVar.b()).get()).f(), null, false, true, true, false, null, false, null, new fdae() { // from class: vld
                @Override // defpackage.fdae
                public final Object invoke() {
                    vle vleVar = this.a;
                    vleVar.b.h(new agdi(((cgsa) ((Optional) vleVar.a.b()).get()).b()));
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
