package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajwd extends fcyz implements fdat {
    int a;
    final /* synthetic */ Conversation b;
    final /* synthetic */ ajwg c;
    final /* synthetic */ auib d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajwd(fcxy fcxyVar, Conversation conversation, ajwg ajwgVar, int i, auib auibVar) {
        super(2, fcxyVar);
        this.b = conversation;
        this.c = ajwgVar;
        this.e = i;
        this.d = auibVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajwd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        boolean z;
        Object objB;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = ((DefaultConversation) this.b).f.b();
            eijuVarB.getClass();
            this.a = 1;
            objC = fdxs.c(eijuVarB, this);
            if (objC != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        objC = obj;
        ajlk ajlkVar = (ajlk) objC;
        ajlkVar.getClass();
        if (ajlkVar.c() != ajlj.GROUP || !(ajlkVar instanceof ajts) || !bvdi.d(((ajts) ajlkVar).A())) {
            ajts ajtsVar = ajlkVar instanceof ajts ? (ajts) ajlkVar : null;
            throw new IllegalArgumentException(a.h(ajtsVar != null ? Integer.valueOf(ajtsVar.A()) : null, "Can not leave conversation with type: ", "}. Only RCS Groups are supported"));
        }
        ajwg ajwgVar = this.c;
        Conversation conversation = this.b;
        int i2 = this.e;
        auib auibVar = this.d;
        this.a = 2;
        aoer aoerVarH = ajlkVar.h();
        if (aoerVarH == null) {
            ekrw ekrwVarJ = ajwg.a.j();
            ekrwVarJ.X(eksq.a, "BugleNetwork");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/ConversationLeaverImpl", "leaveWithCurrentlySelectedSelfIdentity", 110, "ConversationLeaverImpl.kt")).t("ActiveSelfIdentity not found for conversation(id = %s)", ((DefaultConversation) conversation).a.toString());
            objB = false;
        } else {
            if (aoerVarH.o().isEmpty()) {
                ekrw ekrwVarJ2 = ajwg.a.j();
                ekrwVarJ2.X(eksq.a, "BugleNetwork");
                z = true;
                ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/ConversationLeaverImpl", "toChatEndpointOrNull", 221, "ConversationLeaverImpl.kt")).t("Messaging identity is not set in selfIdentity(id = %s)", aoerVarH.h().toString());
            } else {
                z = true;
            }
            if (((alqm) aoerVarH.o().get()).e().isEmpty()) {
                ekrw ekrwVarJ3 = ajwg.a.j();
                ekrwVarJ3.X(eksq.a, "BugleNetwork");
                ekrd ekrdVar = (ekrd) ekrwVarJ3;
                ekrdVar.X(cqnc.G, aoerVarH.o().get());
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/ConversationLeaverImpl", "toChatEndpointOrNull", 228, "ConversationLeaverImpl.kt")).q("RcsIdentifier is not set in messagingIdentity");
            }
            Optional optionalE = ((alqm) aoerVarH.o().get()).e();
            optionalE.getClass();
            aubq aubqVar = (aubq) fdct.b(optionalE);
            if (aubqVar == null) {
                objB = false;
            } else {
                cijs cijsVar = (cijs) ciju.a.createBuilder();
                cijsVar.getClass();
                String strB = ((DefaultConversation) conversation).a.b();
                strB.getClass();
                cijv.b(strB, cijsVar);
                cijt cijtVar = cijt.DO_NOT_DELETE;
                cijtVar.getClass();
                cijsVar.copyOnWrite();
                ((ciju) cijsVar.instance).d = cijtVar.a();
                evvp evvpVarC = evxc.c(((cogw) ajwgVar.c.b()).f().toEpochMilli());
                evvpVarC.getClass();
                cijsVar.copyOnWrite();
                ciju cijuVar = (ciju) cijsVar.instance;
                cijuVar.e = evvpVarC;
                cijuVar.b |= 1;
                cijsVar.copyOnWrite();
                ciju cijuVar2 = (ciju) cijsVar.instance;
                cijuVar2.b |= 2;
                cijuVar2.f = i2 == 2 ? z : false;
                cijv.c(aubqVar, cijsVar);
                cijsVar.copyOnWrite();
                ciju cijuVar3 = (ciju) cijsVar.instance;
                cijuVar3.h = auibVar;
                cijuVar3.b |= 16;
                objB = ajwgVar.b(cijv.a(cijsVar), this);
            }
        }
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ajwd ajwdVar = new ajwd(fcxyVar, this.b, this.c, this.e, this.d);
        ajwdVar.f = obj;
        return ajwdVar;
    }
}
