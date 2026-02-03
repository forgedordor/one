package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aurx {
    public static final cqce a = cqce.g("BugleCms", "CmsSettingsDataService");
    public static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService");
    public static final cczi c = cdag.e(cdag.b, "previous_session_ids_including_current_to_count", 5);
    public final cogw d;
    public final ejxr e;
    public final eosc f;
    public final egzh g;
    public final fcsu h;
    public final aush i;
    public final apoy j;
    public final AtomicReference k;
    public final aqee l;
    public final aurw m = new aurw(this);
    private final egyt n;
    private final eosc o;
    private final eosc p;
    private final Set q;
    private final fcsu r;
    private final apqc s;

    public aurx(final fcsu fcsuVar, cogw cogwVar, egyt egytVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, Set set, egzh egzhVar, fcsu fcsuVar2, aush aushVar, apoy apoyVar, fcsu fcsuVar3, apqc apqcVar, AtomicReference atomicReference, aqee aqeeVar) {
        this.d = cogwVar;
        this.n = egytVar;
        this.f = eoscVar;
        this.o = eoscVar2;
        this.p = eoscVar3;
        this.g = egzhVar;
        this.h = fcsuVar2;
        this.r = fcsuVar3;
        this.s = apqcVar;
        this.i = aushVar;
        this.e = new ejxr() { // from class: aunc
            @Override // defpackage.ejxr
            public final Object get() {
                cqce cqceVar = aurx.a;
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.CMS_SETTINGS);
                cmggVarC.f(aumq.a);
                cmggVarC.c(new Supplier() { // from class: aupj
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new aurs();
                    }
                });
                return ((cmgk) fcsuVar.b()).a(cmggVarC.a());
            }
        };
        this.j = apoyVar;
        this.q = set;
        this.k = atomicReference;
        this.l = aqeeVar;
    }

    private final void ar(long j, long j2, long j3, String str) {
        if (this.s.a()) {
            cpri.a(str);
            return;
        }
        cqbd cqbdVarB = a.b();
        cqbdVarB.I(str);
        cqbdVarB.z("messageCount", j);
        cqbdVarB.z("incrementValue", j2);
        cqbdVarB.z("totalCount", j3);
        cqbdVarB.r();
        fcsu fcsuVar = this.r;
        if (((Optional) fcsuVar.b()).isPresent()) {
            ((cden) ((Optional) fcsuVar.b()).get()).b(new IllegalStateException(str)).k(auvh.b(), eoqg.a);
        }
    }

    public static aumq d(aumq aumqVar, String str) {
        aumg builder = aumqVar.toBuilder();
        builder.copyOnWrite();
        aumq aumqVar2 = (aumq) builder.instance;
        aumqVar2.b |= 16;
        aumqVar2.h = ejwk.b(str);
        builder.copyOnWrite();
        aumq aumqVar3 = (aumq) builder.instance;
        aumqVar3.b |= 1024;
        aumqVar3.n = 0;
        return builder.build();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju A(final Function function, final Function function2) {
        return this.e.get().j(new ejvr() { // from class: aurp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                return ((aumg) function.apply(((aumq) obj).toBuilder())).build();
            }
        }).h(new ejvr() { // from class: aurq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.L();
                return function2.apply((aumq) obj);
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju B(final Function function) {
        return this.e.get().j(new ejvr() { // from class: aurj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                return ((aumg) function.apply(((aumq) obj).toBuilder())).build();
            }
        }).h(new ejvr() { // from class: aurk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                return null;
            }
        }, this.f);
    }

    public final feds C() {
        feds fedsVar = (feds) this.k.get();
        if (fedsVar != null) {
            return fedsVar == feds.UNKNOWN_CLOUD_SYNC_STATUS ? feds.NOT_ENABLED : fedsVar;
        }
        k().h(new ejvr() { // from class: aunq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                auml aumlVarB = auml.b(aumqVar.r);
                if (aumlVarB == null) {
                    aumlVarB = auml.UNSPECIFIED_STATUS;
                }
                aurx aurxVar = this.a;
                auml aumlVarB2 = auml.b(aumqVar.l);
                if (aumlVarB2 == null) {
                    aumlVarB2 = auml.UNSPECIFIED_STATUS;
                }
                aurx aurxVar2 = aurxVar.m.a;
                if (!aurxVar2.l.a()) {
                    aurxVar2.k.set(aurw.d(aumlVarB));
                    return null;
                }
                int iOrdinal = aumlVarB.ordinal();
                aurxVar2.k.set(iOrdinal != 1 ? iOrdinal != 2 ? feds.NOT_ENABLED : aumlVarB == aumlVarB2 ? feds.FI_INITIAL_SYNC_IN_PROGRESS : feds.BNR_INITIAL_SYNC_IN_PROGRESS : aumlVarB == aumlVarB2 ? feds.FI_ENABLED : feds.BNR_ENABLED);
                return null;
            }
        }, this.p);
        return feds.UNKNOWN_CLOUD_SYNC_STATUS;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [cmfo, java.lang.Object] */
    public final void D() {
        ecem.b();
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService", "cleanupDeltaSyncFieldsSync", 1840, "CmsSettingsDataService.java")).q("Cleaning up delta sync fields.");
        this.e.get().m(new ejvr() { // from class: auqm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.I = null;
                aumqVar.c &= -17;
                builder.copyOnWrite();
                aumq aumqVar2 = (aumq) builder.instance;
                aumqVar2.M = null;
                aumqVar2.c &= -129;
                builder.copyOnWrite();
                aumq aumqVar3 = (aumq) builder.instance;
                aumqVar3.H = null;
                aumqVar3.c &= -9;
                builder.copyOnWrite();
                aumq aumqVar4 = (aumq) builder.instance;
                aumqVar4.c &= -33;
                aumq aumqVar5 = aumq.a;
                aumqVar4.J = aumqVar5.J;
                builder.copyOnWrite();
                aumq aumqVar6 = (aumq) builder.instance;
                aumqVar6.c &= -65;
                aumqVar6.K = aumqVar5.K;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void E() {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: auqi
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.u = null;
                aumqVar.b &= -131073;
                return builder.build();
            }
        });
        L();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void F() {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aund
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return aurx.d((aumq) obj, "");
            }
        });
        L();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void G() {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: auqf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.C = null;
                aumqVar.b &= -1073741825;
                return builder.build();
            }
        });
        L();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void H() {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: auow
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.P = null;
                aumqVar.c &= -1025;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void I() {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: auoj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.b &= -1048577;
                aumqVar.w = false;
                return builder.build();
            }
        });
        L();
    }

    public final void J() {
        ((dqsn) this.h.b()).g(new dqsm() { // from class: aupa
            @Override // defpackage.dqsm
            public final eieu a() {
                cqce cqceVar = aurx.a;
                return eiiy.k("CSDS::notifyAppSettingsUi::runAfterCommit");
            }
        }, "CmsSettingsDataService#notifyAppSettingsUi", new Runnable() { // from class: aupb
            @Override // java.lang.Runnable
            public final void run() {
                this.a.g.a(eijx.e(null), cpxy.a);
                aurx.a.p("Notify App Settings Ui called.");
            }
        });
    }

    public final void K() {
        if (cpyl.a()) {
            fcsu fcsuVar = this.h;
            if (((dqsn) fcsuVar.b()).i()) {
                ((dqsn) fcsuVar.b()).g(new dqsm() { // from class: auok
                    @Override // defpackage.dqsm
                    public final eieu a() {
                        cqce cqceVar = aurx.a;
                        return eiiy.k("CSDS::notifyBnrSettingsUi::runAfterCommit");
                    }
                }, "CmsSettingsDataService#notifyBnrSettingsUi", new Runnable() { // from class: auol
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.g.a(eijx.e(null), cpxx.a);
                        aurx.a.p("Notify Bnr Settings Ui called after transaction commit");
                    }
                });
            } else {
                this.g.a(eijx.e(null), cpxx.a);
                a.p("Notify Bnr Settings Ui called");
            }
        }
    }

    public final void L() {
        this.g.a(eijx.e(null), "CMS_SETTINGS_DATA_SOURCE_CONTENT_KEY");
    }

    public final void M() {
        ekqg ekqgVarListIterator = ((ekph) this.q).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            final ausk auskVar = (ausk) ekqgVarListIterator.next();
            auskVar.getClass();
            eijx.f(new Runnable() { // from class: aupr
                @Override // java.lang.Runnable
                public final void run() {
                    auskVar.a();
                }
            }, this.o).k(auvh.c(new Consumer() { // from class: aups
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ekrw ekrwVarH = aurx.b.h();
                    ekrwVarH.X(eksq.a, "BugleCms");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService", "notifyRestoreComplete", 1243, "CmsSettingsDataService.java")).t("Notified listener %s for restore complete", auskVar);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), this.f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void N() {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aupn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.clear();
                return builder.build();
            }
        });
        this.k.set(feds.UNKNOWN_CLOUD_SYNC_STATUS);
        L();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [cmfo, java.lang.Object] */
    public final void O() {
        ecem.b();
        this.i.a(false);
        this.e.get().m(new ejvr() { // from class: aunf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.G = null;
                aumqVar.c &= -5;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void P() {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: auos
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.b |= 4096;
                aumqVar.p = 0;
                return builder.build();
            }
        });
        L();
    }

    public final void Q(auml aumlVar) {
        R(aumlVar, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void R(final auml aumlVar, boolean z) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aumr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.r = aumlVar.h;
                aumqVar.b |= 16384;
                return builder.build();
            }
        });
        if (this.l.a()) {
            this.k.set(null);
        } else {
            this.m.c(aumlVar);
        }
        L();
        if (z) {
            K();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void S(final aumj aumjVar) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aunm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.y = aumjVar.d;
                aumqVar.b |= 16777216;
                return builder.build();
            }
        });
        L();
        K();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void T(final evvp evvpVar) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aung
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                evvp evvpVar2 = evvpVar;
                evvpVar2.getClass();
                aumqVar.I = evvpVar2;
                aumqVar.c |= 16;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void U(final evvp evvpVar) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aupd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                evvp evvpVar2 = evvpVar;
                evvpVar2.getClass();
                aumqVar.M = evvpVar2;
                aumqVar.c |= 128;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void V(final evvp evvpVar) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aupz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                evvp evvpVar2 = evvpVar;
                evvpVar2.getClass();
                aumqVar.H = evvpVar2;
                aumqVar.c |= 8;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [cmfo, java.lang.Object] */
    public final void W(final String str) {
        ecem.b();
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService", "setDeltaSyncFieldsDuringOptOutSync", 1857, "CmsSettingsDataService.java")).q("Setting up delta sync PriorToCmsGaiaId field.");
        this.e.get().m(new ejvr() { // from class: aunw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.I = null;
                aumqVar.c &= -17;
                builder.copyOnWrite();
                aumq aumqVar2 = (aumq) builder.instance;
                String str2 = str;
                str2.getClass();
                aumqVar2.c |= 64;
                aumqVar2.K = str2;
                builder.copyOnWrite();
                aumq aumqVar3 = (aumq) builder.instance;
                aumqVar3.H = null;
                aumqVar3.c &= -9;
                builder.copyOnWrite();
                aumq aumqVar4 = (aumq) builder.instance;
                aumqVar4.c &= -33;
                aumqVar4.J = aumq.a.J;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    @Deprecated
    public final void X(final boolean z) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aurn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.b |= 8192;
                aumqVar.q = z;
                return builder.build();
            }
        });
        L();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    @Deprecated
    public final void Y(final boolean z) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aurm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.b |= 2;
                aumqVar.e = z;
                return builder.build();
            }
        });
        L();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void Z(final aumn aumnVar) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aurd
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.o = aumnVar.g;
                aumqVar.b |= 2048;
                return builder.build();
            }
        });
        L();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final auml a() {
        ecem.b();
        auml aumlVarB = auml.b(((aumq) this.e.get().l()).r);
        return aumlVarB == null ? auml.UNSPECIFIED_STATUS : aumlVarB;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void aa(final long j) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aunr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                aumg builder = aumqVar.toBuilder();
                ausj ausjVar = aumqVar.C;
                if (ausjVar == null) {
                    ausjVar = ausj.a;
                }
                long j2 = j;
                this.a.al(ausjVar.f, 0L, j2, "The total messages to backup will be smaller than the backed up message count");
                ausi ausiVar = (ausi) ausjVar.toBuilder();
                ausiVar.copyOnWrite();
                ausj ausjVar2 = (ausj) ausiVar.instance;
                ausjVar2.b |= 16;
                ausjVar2.e = j2;
                builder.copyOnWrite();
                aumq aumqVar2 = (aumq) builder.instance;
                ausj ausjVar3 = (ausj) ausiVar.build();
                ausjVar3.getClass();
                aumqVar2.C = ausjVar3;
                aumqVar2.b |= 1073741824;
                return builder.build();
            }
        });
        L();
    }

    public final void ab(autt auttVar) {
        ac(auttVar, true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cmfo, java.lang.Object] */
    public final void ac(final autt auttVar, boolean z) {
        ecem.b();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e.get().m(new ejvr() { // from class: aupf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                cqce cqceVar = aurx.a;
                autt auttVarB = autt.b(aumqVar.f);
                if (auttVarB == null) {
                    auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
                }
                autt auttVar2 = auttVar;
                if (auttVarB.equals(autt.RESTORE) && auttVar2.equals(autt.BACKUP)) {
                    atomicBoolean.set(true);
                }
                aumg builder = aumqVar.toBuilder();
                builder.copyOnWrite();
                aumq aumqVar2 = (aumq) builder.instance;
                aumqVar2.f = auttVar2.j;
                aumqVar2.b |= 4;
                return builder.build();
            }
        });
        if (atomicBoolean.get()) {
            M();
        }
        L();
        if (z) {
            K();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void ad(final auml aumlVar) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: auro
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.l = aumlVar.h;
                aumqVar.b |= 256;
                return builder.build();
            }
        });
        if (this.l.a()) {
            this.k.set(null);
        } else {
            this.m.c(aumlVar);
        }
        L();
        if (cpyl.a() && ((Boolean) ((cczi) cqaa.a.get()).e()).booleanValue()) {
            J();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void ae(final String str) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: auoe
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                String str2 = str;
                str2.getClass();
                aumqVar.c |= 64;
                aumqVar.K = str2;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void af(final String str) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aurr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                String str2 = str;
                str2.getClass();
                aumqVar.c |= 32;
                aumqVar.J = str2;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void ag(final boolean z) {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: aunx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.b |= 536870912;
                aumqVar.B = z;
                return builder.build();
            }
        });
        L();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [cmfo, java.lang.Object] */
    public final void ah(final String str) {
        ecem.b();
        if (ejwk.c(str)) {
            a.p("Clearing session id.");
        } else {
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Setting session id.");
            cqbdVarC.A("sessionId", str);
            cqbdVarC.r();
        }
        this.e.get().m(new ejvr() { // from class: aumt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    ArrayDeque arrayDeque = new ArrayDeque(DesugarCollections.unmodifiableList(((aumq) builder.instance).L));
                    arrayDeque.add(str2);
                    while (!arrayDeque.isEmpty() && arrayDeque.size() > ((Integer) aurx.c.e()).intValue()) {
                        arrayDeque.pollFirst();
                    }
                    builder.copyOnWrite();
                    ((aumq) builder.instance).L = evsn.emptyProtobufList();
                    builder.copyOnWrite();
                    aumq aumqVar = (aumq) builder.instance;
                    evtg evtgVar = aumqVar.L;
                    if (!evtgVar.c()) {
                        aumqVar.L = evsn.mutableCopy(evtgVar);
                    }
                    evpz.addAll(arrayDeque, aumqVar.L);
                }
                builder.copyOnWrite();
                aumq aumqVar2 = (aumq) builder.instance;
                str2.getClass();
                aumqVar2.b |= 64;
                aumqVar2.j = str2;
                return builder.build();
            }
        });
        L();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    @Deprecated
    public final boolean ai() {
        ecem.b();
        return ((aumq) this.e.get().l()).e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final boolean aj() {
        ecem.b();
        return ((aumq) this.e.get().l()).v;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju ak() {
        return this.e.get().j(new ejvr() { // from class: aupk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final aumg builder = ((aumq) obj).toBuilder();
                ((dqsn) this.a.h.b()).d("CmsSettingsDataService#incrementInitialSyncProgressDataParticipantsToBackupCount", new Runnable() { // from class: auob
                    @Override // java.lang.Runnable
                    public final void run() {
                        cqce cqceVar = aurx.a;
                        aumg aumgVar = builder;
                        ausj ausjVar = ((aumq) aumgVar.instance).C;
                        if (ausjVar == null) {
                            ausjVar = ausj.a;
                        }
                        ausi ausiVar = (ausi) ausjVar.toBuilder();
                        int i = ausjVar.m + 1;
                        ausiVar.copyOnWrite();
                        ausj ausjVar2 = (ausj) ausiVar.instance;
                        ausjVar2.b |= 4096;
                        ausjVar2.m = i;
                        aumgVar.copyOnWrite();
                        aumq aumqVar = (aumq) aumgVar.instance;
                        ausj ausjVar3 = (ausj) ausiVar.build();
                        ausjVar3.getClass();
                        aumqVar.C = ausjVar3;
                        aumqVar.b |= 1073741824;
                    }
                });
                return builder.build();
            }
        }).h(new ejvr() { // from class: aupl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                return null;
            }
        }, eoqg.a);
    }

    public final void al(long j, long j2, long j3, String str) {
        if (j + j2 > j3 || j < 0 || j2 < 0) {
            if (!cpyl.a()) {
                ar(j, j2, j3, str);
                return;
            }
            if (j < 0) {
                cqbd cqbdVarB = a.b();
                cqbdVarB.I("The negative messageCount is invalid");
                cqbdVarB.z("messageCount", j);
                cqbdVarB.r();
                return;
            }
            if (j2 < 0) {
                cqbd cqbdVarB2 = a.b();
                cqbdVarB2.I("The negative incrementValue is invalid");
                cqbdVarB2.z("incrementValue", j2);
                cqbdVarB2.r();
                return;
            }
            if ((j2 != 0 || j <= j3) && (j2 <= 0 || j > j3)) {
                return;
            }
            ar(j, j2, j3, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju am() {
        return this.e.get().j(new ejvr() { // from class: auqy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.b |= 2097152;
                aumqVar.x = true;
                return builder.build();
            }
        }).h(new ejvr() { // from class: aure
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.L();
                return null;
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final void an() {
        ecem.b();
        this.e.get().m(new ejvr() { // from class: auox
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumg builder = ((aumq) obj).toBuilder();
                builder.copyOnWrite();
                aumq aumqVar = (aumq) builder.instance;
                aumqVar.b |= 524288;
                aumqVar.v = true;
                return builder.build();
            }
        });
        L();
    }

    public final eiju ao(final int i) {
        return z(new Function() { // from class: auqx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aumg aumgVar = (aumg) obj;
                cqce cqceVar = aurx.a;
                ausb ausbVar = ((aumq) aumgVar.instance).s;
                if (ausbVar == null) {
                    ausbVar = ausb.a;
                }
                int i2 = i;
                aury auryVar = (aury) ausbVar.toBuilder();
                auryVar.copyOnWrite();
                ausb ausbVar2 = (ausb) auryVar.instance;
                ausbVar2.e = i2 - 1;
                ausbVar2.b |= 4;
                ausb ausbVar3 = (ausb) auryVar.build();
                aumgVar.copyOnWrite();
                aumq aumqVar = (aumq) aumgVar.instance;
                ausbVar3.getClass();
                aumqVar.s = ausbVar3;
                aumqVar.b |= 32768;
                return aumgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eiju ap(final int i) {
        return z(new Function() { // from class: aupg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aumg aumgVar = (aumg) obj;
                cqce cqceVar = aurx.a;
                ausb ausbVar = ((aumq) aumgVar.instance).s;
                if (ausbVar == null) {
                    ausbVar = ausb.a;
                }
                int i2 = i;
                aury auryVar = (aury) ausbVar.toBuilder();
                auryVar.copyOnWrite();
                ausb ausbVar2 = (ausb) auryVar.instance;
                ausbVar2.d = i2 - 1;
                ausbVar2.b |= 2;
                ausb ausbVar3 = (ausb) auryVar.build();
                aumgVar.copyOnWrite();
                aumq aumqVar = (aumq) aumgVar.instance;
                ausbVar3.getClass();
                aumqVar.s = ausbVar3;
                aumqVar.b |= 32768;
                return aumgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eiju aq(final int i) {
        return z(new Function() { // from class: auqs
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aumg aumgVar = (aumg) obj;
                cqce cqceVar = aurx.a;
                ausb ausbVar = ((aumq) aumgVar.instance).s;
                if (ausbVar == null) {
                    ausbVar = ausb.a;
                }
                int i2 = i;
                aury auryVar = (aury) ausbVar.toBuilder();
                auryVar.copyOnWrite();
                ausb ausbVar2 = (ausb) auryVar.instance;
                ausbVar2.c = i2 - 1;
                ausbVar2.b |= 1;
                ausb ausbVar3 = (ausb) auryVar.build();
                aumgVar.copyOnWrite();
                aumq aumqVar = (aumq) aumgVar.instance;
                ausbVar3.getClass();
                aumqVar.s = ausbVar3;
                aumqVar.b |= 32768;
                return aumgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final auml b() {
        ecem.b();
        auml aumlVarB = auml.b(((aumq) this.e.get().l()).l);
        return aumlVarB == null ? auml.UNSPECIFIED_STATUS : aumlVarB;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final aumq c() {
        return (aumq) this.e.get().l();
    }

    public final egyi e() {
        return new egys(this.n, new eopk() { // from class: auot
            /* JADX WARN: Type inference failed for: r2v3, types: [cmfo, java.lang.Object] */
            @Override // defpackage.eopk
            public final eopy a(eopt eoptVar) {
                return new eopy(this.a.e.get().h());
            }
        }, "CMS_SETTINGS_DATA_SOURCE_CONTENT_KEY");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju f() {
        return this.e.get().h().h(new ejvr() { // from class: auom
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                auml aumlVarB = auml.b(((aumq) obj).r);
                return aumlVarB == null ? auml.UNSPECIFIED_STATUS : aumlVarB;
            }
        }, eoqg.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju g() {
        return this.e.get().h().h(new ejvr() { // from class: aurh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aulz aulzVar = ((aumq) obj).u;
                return aulzVar == null ? aulz.a : aulzVar;
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju h() {
        return this.e.get().h().h(new ejvr() { // from class: auod
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                aumj aumjVarB = aumj.b(((aumq) obj).y);
                return aumjVarB == null ? aumj.ENCRYPTION_STATUS_UNSPECIFIED : aumjVarB;
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju i() {
        return this.e.get().h().h(new ejvr() { // from class: aupw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                evvp evvpVar = ((aumq) obj).I;
                return evvpVar == null ? evvp.a : evvpVar;
            }
        }, eoqg.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju j() {
        return this.e.get().h().h(new ejvr() { // from class: auou
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Integer.valueOf(((aumq) obj).n);
            }
        }, eoqg.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju k() {
        return this.e.get().h();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju l() {
        return this.e.get().h().h(new ejvr() { // from class: aune
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ausb ausbVar = ((aumq) obj).s;
                return ausbVar == null ? ausb.a : ausbVar;
            }
        }, eoqg.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju m() {
        return this.e.get().h().h(new ejvr() { // from class: auqc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                apoy apoyVar = this.a.j;
                apoyVar.a();
                if (apoyVar.a()) {
                    evvp evvpVar = aumqVar.I;
                    return evvpVar == null ? evvp.a : evvpVar;
                }
                apoyVar.a();
                return evxc.c;
            }
        }, eoqg.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju n() {
        return this.e.get().h().h(new ejvr() { // from class: auns
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                aumq aumqVar = (aumq) obj;
                cqce cqceVar = aurx.a;
                return (aumqVar.b & 8) != 0 ? Optional.of(aumqVar.g) : Optional.empty();
            }
        }, eoqg.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju o() {
        return this.e.get().h().h(new ejvr() { // from class: auph
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Integer.valueOf(((aumq) obj).p);
            }
        }, eoqg.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju p() {
        return this.e.get().h().h(new ejvr() { // from class: auoz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                evrj evrjVar = ((aumq) obj).P;
                return evrjVar == null ? evrj.a : evrjVar;
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    @Deprecated
    public final eiju q() {
        return this.e.get().h().h(new ejvr() { // from class: aupp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((aumq) obj).e);
            }
        }, eoqg.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju r() {
        return this.e.get().h().h(new ejvr() { // from class: auoo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                auml aumlVarB = auml.b(((aumq) obj).l);
                return aumlVarB == null ? auml.UNSPECIFIED_STATUS : aumlVarB;
            }
        }, eoqg.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju s() {
        return this.e.get().h().h(new ejvr() { // from class: auoy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(((aumq) obj).B);
            }
        }, eoqg.a);
    }

    public final eiju t(final int i) {
        return z(new Function() { // from class: aupi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final aumg aumgVar = (aumg) obj;
                dqsn dqsnVar = (dqsn) this.a.h.b();
                final int i2 = i;
                dqsnVar.d("CmsSettingsDataService#incrementInitialSyncProgressDataRestoredConversationsCount", new Runnable() { // from class: auoa
                    @Override // java.lang.Runnable
                    public final void run() {
                        cqce cqceVar = aurx.a;
                        aumg aumgVar2 = aumgVar;
                        ausj ausjVar = ((aumq) aumgVar2.instance).C;
                        if (ausjVar == null) {
                            ausjVar = ausj.a;
                        }
                        int i3 = i2;
                        int i4 = ausjVar.h;
                        ausi ausiVar = (ausi) ausjVar.toBuilder();
                        int i5 = i4 + i3;
                        ausiVar.copyOnWrite();
                        ausj ausjVar2 = (ausj) ausiVar.instance;
                        ausjVar2.b |= 128;
                        ausjVar2.h = i5;
                        aumgVar2.copyOnWrite();
                        aumq aumqVar = (aumq) aumgVar2.instance;
                        ausj ausjVar3 = (ausj) ausiVar.build();
                        ausjVar3.getClass();
                        aumqVar.C = ausjVar3;
                        aumqVar.b |= 1073741824;
                    }
                });
                return aumgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eiju u(final long j) {
        return z(new Function() { // from class: auqe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final aurx aurxVar = this.a;
                final aumg aumgVar = (aumg) obj;
                dqsn dqsnVar = (dqsn) aurxVar.h.b();
                final long j2 = j;
                dqsnVar.d("CmsSettingsDataService#incrementInitialSyncProgressDataRestoredMessagesCount", new Runnable() { // from class: aupq
                    @Override // java.lang.Runnable
                    public final void run() {
                        aumg aumgVar2 = aumgVar;
                        ausj ausjVar = ((aumq) aumgVar2.instance).C;
                        if (ausjVar == null) {
                            ausjVar = ausj.a;
                        }
                        long j3 = j2;
                        aurx aurxVar2 = aurxVar;
                        long j4 = ausjVar.c;
                        long j5 = ausjVar.d;
                        aurxVar2.al(j5, j3, j4, "The restored message count will be more than the total messages to restore");
                        ausi ausiVar = (ausi) ausjVar.toBuilder();
                        ausiVar.copyOnWrite();
                        ausj ausjVar2 = (ausj) ausiVar.instance;
                        ausjVar2.b |= 2;
                        ausjVar2.d = j5 + j3;
                        aumgVar2.copyOnWrite();
                        aumq aumqVar = (aumq) aumgVar2.instance;
                        ausj ausjVar3 = (ausj) ausiVar.build();
                        ausjVar3.getClass();
                        aumqVar.C = ausjVar3;
                        aumqVar.b |= 1073741824;
                    }
                });
                return aumgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eiju v(final int i) {
        return z(new Function() { // from class: auoq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final aumg aumgVar = (aumg) obj;
                dqsn dqsnVar = (dqsn) this.a.h.b();
                final int i2 = i;
                dqsnVar.d("CmsSettingsDataService#incrementInitialSyncProgressDataRestoredParticipantsCount", new Runnable() { // from class: auqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        cqce cqceVar = aurx.a;
                        aumg aumgVar2 = aumgVar;
                        ausj ausjVar = ((aumq) aumgVar2.instance).C;
                        if (ausjVar == null) {
                            ausjVar = ausj.a;
                        }
                        int i3 = i2;
                        int i4 = ausjVar.l;
                        ausi ausiVar = (ausi) ausjVar.toBuilder();
                        int i5 = i4 + i3;
                        ausiVar.copyOnWrite();
                        ausj ausjVar2 = (ausj) ausiVar.instance;
                        ausjVar2.b |= 2048;
                        ausjVar2.l = i5;
                        aumgVar2.copyOnWrite();
                        aumq aumqVar = (aumq) aumgVar2.instance;
                        ausj ausjVar3 = (ausj) ausiVar.build();
                        ausjVar3.getClass();
                        aumqVar.C = ausjVar3;
                        aumqVar.b |= 1073741824;
                    }
                });
                return aumgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eiju w(final String str) {
        return A(new Function() { // from class: aunn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                return aurx.d(((aumg) obj).build(), str).toBuilder();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: auno
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aumq) obj).h;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eiju x(final int i) {
        return A(new Function() { // from class: auna
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aumg aumgVar = (aumg) obj;
                cqce cqceVar = aurx.a;
                aumgVar.copyOnWrite();
                aumq aumqVar = (aumq) aumgVar.instance;
                aumq aumqVar2 = aumq.a;
                aumqVar.b |= 4096;
                aumqVar.p = i;
                return aumgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: aunb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((aumq) obj).p);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eiju y(final boolean z) {
        return z(new Function() { // from class: aunp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aumg aumgVar = (aumg) obj;
                cqce cqceVar = aurx.a;
                aumgVar.copyOnWrite();
                aumq aumqVar = (aumq) aumgVar.instance;
                aumq aumqVar2 = aumq.a;
                aumqVar.b |= 1048576;
                aumqVar.w = z;
                return aumgVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cmfo, java.lang.Object] */
    public final eiju z(final Function function) {
        return this.e.get().j(new ejvr() { // from class: aumx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqce cqceVar = aurx.a;
                return ((aumg) function.apply(((aumq) obj).toBuilder())).build();
            }
        }).h(new ejvr() { // from class: aumy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.L();
                return null;
            }
        }, this.f);
    }
}
