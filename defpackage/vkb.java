package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vkb implements vdy {
    public final ConversationId a;
    public final fcsu b;
    public final aqhc c;
    private final fdpl d;
    private final Set e;

    public vkb(Context context, afzc afzcVar, ConversationId conversationId, fdpl fdplVar, fcsu fcsuVar, aqhc aqhcVar) {
        context.getClass();
        afzcVar.getClass();
        conversationId.getClass();
        fdplVar.getClass();
        fcsuVar.getClass();
        aqhcVar.getClass();
        this.a = conversationId;
        this.b = fcsuVar;
        this.c = aqhcVar;
        this.d = !(conversationId instanceof RbmConversationId) ? new fdpu(null) : new vka(fdplVar, this, context, afzcVar);
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
