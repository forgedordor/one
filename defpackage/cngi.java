package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cngi implements cnfu {
    private final cnlh a;
    private final fcsu b;
    private final fcsu c;
    private final eosc d;

    public cngi(cnlh cnlhVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar) {
        this.a = cnlhVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = eoscVar;
    }

    @Override // defpackage.cnfu
    public final /* synthetic */ aubq a(Object obj) {
        aubq aubqVar = ((augo) obj).c;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq b(Object obj) {
        augo augoVar = (augo) obj;
        ejwl.b((augoVar.b & 16) != 0, "Self identity is missing in RevokeChatMessageRequest");
        aubq aubqVar = augoVar.g;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        final augo augoVar = (augo) obj;
        ejwl.b((augoVar.b & 16) != 0, "sender is missing");
        ejwl.b(1 == (augoVar.b & 1), "recipient is missing");
        aubq aubqVar = augoVar.g;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubq aubqVar2 = augoVar.c;
        cnhz cnhzVar = (cnhz) this.c.b();
        aubq aubqVar3 = augoVar.c;
        if (aubqVar3 == null) {
            aubqVar3 = aubq.a;
        }
        eiju eijuVarA = cnhzVar.a(aubqVar3, augoVar.e);
        ejvr ejvrVar = new ejvr() { // from class: cngh
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                eqen eqenVarA = eqeo.a();
                augo augoVar2 = augoVar;
                eqenVarA.d(augoVar2.d);
                eqenVarA.f((ezol) obj2);
                aubq aubqVar4 = augoVar2.g;
                if (aubqVar4 == null) {
                    aubqVar4 = aubq.a;
                }
                eqenVarA.g(cnln.b(aubqVar4));
                return eqenVarA.b();
            }
        };
        eosc eoscVar = this.d;
        final eiju eijuVarH = eijuVarA.h(ejvrVar, eoscVar);
        cnlh cnlhVar = this.a;
        aubqVar.getClass();
        final eiju eijuVarJ = cnlh.j(cnlhVar, aubqVar, null, 14);
        return eijx.k(eijuVarH, eijuVarJ).b(eiid.c(new eooy() { // from class: cngg
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eqeq eqeqVar = (eqeq) eork.q(eijuVarH);
                cnkx cnkxVar = (cnkx) eork.q(eijuVarJ);
                eqeqVar.getClass();
                return auvw.i(cnkxVar.b, new cnkv(cnkxVar, eqeqVar, null));
            }
        }), eoscVar);
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju d(Object obj, aubl aublVar) {
        augo augoVar = (augo) obj;
        eksl ekslVar = (eksl) cngj.a.j();
        ekslVar.X(cqnc.r, augoVar.e);
        ekslVar.X(cqnc.a, augoVar.d);
        ekrz ekrzVar = atnw.b;
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        ekslVar.X(ekrzVar, aubkVarB);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramRevokeMessageWorkHandler$TachygramRevokeMessageOperation", "onFailure", 167, "TachygramRevokeMessageWorkHandler.java")).q("TachygramTransport has failed to revoke the message.");
        asrc asrcVar = (asrc) this.b.b();
        evqs evqsVar = augoVar.f;
        augp augpVar = (augp) augq.a.createBuilder();
        augpVar.copyOnWrite();
        augq augqVar = (augq) augpVar.instance;
        evqsVar.getClass();
        augqVar.b |= 2;
        augqVar.d = evqsVar;
        augpVar.copyOnWrite();
        augq augqVar2 = (augq) augpVar.instance;
        aublVar.getClass();
        augqVar2.c = aublVar;
        augqVar2.b |= 1;
        return asrcVar.h((augq) augpVar.build());
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju e(Object obj, Object obj2) {
        augo augoVar = (augo) obj;
        eksl ekslVar = (eksl) cngj.a.h();
        ekslVar.X(cqnc.a, augoVar.d);
        ekslVar.X(cqnc.r, augoVar.e);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramRevokeMessageWorkHandler$TachygramRevokeMessageOperation", "onSuccess", 152, "TachygramRevokeMessageWorkHandler.java")).q("TachygramTransport has successfully processed message revoking.");
        asrc asrcVar = (asrc) this.b.b();
        evqs evqsVar = augoVar.f;
        aubk aubkVar = aubk.OK;
        augp augpVar = (augp) augq.a.createBuilder();
        augpVar.copyOnWrite();
        augq augqVar = (augq) augpVar.instance;
        evqsVar.getClass();
        augqVar.b |= 2;
        augqVar.d = evqsVar;
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubl aublVar2 = (aubl) aubgVar.build();
        augpVar.copyOnWrite();
        augq augqVar2 = (augq) augpVar.instance;
        aublVar2.getClass();
        augqVar2.c = aublVar2;
        augqVar2.b |= 1;
        return asrcVar.h((augq) augpVar.build());
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        augo augoVar = (augo) obj;
        aubq aubqVar = augoVar.c;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        ejwl.m(aubpVarB.equals(aubp.GROUP), "getRcsGroupId called on a non-group operation.");
        return augoVar.e;
    }

    @Override // defpackage.cnfu
    public final String h() {
        return "TachygramRevokeMessageOperation";
    }

    @Override // defpackage.cnfu
    public final boolean i() {
        return false;
    }
}
