package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cagn;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cagn extends cayv {
    static final cczi a = cdag.e(cdag.b, "cms_box_copy_multi_device_and_initial_sync_status_max_retry_attempts", 5);
    public static final eksp b = eksp.c("BugleCms");
    public final aurx c;
    public final axky d;
    public final Context e;
    public final eosc f;
    private final eosc g;

    /* compiled from: PG */
    public interface a {
        cpmc fr();

        cpmd fu();
    }

    public cagn(aurx aurxVar, axky axkyVar, Context context, eosc eoscVar, eosc eoscVar2) {
        this.c = aurxVar;
        this.d = axkyVar;
        this.e = context;
        this.g = eoscVar;
        this.f = eoscVar2;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.a);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxy.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        eksp ekspVar = b;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processPendingWorkItemAsync", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade steps triggered");
        if (((caxm) cayyVar.a()).c <= ((Integer) a.e()).intValue()) {
            return this.c.l().i(new eooz() { // from class: cagf
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    int iA = ausa.a(((ausb) obj).e);
                    if (iA != 0 && iA == 2) {
                        ((eksl) ((eksl) cagn.b.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processPendingWorkItemAsync", 117, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade skipped because upgrade was already performed on this device.");
                        return eijx.e(cbcw.i());
                    }
                    final cagn cagnVar = this.a;
                    eiju eijuVarA = cagnVar.d.a();
                    eooz eoozVar = new eooz() { // from class: cagj
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final cagn cagnVar2 = cagnVar;
                            cagn.a aVar = (cagn.a) ehlh.a(cagnVar2.e, cagn.a.class, (efwo) obj2);
                            ((eksl) cagn.b.n().h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processUpgradeTask", 147, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade step beginning migration of object status values.");
                            cpmc cpmcVarFr = aVar.fr();
                            final cpmd cpmdVarFu = aVar.fu();
                            eiju eijuVarR = cpmcVarFr.r("multidevice_status");
                            ejvr ejvrVar = new ejvr() { // from class: cagm
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    eqnd eqndVar = (eqnd) obj3;
                                    Collection arrayList = new ArrayList();
                                    if ((eqndVar.b & 4) != 0) {
                                        eqns eqnsVar = eqndVar.i;
                                        if (eqnsVar == null) {
                                            eqnsVar = eqns.a;
                                        }
                                        arrayList = eqnsVar.b;
                                    }
                                    Optional optionalFindFirst = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: cptw
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo538negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj4) {
                                            return ((eqnu) obj4).f.equals("multidevice_status@message.cms.google");
                                        }
                                    }).findFirst();
                                    if (optionalFindFirst.isEmpty()) {
                                        eplu epluVar = (eplu) eplw.a.createBuilder();
                                        eplv eplvVar = eplv.NOT_SET;
                                        epluVar.copyOnWrite();
                                        ((eplw) epluVar.instance).b = eplvVar.a();
                                        return (eplw) epluVar.build();
                                    }
                                    try {
                                        evqe evqeVar = ((eqnu) optionalFindFirst.get()).g;
                                        if (evqeVar == null) {
                                            evqeVar = evqe.a;
                                        }
                                        epkh epkhVar = (epkh) evsn.parseFrom(epkh.a, evqeVar.c, evrr.a());
                                        if (epkhVar.c != -1) {
                                            cqbd cqbdVarE = cpty.a.e();
                                            cqbdVarE.I("Could not parse MultiDeviceStatus object");
                                            cqbdVarE.A("ObjectId", eqndVar.c);
                                            cqbdVarE.A("Method", "parseMultiDeviceStatus");
                                            cqbdVarE.A("Cause", "EncryptedData doesn't have unencrypted key index.");
                                            cqbdVarE.r();
                                            eplu epluVar2 = (eplu) eplw.a.createBuilder();
                                            eplv eplvVar2 = eplv.NOT_SET;
                                            epluVar2.copyOnWrite();
                                            ((eplw) epluVar2.instance).b = eplvVar2.a();
                                            return (eplw) epluVar2.build();
                                        }
                                        try {
                                            return (eplw) evsn.parseFrom(eplw.a, epkhVar.b, evrr.a());
                                        } catch (evtj e) {
                                            cqbd cqbdVarE2 = cpty.a.e();
                                            cqbdVarE2.I("Could not parse MultiDeviceStatus object");
                                            cqbdVarE2.A("ObjectId", eqndVar.c);
                                            cqbdVarE2.A("Method", "parseMultiDeviceStatus");
                                            cqbdVarE2.A("Message", e.getMessage());
                                            cqbdVarE2.A("Cause", e.getCause());
                                            cqbdVarE2.r();
                                            eplu epluVar3 = (eplu) eplw.a.createBuilder();
                                            eplv eplvVar3 = eplv.NOT_SET;
                                            epluVar3.copyOnWrite();
                                            ((eplw) epluVar3.instance).b = eplvVar3.a();
                                            return (eplw) epluVar3.build();
                                        }
                                    } catch (evtj e2) {
                                        cqbd cqbdVarE3 = cpty.a.e();
                                        cqbdVarE3.I("Could not parse EncryptedData object");
                                        cqbdVarE3.A("ObjectId", eqndVar.c);
                                        cqbdVarE3.A("Method", "parseMultiDeviceStatus");
                                        cqbdVarE3.A("Message", e2.getMessage());
                                        cqbdVarE3.A("Cause", e2.getCause());
                                        cqbdVarE3.r();
                                        eplu epluVar4 = (eplu) eplw.a.createBuilder();
                                        eplv eplvVar4 = eplv.NOT_SET;
                                        epluVar4.copyOnWrite();
                                        ((eplw) epluVar4.instance).b = eplvVar4.a();
                                        return (eplw) epluVar4.build();
                                    }
                                }
                            };
                            eosc eoscVar = cagnVar2.f;
                            final eiju eijuVarE = eijuVarR.h(ejvrVar, eoscVar).e(fbtf.class, new ejvr() { // from class: cafy
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    fbtf fbtfVar = (fbtf) obj3;
                                    Status status = fbtfVar.a;
                                    eksp ekspVar2 = cagn.b;
                                    if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                                        throw fbtfVar;
                                    }
                                    ((eksl) ((eksl) ((eksl) cagn.b.j()).g(fbtfVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "updateBoxStatusWithCatching", (char) 199, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CloudMessageStoreClient Object does not contain MultiDeviceStatus, return default MultiDeviceStatus instance.");
                                    return eplw.a;
                                }
                            }, eoscVar);
                            final eiju eijuVarE2 = cpmcVarFr.r("initial_sync_status").h(new ejvr() { // from class: cafz
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    eqnd eqndVar = (eqnd) obj3;
                                    java.util.Collection arrayList = new ArrayList();
                                    if ((eqndVar.b & 4) != 0) {
                                        eqns eqnsVar = eqndVar.i;
                                        if (eqnsVar == null) {
                                            eqnsVar = eqns.a;
                                        }
                                        arrayList = eqnsVar.b;
                                    }
                                    Optional optionalFindFirst = Collection.EL.stream(arrayList).filter(new Predicate() { // from class: cptx
                                        public final /* synthetic */ Predicate and(Predicate predicate) {
                                            return Predicate$CC.$default$and(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        /* renamed from: negate */
                                        public final /* synthetic */ Predicate mo538negate() {
                                            return Predicate$CC.$default$negate(this);
                                        }

                                        public final /* synthetic */ Predicate or(Predicate predicate) {
                                            return Predicate$CC.$default$or(this, predicate);
                                        }

                                        @Override // java.util.function.Predicate
                                        public final boolean test(Object obj4) {
                                            return ((eqnu) obj4).f.equals("initial_sync_status@message.cms.google");
                                        }
                                    }).findFirst();
                                    if (optionalFindFirst.isEmpty()) {
                                        epki epkiVar = (epki) epkk.a.createBuilder();
                                        epkj epkjVar = epkj.NOT_SET;
                                        epkiVar.copyOnWrite();
                                        ((epkk) epkiVar.instance).b = epkjVar.a();
                                        return (epkk) epkiVar.build();
                                    }
                                    try {
                                        evqe evqeVar = ((eqnu) optionalFindFirst.get()).g;
                                        if (evqeVar == null) {
                                            evqeVar = evqe.a;
                                        }
                                        epkh epkhVar = (epkh) evsn.parseFrom(epkh.a, evqeVar.c, evrr.a());
                                        if (epkhVar.c != -1) {
                                            cqbd cqbdVarE = cpty.a.e();
                                            cqbdVarE.I("Could not parse InitialSyncStatus object");
                                            cqbdVarE.A("ObjectId", eqndVar.c);
                                            cqbdVarE.A("Method", "parseInitialSyncStatus");
                                            cqbdVarE.A("Cause", "EncryptedData doesn't have unencrypted key index.");
                                            cqbdVarE.r();
                                            epki epkiVar2 = (epki) epkk.a.createBuilder();
                                            epkj epkjVar2 = epkj.NOT_SET;
                                            epkiVar2.copyOnWrite();
                                            ((epkk) epkiVar2.instance).b = epkjVar2.a();
                                            return (epkk) epkiVar2.build();
                                        }
                                        try {
                                            return (epkk) evsn.parseFrom(epkk.a, epkhVar.b, evrr.a());
                                        } catch (evtj e) {
                                            cqbd cqbdVarE2 = cpty.a.e();
                                            cqbdVarE2.I("Could not parse InitialSyncStatus object");
                                            cqbdVarE2.A("ObjectId", eqndVar.c);
                                            cqbdVarE2.A("Method", "parseInitialSyncStatus");
                                            cqbdVarE2.A("Message", e.getMessage());
                                            cqbdVarE2.A("Cause", e.getCause());
                                            cqbdVarE2.r();
                                            epki epkiVar3 = (epki) epkk.a.createBuilder();
                                            epkj epkjVar3 = epkj.NOT_SET;
                                            epkiVar3.copyOnWrite();
                                            ((epkk) epkiVar3.instance).b = epkjVar3.a();
                                            return (epkk) epkiVar3.build();
                                        }
                                    } catch (evtj e2) {
                                        cqbd cqbdVarE3 = cpty.a.e();
                                        cqbdVarE3.I("Could not parse InitialSyncStatus object");
                                        cqbdVarE3.A("ObjectId", eqndVar.c);
                                        cqbdVarE3.A("Method", "parseInitialSyncStatus");
                                        cqbdVarE3.A("Message", e2.getMessage());
                                        cqbdVarE3.A("Cause", e2.getCause());
                                        cqbdVarE3.r();
                                        epki epkiVar4 = (epki) epkk.a.createBuilder();
                                        epkj epkjVar4 = epkj.NOT_SET;
                                        epkiVar4.copyOnWrite();
                                        ((epkk) epkiVar4.instance).b = epkjVar4.a();
                                        return (epkk) epkiVar4.build();
                                    }
                                }
                            }, eoscVar).e(fbtf.class, new ejvr() { // from class: caga
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    fbtf fbtfVar = (fbtf) obj3;
                                    Status status = fbtfVar.a;
                                    eksp ekspVar2 = cagn.b;
                                    if (!status.getCode().equals(Status.Code.NOT_FOUND)) {
                                        throw fbtfVar;
                                    }
                                    ((eksl) ((eksl) ((eksl) cagn.b.j()).g(fbtfVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "updateBoxStatusWithCatching", (char) 215, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CloudMessageStoreClient Object does not contain InitialSyncStatus, return default InitialSyncStatus instance.");
                                    return epkk.a;
                                }
                            }, eoscVar);
                            return eijx.k(eijuVarE, eijuVarE2).b(new eooy() { // from class: cagb
                                @Override // defpackage.eooy
                                public final ListenableFuture a() {
                                    eksp ekspVar2 = cagn.b;
                                    return cpmdVarFu.k((eplw) eork.q(eijuVarE), (epkk) eork.q(eijuVarE2));
                                }
                            }, eoscVar).h(new ejvr() { // from class: cagc
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    eksp ekspVar2 = cagn.b;
                                    return true;
                                }
                            }, eoscVar).f(Exception.class, new eooz() { // from class: cagd
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    ((eksl) ((eksl) ((eksl) cagn.b.j()).g((Exception) obj3)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "updateBoxStatusWithCatching", 236, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade step failed when cloudMessageStoreClient fetch data. Will retry.");
                                    return eijx.e(false);
                                }
                            }, eoscVar).i(new eooz() { // from class: cafx
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                                    cagn cagnVar3 = cagnVar2;
                                    return zBooleanValue ? cagnVar3.c.ao(2).h(new ejvr() { // from class: cagh
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj4) {
                                            eksp ekspVar2 = cagn.b;
                                            return cbcw.i();
                                        }
                                    }, cagnVar3.f) : cagnVar3.c.ao(3).h(new ejvr() { // from class: cagi
                                        @Override // defpackage.ejvr
                                        public final Object apply(Object obj4) {
                                            eksp ekspVar2 = cagn.b;
                                            return cbcw.m();
                                        }
                                    }, cagnVar3.f);
                                }
                            }, eoscVar);
                        }
                    };
                    eosc eoscVar = cagnVar.f;
                    return eijuVarA.i(eoozVar, eoscVar).f(axlg.class, new eooz() { // from class: cagk
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            ((eksl) ((eksl) ((eksl) cagn.b.j()).g((axlg) obj2)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processUpgradeTask", 178, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade step failed with exception.");
                            cagn cagnVar2 = cagnVar;
                            return cagnVar2.c.ao(3).h(new ejvr() { // from class: cagl
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj3) {
                                    eksp ekspVar2 = cagn.b;
                                    return cbcw.k();
                                }
                            }, cagnVar2.f);
                        }
                    }, eoscVar);
                }
            }, this.g).e(Throwable.class, new ejvr() { // from class: cagg
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ((eksl) ((eksl) ((eksl) cagn.b.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processPendingWorkItemAsync", 128, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade step failed. Will retry.");
                    return cbcw.m();
                }
            }, this.f);
        }
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/triggerrefresh/CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler", "processPendingWorkItemAsync", 104, "CmsBoxCopyMultiDeviceAndInitialSyncStatusHandler.java")).q("CmsBoxState upgrade steps aborted because max retry is exceeded.");
        return this.c.ao(3).h(new ejvr() { // from class: cage
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar2 = cagn.b;
                return cbcw.k();
            }
        }, this.f);
    }
}
