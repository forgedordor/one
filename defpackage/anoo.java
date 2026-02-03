package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anoo {
    public static final ejxr a = cdag.x("toolstone_include_conversation_id");
    private final aimb b;
    private final fcsu c;

    public anoo(aimb aimbVar, fcsu fcsuVar) {
        aimbVar.getClass();
        fcsuVar.getClass();
        this.b = aimbVar;
        this.c = fcsuVar;
    }

    public final void a(enkm enkmVar, ConversationId conversationId) {
        int iA;
        cczi ccziVar = crtr.a;
        if (((Boolean) crtr.S.e()).booleanValue() && (iA = enkl.a(enkmVar.c)) != 0 && iA == 5) {
            return;
        }
        ailn ailnVarA = this.b.a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.TOOLSTONE_EVENT, ellgVar);
        enkh enkhVar = enkh.a;
        enkg enkgVar = (enkg) enkhVar.createBuilder();
        enkgVar.getClass();
        enkgVar.copyOnWrite();
        enkh enkhVar2 = (enkh) enkgVar.instance;
        enkhVar2.d = enkmVar;
        enkhVar2.c = 1;
        if (((Boolean) ((cczi) a.get()).e()).booleanValue() && conversationId != null) {
            long jA = ((aika) this.c.b()).a(conversationId);
            enkgVar.copyOnWrite();
            enkh enkhVar3 = (enkh) enkgVar.instance;
            enkhVar3.b |= 1;
            enkhVar3.e = jA;
        }
        evsn evsnVarBuild = enkgVar.build();
        evsnVarBuild.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.cu = (enkh) evsnVarBuild;
        ellhVar.h |= Integer.MIN_VALUE;
        enkg enkgVar2 = (enkg) enkhVar.createBuilder();
        enkgVar2.copyOnWrite();
        enkh enkhVar4 = (enkh) enkgVar2.instance;
        enkhVar4.d = enkmVar;
        enkhVar4.c = 1;
        enkgVar2.build();
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_TOOLSTONE_EVENTS);
    }

    public final void c(int i, ConversationId conversationId) {
        enkj enkjVar = (enkj) enkm.a.createBuilder();
        enkjVar.getClass();
        eobv.c(enkjVar);
        eobv.b(i, enkjVar);
        a(eobv.a(enkjVar), conversationId);
    }
}
