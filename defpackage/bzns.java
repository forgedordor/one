package defpackage;

import androidx.car.app.model.Alert;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzns extends cayv {
    public static final cqce a = cqce.g("BugleCms", "CmsKeySyncWorkHandler");
    public final aukz b;
    public final eosc c;
    public final bzmy d;
    public final bznk e;
    private final aurx f;

    public bzns(bznk bznkVar, aurx aurxVar, bzmy bzmyVar, aukz aukzVar, eosc eoscVar) {
        this.e = bznkVar;
        this.f = aurxVar;
        this.d = bzmyVar;
        this.b = aukzVar;
        this.c = eoscVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.c(Alert.DURATION_SHOW_INDEFINITELY);
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.a);
        pzh pzhVar = new pzh();
        pzhVar.c(4);
        ((caxk) caxzVarL).a = pzhVar.a();
        caxzVarL.e(true);
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("CmsKeySyncWorkHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bzon.b.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(final cayy cayyVar, evuh evuhVar) {
        final bzon bzonVar = (bzon) evuhVar;
        return this.f.m.b().i(new eooz() { // from class: bznr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    cqbd cqbdVarC = bzns.a.c();
                    cqbdVarC.I("Cms turned off, finishing the step");
                    cqbdVarC.r();
                    return eijx.e(cbcw.i());
                }
                final bzon bzonVar2 = bzonVar;
                final bzns bznsVar = this.a;
                bzol bzolVarB = bzol.b(bzonVar2.e);
                if (bzolVarB == null) {
                    bzolVarB = bzol.UNSPECIFIED_STEP;
                }
                final bznk bznkVar = bznsVar.e;
                cayy cayyVar2 = cayyVar;
                int i = bzonVar2.d;
                final int i2 = ((caxm) cayyVar2.a()).c;
                eiju eijuVarB = bznkVar.a.b(i);
                ejvr ejvrVar = new ejvr() { // from class: bzne
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        return (bznj) ehlh.a(bznkVar.b, bznj.class, (efwo) obj2);
                    }
                };
                eoqg eoqgVar = eoqg.a;
                eiju eijuVarH = eijuVarB.h(ejvrVar, eoqgVar);
                int iOrdinal = bzolVarB.ordinal();
                return (iOrdinal != 1 ? (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) ? eijuVarH.i(new eooz() { // from class: bzng
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        final bzoh bzohVar = (bzoh) ((bznj) obj2).bT();
                        if (bzohVar.d instanceof bypq) {
                            bzoh.a.n("CmsHandler for key is not bind");
                            return eijx.d(new bzof());
                        }
                        if (i2 > ((Integer) bzoh.c.e()).intValue()) {
                            return eijx.d(new bzog());
                        }
                        final bzon bzonVar3 = bzonVar2;
                        bzol bzolVarB2 = bzol.b(bzonVar3.e);
                        if (bzolVarB2 == null) {
                            bzolVarB2 = bzol.UNSPECIFIED_STEP;
                        }
                        int iOrdinal2 = bzolVarB2.ordinal();
                        final int i3 = 2;
                        if (iOrdinal2 != 2) {
                            i3 = 3;
                            if (iOrdinal2 == 3) {
                                i3 = 1;
                            } else if (iOrdinal2 != 4) {
                                throw new AssertionError("current step is not a key sync step");
                            }
                        }
                        final int iC = byrx.c(i3);
                        cqbd cqbdVarC2 = bzoh.a.c();
                        cqbdVarC2.I("Sync CMS key step is invoked");
                        cqbdVarC2.y("Key type", i3);
                        cqbdVarC2.r();
                        Callable callable = new Callable() { // from class: bzoa
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                cqce cqceVar = bzoh.a;
                                bnbw bnbwVarA = bncb.a();
                                bnbwVarA.A("SyncCmsKeyStep#getCmsKeysToBackup");
                                final int i4 = i3;
                                bnbwVarA.e(new Function() { // from class: bzny
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj3) {
                                        bnca bncaVar = (bnca) obj3;
                                        cqce cqceVar2 = bzoh.a;
                                        bncaVar.e(i4);
                                        return bncaVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bnbwVarA.c(new bnbt(bncb.c.a));
                                return bnbwVarA.b().z();
                            }
                        };
                        eosc eoscVar = bzohVar.e;
                        return eijx.g(callable, eoscVar).i(new eooz() { // from class: bzob
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) {
                                ekgb ekgbVar = (ekgb) obj3;
                                if (ekgbVar.isEmpty()) {
                                    bzoh.a.n("Key not generated before backup");
                                    return eijx.d(new bzod());
                                }
                                if (ekgbVar.size() > 1 && !((Boolean) ((cczi) cpyl.X.get()).e()).booleanValue()) {
                                    bzoh.a.n("More than one key found!");
                                    return eijx.d(new bzoe());
                                }
                                final int i4 = iC;
                                final int i5 = i3;
                                final bzoh bzohVar2 = bzohVar;
                                if (!((Boolean) ((cczi) cpyl.X.get()).e()).booleanValue()) {
                                    return bzohVar2.a((bnar) ekgbVar.get(0), i5, i4);
                                }
                                eiju eijuVarE = eijx.e(false);
                                int size = ekgbVar.size();
                                for (int i6 = 0; i6 < size; i6++) {
                                    final bnar bnarVar = (bnar) ekgbVar.get(i6);
                                    eijuVarE = eijuVarE.i(new eooz() { // from class: bznv
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            return bzohVar2.a(bnarVar, i5, i4);
                                        }
                                    }, bzohVar2.e).f(Exception.class, new eooz() { // from class: bznw
                                        @Override // defpackage.eooz
                                        public final ListenableFuture a(Object obj4) {
                                            Exception exc = (Exception) obj4;
                                            ekrw ekrwVarJ = bzoh.b.j();
                                            ekrwVarJ.X(eksq.a, "BugleCms");
                                            ekrd ekrdVar = (ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(exc)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/keysync/SyncCmsKeyStep", "doWork", 133, "SyncCmsKeyStep.java");
                                            bnar bnarVar2 = bnarVar;
                                            ekrdVar.u("processKey failed with keyIndex = %d, keyType = %d", bnarVar2.k(), bnarVar2.m());
                                            return eijx.d(exc);
                                        }
                                    }, bzohVar2.f);
                                }
                                return eijuVarE;
                            }
                        }, eoscVar).h(new ejvr() { // from class: bzoc
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cqce cqceVar = bzoh.a;
                                bzoj bzojVar = (bzoj) bzonVar3.toBuilder();
                                bzojVar.copyOnWrite();
                                bzon bzonVar4 = (bzon) bzojVar.instance;
                                bzonVar4.f = 2;
                                bzonVar4.c |= 4;
                                return (bzon) bzojVar.build();
                            }
                        }, bzohVar.f);
                    }
                }, eoqgVar) : iOrdinal != 5 ? eijx.d(new cpzc(68, cpyz.NO_RETRY)) : eijuVarH.i(new eooz() { // from class: bznh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        ((bznj) obj2).hK();
                        if (i2 > ((Integer) bznu.a.e()).intValue()) {
                            return eijx.d(new bznt());
                        }
                        bzoj bzojVar = (bzoj) bzonVar2.toBuilder();
                        bzojVar.copyOnWrite();
                        bzon bzonVar3 = (bzon) bzojVar.instance;
                        bzonVar3.f = 2;
                        bzonVar3.c |= 4;
                        return eijx.e((bzon) bzojVar.build());
                    }
                }, eoqgVar) : eijuVarH.i(new eooz() { // from class: bznf
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        bznn bznnVarBS = ((bznj) obj2).bS();
                        if (i2 > ((Integer) bznd.b.e()).intValue()) {
                            return eijx.d(new bznc());
                        }
                        final bzon bzonVar3 = bzonVar2;
                        cqbd cqbdVarA = bznd.a.a();
                        cqbdVarA.I("Generate key step is invoked");
                        cqbdVarA.r();
                        bznd bzndVar = (bznd) bznnVarBS;
                        final byrn byrnVar = bzndVar.c;
                        return eijx.f(new Runnable() { // from class: bzna
                            @Override // java.lang.Runnable
                            public final void run() {
                                byrp byrpVar = (byrp) byrnVar;
                                fcsu fcsuVar = byrpVar.b;
                                if (((cpqk) fcsuVar.b()).c(2) == null) {
                                    ((eksl) ((eksl) byrp.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsKeyManagerImpl", "initializeKeys", 54, "CmsKeyManagerImpl.java")).q("No backup key found, inserting backup key");
                                    ((cpqk) fcsuVar.b()).e(cpzk.a(), 2);
                                    byrpVar.a();
                                }
                                if (((cpqk) fcsuVar.b()).c(1) == null) {
                                    ((eksl) ((eksl) byrp.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsKeyManagerImpl", "initializeKeys", 63, "CmsKeyManagerImpl.java")).q("No CMS key found, inserting CMS key");
                                    ((cpqk) fcsuVar.b()).e(cpzk.a(), 1);
                                }
                                if (((cpqk) fcsuVar.b()).c(3) == null) {
                                    ((eksl) ((eksl) byrp.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsKeyManagerImpl", "initializeKeys", 72, "CmsKeyManagerImpl.java")).q("No HMAC key found, inserting HMAC key");
                                    ((cpqk) fcsuVar.b()).e(cpzk.b(), 3);
                                }
                            }
                        }, bzndVar.d).h(new ejvr() { // from class: bznb
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                cqce cqceVar = bznd.a;
                                bzoj bzojVar = (bzoj) bzonVar3.toBuilder();
                                bzojVar.copyOnWrite();
                                bzon bzonVar4 = (bzon) bzojVar.instance;
                                bzonVar4.f = 2;
                                bzonVar4.c |= 4;
                                return (bzon) bzojVar.build();
                            }
                        }, eoqg.a);
                    }
                }, eoqgVar)).h(new ejvr() { // from class: bzni
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        bzon bzonVar3 = (bzon) obj2;
                        bzol bzolVarB2 = bzol.b(bzonVar3.e);
                        if (bzolVarB2 == null) {
                            bzolVarB2 = bzol.UNSPECIFIED_STEP;
                        }
                        evsz evszVar = new evsz(bzonVar3.g, bzon.a);
                        if (!evszVar.contains(bzolVarB2)) {
                            throw new cpzc(67, cpyz.NO_RETRY);
                        }
                        int size = evszVar.size() - 1;
                        int iIndexOf = evszVar.indexOf(bzolVarB2);
                        if (size == iIndexOf) {
                            return Optional.empty();
                        }
                        bzoj bzojVar = (bzoj) bzonVar3.toBuilder();
                        bzol bzolVar = (bzol) evszVar.get(iIndexOf + 1);
                        bzojVar.copyOnWrite();
                        bzon bzonVar4 = (bzon) bzojVar.instance;
                        bzonVar4.e = bzolVar.g;
                        bzonVar4.c |= 2;
                        bzojVar.copyOnWrite();
                        bzon bzonVar5 = (bzon) bzojVar.instance;
                        bzonVar5.f = 1;
                        bzonVar5.c |= 4;
                        return Optional.of((bzon) bzojVar.build());
                    }
                }, eoqgVar).h(new ejvr() { // from class: bzno
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        Optional optional = (Optional) obj2;
                        if (!optional.isEmpty()) {
                            bzon bzonVar3 = (bzon) optional.get();
                            cbcv cbcvVarH = cbcw.h();
                            caxr caxrVar = new caxr();
                            bzon bzonVar4 = (bzon) optional.get();
                            int i3 = bzonVar4.d;
                            bzol bzolVarB2 = bzol.b(bzonVar4.e);
                            if (bzolVarB2 == null) {
                                bzolVarB2 = bzol.UNSPECIFIED_STEP;
                            }
                            int iOrdinal2 = bzolVarB2.ordinal();
                            caxrVar.b = i3 + (iOrdinal2 != 1 ? iOrdinal2 != 2 ? iOrdinal2 != 3 ? iOrdinal2 != 4 ? iOrdinal2 != 5 ? "Unspecified_Step" : "Complete_Key_Sync" : "Sync HMAC_Key" : "Sync_Encryption_Key" : "Sync_Backup_Key" : "Generate_Key");
                            ((caxp) cbcvVarH).a = ekgb.r(cbcu.g("cms_key_sync", bzonVar3, caxrVar.a()));
                            cbcvVarH.b(true);
                            cbcvVarH.c(false);
                            return cbcvVarH.a();
                        }
                        bzon bzonVar5 = bzonVar2;
                        cqbd cqbdVarC2 = bzns.a.c();
                        cqbdVarC2.I("Key sync process succeeded");
                        cqbdVarC2.r();
                        cabm cabmVar = (cabm) cabo.a.createBuilder();
                        int i4 = bzonVar5.d;
                        cabmVar.copyOnWrite();
                        cabo caboVar = (cabo) cabmVar.instance;
                        caboVar.b = 1 | caboVar.b;
                        caboVar.c = i4;
                        if (cpyl.a()) {
                            cpyo cpyoVarB = cpyo.b(bzonVar5.h);
                            if (cpyoVarB == null) {
                                cpyoVarB = cpyo.CMS_FEATURE_UNDEFINED;
                            }
                            cabmVar.copyOnWrite();
                            cabo caboVar2 = (cabo) cabmVar.instance;
                            caboVar2.e = cpyoVarB.d;
                            caboVar2.b |= 32;
                        }
                        cabo caboVar3 = (cabo) cabmVar.build();
                        caxr caxrVar2 = new caxr();
                        caxrVar2.b = "backup_self_participant";
                        return cbcw.j(ekgb.r(cbcu.g("backup_self_participant", caboVar3, caxrVar2.a())));
                    }
                }, bznsVar.c).f(Throwable.class, new eooz() { // from class: bznp
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        Throwable th = (Throwable) obj2;
                        boolean z = th instanceof cpzc;
                        bzon bzonVar3 = bzonVar2;
                        if (!z && !(th instanceof axkg)) {
                            cqbd cqbdVarE = bzns.a.e();
                            bzol bzolVarB2 = bzol.b(bzonVar3.e);
                            if (bzolVarB2 == null) {
                                bzolVarB2 = bzol.UNSPECIFIED_STEP;
                            }
                            cqbdVarE.A("step", bzolVarB2.name());
                            cqbdVarE.I("Key sync failed, will retry");
                            cqbdVarE.s(th);
                            return eijx.e(cbcw.m());
                        }
                        cqbd cqbdVarE2 = bzns.a.e();
                        bzol bzolVarB3 = bzol.b(bzonVar3.e);
                        if (bzolVarB3 == null) {
                            bzolVarB3 = bzol.UNSPECIFIED_STEP;
                        }
                        bzns bznsVar2 = bznsVar;
                        cqbdVarE2.A("step", bzolVarB3.name());
                        cqbdVarE2.I("Key sync failed due to fatal error, terminate key sync flow");
                        cqbdVarE2.s(th);
                        bznsVar2.b.h(true, emcd.KEY_BACKUP, true, 0, th);
                        return bznsVar2.d.b(1).h(new ejvr() { // from class: bznq
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                return cbcw.k();
                            }
                        }, eoqg.a);
                    }
                }, eoqgVar);
            }
        }, eoqg.a);
    }
}
