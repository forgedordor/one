package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cncr implements cnfu {
    public final fcsu a;
    public final eosc b;
    public final cnaj c;
    public final cnam d;
    public final fcsu e;
    public final ardl f;
    private final fcsu g;
    private final cnbc h;

    public cncr(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, cnbc cnbcVar, cnaj cnajVar, cnam cnamVar, fcsu fcsuVar3, ardl ardlVar) {
        this.a = fcsuVar;
        this.g = fcsuVar2;
        this.b = eoscVar;
        this.h = cnbcVar;
        this.c = cnajVar;
        this.d = cnamVar;
        this.e = fcsuVar3;
        this.f = ardlVar;
    }

    public static auik f(evqs evqsVar, aubk aubkVar) {
        auij auijVar = (auij) auik.a.createBuilder();
        auijVar.copyOnWrite();
        auik auikVar = (auik) auijVar.instance;
        evqsVar.getClass();
        auikVar.b |= 2;
        auikVar.d = evqsVar;
        aubg aubgVar = (aubg) aubl.a.createBuilder();
        aubgVar.copyOnWrite();
        aubl aublVar = (aubl) aubgVar.instance;
        aublVar.c = aubkVar.f;
        aublVar.b |= 1;
        aubl aublVar2 = (aubl) aubgVar.build();
        auijVar.copyOnWrite();
        auik auikVar2 = (auik) auijVar.instance;
        aublVar2.getClass();
        auikVar2.c = aublVar2;
        auikVar2.b |= 1;
        return (auik) auijVar.build();
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq a(Object obj) {
        audu auduVar = ((auii) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        aubq aubqVar = auduVar.d;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq b(Object obj) {
        auii auiiVar = (auii) obj;
        ejwl.b((auiiVar.b & 4) != 0, "Self identity is missing in TriggerChatGroupFullStateUpdateRequest");
        aubq aubqVar = auiiVar.e;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju c(Object obj) {
        final auii auiiVar = (auii) obj;
        ejwl.l((auiiVar.b & 4) != 0);
        cnao cnaoVar = (cnao) this.g.b();
        audu auduVar = auiiVar.c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return cnaoVar.a(auduVar).i(new eooz() { // from class: cncn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                final eqdr eqdrVar = (eqdr) obj2;
                cncr cncrVar = this.a;
                cnlh cnlhVar = (cnlh) cncrVar.e.b();
                aubq aubqVar = auiiVar.e;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                return cnlhVar.b(aubqVar).i(new eooz() { // from class: cncq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj3) {
                        cnku cnkuVar = (cnku) obj3;
                        eqdr eqdrVar2 = eqdrVar;
                        eqdrVar2.getClass();
                        return auvw.c(cnkuVar.b, fcyi.a, fdjz.a, new cnkr(cnkuVar, eqdrVar2, null));
                    }
                }, cncrVar.b);
            }
        }, this.b);
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju d(Object obj, aubl aublVar) {
        asrc asrcVar = (asrc) this.a.b();
        evqs evqsVar = ((auii) obj).d;
        auij auijVar = (auij) auik.a.createBuilder();
        auijVar.copyOnWrite();
        auik auikVar = (auik) auijVar.instance;
        evqsVar.getClass();
        auikVar.b |= 2;
        auikVar.d = evqsVar;
        auijVar.copyOnWrite();
        auik auikVar2 = (auik) auijVar.instance;
        aublVar.getClass();
        auikVar2.c = aublVar;
        auikVar2.b |= 1;
        return asrcVar.j((auik) auijVar.build());
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju e(Object obj, Object obj2) {
        final auii auiiVar = (auii) obj;
        final eqds eqdsVar = (eqds) obj2;
        if (!eqdsVar.a.b.isEmpty()) {
            return this.h.a(eqdsVar).i(new eooz() { // from class: cncm
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj3) {
                    final cncr cncrVar = this.a;
                    asrc asrcVar = (asrc) cncrVar.a.b();
                    final auii auiiVar2 = auiiVar;
                    eiju eijuVarJ = asrcVar.j(cncr.f(auiiVar2.d, aubk.OK));
                    final eqds eqdsVar2 = eqdsVar;
                    return eijuVarJ.i(new eooz() { // from class: cncp
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj4) {
                            eiju eijuVarA;
                            eqds eqdsVar3 = eqdsVar2;
                            auii auiiVar3 = auiiVar2;
                            final aubl aublVar = (aubl) obj4;
                            cncr cncrVar2 = cncrVar;
                            if (cncrVar2.f.a()) {
                                cnam cnamVar = cncrVar2.d;
                                aubq aubqVar = auiiVar3.e;
                                if (aubqVar == null) {
                                    aubqVar = aubq.a;
                                }
                                eqdsVar3.getClass();
                                aubqVar.getClass();
                                eijuVarA = auvw.c(cnamVar.a, fcyi.a, fdjz.a, new cnak(cnamVar, eqdsVar3, aubqVar, null));
                            } else {
                                cnaj cnajVar = cncrVar2.c;
                                aubq aubqVar2 = auiiVar3.e;
                                if (aubqVar2 == null) {
                                    aubqVar2 = aubq.a;
                                }
                                eijuVarA = cnajVar.a(eqdsVar3, aubqVar2);
                            }
                            return eijuVarA.h(new ejvr() { // from class: cnco
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj5) {
                                    aubl aublVar2 = aublVar;
                                    aubl aublVar3 = (aubl) obj5;
                                    aubk aubkVar = aubk.OK;
                                    aubk aubkVarB = aubk.b(aublVar2.c);
                                    if (aubkVarB == null) {
                                        aubkVarB = aubk.UNKNOWN_STATUS;
                                    }
                                    if (aubkVar.equals(aubkVarB)) {
                                        aubk aubkVarB2 = aubk.b(aublVar3.c);
                                        if (aubkVarB2 == null) {
                                            aubkVarB2 = aubk.UNKNOWN_STATUS;
                                        }
                                        if (aubkVar.equals(aubkVarB2)) {
                                            aubg aubgVar = (aubg) aubl.a.createBuilder();
                                            aubgVar.copyOnWrite();
                                            aubl aublVar4 = (aubl) aubgVar.instance;
                                            aublVar4.c = aubkVar.f;
                                            aublVar4.b |= 1;
                                            return (aubl) aubgVar.build();
                                        }
                                    }
                                    eksl ekslVar = (eksl) ((eksl) cncs.a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGetGroupInfoWorkHandler$TachygramGetGroupInfoOperation", "mergeChatApiResults", 251, "TachygramGetGroupInfoWorkHandler.java");
                                    aubk aubkVarB3 = aubk.b(aublVar2.c);
                                    if (aubkVarB3 == null) {
                                        aubkVarB3 = aubk.UNKNOWN_STATUS;
                                    }
                                    aubk aubkVarB4 = aubk.b(aublVar3.c);
                                    if (aubkVarB4 == null) {
                                        aubkVarB4 = aubk.UNKNOWN_STATUS;
                                    }
                                    ekslVar.u("IncomingChatApi did not succeed in processing a group trigger. \n onTriggerCompleteResult: %d, onGroupNotificationCompleteResult: %d", aubkVarB3.f, aubkVarB4.f);
                                    aubg aubgVar2 = (aubg) aubl.a.createBuilder();
                                    aubk aubkVar2 = aubk.FAILED_PERMANENTLY;
                                    aubgVar2.copyOnWrite();
                                    aubl aublVar5 = (aubl) aubgVar2.instance;
                                    aublVar5.c = aubkVar2.f;
                                    aublVar5.b |= 1;
                                    return (aubl) aubgVar2.build();
                                }
                            }, cncrVar2.b);
                        }
                    }, cncrVar.b);
                }
            }, this.b);
        }
        ((eksl) ((eksl) cncs.a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGetGroupInfoWorkHandler$TachygramGetGroupInfoOperation", "onSuccess", 164, "TachygramGetGroupInfoWorkHandler.java")).q("Tachygram fetched group information missing the conference URI.");
        return ((asrc) this.a.b()).j(f(auiiVar.d, aubk.FAILED_PERMANENTLY));
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        audu auduVar = ((auii) obj).c;
        if (auduVar == null) {
            auduVar = audu.a;
        }
        return auduVar.c;
    }

    @Override // defpackage.cnfu
    public final String h() {
        return "TachygramGetGroupInfoOperation";
    }

    @Override // defpackage.cnfu
    public final boolean i() {
        return false;
    }
}
