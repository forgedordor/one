package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnfv {
    public static final eksp a = eksp.c("BugleTachygram");
    public final cnfu b;
    public final eosc c;
    public final eosc d;
    public final ceni e;
    public final aujf f;
    public final asrc g;
    public final fcsu h;
    public final eosd i;
    public final cogw j;
    public final ardl k;
    public final awng l;
    private final Set m;
    private final cnbn n = new cnbn();
    private final ains o;

    public cnfv(cnfu cnfuVar, eosc eoscVar, eosc eoscVar2, ceni ceniVar, Set set, aujf aujfVar, asrc asrcVar, fcsu fcsuVar, eosd eosdVar, ains ainsVar, cogw cogwVar, ardl ardlVar, awng awngVar) {
        this.b = cnfuVar;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = ceniVar;
        this.m = set;
        this.f = aujfVar;
        this.g = asrcVar;
        this.h = fcsuVar;
        this.i = eosdVar;
        this.o = ainsVar;
        this.j = cogwVar;
        this.k = ardlVar;
        this.l = awngVar;
    }

    public final eiju a(final eqcx eqcxVar, final Object obj) {
        if (eqcxVar instanceof eqco) {
            return e(obj, eqcxVar.a);
        }
        f("Tachygram user suspended by the server. Triggering re-provisioning.", eqcxVar);
        ArrayList arrayList = new ArrayList();
        ekqg ekqgVarListIterator = ((ekph) this.m).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            arrayList.add(((cfsa) ekqgVarListIterator.next()).a(cnln.b(this.b.b(obj))));
        }
        return eijx.j(arrayList).b(new eooy() { // from class: cnfl
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return this.a.e(obj, eqcxVar.a);
            }
        }, this.c);
    }

    public final eiju b(final eqcx eqcxVar, final Object obj) {
        f("call into chat api to remove user from group.", eqcxVar);
        cnfu cnfuVar = this.b;
        aubq aubqVarB = cnfuVar.b(obj);
        String strG = cnfuVar.g(obj);
        final audb audbVar = (audb) audc.c.createBuilder();
        audbVar.copyOnWrite();
        audc audcVar = (audc) audbVar.instance;
        strG.getClass();
        audcVar.d |= 1;
        audcVar.e = strG;
        audbVar.f(aubqVarB);
        audbVar.copyOnWrite();
        audc audcVar2 = (audc) audbVar.instance;
        aubqVarB.getClass();
        audcVar2.t = aubqVarB;
        audcVar2.d |= 4096;
        return (this.k.a() ? this.l.c(strG).h(new cnfs(), this.d) : eijx.e(Optional.empty())).i(new eooz() { // from class: cnft
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                final audb audbVar2 = audbVar;
                ((Optional) obj2).ifPresent(new Consumer() { // from class: cnfh
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj3) {
                        eksp ekspVar = cnfv.a;
                        awso awsoVarB = awou.b((awpx) obj3);
                        audb audbVar3 = audbVar2;
                        audbVar3.copyOnWrite();
                        audc audcVar3 = (audc) audbVar3.instance;
                        evsy evsyVar = audc.a;
                        audcVar3.f = awsoVarB;
                        audcVar3.d |= 4;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                cnfv cnfvVar = this.a;
                if (!cnfvVar.k.a()) {
                    return cnfvVar.g.c((audc) audbVar2.build());
                }
                asrc asrcVar = cnfvVar.g;
                aued auedVar = (aued) auee.a.createBuilder();
                auedVar.a(audbVar2);
                return asrcVar.e((auee) auedVar.build());
            }
        }, this.d).i(new eooz() { // from class: cnff
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj2) {
                return this.a.e(obj, eqcxVar.a);
            }
        }, this.c);
    }

    public final eiju c(cayy cayyVar, Object obj) {
        return d(obj, cayyVar, null).h(new ejvr() { // from class: cnfi
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return ataw.b((atav) obj2);
            }
        }, eoqg.a);
    }

    public final eiju d(final Object obj, final cayy cayyVar, Function function) {
        eksl ekslVar = (eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "processInternalAndCatch", 146, "TachygramOutgoingOperationTemplate.java");
        cnfu cnfuVar = this.b;
        ekslVar.t("Executing outgoing tachygram operation %s", cnfuVar.h());
        final long jA = this.j.a();
        eieu eieuVarK = eiiy.k("TachygramOutgoingOperationTemplate::process::networkCall");
        try {
            eiju eijuVarC = cnfuVar.c(obj);
            if (function != null) {
                eijuVarC = (eiju) function.apply(eijuVarC);
            }
            eieuVarK.b(eijuVarC);
            eieuVarK.close();
            return eijuVarC.i(new eooz() { // from class: cnfp
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    eksl ekslVar2 = (eksl) ((eksl) cnfv.a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "processInternalAndCatch", 162, "TachygramOutgoingOperationTemplate.java");
                    cnfv cnfvVar = this.a;
                    long jA2 = cnfvVar.j.a() - jA;
                    cnfu cnfuVar2 = cnfvVar.b;
                    ekslVar2.C("Executed outgoing tachygram operation %s, latency[ms]=%d", cnfuVar2.h(), jA2);
                    return cnfuVar2.e(obj, obj2);
                }
            }, this.d).h(new ejvr() { // from class: cnfq
                @Override // defpackage.ejvr
                public final Object apply(Object obj2) {
                    return this.a.g(1, (aubl) obj2);
                }
            }, eoqg.a).f(eqcx.class, new eooz() { // from class: cnfr
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj2) {
                    final cnfv cnfvVar = this.a;
                    final eqcx eqcxVar = (eqcx) obj2;
                    cnfu cnfuVar2 = cnfvVar.b;
                    final Object obj3 = obj;
                    if (cnfuVar2.i()) {
                        eqcs eqcsVar = eqcxVar.a;
                        int iOrdinal = eqcsVar.c.ordinal();
                        if (iOrdinal == 0 || iOrdinal == 1) {
                            cnfvVar.f("call into chat api to maybe try the operation again.", eqcxVar);
                            return cnfvVar.e(obj3, eqcsVar);
                        }
                        if (iOrdinal == 3) {
                            return cnfvVar.a(eqcxVar, obj3);
                        }
                        if (iOrdinal == 4) {
                            ejwl.m(!cnfuVar2.g(obj3).isEmpty(), "Group recovery invoked on a non-group operation");
                        } else if (iOrdinal == 5) {
                            return cnfvVar.b(eqcxVar, obj3);
                        }
                        cnfvVar.f("call into chat api to maybe try the operation again.", eqcxVar);
                        return cnfvVar.e(obj3, eqcsVar);
                    }
                    cayy cayyVar2 = cayyVar;
                    if (cayyVar2 != null && !cayyVar2.c()) {
                        cnfvVar.f("call into chat api to maybe try the operation again.", eqcxVar);
                        return cnfvVar.e(obj3, eqcxVar.a);
                    }
                    eqcs eqcsVar2 = eqcxVar.a;
                    switch (eqcsVar2.c.ordinal()) {
                        case 0:
                            cnfvVar.f("call into chat api to maybe try the operation again.", eqcxVar);
                            return cnfvVar.e(obj3, eqcsVar2);
                        case 1:
                            cnfvVar.f("returning work queue result to retry.", eqcxVar);
                            return eijx.e(atav.FAIL_RETRY);
                        case 2:
                            aubq aubqVarB = cnfuVar2.b(obj3);
                            if (aubqVarB.d.isEmpty()) {
                                cnfvVar.f("attempting to refresh registration but empty chat endpoint is found.", eqcxVar);
                                return cnfvVar.e(obj3, eqcsVar2);
                            }
                            cnfvVar.f("refreshing registration and returning work queue result to retry.", eqcxVar);
                            return cnfvVar.e.c(aubqVarB).h(new ejvr() { // from class: cnfg
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj4) {
                                    eksp ekspVar = cnfv.a;
                                    return atav.FAIL_RETRY;
                                }
                            }, cnfvVar.c);
                        case 3:
                            return cnfvVar.a(eqcxVar, obj3);
                        case 4:
                            cnfvVar.f("call into chat api to re-create the group and retry the operation.", eqcxVar);
                            String strG = cnfuVar2.g(obj3);
                            final audb audbVar = (audb) audc.c.createBuilder();
                            audbVar.copyOnWrite();
                            audc audcVar = (audc) audbVar.instance;
                            strG.getClass();
                            audcVar.d |= 1;
                            audcVar.e = strG;
                            aucs aucsVar = (aucs) aucv.a.createBuilder();
                            aucu aucuVar = aucu.CAUSE_GROUP_NOT_FOUND;
                            aucsVar.copyOnWrite();
                            aucv aucvVar = (aucv) aucsVar.instance;
                            aucvVar.c = aucuVar.d;
                            aucvVar.b = 1 | aucvVar.b;
                            audbVar.copyOnWrite();
                            audc audcVar2 = (audc) audbVar.instance;
                            aucv aucvVar2 = (aucv) aucsVar.build();
                            aucvVar2.getClass();
                            audcVar2.s = aucvVar2;
                            audcVar2.d |= 2048;
                            aubq aubqVarB2 = cnfuVar2.b(obj3);
                            audbVar.copyOnWrite();
                            audc audcVar3 = (audc) audbVar.instance;
                            aubqVarB2.getClass();
                            audcVar3.t = aubqVarB2;
                            audcVar3.d |= 4096;
                            return (cnfvVar.k.a() ? cnfvVar.l.c(strG).h(new cnfs(), cnfvVar.d) : eijx.e(Optional.empty())).i(new eooz() { // from class: cnfj
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj4) {
                                    final audb audbVar2 = audbVar;
                                    ((Optional) obj4).ifPresent(new Consumer() { // from class: cnfo
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj5) {
                                            eksp ekspVar = cnfv.a;
                                            awso awsoVarB = awou.b((awpx) obj5);
                                            audb audbVar3 = audbVar2;
                                            audbVar3.copyOnWrite();
                                            audc audcVar4 = (audc) audbVar3.instance;
                                            evsy evsyVar = audc.a;
                                            audcVar4.f = awsoVarB;
                                            audcVar4.d |= 4;
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    cnfv cnfvVar2 = cnfvVar;
                                    if (!cnfvVar2.k.a()) {
                                        return cnfvVar2.g.c((audc) audbVar2.build());
                                    }
                                    asrc asrcVar = cnfvVar2.g;
                                    aued auedVar = (aued) auee.a.createBuilder();
                                    auedVar.a(audbVar2);
                                    return asrcVar.e((auee) auedVar.build());
                                }
                            }, cnfvVar.d).i(new eooz() { // from class: cnfk
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj4) {
                                    return cnfvVar.e(obj3, eqcxVar.a);
                                }
                            }, cnfvVar.c);
                        case 5:
                            return cnfvVar.b(eqcxVar, obj3);
                        case 6:
                            return cnfvVar.f.a(new aujc(cnfuVar2.a(obj3))).i(new eooz() { // from class: cnfn
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj4) {
                                    return cnfvVar.e(obj3, eqcxVar.a);
                                }
                            }, eoqg.a);
                        default:
                            cnfvVar.f("Unknown Tachygram RecoveryType.", eqcxVar);
                            return cnfvVar.e(obj3, eqcsVar2);
                    }
                }
            }, this.c);
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju e(Object obj, eqcs eqcsVar) {
        return this.b.d(obj, this.n.apply(eqcsVar)).h(new ejvr() { // from class: cnfm
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                return this.a.g(2, (aubl) obj2);
            }
        }, this.c);
    }

    public final void f(String str, eqcx eqcxVar) {
        if (((Boolean) ((cczi) crbf.bL.get()).e()).booleanValue() && (eqcxVar.getCause() instanceof cnis)) {
            if (((Boolean) ((cczi) crbf.bM.get()).e()).booleanValue()) {
                this.o.c("Bugle.Penpal.Transport.OAuth2.Tachygram.FailureWithRefresh");
            } else {
                this.o.c("Bugle.Penpal.Transport.OAuth2.Tachygram.Failure");
            }
        }
        if (!(eqcxVar instanceof eqgc)) {
            ((eksl) ((eksl) ((eksl) a.j()).g(eqcxVar)).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "logTachygramException", 490, "TachygramOutgoingOperationTemplate.java")).D("%s failed: %s", this.b.h(), str);
            return;
        }
        eksl ekslVar = (eksl) ((eksl) a.j()).g(eqcxVar);
        ekrz ekrzVar = cnjh.a;
        Status status = ((eqgc) eqcxVar).c;
        ekslVar.X(ekrzVar, status.t);
        ekslVar.X(cnjh.b, status.getDescription());
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "logTachygramException", 487, "TachygramOutgoingOperationTemplate.java")).D("%s failed: %s", this.b.h(), str);
    }

    public final atav g(int i, aubl aublVar) {
        if (i == 1) {
            aubk aubkVarB = aubk.b(aublVar.c);
            if (aubkVarB == null) {
                aubkVarB = aubk.UNKNOWN_STATUS;
            }
            if (aubkVarB.equals(aubk.OK)) {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "handleProcessingComplete", 498, "TachygramOutgoingOperationTemplate.java")).t("Successfully completed %s", this.b.h());
                return atav.SUCCESS;
            }
        }
        eksl ekslVar = (eksl) a.j();
        ekrz ekrzVar = atnw.b;
        aubk aubkVarB2 = aubk.b(aublVar.c);
        if (aubkVarB2 == null) {
            aubkVarB2 = aubk.UNKNOWN_STATUS;
        }
        ekslVar.X(ekrzVar, aubkVarB2);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "handleProcessingComplete", 504, "TachygramOutgoingOperationTemplate.java")).t("Failed to complete %s, returning work queue result to no retry.", this.b.h());
        return atav.FAIL_NO_RETRY;
    }
}
