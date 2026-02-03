package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cafv;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cafv implements cafd {
    public static final eksp b = eksp.c("BugleCms");
    static final cczi c = cdag.e(cdag.b, "cms_opt_out_pwq_step_max_retry", 3);
    public final axlf d;
    public final Context e;
    public final aurx f;
    public final eosc g;
    public final eosc h;
    private final cadx i;
    private final cadn j;
    private final cadc k;
    private final cacr l;

    /* compiled from: PG */
    public interface a {
        cadz co();

        cadz cp();

        cadz cq();

        cadz cr();

        cadz cs();

        cadz ct();

        cadz cu();
    }

    public cafv(Context context, axlf axlfVar, cadx cadxVar, cadn cadnVar, cadc cadcVar, cacr cacrVar, aurx aurxVar, eosc eoscVar, eosc eoscVar2) {
        this.e = context;
        this.d = axlfVar;
        this.i = cadxVar;
        this.j = cadnVar;
        this.k = cadcVar;
        this.l = cacrVar;
        this.f = aurxVar;
        this.g = eoscVar;
        this.h = eoscVar2;
    }

    public final eiju a(caeg caegVar, final int i, final caei caeiVar, eiju eijuVar) {
        switch (caegVar.ordinal()) {
            case 1:
                return eijuVar.i(new eooz() { // from class: cafm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eksp ekspVar = cafv.b;
                        return ((cafv.a) obj).cu().a(i, caeiVar);
                    }
                }, this.g);
            case 2:
                return eijuVar.i(new eooz() { // from class: cafe
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eksp ekspVar = cafv.b;
                        cadz cadzVarCt = ((cafv.a) obj).ct();
                        boolean zBooleanValue = ((Boolean) caez.b.e()).booleanValue();
                        int i2 = i;
                        final caei caeiVar2 = caeiVar;
                        if (!zBooleanValue) {
                            eksl ekslVar = (eksl) caez.a.h();
                            ekslVar.X(bzmz.I, Integer.valueOf(i2));
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsSetFeatureDisabledOnServerStep", "doWork", 55, "CmsSetFeatureDisabledOnServerStep.java")).q("Removing status object from the server");
                            eiju eijuVarH = ((caez) cadzVarCt).c.h();
                            ejvr ejvrVar = new ejvr() { // from class: caex
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    ((eksl) ((eksl) caez.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsSetFeatureDisabledOnServerStep", "doWork", 61, "CmsSetFeatureDisabledOnServerStep.java")).q("MultiDeviceStatus set to disabled on server successfully");
                                    caec caecVar = (caec) caeiVar2.toBuilder();
                                    caecVar.copyOnWrite();
                                    caei caeiVar3 = (caei) caecVar.instance;
                                    caeiVar3.f = 2;
                                    caeiVar3.c |= 4;
                                    return (caei) caecVar.build();
                                }
                            };
                            eoqg eoqgVar = eoqg.a;
                            return eijuVarH.h(ejvrVar, eoqgVar).e(cpyy.class, new ejvr() { // from class: caey
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    ((eksl) ((eksl) caez.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsSetFeatureDisabledOnServerStep", "doWork", 68, "CmsSetFeatureDisabledOnServerStep.java")).q("Skipping delete of MultiDeviceStatus on CMS because device id did not match the one on CMS.");
                                    caec caecVar = (caec) caeiVar2.toBuilder();
                                    caecVar.copyOnWrite();
                                    caei caeiVar3 = (caei) caecVar.instance;
                                    caeiVar3.f = 2;
                                    caeiVar3.c |= 4;
                                    return (caei) caecVar.build();
                                }
                            }, eoqgVar);
                        }
                        eksl ekslVar2 = (eksl) caez.a.h();
                        ekslVar2.X(bzmz.I, Integer.valueOf(i2));
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsSetFeatureDisabledOnServerStep", "doWork", 48, "CmsSetFeatureDisabledOnServerStep.java")).q("Remove status object from the server step is skipped");
                        caec caecVar = (caec) caeiVar2.toBuilder();
                        caecVar.copyOnWrite();
                        caei caeiVar3 = (caei) caecVar.instance;
                        caeiVar3.f = 2;
                        caeiVar3.c |= 4;
                        return eijx.e((caei) caecVar.build());
                    }
                }, this.g);
            case 3:
                final cadx cadxVar = this.i;
                final egbf egbfVar = cadxVar.d;
                eiju eijuVarA = cadxVar.a.a();
                egbfVar.getClass();
                eiju eijuVarI = eijuVarA.i(new eooz() { // from class: cadu
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return egbfVar.c((efwo) obj);
                    }
                }, cadxVar.f);
                eooz eoozVar = new eooz() { // from class: cadv
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final egbe egbeVar = (egbe) obj;
                        final cadx cadxVar2 = cadxVar;
                        final caei caeiVar2 = caeiVar;
                        return cadxVar2.h.b("CmsCompleteOptOutMdStep#doWork", new Runnable() { // from class: cadr
                            @Override // java.lang.Runnable
                            public final void run() {
                                cadx cadxVar3 = cadxVar2;
                                if (((Boolean) cadxVar3.g.b()).booleanValue()) {
                                    if (new evsz(caeiVar2.g, caei.a).contains(caeg.RETRIEVE_CMS_TIMESTAMP)) {
                                        cadxVar3.b.W(egbeVar.b().c);
                                    } else {
                                        cadxVar3.b.D();
                                    }
                                }
                                cadxVar3.b();
                                cadxVar3.a.b();
                                dqsn dqsnVar = cadxVar3.c;
                                dqsm dqsmVar = new dqsm() { // from class: cadt
                                    @Override // defpackage.dqsm
                                    public final eieu a() {
                                        return eiiy.k("CCOOMS::notifyDataChanged::runAfterCommit");
                                    }
                                };
                                aurx aurxVar = cadxVar3.b;
                                aurxVar.getClass();
                                dqsnVar.g(dqsmVar, "CmsCompleteOptOutMdStep#doWork", new cadq(aurxVar));
                            }
                        }).h(new ejvr() { // from class: cads
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                caec caecVar = (caec) caeiVar2.toBuilder();
                                caecVar.copyOnWrite();
                                caei caeiVar3 = (caei) caecVar.instance;
                                caeiVar3.f = 2;
                                caeiVar3.c |= 4;
                                return (caei) caecVar.build();
                            }
                        }, cadxVar2.f);
                    }
                };
                eosc eoscVar = cadxVar.e;
                return eijuVarI.i(eoozVar, eoscVar).e(axlg.class, new ejvr() { // from class: cadw
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        final cadx cadxVar2 = cadxVar;
                        Runnable runnable = new Runnable() { // from class: cado
                            @Override // java.lang.Runnable
                            public final void run() {
                                cadx cadxVar3 = cadxVar2;
                                cadxVar3.b.D();
                                cadxVar3.b();
                            }
                        };
                        dqsn dqsnVar = cadxVar2.c;
                        dqsnVar.d("CmsCompleteOptOutMdStep#catchNoLinkedAccountException", runnable);
                        dqsm dqsmVar = new dqsm() { // from class: cadp
                            @Override // defpackage.dqsm
                            public final eieu a() {
                                return eiiy.k("CCOOMS::notifyDataChanged::runAfterCommit");
                            }
                        };
                        aurx aurxVar = cadxVar2.b;
                        aurxVar.getClass();
                        dqsnVar.g(dqsmVar, "CmsCompleteOptOutMdStep#doWork", new cadq(aurxVar));
                        caec caecVar = (caec) caeiVar.toBuilder();
                        caecVar.copyOnWrite();
                        caei caeiVar2 = (caei) caecVar.instance;
                        caeiVar2.f = 2;
                        caeiVar2.c |= 4;
                        return (caei) caecVar.build();
                    }
                }, eoscVar);
            case 4:
                return eijuVar.i(new eooz() { // from class: cafn
                    /* JADX WARN: Type inference failed for: r2v9, types: [cmfo, java.lang.Object] */
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eksp ekspVar = cafv.b;
                        cadz cadzVarCq = ((cafv.a) obj).cq();
                        final caei caeiVar2 = caeiVar;
                        ekrz ekrzVarA = cady.a(caeiVar2);
                        boolean zBooleanValue = ((Boolean) cacz.b.e()).booleanValue();
                        int i2 = i;
                        if (zBooleanValue) {
                            eksl ekslVar = (eksl) cacz.a.h();
                            ekslVar.X(ekrzVarA, Integer.valueOf(i2));
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearPrimaryDeviceIdStep", "doWork", 48, "CmsClearPrimaryDeviceIdStep.java")).q("Clear primary device id step is skipped");
                            caec caecVar = (caec) caeiVar2.toBuilder();
                            caecVar.copyOnWrite();
                            caei caeiVar3 = (caei) caecVar.instance;
                            caeiVar3.f = 2;
                            caeiVar3.c |= 4;
                            return eijx.e((caei) caecVar.build());
                        }
                        eksl ekslVar2 = (eksl) cacz.a.h();
                        ekslVar2.X(ekrzVarA, Integer.valueOf(i2));
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearPrimaryDeviceIdStep", "doWork", 52, "CmsClearPrimaryDeviceIdStep.java")).q("Doing clear primary device id");
                        final cpnx cpnxVar = ((cacz) cadzVarCq).c;
                        aurx aurxVar = cpnxVar.e;
                        eiju eijuVarH = aurxVar.e.get().h();
                        ejvr ejvrVar = new ejvr() { // from class: auqu
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                aumq aumqVar = (aumq) obj2;
                                cqce cqceVar = aurx.a;
                                return (aumqVar.b & 512) != 0 ? Optional.of(aumqVar.m) : Optional.empty();
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        final eiju eijuVarH2 = eijuVarH.h(ejvrVar, eoqgVar);
                        evrv evrvVar = (evrv) evrw.a.createBuilder();
                        evrvVar.a("box_devices");
                        final eiju eijuVarK = cpnxVar.f.k((evrw) evrvVar.build());
                        final eiju eijuVarN = aurxVar.n();
                        return eijx.m(eijuVarH2, eijuVarK, eijuVarN).b(new eooy() { // from class: cpnt
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                Optional optional = (Optional) eork.q(eijuVarH2);
                                Optional optional2 = (Optional) eork.q(eijuVarN);
                                eqiz eqizVar = (eqiz) eork.q(eijuVarK);
                                ekgb ekgbVarA = cpus.a(eqizVar);
                                if (optional2.isEmpty()) {
                                    ((eksl) ((eksl) cpnx.a.j()).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "clearPrimaryDevice", 256, "CmsBoxDetailsManager.java")).q("No device ID on the device");
                                    return eijx.e(null);
                                }
                                if (!ekgbVarA.contains(optional2.get())) {
                                    eksl ekslVar3 = (eksl) cpnx.a.h();
                                    ekslVar3.X(bzmz.m, (String) optional2.get());
                                    ekslVar3.X(bzmz.x, "Current device is not primary device in box");
                                    ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "clearPrimaryDevice", 265, "CmsBoxDetailsManager.java")).q("Skip clearing primary device in box");
                                    return eijx.e(null);
                                }
                                cpnx cpnxVar2 = cpnxVar;
                                String str = (String) optional.orElse("");
                                String strA = efvl.b().a(ekgbVarA);
                                emdh emdhVar = (emdh) emdj.a.createBuilder();
                                emdhVar.copyOnWrite();
                                emdj emdjVar = (emdj) emdhVar.instance;
                                emdjVar.c = 2;
                                emdjVar.b |= 1;
                                emdhVar.copyOnWrite();
                                emdj emdjVar2 = (emdj) emdhVar.instance;
                                str.getClass();
                                emdjVar2.b = 2 | emdjVar2.b;
                                emdjVar2.d = str;
                                emdhVar.copyOnWrite();
                                emdj emdjVar3 = (emdj) emdhVar.instance;
                                emdjVar3.b |= 8;
                                emdjVar3.f = strA;
                                cpnxVar2.h.s((emdj) emdhVar.build());
                                final String str2 = (String) optional2.get();
                                eqiy eqiyVar = (eqiy) eqiz.b.createBuilder();
                                String str3 = eqizVar.d;
                                eqiyVar.copyOnWrite();
                                eqiz eqizVar2 = (eqiz) eqiyVar.instance;
                                str3.getClass();
                                eqizVar2.d = str3;
                                eqiyVar.a((Iterable) Collection.EL.stream(eqizVar.f).filter(new Predicate() { // from class: cpnu
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
                                    public final boolean test(Object obj2) {
                                        eqjb eqjbVar = (eqjb) obj2;
                                        eksp ekspVar2 = cpnx.a;
                                        int iA = eqjd.a(eqjbVar.c);
                                        return (iA != 0 && iA == 3 && str2.equals(eqjbVar.b)) ? false : true;
                                    }
                                }).collect(Collectors.toCollection(new cpnr())));
                                eqmw eqmwVar = cpnx.d;
                                eqiyVar.copyOnWrite();
                                eqiz eqizVar3 = (eqiz) eqiyVar.instance;
                                eqmwVar.getClass();
                                eqizVar3.b();
                                eqizVar3.e.add(eqmwVar);
                                eqiz eqizVar4 = (eqiz) eqiyVar.build();
                                eksl ekslVar4 = (eksl) cpnx.a.h();
                                ekslVar4.X(bzmz.m, str2);
                                ((eksl) ekslVar4.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsBoxDetailsManager", "clearPrimaryDeviceInBox", 293, "CmsBoxDetailsManager.java")).q("Clear primary device id from box");
                                cpmc cpmcVar = cpnxVar2.f;
                                return (cpyl.a() && ((Boolean) ((cczi) cpxw.b.get()).e()).booleanValue()) ? cpmcVar.ai(eqizVar4, cpnx.b, cpnx.c, 3).h(new ejvr() { // from class: cpnv
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        eksp ekspVar2 = cpnx.a;
                                        return null;
                                    }
                                }, eoqg.a) : cpmcVar.S(eqizVar4, cpnx.b, cpnx.c).h(new ejvr() { // from class: cpnw
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj2) {
                                        eksp ekspVar2 = cpnx.a;
                                        return null;
                                    }
                                }, eoqg.a);
                            }
                        }, cpnxVar.i).h(new ejvr() { // from class: cacy
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ((eksl) ((eksl) cacz.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearPrimaryDeviceIdStep", "doWork", 58, "CmsClearPrimaryDeviceIdStep.java")).q("Clearing primary device id completed successfully");
                                caec caecVar2 = (caec) caeiVar2.toBuilder();
                                caecVar2.copyOnWrite();
                                caei caeiVar4 = (caei) caecVar2.instance;
                                caeiVar4.f = 2;
                                caeiVar4.c |= 4;
                                return (caei) caecVar2.build();
                            }
                        }, eoqgVar);
                    }
                }, this.g);
            case 5:
                return eijuVar.i(new eooz() { // from class: cafo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eksp ekspVar = cafv.b;
                        cadz cadzVarCp = ((cafv.a) obj).cp();
                        final caei caeiVar2 = caeiVar;
                        ekrz ekrzVarA = cady.a(caeiVar2);
                        eksl ekslVar = (eksl) cacx.a.h();
                        ekslVar.X(ekrzVarA, Integer.valueOf(i));
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearInitialSyncStatusStep", "doWork", 38, "CmsClearInitialSyncStatusStep.java")).q("Removing initial sync status object from the server");
                        eiju eijuVarE = ((cacx) cadzVarCp).b.e();
                        ejvr ejvrVar = new ejvr() { // from class: cacv
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ((eksl) ((eksl) cacx.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearInitialSyncStatusStep", "doWork", 44, "CmsClearInitialSyncStatusStep.java")).q("InitialSyncStatus successfully cleared on server");
                                caec caecVar = (caec) caeiVar2.toBuilder();
                                caecVar.copyOnWrite();
                                caei caeiVar3 = (caei) caecVar.instance;
                                caeiVar3.f = 2;
                                caeiVar3.c |= 4;
                                return (caei) caecVar.build();
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        return eijuVarE.h(ejvrVar, eoqgVar).e(cpyy.class, new ejvr() { // from class: cacw
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ((eksl) ((eksl) cacx.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearInitialSyncStatusStep", "doWork", 51, "CmsClearInitialSyncStatusStep.java")).q("Skipping InitialSyncStatus reset on CMS because device id did not match the one on CMS.");
                                caec caecVar = (caec) caeiVar2.toBuilder();
                                caecVar.copyOnWrite();
                                caei caeiVar3 = (caei) caecVar.instance;
                                caeiVar3.f = 2;
                                caeiVar3.c |= 4;
                                return (caei) caecVar.build();
                            }
                        }, eoqgVar);
                    }
                }, this.g);
            case 6:
                return eijuVar.i(new eooz() { // from class: cafr
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eksp ekspVar = cafv.b;
                        cadz cadzVarCr = ((cafv.a) obj).cr();
                        cqbd cqbdVarC = caes.a.c();
                        final caei caeiVar2 = caeiVar;
                        caee caeeVarB = caee.b(caeiVar2.h);
                        if (caeeVarB == null) {
                            caeeVarB = caee.UNSPECIFIED_FLOW;
                        }
                        int i2 = i;
                        cqbdVarC.A("OptOutFlow", caeeVarB);
                        cqbdVarC.y("attemptCount", i2);
                        cqbdVarC.I("Resetting CMS box while disabling the cloud sync feature");
                        cqbdVarC.r();
                        final caes caesVar = (caes) cadzVarCr;
                        return caesVar.e.R().i(new eooz() { // from class: caen
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                ((eksl) ((eksl) caes.c.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsResetBoxStep", "doWork", 88, "CmsResetBoxStep.java")).q("Successfully reset the user's box");
                                caec caecVar = (caec) caeiVar2.toBuilder();
                                caecVar.copyOnWrite();
                                caei caeiVar3 = (caei) caecVar.instance;
                                caeiVar3.f = 2;
                                caeiVar3.c |= 4;
                                final caei caeiVar4 = (caei) caecVar.build();
                                if (!cpyl.a()) {
                                    return eijx.e(caeiVar4);
                                }
                                final caes caesVar2 = caesVar;
                                caes.b.p("Resetting Folsom keys.");
                                eiju eijuVarI2 = caesVar2.d.b().i(new eooz() { // from class: caep
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        return caesVar2.f.z(new Function() { // from class: aumu
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj4) {
                                                aumg aumgVar = (aumg) obj4;
                                                cqce cqceVar = aurx.a;
                                                aumgVar.copyOnWrite();
                                                aumq aumqVar = (aumq) aumgVar.instance;
                                                aumq aumqVar2 = aumq.a;
                                                aumqVar.b |= Integer.MIN_VALUE;
                                                aumqVar.D = false;
                                                return aumgVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        });
                                    }
                                }, caesVar2.h);
                                ejvr ejvrVar = new ejvr() { // from class: caeq
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        cqce cqceVar = caes.a;
                                        return caeiVar4;
                                    }
                                };
                                eoqg eoqgVar = eoqg.a;
                                return eijuVarI2.h(ejvrVar, eoqgVar).f(dcff.class, new eooz() { // from class: caer
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        ((eksl) ((eksl) caes.c.j()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsResetBoxStep", "resetFolsomKeys", 128, "CmsResetBoxStep.java")).q("Failed to reset folsom keys");
                                        return eijx.d((dcff) obj3);
                                    }
                                }, eoqgVar);
                            }
                        }, caesVar.g).f(fbtf.class, new eooz() { // from class: caeo
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                fbtf fbtfVar = (fbtf) obj2;
                                cqce cqceVar = caes.a;
                                if (!fbtfVar.a.getCode().equals(Status.Code.NOT_FOUND)) {
                                    return eijx.d(fbtfVar);
                                }
                                caei caeiVar3 = caeiVar2;
                                ((eksl) ((eksl) caes.c.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsResetBoxStep", "doWork", 97, "CmsResetBoxStep.java")).q("Skipping user's box reset because box was not found on CMS.");
                                caec caecVar = (caec) caeiVar3.toBuilder();
                                caecVar.copyOnWrite();
                                caei caeiVar4 = (caei) caecVar.instance;
                                caeiVar4.f = 2;
                                caeiVar4.c |= 4;
                                return eijx.e((caei) caecVar.build());
                            }
                        }, eoqg.a);
                    }
                }, this.g);
            case 7:
                return this.l.a(i, caeiVar);
            case 8:
                final cadn cadnVar = this.j;
                if (!((Boolean) cadnVar.h.b()).booleanValue()) {
                    return cadnVar.i.b("CmsCompleteOptOutBnrStep#doWork", new Runnable() { // from class: cadl
                        @Override // java.lang.Runnable
                        public final void run() {
                            cadn cadnVar2 = cadnVar;
                            cadnVar2.b.H();
                            cadnVar2.b();
                            cadnVar2.a.b();
                            cadnVar2.c();
                        }
                    }).h(new ejvr() { // from class: cadm
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            caec caecVar = (caec) caeiVar.toBuilder();
                            caecVar.copyOnWrite();
                            caei caeiVar2 = (caei) caecVar.instance;
                            caeiVar2.f = 2;
                            caeiVar2.c |= 4;
                            return (caei) caecVar.build();
                        }
                    }, cadnVar.f);
                }
                axky axkyVar = cadnVar.a;
                final egbf egbfVar2 = cadnVar.d;
                eiju eijuVarA2 = axkyVar.a();
                egbfVar2.getClass();
                eiju eijuVarI2 = eijuVarA2.i(new eooz() { // from class: cadi
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return egbfVar2.c((efwo) obj);
                    }
                }, cadnVar.f);
                eooz eoozVar2 = new eooz() { // from class: cadj
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        final egbe egbeVar = (egbe) obj;
                        final cadn cadnVar2 = cadnVar;
                        final caei caeiVar2 = caeiVar;
                        return cadnVar2.i.b("CmsCompleteOptOutBnrStep#doWork", new Runnable() { // from class: cadd
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zContains = new evsz(caeiVar2.g, caei.a).contains(caeg.RETRIEVE_CMS_TIMESTAMP);
                                cadn cadnVar3 = cadnVar2;
                                if (zContains) {
                                    cadnVar3.b.W(egbeVar.b().c);
                                } else {
                                    cadnVar3.b.D();
                                }
                                cadnVar3.b.H();
                                cadnVar3.b();
                                cadnVar3.a.b();
                                cadnVar3.c();
                            }
                        }).h(new ejvr() { // from class: cade
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                caec caecVar = (caec) caeiVar2.toBuilder();
                                caecVar.copyOnWrite();
                                caei caeiVar3 = (caei) caecVar.instance;
                                caeiVar3.f = 2;
                                caeiVar3.c |= 4;
                                return (caei) caecVar.build();
                            }
                        }, cadnVar2.f);
                    }
                };
                eosc eoscVar2 = cadnVar.e;
                return eijuVarI2.i(eoozVar2, eoscVar2).e(axlg.class, new ejvr() { // from class: cadk
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        final cadn cadnVar2 = cadnVar;
                        cadnVar2.c.d("CmsCompleteOptOutBnrStep#catchNoLinkedAccountException", new Runnable() { // from class: cadf
                            @Override // java.lang.Runnable
                            public final void run() {
                                cadn cadnVar3 = cadnVar2;
                                aurx aurxVar = cadnVar3.b;
                                aurxVar.H();
                                aurxVar.D();
                                cadnVar3.b();
                            }
                        });
                        cadnVar2.c();
                        caec caecVar = (caec) caeiVar.toBuilder();
                        caecVar.copyOnWrite();
                        caei caeiVar2 = (caei) caecVar.instance;
                        caeiVar2.f = 2;
                        caeiVar2.c |= 4;
                        return (caei) caecVar.build();
                    }
                }, eoscVar2);
            case 9:
                cadc cadcVar = this.k;
                caeiVar.getClass();
                return auvw.c(cadcVar.c, fcyi.a, fdjz.a, new cadb(cadcVar, caeiVar, null));
            case 10:
                return eijuVar.i(new eooz() { // from class: cafp
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eksp ekspVar = cafv.b;
                        cadz cadzVarCo = ((cafv.a) obj).co();
                        final caei caeiVar2 = caeiVar;
                        ekrz ekrzVarA = cady.a(caeiVar2);
                        eksl ekslVar = (eksl) cacu.a.h();
                        ekslVar.X(ekrzVarA, Integer.valueOf(i));
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearFeatureTypesStep", "doWork", 40, "CmsClearFeatureTypesStep.java")).q("Clearing feature types from the server");
                        cpmd cpmdVar = ((cacu) cadzVarCo).b;
                        int i2 = ekgb.d;
                        eiju eijuVarF = cpmdVar.f(ekoe.a);
                        ejvr ejvrVar = new ejvr() { // from class: cacs
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                ((eksl) ((eksl) cacu.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearFeatureTypesStep", "doWork", 46, "CmsClearFeatureTypesStep.java")).q("Successfully cleared feature types on server");
                                caec caecVar = (caec) caeiVar2.toBuilder();
                                caecVar.copyOnWrite();
                                caei caeiVar3 = (caei) caecVar.instance;
                                caeiVar3.f = 2;
                                caeiVar3.c |= 4;
                                return (caei) caecVar.build();
                            }
                        };
                        eoqg eoqgVar = eoqg.a;
                        return eijuVarF.h(ejvrVar, eoqgVar).e(fbtf.class, new ejvr() { // from class: cact
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj2) {
                                fbtf fbtfVar = (fbtf) obj2;
                                Status status = fbtfVar.a;
                                eksp ekspVar2 = cacu.a;
                                if (status.getCode() != Status.Code.INVALID_ARGUMENT) {
                                    throw fbtfVar;
                                }
                                caei caeiVar3 = caeiVar2;
                                ((eksl) ((eksl) ((eksl) cacu.a.j()).g(fbtfVar)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsClearFeatureTypesStep", "doWork", '6', "CmsClearFeatureTypesStep.java")).q("Skipping ClearFeatureTypes due to CMS failure.");
                                caec caecVar = (caec) caeiVar3.toBuilder();
                                caecVar.copyOnWrite();
                                caei caeiVar4 = (caei) caecVar.instance;
                                caeiVar4.f = 2;
                                caeiVar4.c |= 4;
                                return (caei) caecVar.build();
                            }
                        }, eoqgVar);
                    }
                }, this.g);
            case 11:
                return eijuVar.i(new eooz() { // from class: cafq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        eksp ekspVar = cafv.b;
                        cadz cadzVarCs = ((cafv.a) obj).cs();
                        caei caeiVar2 = caeiVar;
                        final ekrz ekrzVarA = cady.a(caeiVar2);
                        caec caecVar = (caec) caeiVar2.toBuilder();
                        caecVar.copyOnWrite();
                        caei caeiVar3 = (caei) caecVar.instance;
                        caeiVar3.f = 2;
                        caeiVar3.c |= 4;
                        final caei caeiVar4 = (caei) caecVar.build();
                        final caew caewVar = (caew) cadzVarCs;
                        eiju eijuVarB = caewVar.c.b();
                        final int i2 = i;
                        return eijuVarB.i(new eooz() { // from class: caet
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                eqli eqliVar = (eqli) obj2;
                                boolean zEquals = eqliVar.equals(eqli.COMPLETE);
                                final caew caewVar2 = caewVar;
                                final caei caeiVar5 = caeiVar4;
                                if (!zEquals) {
                                    ekrw ekrwVarH = caew.a.h();
                                    ekrwVarH.X(eksq.a, "BugleCms");
                                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsRetrieveTimestampStep", "doWork", 92, "CmsRetrieveTimestampStep.java")).t("Server initialSyncState value: %s, clearing opt out timestamp.", eqliVar);
                                    caewVar2.d.U(evxc.c);
                                    return eork.i(caeiVar5);
                                }
                                int i3 = i2;
                                ekrz ekrzVar = ekrzVarA;
                                ekrw ekrwVarH2 = caew.a.h();
                                ekrwVarH2.X(eksq.a, "BugleCms");
                                ekrd ekrdVar = (ekrd) ekrwVarH2;
                                ekrdVar.X(ekrzVar, Integer.valueOf(i3));
                                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsRetrieveTimestampStep", "doWork", 68, "CmsRetrieveTimestampStep.java")).q("Retrieving CMS timestamp from the server");
                                eiju eijuVarL = caewVar2.b.l();
                                ejvr ejvrVar = new ejvr() { // from class: caeu
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        evvp evvpVar = (evvp) obj3;
                                        ekrw ekrwVarH3 = caew.a.h();
                                        ekrwVarH3.X(eksq.a, "BugleCms");
                                        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsRetrieveTimestampStep", "doWork", 73, "CmsRetrieveTimestampStep.java")).t("Saving opt out timestamp %s", evxc.h(evvpVar));
                                        caewVar2.d.U(evvpVar);
                                        return caeiVar5;
                                    }
                                };
                                eosc eoscVar3 = caewVar2.e;
                                return eijuVarL.h(ejvrVar, eoscVar3).e(cpyy.class, new ejvr() { // from class: caev
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj3) {
                                        ekrw ekrwVarH3 = caew.a.h();
                                        ekrwVarH3.X(eksq.a, "BugleCms");
                                        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/CmsRetrieveTimestampStep", "doWork", 83, "CmsRetrieveTimestampStep.java")).q("CmsRetrieveTimestampStep: Skipped saving opt out timestamp. because device id did not match the one on CMS.");
                                        caewVar2.d.U(evxc.c);
                                        return caeiVar5;
                                    }
                                }, eoscVar3);
                            }
                        }, caewVar.e);
                    }
                }, this.g);
            default:
                ((eksl) ((eksl) b.j()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optout/OptOutStepDelegatorImpl", "processCurrentStep", 308, "OptOutStepDelegatorImpl.java")).q("Encounter unspecified opt out step");
                return eijx.d(new cpze(34, cpyz.NO_RETRY));
        }
    }
}
