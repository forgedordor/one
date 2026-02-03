package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cijr extends cayv {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final eosc b;
    public final eosc c;
    public final eosc d;
    public final fcsu e;
    public final asre f;
    public final asqx g;
    public final fcsu h;
    public final asrc i;
    public final ardl j;
    public final awng k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    private final avnh o;
    private final bbfn p;

    public cijr(eosc eoscVar, eosc eoscVar2, eosc eoscVar3, fcsu fcsuVar, avnh avnhVar, bbfn bbfnVar, asre asreVar, asqx asqxVar, fcsu fcsuVar2, asrc asrcVar, ardl ardlVar, awng awngVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        this.b = eoscVar;
        this.d = eoscVar2;
        this.c = eoscVar3;
        this.e = fcsuVar;
        this.o = avnhVar;
        this.p = bbfnVar;
        this.f = asreVar;
        this.g = asqxVar;
        this.h = fcsuVar2;
        this.i = asrcVar;
        this.j = ardlVar;
        this.k = awngVar;
        this.l = fcsuVar3;
        this.m = fcsuVar4;
        this.n = fcsuVar5;
    }

    public static boolean m(ciju cijuVar) {
        cijt cijtVarB = cijt.b(cijuVar.d);
        if (cijtVarB == null) {
            cijtVarB = cijt.UNRECOGNIZED;
        }
        if (cijtVarB.equals(cijt.DELETE)) {
            return true;
        }
        cijt cijtVarB2 = cijt.b(cijuVar.d);
        if (cijtVarB2 == null) {
            cijtVarB2 = cijt.UNRECOGNIZED;
        }
        return cijtVarB2.equals(cijt.DELETE_IF_EMPTY);
    }

    public static boolean n(aubl aublVar) {
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        if (Objects.equals(aubkVarB, aubk.OK)) {
            return false;
        }
        aubk aubkVarB2 = aubk.b(aublVar.c);
        if (aubkVarB2 == null) {
            aubkVarB2 = aubk.UNKNOWN_STATUS;
        }
        return !Objects.equals(aubkVarB2, aubk.PENDING);
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        ((caxk) caxzVarL).c = elgm.LEAVE_RCS_CONVERSATION_ACTION;
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("LeaveRcsGroupConversationHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return ciju.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final ciju cijuVar = (ciju) evuhVar;
        return eijx.h(new eooy() { // from class: cijf
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eiju eijuVarD;
                final ciju cijuVar2 = cijuVar;
                ConversationIdType conversationIdTypeB = barn.b(cijuVar2.c);
                final UUID uuidRandomUUID = UUID.randomUUID();
                final cijr cijrVar = this.a;
                fcsu fcsuVar = cijrVar.l;
                if (!((ardx) fcsuVar.b()).a()) {
                    int size = ((bakt) cijrVar.e.b()).K(conversationIdTypeB).size();
                    int i = size - 1;
                    cifw cifwVar = (cifw) cijrVar.h.b();
                    uuidRandomUUID.getClass();
                    String string = uuidRandomUUID.toString();
                    ellz ellzVar = (ellz) elma.a.createBuilder();
                    ellzVar.getClass();
                    ellzVar.copyOnWrite();
                    elma elmaVar = (elma) ellzVar.instance;
                    elmaVar.b |= 1;
                    elmaVar.c = size;
                    ellzVar.copyOnWrite();
                    elma elmaVar2 = (elma) ellzVar.instance;
                    elmaVar2.b |= 2;
                    elmaVar2.d = i;
                    evsn evsnVarBuild = ellzVar.build();
                    evsnVarBuild.getClass();
                    cifw.v(cifwVar, 20, 0, string, null, (elma) evsnVarBuild, null, 0, null, null, 490);
                }
                final bojh bojhVarR = ((bakt) cijrVar.e.b()).r(conversationIdTypeB);
                if (bojhVarR == null) {
                    ekrw ekrwVarN = cijr.a.n();
                    ekrwVarN.X(cqnc.r, conversationIdTypeB.toString());
                    ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 187, "LeaveRcsGroupConversationHandler.java")).q("Cannot leave RCS group conversation. The conversation does not exist.");
                    if (((ardx) fcsuVar.b()).a()) {
                        cifw cifwVar2 = (cifw) cijrVar.h.b();
                        auib auibVar = cijuVar2.h;
                        if (auibVar == null) {
                            auibVar = auib.a;
                        }
                        cifwVar2.w(auibVar, 2);
                    } else {
                        ((cifw) cijrVar.h.b()).r(uuidRandomUUID.toString(), null, 2, 2);
                    }
                    return eijx.e(cbcw.k());
                }
                if (bojhVarR.k() != 2) {
                    eksl ekslVar = (eksl) cijr.a.j();
                    ekslVar.X(cqnc.r, conversationIdTypeB.toString());
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 214, "LeaveRcsGroupConversationHandler.java")).q("Cannot leave conversation because this is not an RCS group conversation.");
                    if (((ardx) fcsuVar.b()).a()) {
                        cifw cifwVar3 = (cifw) cijrVar.h.b();
                        auib auibVar2 = cijuVar2.h;
                        if (auibVar2 == null) {
                            auibVar2 = auib.a;
                        }
                        cifwVar3.x(auibVar2, null, 3, cijrVar.k(bojhVarR));
                    } else {
                        ((cifw) cijrVar.h.b()).r(uuidRandomUUID.toString(), null, 2, 3);
                    }
                    return eijx.e(cbcw.k());
                }
                int iN = bojhVarR.n();
                switch (iN) {
                    case 0:
                    case 1:
                        if (!ejwk.c(bojhVarR.ad())) {
                            if ((cijuVar2.b & 8) != 0) {
                                aubq aubqVar = cijuVar2.g;
                                if (aubqVar == null) {
                                    aubqVar = aubq.a;
                                }
                                eijuVarD = eijx.e(aubqVar);
                            } else {
                                eijuVarD = eijx.d(new chsq());
                            }
                            eiju eijuVarI = eijuVarD.i(new eooz() { // from class: cijl
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj) {
                                    long jA;
                                    auib auibVar3;
                                    final aubq aubqVar2 = (aubq) obj;
                                    final bojh bojhVar = bojhVarR;
                                    String strAe = bojhVar.ae();
                                    strAe.getClass();
                                    String strAd = bojhVar.ad();
                                    strAd.getClass();
                                    audt audtVar = (audt) audu.a.createBuilder();
                                    audtVar.copyOnWrite();
                                    audu auduVar = (audu) audtVar.instance;
                                    auduVar.b |= 1;
                                    auduVar.c = strAe;
                                    final cijr cijrVar2 = cijrVar;
                                    aubq aubqVarA = cijrVar2.g.a(strAd, true);
                                    audtVar.copyOnWrite();
                                    audu auduVar2 = (audu) audtVar.instance;
                                    aubqVarA.getClass();
                                    auduVar2.d = aubqVarA;
                                    auduVar2.b |= 2;
                                    audu auduVar3 = (audu) audtVar.build();
                                    augf augfVar = (augf) augg.a.createBuilder();
                                    augfVar.copyOnWrite();
                                    augg auggVar = (augg) augfVar.instance;
                                    auggVar.b |= 1;
                                    auggVar.c = strAe;
                                    final UUID uuid = uuidRandomUUID;
                                    String string2 = uuid.toString();
                                    augfVar.copyOnWrite();
                                    augg auggVar2 = (augg) augfVar.instance;
                                    string2.getClass();
                                    auggVar2.b |= 8;
                                    auggVar2.e = string2;
                                    final ciju cijuVar3 = cijuVar2;
                                    auib auibVar4 = cijuVar3.h;
                                    if (auibVar4 == null) {
                                        auibVar4 = auib.a;
                                    }
                                    augfVar.copyOnWrite();
                                    augg auggVar3 = (augg) augfVar.instance;
                                    auibVar4.getClass();
                                    auggVar3.f = auibVar4;
                                    auggVar3.b |= 16;
                                    if (((armi) cijrVar2.n.b()).a()) {
                                        cbqz cbqzVarJ = bojhVar.J();
                                        cbqz cbqzVar = cbqz.a;
                                        jA = cbqy.a(cbqzVarJ);
                                    } else {
                                        jA = 0;
                                    }
                                    augfVar.copyOnWrite();
                                    augg auggVar4 = (augg) augfVar.instance;
                                    auggVar4.b |= 32;
                                    auggVar4.g = jA;
                                    augg auggVar5 = (augg) augfVar.build();
                                    augh aughVar = (augh) augi.a.createBuilder();
                                    aughVar.copyOnWrite();
                                    augi augiVar = (augi) aughVar.instance;
                                    auduVar3.getClass();
                                    augiVar.c = auduVar3;
                                    augiVar.b |= 1;
                                    evqs byteString = auggVar5.toByteString();
                                    aughVar.copyOnWrite();
                                    augi augiVar2 = (augi) aughVar.instance;
                                    augiVar2.b |= 2;
                                    augiVar2.e = byteString;
                                    aughVar.a(aubqVar2);
                                    if (!((areb) cijrVar2.m.b()).a() || (auibVar3 = cijuVar3.h) == null) {
                                        auibVar3 = auib.a;
                                    }
                                    aughVar.copyOnWrite();
                                    augi augiVar3 = (augi) aughVar.instance;
                                    auibVar3.getClass();
                                    augiVar3.g = auibVar3;
                                    augiVar3.b |= 8;
                                    aughVar.copyOnWrite();
                                    augi augiVar4 = (augi) aughVar.instance;
                                    aubqVar2.getClass();
                                    augiVar4.f = aubqVar2;
                                    augiVar4.b |= 4;
                                    return cijrVar2.f.c((augi) aughVar.build()).i(new eooz() { // from class: cijq
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj2) {
                                            augk augkVar = (augk) obj2;
                                            int i2 = augkVar.b & 1;
                                            final cijr cijrVar3 = cijrVar2;
                                            final bojh bojhVar2 = bojhVar;
                                            final UUID uuid2 = uuid;
                                            final ciju cijuVar4 = cijuVar3;
                                            if (i2 == 0) {
                                                boolean z = !cijuVar4.f;
                                                auib auibVar5 = cijuVar4.h;
                                                if (auibVar5 == null) {
                                                    auibVar5 = auib.a;
                                                }
                                                cijrVar3.q(bojhVar2, null, uuid2, null, 8, z, auibVar5);
                                                return eijx.e(cbcw.k());
                                            }
                                            aubl aublVar = augkVar.c;
                                            if (aublVar == null) {
                                                aublVar = aubl.a;
                                            }
                                            aubl aublVar2 = aublVar;
                                            if (!cijr.n(aublVar2)) {
                                                final aubq aubqVar3 = aubqVar2;
                                                return (eiju) Optional.ofNullable(bojhVar2.ae()).map(new Function() { // from class: cijo
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj3) {
                                                        final cijr cijrVar4 = cijrVar3;
                                                        final String str = (String) obj3;
                                                        eiju eijuVarH = cijrVar4.j.a() ? cijrVar4.k.c(str).h(new ejvr() { // from class: ciji
                                                            @Override // defpackage.ejvr
                                                            public final Object apply(Object obj4) {
                                                                return Optional.of((awpx) obj4);
                                                            }
                                                        }, cijrVar4.c) : eijx.e(Optional.empty());
                                                        final ciju cijuVar5 = cijuVar4;
                                                        final UUID uuid3 = uuid2;
                                                        final bojh bojhVar3 = bojhVar2;
                                                        final aubq aubqVar4 = aubqVar3;
                                                        return eijuVarH.i(new eooz() { // from class: cijj
                                                            @Override // defpackage.eooz
                                                            public final ListenableFuture a(Object obj4) {
                                                                final audb audbVar = (audb) audc.c.createBuilder();
                                                                audbVar.copyOnWrite();
                                                                audc audcVar = (audc) audbVar.instance;
                                                                String str2 = str;
                                                                str2.getClass();
                                                                audcVar.d |= 1;
                                                                audcVar.e = str2;
                                                                audbVar.copyOnWrite();
                                                                audc audcVar2 = (audc) audbVar.instance;
                                                                aubq aubqVar5 = aubqVar4;
                                                                aubqVar5.getClass();
                                                                audcVar2.t = aubqVar5;
                                                                audcVar2.d |= 4096;
                                                                audbVar.f(aubqVar5);
                                                                aufa aufaVar = (aufa) aufb.a.createBuilder();
                                                                aufaVar.copyOnWrite();
                                                                aufb aufbVar = (aufb) aufaVar.instance;
                                                                aubqVar5.getClass();
                                                                aufbVar.c = aubqVar5;
                                                                aufbVar.b |= 1;
                                                                aufb aufbVar2 = (aufb) aufaVar.build();
                                                                audbVar.copyOnWrite();
                                                                audc audcVar3 = (audc) audbVar.instance;
                                                                aufbVar2.getClass();
                                                                audcVar3.r = aufbVar2;
                                                                audcVar3.d |= 1024;
                                                                ((Optional) obj4).ifPresent(new Consumer() { // from class: cijh
                                                                    @Override // java.util.function.Consumer
                                                                    /* renamed from: accept */
                                                                    public final void z(Object obj5) {
                                                                        eksp ekspVar = cijr.a;
                                                                        awso awsoVarB = awou.b((awpx) obj5);
                                                                        audb audbVar2 = audbVar;
                                                                        audbVar2.copyOnWrite();
                                                                        audc audcVar4 = (audc) audbVar2.instance;
                                                                        evsy evsyVar = audc.a;
                                                                        audcVar4.f = awsoVarB;
                                                                        audcVar4.d |= 4;
                                                                    }

                                                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                                        return Consumer$CC.$default$andThen(this, consumer);
                                                                    }
                                                                });
                                                                cijr cijrVar5 = cijrVar4;
                                                                if (!cijrVar5.j.a()) {
                                                                    return cijrVar5.i.c((audc) audbVar.build());
                                                                }
                                                                asrc asrcVar = cijrVar5.i;
                                                                aued auedVar = (aued) auee.a.createBuilder();
                                                                auedVar.b((audc) audbVar.build());
                                                                return asrcVar.e((auee) auedVar.build());
                                                            }
                                                        }, cijrVar4.c).h(new ejvr() { // from class: cijk
                                                            @Override // defpackage.ejvr
                                                            public final Object apply(Object obj4) {
                                                                aubl aublVar3 = (aubl) obj4;
                                                                boolean zN = cijr.n(aublVar3);
                                                                cijr cijrVar5 = cijrVar4;
                                                                bojh bojhVar4 = bojhVar3;
                                                                UUID uuid4 = uuid3;
                                                                ciju cijuVar6 = cijuVar5;
                                                                if (zN) {
                                                                    boolean z2 = !cijuVar6.f;
                                                                    auib auibVar6 = cijuVar6.h;
                                                                    if (auibVar6 == null) {
                                                                        auibVar6 = auib.a;
                                                                    }
                                                                    cijrVar5.o(bojhVar4, uuid4, aublVar3, z2, auibVar6);
                                                                    return cbcw.k();
                                                                }
                                                                if (((ardx) cijrVar5.l.b()).a()) {
                                                                    cifw cifwVar4 = (cifw) cijrVar5.h.b();
                                                                    auib auibVar7 = cijuVar6.h;
                                                                    if (auibVar7 == null) {
                                                                        auibVar7 = auib.a;
                                                                    }
                                                                    cifwVar4.k(auibVar7, cijrVar5.k(bojhVar4));
                                                                } else {
                                                                    ((cifw) cijrVar5.h.b()).j(uuid4.toString());
                                                                }
                                                                return cbcw.i();
                                                            }
                                                        }, cijrVar4.b);
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }).orElseGet(new Supplier() { // from class: cijp
                                                    @Override // java.util.function.Supplier
                                                    public final Object get() {
                                                        ciju cijuVar5 = cijuVar4;
                                                        boolean z2 = !cijuVar5.f;
                                                        auib auibVar6 = cijuVar5.h;
                                                        if (auibVar6 == null) {
                                                            auibVar6 = auib.a;
                                                        }
                                                        UUID uuid3 = uuid2;
                                                        cijrVar3.q(bojhVar2, null, uuid3, null, 9, z2, auibVar6);
                                                        return eijx.e(cbcw.k());
                                                    }
                                                });
                                            }
                                            boolean z2 = !cijuVar4.f;
                                            auib auibVar6 = cijuVar4.h;
                                            if (auibVar6 == null) {
                                                auibVar6 = auib.a;
                                            }
                                            cijrVar3.o(bojhVar2, uuid2, aublVar2, z2, auibVar6);
                                            return eijx.e(cbcw.k());
                                        }
                                    }, cijrVar2.b);
                                }
                            }, cijrVar.d);
                            ejvr ejvrVar = new ejvr() { // from class: cijm
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    return cijrVar.p(bojhVarR, (asrb) obj, uuidRandomUUID, 6, cijuVar2);
                                }
                            };
                            eosc eoscVar = cijrVar.b;
                            return eijuVarI.e(asrb.class, ejvrVar, eoscVar).e(chsq.class, new ejvr() { // from class: cijn
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    return cijrVar.p(bojhVarR, (chsq) obj, uuidRandomUUID, 7, cijuVar2);
                                }
                            }, eoscVar);
                        }
                        eksl ekslVar2 = (eksl) cijr.a.j();
                        ekslVar2.X(cqnc.r, bojhVarR.C().toString());
                        ekslVar2.X(cqnc.N, bojhVarR.ae());
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "leaveConversationWithoutValidConferenceUri", 513, "LeaveRcsGroupConversationHandler.java")).q("Attempting to leave RCS group conversation without conference URI.");
                        if (cijr.m(cijuVar2)) {
                            return cijrVar.l(cijuVar2, bojhVarR.C());
                        }
                        boolean z = !cijuVar2.f;
                        auib auibVar3 = cijuVar2.h;
                        if (auibVar3 == null) {
                            auibVar3 = auib.a;
                        }
                        cijrVar.q(bojhVarR, null, uuidRandomUUID, null, 10, z, auibVar3);
                        return eijx.e(cbcw.k());
                    case 2:
                    case 3:
                    case 5:
                    case 6:
                        ekrw ekrwVarN2 = cijr.a.n();
                        ekrwVarN2.X(cqnc.r, conversationIdTypeB.toString());
                        ekrwVarN2.X(cqnc.K, bvdh.a(iN));
                        ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 251, "LeaveRcsGroupConversationHandler.java")).q("Leaving RCS group in a join state that should not trigger a server leave group request.");
                        if (!cijr.m(cijuVar2)) {
                            boolean z2 = !cijuVar2.f;
                            auib auibVar4 = cijuVar2.h;
                            if (auibVar4 == null) {
                                auibVar4 = auib.a;
                            }
                            cijrVar.q(bojhVarR, null, uuidRandomUUID, null, 4, z2, auibVar4);
                            return eijx.e(cbcw.k());
                        }
                        if (((ardx) fcsuVar.b()).a()) {
                            cifw cifwVar4 = (cifw) cijrVar.h.b();
                            auib auibVar5 = cijuVar2.h;
                            if (auibVar5 == null) {
                                auibVar5 = auib.a;
                            }
                            cifwVar4.k(auibVar5, cijrVar.k(bojhVarR));
                        } else {
                            ((cifw) cijrVar.h.b()).j(uuidRandomUUID.toString());
                        }
                        return cijrVar.l(cijuVar2, conversationIdTypeB);
                    case 4:
                    case 7:
                    case 8:
                        ekrw ekrwVarN3 = cijr.a.n();
                        ekrwVarN3.X(cqnc.r, conversationIdTypeB.toString());
                        ekrwVarN3.X(cqnc.K, bvdh.a(iN));
                        ((eksl) ekrwVarN3.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "processPendingWorkItem", 289, "LeaveRcsGroupConversationHandler.java")).q("Leaving RCS group in a pending setup join state.");
                        boolean z3 = !cijuVar2.f;
                        auib auibVar6 = cijuVar2.h;
                        if (auibVar6 == null) {
                            auibVar6 = auib.a;
                        }
                        cijrVar.q(bojhVarR, null, uuidRandomUUID, null, 5, z3, auibVar6);
                        return eijx.e(cbcw.k());
                    case 9:
                        return eijx.e(cbcw.i());
                    default:
                        throw new IllegalStateException("Unhandled join state while leaving RCS group.");
                }
            }
        }, this.b);
    }

    public final cbqz k(bojh bojhVar) {
        return ((armi) this.n.b()).a() ? bojhVar.J() : cbqz.a;
    }

    public final eiju l(ciju cijuVar, ConversationIdType conversationIdType) {
        ekrw ekrwVarN = a.n();
        ekrwVarN.X(cqnc.r, conversationIdType.toString());
        eksl ekslVar = (eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "deleteConversation", 535, "LeaveRcsGroupConversationHandler.java");
        cijt cijtVarB = cijt.b(cijuVar.d);
        if (cijtVarB == null) {
            cijtVarB = cijt.UNRECOGNIZED;
        }
        ekslVar.t("We have successfully left the conversation. Deleting the conversation with a deletion strategy of %s.", cijtVarB);
        avnh avnhVar = this.o;
        avnk avnkVarF = avnl.f();
        avnkVarF.b(conversationIdType);
        evvp evvpVar = cijuVar.e;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        avnkVarF.c(evxc.a(evvpVar));
        cijt cijtVarB2 = cijt.b(cijuVar.d);
        if (cijtVarB2 == null) {
            cijtVarB2 = cijt.UNRECOGNIZED;
        }
        avnkVarF.e(cijtVarB2.equals(cijt.DELETE_IF_EMPTY));
        avnkVarF.f(elka.CONVERSATION_FROM_LIST);
        return avnhVar.a(avnkVarF.a()).h(new ejvr() { // from class: cijg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = cijr.a;
                return cbcw.i();
            }
        }, eoqg.a);
    }

    public final void o(bojh bojhVar, UUID uuid, aubl aublVar, boolean z, auib auibVar) {
        q(bojhVar, null, uuid, aublVar, 1, z, auibVar);
    }

    public final cbcw p(bojh bojhVar, Throwable th, UUID uuid, int i, ciju cijuVar) {
        boolean z = !cijuVar.f;
        auib auibVar = cijuVar.h;
        if (auibVar == null) {
            auibVar = auib.a;
        }
        q(bojhVar, th, uuid, null, i, z, auibVar);
        return cbcw.k();
    }

    public final void q(bojh bojhVar, Throwable th, UUID uuid, aubl aublVar, int i, boolean z, auib auibVar) {
        eksl ekslVar = (eksl) a.j();
        ekslVar.X(cqnc.r, bojhVar.C().toString());
        ekslVar.X(cqnc.N, bojhVar.ae());
        ekslVar.X(cqnc.L, Long.valueOf(bojhVar.v()));
        ((eksl) ((eksl) ekslVar.g(th)).h("com/google/android/apps/messaging/shared/rcs/groups/leave/LeaveRcsGroupConversationHandler", "handleLeaveGroupFailed", 600, "LeaveRcsGroupConversationHandler.java")).q("Error while leaving RCS group conversation.");
        if (z) {
            this.p.d(R.string.self_left_group_conversation_failed);
        }
        if (((ardx) this.l.b()).a()) {
            ((cifw) this.h.b()).x(auibVar, aublVar, i, k(bojhVar));
        } else {
            ((cifw) this.h.b()).r(uuid.toString(), aublVar, 2, i);
        }
    }
}
