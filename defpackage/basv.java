package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class basv extends cayv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler");
    public final fcsu b;
    public final eosc c;
    public final eosc d;
    public final fcsu e;
    public final fcsu f;
    private final fcsu g;

    public basv(fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.b = fcsuVar;
        this.g = fcsuVar2;
        this.c = eoscVar;
        this.d = eoscVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.f(pza.a);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("DataUpgradeHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return caxy.a.getParserForType();
    }

    @Override // defpackage.cayv
    public final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        fcsu fcsuVar = this.g;
        eiju eijuVarE = eijx.e(null);
        ArrayList arrayList = new ArrayList(((Map) fcsuVar.b()).values());
        Collections.shuffle(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            final bati batiVar = (bati) arrayList.get(i);
            eijuVarE = eijuVarE.i(new eooz() { // from class: basu
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    final bati batiVar2 = batiVar;
                    eiju eijuVarC = batiVar2.c();
                    final basv basvVar = this.a;
                    return eijuVarC.i(new eooz() { // from class: bast
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            final basj basjVar = (basj) obj2;
                            if (basjVar == basj.DISABLED) {
                                return eijx.e(null);
                            }
                            final bati batiVar3 = batiVar2;
                            final basv basvVar2 = basvVar;
                            return eijx.g(new Callable() { // from class: basq
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return Optional.ofNullable(bovn.a(batiVar3.b()));
                                }
                            }, basvVar2.d).i(new eooz() { // from class: basr
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj3) {
                                    final Optional optional = (Optional) obj3;
                                    boolean zIsEmpty = optional.isEmpty();
                                    final bati batiVar4 = batiVar3;
                                    boolean z = true;
                                    if (!zIsEmpty && ((bouo) optional.get()).k() >= batiVar4.a()) {
                                        z = false;
                                    }
                                    basj basjVar2 = basjVar;
                                    final basv basvVar3 = basvVar2;
                                    if (basjVar2 == basj.EXECUTE_UPGRADE && z) {
                                        ekrw ekrwVarH = basv.a.h();
                                        ekrwVarH.X(eksq.a, "BugleDataModel");
                                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler", "doUpgrade", 162, "DataUpgradeHandler.java")).t("doUpgrade for %s", batiVar4.b());
                                        return batiVar4.e(optional.map(new Function() { // from class: baso
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                return Long.valueOf(((bouo) obj4).k());
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        })).i(new eooz() { // from class: basp
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj4) {
                                                bati batiVar5 = batiVar4;
                                                if (optional.isEmpty()) {
                                                    String[] strArr = bovn.a;
                                                    bour bourVar = new bour();
                                                    bourVar.b(batiVar5.b());
                                                    bourVar.c(batiVar5.a());
                                                    bouo bouoVarA = bourVar.a();
                                                    final dqsy dqsyVarB = bovn.b();
                                                    dqru.b(bovn.b(), "data_upgrade_workers", bouoVarA, new Function() { // from class: boum
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj5) {
                                                            return Long.valueOf(dqsyVarB.P("data_upgrade_workers", (dqst) obj5));
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    }, new Consumer() { // from class: boun
                                                        @Override // java.util.function.Consumer
                                                        /* renamed from: accept */
                                                        public final void z(Object obj5) {
                                                        }

                                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                            return Consumer$CC.$default$andThen(this, consumer);
                                                        }
                                                    });
                                                } else {
                                                    String[] strArr2 = bovn.a;
                                                    bovk bovkVar = new bovk();
                                                    bovkVar.ap("DataUpgradeHandler#doUpgrade");
                                                    bovkVar.a.put("last_update_version", Long.valueOf(batiVar5.a()));
                                                    bvdj bvdjVarB = batiVar5.b();
                                                    bovm bovmVar = new bovm();
                                                    bovmVar.b(bvdjVarB);
                                                    if (!bovkVar.aj(new bovl(bovmVar), "data_upgrade_workers-buildAndUpdateForId")) {
                                                        throw new IllegalStateException("failed to mark DataUpgrader " + batiVar5.b().a() + " as updated");
                                                    }
                                                }
                                                basv basvVar4 = basvVar3;
                                                ekrw ekrwVarH2 = basv.a.h();
                                                ekrwVarH2.X(eksq.a, "BugleDataModel");
                                                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler", "doUpgrade", 188, "DataUpgradeHandler.java")).t("Upgrade complete for %s", batiVar5.b());
                                                return ((batf) basvVar4.f.b()).a(batiVar5.b(), new eooz() { // from class: basy
                                                    @Override // defpackage.eooz
                                                    public final ListenableFuture a(Object obj5) {
                                                        return ((bate) obj5).a();
                                                    }
                                                });
                                            }
                                        }, basvVar3.d);
                                    }
                                    if (basjVar2 == basj.EXECUTE_DOWNGRADE && optional.isPresent()) {
                                        final long jK = ((bouo) optional.get()).k();
                                        ekrw ekrwVarH2 = basv.a.h();
                                        ekrwVarH2.X(eksq.a, "BugleDataModel");
                                        ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler", "doDowngrade", 196, "DataUpgradeHandler.java")).t("doDowngrade for %s", batiVar4.b());
                                        eooy eooyVar = new eooy() { // from class: bask
                                            @Override // defpackage.eooy
                                            public final ListenableFuture a() {
                                                return ((batf) basvVar3.f.b()).a(batiVar4.b(), new eooz() { // from class: batb
                                                    @Override // defpackage.eooz
                                                    public final ListenableFuture a(Object obj4) {
                                                        return ((bate) obj4).b();
                                                    }
                                                });
                                            }
                                        };
                                        eosc eoscVar = basvVar3.c;
                                        return eijx.h(eooyVar, eoscVar).i(new eooz() { // from class: basm
                                            @Override // defpackage.eooz
                                            public final ListenableFuture a(Object obj4) {
                                                return batiVar4.d(jK);
                                            }
                                        }, eoscVar).h(new ejvr() { // from class: basn
                                            @Override // defpackage.ejvr
                                            public final Object apply(Object obj4) {
                                                String[] strArr = bovn.a;
                                                bovd bovdVar = new bovd();
                                                bovdVar.f("DataUpgradeHandler#doDowngrade");
                                                final bati batiVar5 = batiVar4;
                                                bovdVar.b = new bovl((bovm) new Function() { // from class: bass
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj5) {
                                                        bovm bovmVar = (bovm) obj5;
                                                        bovmVar.b(batiVar5.b());
                                                        return bovmVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }.apply(new bovm()));
                                                if (bovdVar.d() != 0) {
                                                    return null;
                                                }
                                                throw new IllegalStateException("failed to delete DataUpgrader " + batiVar5.b().a() + " after downgrade");
                                            }
                                        }, basvVar3.d);
                                    }
                                    if (basjVar2 != basj.WIPE_APP_DATA || !optional.isPresent()) {
                                        ekrw ekrwVarH3 = basv.a.h();
                                        ekrwVarH3.X(eksq.a, "BugleDataModel");
                                        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler", "runDataUpgradeOrDowngradeInner", 151, "DataUpgradeHandler.java")).I("%s not running because already up to date, upgradeCommand: %s, version: %s", batiVar4.b(), basjVar2.name(), Long.valueOf(batiVar4.a()));
                                        return eijx.e(null);
                                    }
                                    long jK2 = ((bouo) optional.get()).k();
                                    ekrw ekrwVarH4 = basv.a.h();
                                    ekrwVarH4.X(eksq.a, "BugleDataModel");
                                    ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/datamodel/data/dataupgrade/DataUpgradeHandler", "doWipe", 220, "DataUpgradeHandler.java")).t("doWipe for %s", batiVar4.b());
                                    ((bwzy) basvVar3.e.b()).E(new bblf(jK2, batiVar4.a(), jK2, "upgrader " + batiVar4.b().a() + " is WIPE_APP_DATA", null), "bugle_db");
                                    ((aill) basvVar3.b.b()).f("Bugle.Datamodel.DataUpgradeHandlerWipeData.Counts", batiVar4.b().a());
                                    return eijx.e(null);
                                }
                            }, basvVar2.c);
                        }
                    }, basvVar.c);
                }
            }, this.c);
        }
        return eijuVarE.h(new ejvr() { // from class: basl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return cbcw.i();
            }
        }, this.c);
    }
}
