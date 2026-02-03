package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cngv implements cnfu {
    public final cnlh a;
    public final fcsu b;
    public final eosc c;
    public final cnhu d;
    public final fcsu e;
    public final ahjx f;
    private final fcsu g;
    private final fcsu h;

    public cngv(cnlh cnlhVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, cnhu cnhuVar, fcsu fcsuVar3, fcsu fcsuVar4, ahjx ahjxVar) {
        this.a = cnlhVar;
        this.b = fcsuVar;
        this.g = fcsuVar2;
        this.c = eoscVar;
        this.d = cnhuVar;
        this.h = fcsuVar3;
        this.e = fcsuVar4;
        this.f = ahjxVar;
    }

    private static String f(aubx aubxVar) {
        return ((ContentType) new atal().fM(aubxVar)).toString();
    }

    @Override // defpackage.cnfu
    public final /* synthetic */ aubq a(Object obj) {
        aubq aubqVar = ((augw) obj).d;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ aubq b(Object obj) {
        augw augwVar = (augw) obj;
        ejwl.b(1 == (augwVar.b & 1), "Self identity is missing in SendChatMessageRequest");
        aubq aubqVar = augwVar.c;
        return aubqVar == null ? aubq.a : aubqVar;
    }

    @Override // defpackage.cnfu
    public final /* synthetic */ eiju c(Object obj) {
        int i;
        eqep eqepVar;
        eiju eijuVarH;
        augw augwVar = (augw) obj;
        if ((augwVar.b & 2048) != 0) {
            auib auibVar = augwVar.n;
            if (auibVar == null) {
                auibVar = auib.a;
            }
            this.d.d(auibVar, basd.a(augwVar.h), 10);
        }
        eieu eieuVarK = eiiy.k("TachyramSendMessage::convert");
        try {
            cnaf cnafVar = new cnaf();
            aubt aubtVar = augwVar.k;
            if (aubtVar == null) {
                aubtVar = aubt.a;
            }
            final eqdb eqdbVar = (eqdb) cnafVar.fM(aubtVar);
            eieuVarK.close();
            ejwl.a(1 == (augwVar.b & 1));
            ejwl.a((augwVar.b & 2) != 0);
            final aubq aubqVar = augwVar.c;
            if (aubqVar == null) {
                aubqVar = aubq.a;
            }
            final aubq aubqVar2 = augwVar.d;
            if (aubqVar2 == null) {
                aubqVar2 = aubq.a;
            }
            eksl ekslVar = (eksl) cngw.a.h();
            ekslVar.X(cqnc.a, augwVar.h);
            ekslVar.X(cqnc.r, augwVar.i);
            ekrz ekrzVar = cqnc.B;
            aubt aubtVar2 = augwVar.k;
            if (aubtVar2 == null) {
                aubtVar2 = aubt.a;
            }
            aubx aubxVar = aubtVar2.c;
            if (aubxVar == null) {
                aubxVar = aubx.a;
            }
            ekslVar.X(ekrzVar, f(aubxVar));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "executeRequest", 190, "TachygramSendMessageWorkHandler.java")).q("Sending message.");
            eieuVarK = eiiy.k("TachygramSendMessage::createMessageMetadata_v2");
            try {
                final eqen eqenVarA = eqeo.a();
                aufx aufxVar = augwVar.m;
                if (aufxVar == null) {
                    aufxVar = aufx.a;
                }
                aufu aufuVarB = aufu.b(aufxVar.d);
                if (aufuVarB == null) {
                    aufuVarB = aufu.UNKNOWN_MESSAGE_PRIORITY;
                }
                int iOrdinal = aufuVarB.ordinal();
                if (iOrdinal != 1) {
                    i = 3;
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aufuVarB))));
                        }
                        i = 1;
                    }
                } else {
                    i = 2;
                }
                eqenVarA.h(i);
                aufx aufxVar2 = augwVar.m;
                if (aufxVar2 == null) {
                    aufxVar2 = aufx.a;
                }
                aufu aufuVarB2 = aufu.b(aufxVar2.d);
                if (aufuVarB2 == null) {
                    aufuVarB2 = aufu.UNKNOWN_MESSAGE_PRIORITY;
                }
                if (aufuVarB2.equals(aufu.LOW)) {
                    eqepVar = eqep.d;
                } else {
                    aufu aufuVarB3 = aufu.b(aufxVar2.d);
                    if (aufuVarB3 == null) {
                        aufuVarB3 = aufu.UNKNOWN_MESSAGE_PRIORITY;
                    }
                    if (aufuVarB3.equals(aufu.NORMAL)) {
                        eqepVar = eqep.c;
                    } else {
                        aufw aufwVarB = aufw.b(aufxVar2.c);
                        if (aufwVarB == null) {
                            aufwVarB = aufw.UNKNOWN_MESSAGE_SOURCE;
                        }
                        int iOrdinal2 = aufwVarB.ordinal();
                        if (iOrdinal2 == 1) {
                            eqepVar = eqep.b;
                        } else {
                            if (iOrdinal2 != 2) {
                                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(aufwVarB))));
                            }
                            eqepVar = eqep.c;
                        }
                    }
                }
                eqenVarA.e(eqepVar);
                eyga eygaVar = augwVar.j;
                if (eygaVar == null) {
                    eygaVar = eyga.a;
                }
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(eygaVar.b).entrySet()) {
                    String str = (String) entry.getKey();
                    for (Map.Entry entry2 : DesugarCollections.unmodifiableMap(((eyge) entry.getValue()).b).entrySet()) {
                        String str2 = (String) entry2.getKey();
                        String str3 = (String) entry2.getValue();
                        str.getClass();
                        str2.getClass();
                        str3.getClass();
                        ekfwVar.h(new eqem(str, str2, str3));
                    }
                }
                eqenVarA.i(ekfwVar.g());
                cnbb cnbbVar = new cnbb();
                aubq aubqVar3 = augwVar.c;
                if (aubqVar3 == null) {
                    aubqVar3 = aubq.a;
                }
                eqenVarA.g((ezol) cnbbVar.fM(aubqVar3));
                eqenVarA.d(augwVar.h);
                if ((augwVar.b & 2048) != 0) {
                    auib auibVar2 = augwVar.n;
                    if (auibVar2 == null) {
                        auibVar2 = auib.a;
                    }
                    ((eqel) eqenVarA).a = new eqcz(auibVar2.c);
                    ((eqel) eqenVarA).b = (byte) (((eqel) eqenVarA).b | (-128));
                }
                if ((augwVar.b & 4) != 0) {
                    cnbb cnbbVar2 = new cnbb();
                    aubq aubqVar4 = augwVar.e;
                    if (aubqVar4 == null) {
                        aubqVar4 = aubq.a;
                    }
                    eqenVarA.f((ezol) cnbbVar2.fM(aubqVar4));
                    eijuVarH = ((cnhz) this.g.b()).b(augwVar.i).h(new ejvr() { // from class: cngq
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eqen eqenVar = eqenVarA;
                            eqenVar.c((ezol) obj2);
                            return eqenVar;
                        }
                    }, this.c);
                } else {
                    cnhz cnhzVar = (cnhz) this.g.b();
                    aubq aubqVar5 = augwVar.d;
                    if (aubqVar5 == null) {
                        aubqVar5 = aubq.a;
                    }
                    eijuVarH = cnhzVar.a(aubqVar5, augwVar.i).h(new ejvr() { // from class: cngr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eqen eqenVar = eqenVarA;
                            eqenVar.f((ezol) obj2);
                            return eqenVar;
                        }
                    }, this.c);
                }
                ejvr ejvrVar = new ejvr() { // from class: cngt
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return ((eqen) obj2).b();
                    }
                };
                eosc eoscVar = this.c;
                eiju eijuVarH2 = eijuVarH.h(ejvrVar, eoscVar);
                eieuVarK.b(eijuVarH2);
                eieuVarK.close();
                return eijuVarH2.i(new eooz() { // from class: cngo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        eiju eijuVarJ;
                        final eqeq eqeqVar = (eqeq) obj2;
                        boolean zBooleanValue = ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue();
                        aubq aubqVar6 = aubqVar;
                        aubq aubqVar7 = aubqVar2;
                        final eqdb eqdbVar2 = eqdbVar;
                        cngv cngvVar = this.a;
                        cmzw cmzwVarA = null;
                        if (zBooleanValue) {
                            fcsu fcsuVar = cngvVar.e;
                            if (((Optional) fcsuVar.b()).isPresent()) {
                                cmzwVarA = ((cmzx) ((Optional) fcsuVar.b()).get()).a(aubqVar6, aubqVar7, eqdbVar2, eqeqVar);
                            }
                        }
                        cmzw cmzwVar = cmzwVarA;
                        eieu eieuVarK2 = eiiy.k("TachygramSendMessage::getTransport_v2");
                        try {
                            if (crtr.a()) {
                                cnlh cnlhVar = cngvVar.a;
                                ahkn ahknVar = cngvVar.f.a.a;
                                eijuVarJ = cnlhVar.h(aubqVar6, cmzwVar, new csbh((csbb) ahknVar.kv.b(), ahknVar.cD, aubqVar6, aubqVar7, eqdbVar2, eqeqVar));
                            } else {
                                cnlh cnlhVar2 = cngvVar.a;
                                aubqVar6.getClass();
                                eijuVarJ = cnlh.j(cnlhVar2, aubqVar6, cmzwVar, 8);
                            }
                            eieuVarK2.b(eijuVarJ);
                            eieuVarK2.close();
                            return eijuVarJ.i(new eooz() { // from class: cngl
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    cnkx cnkxVar = (cnkx) obj3;
                                    eqdb eqdbVar3 = eqdbVar2;
                                    eqdbVar3.getClass();
                                    eqeq eqeqVar2 = eqeqVar;
                                    eqeqVar2.getClass();
                                    return auvw.c(cnkxVar.b, fcyi.a, fdjz.a, new cnkw(cnkxVar, eqdbVar3, eqeqVar2, null));
                                }
                            }, cngvVar.c);
                        } finally {
                        }
                    }
                }, eoscVar);
            } finally {
            }
        } finally {
        }
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ eiju d(Object obj, aubl aublVar) {
        final augw augwVar = (augw) obj;
        eksl ekslVar = (eksl) cngw.a.j();
        ekslVar.X(cqnc.a, augwVar.h);
        ekslVar.X(cqnc.r, augwVar.i);
        ekrz ekrzVar = atnw.b;
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        ekslVar.X(ekrzVar, aubkVarB);
        ekrz ekrzVar2 = cqnc.B;
        aubt aubtVar = augwVar.k;
        if (aubtVar == null) {
            aubtVar = aubt.a;
        }
        aubx aubxVar = aubtVar.c;
        if (aubxVar == null) {
            aubxVar = aubx.a;
        }
        ekslVar.X(ekrzVar2, f(aubxVar));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation", "onFailure", 234, "TachygramSendMessageWorkHandler.java")).q("TachygramTransport has failed to send the message.");
        this.d.a(augwVar);
        asrc asrcVar = (asrc) this.b.b();
        evqs evqsVar = augwVar.l;
        augy augyVar = (augy) augz.a.createBuilder();
        augyVar.copyOnWrite();
        augz augzVar = (augz) augyVar.instance;
        evqsVar.getClass();
        augzVar.b |= 2;
        augzVar.d = evqsVar;
        augyVar.copyOnWrite();
        augz augzVar2 = (augz) augyVar.instance;
        aublVar.getClass();
        augzVar2.c = aublVar;
        augzVar2.b |= 1;
        elpg elpgVarA = cnbk.a();
        augyVar.copyOnWrite();
        augz augzVar3 = (augz) augyVar.instance;
        elpgVarA.getClass();
        augzVar3.h = elpgVarA;
        augzVar3.b |= 32;
        return asrcVar.i((augz) augyVar.build()).h(new ejvr() { // from class: cngu
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                aubl aublVar2 = (aubl) obj2;
                this.a.d.b(augwVar);
                return aublVar2;
            }
        }, this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    @Override // defpackage.cnfu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.eiju e(java.lang.Object r7, java.lang.Object r8) {
        /*
            r6 = this;
            augw r7 = (defpackage.augw) r7
            eqfx r8 = (defpackage.eqfx) r8
            eksp r0 = defpackage.cngw.a
            ekrw r1 = r0.h()
            eksl r1 = (defpackage.eksl) r1
            ekrz r2 = defpackage.cqnc.a
            java.lang.String r3 = r7.h
            r1.X(r2, r3)
            ekrz r2 = defpackage.cqnc.r
            java.lang.String r3 = r7.i
            r1.X(r2, r3)
            ekrz r2 = defpackage.cqnc.B
            aubt r3 = r7.k
            if (r3 != 0) goto L22
            aubt r3 = defpackage.aubt.a
        L22:
            aubx r3 = r3.c
            if (r3 != 0) goto L28
            aubx r3 = defpackage.aubx.a
        L28:
            java.lang.String r3 = f(r3)
            r1.X(r2, r3)
            java.lang.String r2 = "onSuccess"
            r3 = 208(0xd0, float:2.91E-43)
            java.lang.String r4 = "com/google/android/apps/messaging/shared/tachygram/chat/TachygramSendMessageWorkHandler$TachygramSendMessageOperation"
            java.lang.String r5 = "TachygramSendMessageWorkHandler.java"
            ekrw r1 = r1.h(r4, r2, r3, r5)
            eksl r1 = (defpackage.eksl) r1
            java.lang.String r2 = "TachygramTransport has successfully processed message sending."
            r1.q(r2)
            cnhu r1 = r6.d
            r1.a(r7)
            aubq r1 = r7.d
            if (r1 != 0) goto L4d
            aubq r1 = defpackage.aubq.a
        L4d:
            int r1 = r1.c
            aubp r1 = defpackage.aubp.b(r1)
            if (r1 != 0) goto L57
            aubp r1 = defpackage.aubp.UNKNOWN_TYPE
        L57:
            aubp r2 = defpackage.aubp.PHONE
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L83
            ekrw r0 = r0.h()
            eksl r0 = (defpackage.eksl) r0
            ekrz r2 = defpackage.atnw.c
            r0.X(r2, r1)
            java.lang.String r1 = "revocationSupported"
            r2 = 405(0x195, float:5.68E-43)
            ekrw r0 = r0.h(r4, r1, r2, r5)
            eksl r0 = (defpackage.eksl) r0
            java.lang.String r1 = "Message revocation not supported. We are not talking to a one to one recipient."
            r0.q(r1)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            eiju r0 = defpackage.eijx.e(r0)
            goto Ld8
        L83:
            aufx r0 = r7.m
            if (r0 != 0) goto L89
            aufx r0 = defpackage.aufx.a
        L89:
            int r1 = r0.c
            aufw r1 = defpackage.aufw.b(r1)
            if (r1 != 0) goto L93
            aufw r1 = defpackage.aufw.UNKNOWN_MESSAGE_SOURCE
        L93:
            aufw r2 = defpackage.aufw.USER
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lbb
            int r1 = r0.d
            aufu r1 = defpackage.aufu.b(r1)
            if (r1 != 0) goto La5
            aufu r1 = defpackage.aufu.UNKNOWN_MESSAGE_PRIORITY
        La5:
            aufu r2 = defpackage.aufu.HIGH
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lbb
            boolean r0 = r0.e
            if (r0 != 0) goto Lbb
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            eiju r0 = defpackage.eijx.e(r0)
            goto Ld8
        Lbb:
            fcsu r0 = r6.h
            java.lang.Object r0 = r0.b()
            awhr r0 = (defpackage.awhr) r0
            aubq r1 = r7.d
            if (r1 != 0) goto Lc9
            aubq r1 = defpackage.aubq.a
        Lc9:
            eiju r0 = r0.d(r1)
            cngs r1 = new cngs
            r1.<init>()
            eosc r2 = r6.c
            eiju r0 = r0.h(r1, r2)
        Ld8:
            cngp r1 = new cngp
            r1.<init>()
            eosc r8 = r6.c
            eiju r0 = r0.h(r1, r8)
            cngm r1 = new cngm
            r1.<init>()
            eiju r0 = r0.i(r1, r8)
            cngn r1 = new cngn
            r1.<init>()
            eiju r7 = r0.h(r1, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cngv.e(java.lang.Object, java.lang.Object):eiju");
    }

    @Override // defpackage.cnfu
    public final /* bridge */ /* synthetic */ String g(Object obj) {
        augw augwVar = (augw) obj;
        aubq aubqVar = augwVar.d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        ejwl.m(aubpVarB.equals(aubp.GROUP), "getRcsGroupId called on a non-group operation.");
        return augwVar.i;
    }

    @Override // defpackage.cnfu
    public final String h() {
        return "TachygramSendMessageOperation";
    }

    @Override // defpackage.cnfu
    public final boolean i() {
        return true;
    }
}
