package defpackage;

import android.content.pm.PackageManager;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adjr implements adjc {
    public static final eksp a = eksp.c("BugleInAppUpdate");
    public final PackageManager b;
    public final eosc c;
    public final fcsu d;
    public final fcsu e;
    public final adjb f;
    public final fcsu g;
    public final fcsu h;
    private final eexy i;

    public adjr(PackageManager packageManager, eexy eexyVar, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2, adjb adjbVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.b = packageManager;
        this.i = eexyVar;
        this.c = eoscVar;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = adjbVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
    }

    public static int e(eexu eexuVar) {
        Integer num = eexuVar.e;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean g(adju adjuVar) {
        return (adjuVar.c == 0 && adjuVar.d == 0) ? false : true;
    }

    @Override // defpackage.adjc
    public final eiju a() {
        return f().h(new ejvr() { // from class: adjq
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                adju adjuVar = (adju) obj;
                if (!adjr.g(adjuVar)) {
                    return Optional.empty();
                }
                emxq emxqVar = (emxq) emxr.a.createBuilder();
                int i = adjuVar.c;
                emxqVar.copyOnWrite();
                emxr emxrVar = (emxr) emxqVar.instance;
                emxrVar.b |= 2;
                emxrVar.c = i;
                int i2 = adjuVar.d;
                emxqVar.copyOnWrite();
                emxr emxrVar2 = (emxr) emxqVar.instance;
                emxrVar2.b |= 4;
                emxrVar2.d = i2;
                return Optional.of((emxr) emxqVar.build());
            }
        }, this.c);
    }

    @Override // defpackage.adjc
    public final eiju b() {
        final defn defnVarA = this.i.a();
        eiju eijuVarG = eiju.g(kol.a(new koi() { // from class: eilf
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                eoqg eoqgVar = eoqg.a;
                final eilg eilgVar = new eilg(kogVar);
                final eiik eiikVarB = eiik.b();
                defnVarA.o(eoqgVar, new defb() { // from class: eilh
                    @Override // defpackage.defb
                    public final void a(defn defnVar) {
                        eiik eiikVar = eiikVarB;
                        eiik eiikVarG = eiik.g();
                        eiik.e(eiikVar);
                        try {
                            eilgVar.a(defnVar);
                        } finally {
                            eiik.e(eiikVarG);
                        }
                    }
                });
                return "Task initializer";
            }
        }));
        ejvr ejvrVar = new ejvr() { // from class: adjk
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Optional.of((eexu) obj);
            }
        };
        eosc eoscVar = this.c;
        return eijuVarG.h(ejvrVar, eoscVar).e(Throwable.class, new ejvr() { // from class: adjl
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) ((eksl) adjr.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "getAppUpdateInfo", 215, "InAppUpdateDataServiceImpl.java")).q("Getting in-app update info failed.");
                return Optional.empty();
            }
        }, eoscVar).i(new eooz() { // from class: adjd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final eiju eijuVarE;
                final eiju eijuVarE2;
                final eiju eijuVarE3;
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return eijx.e(Optional.empty());
                }
                final eexu eexuVar = (eexu) optional.get();
                eksp ekspVar = adjr.a;
                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkTriggeringConditions", 83, "InAppUpdateDataServiceImpl.java")).B("Package name: %s, version code: %s", eexuVar.a, eexuVar.b);
                if (eexuVar.d == 11) {
                    return eijx.e(Optional.of(adjw.a(0, eexuVar)));
                }
                int i = eexuVar.c;
                if (i == 1 || i == 0) {
                    ((eksl) ekspVar.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkTriggeringConditions", 97, "InAppUpdateDataServiceImpl.java")).r("No update due to UpdateAvailability: %s", i);
                    return eijx.e(Optional.empty());
                }
                final adjr adjrVar = this.a;
                int iE = adjr.e(eexuVar);
                long j = iE;
                adjb adjbVar = adjrVar.f;
                final int i2 = j < Duration.ofDays(((Long) adjbVar.g.b()).longValue()).toDays() ? 0 : 1;
                ((eksl) ekspVar.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "getAppUpdateType", 339, "InAppUpdateDataServiceImpl.java")).r("Selected update flow: %s", i2);
                if (i == 3) {
                    ((eksl) ekspVar.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkTriggeringConditions", 107, "InAppUpdateDataServiceImpl.java")).q("Start update decision: resume update.");
                    return eijx.e(Optional.of(adjw.a(i2, eexuVar)));
                }
                fcsu fcsuVar = adjrVar.g;
                if (((apve) fcsuVar.b()).a()) {
                    ahwd ahwdVar = (ahwd) adjrVar.h.b();
                    eijuVarE = auvw.c(ahwdVar.e, fcyi.a, fdjz.a, new ahvc(ahwdVar, null)).h(new ejvr() { // from class: adjh
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar2 = adjr.a;
                            if (((List) obj2).isEmpty()) {
                                ((eksl) adjr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkRestoreExecutionsWaitingForAppUpdate", 238, "InAppUpdateDataServiceImpl.java")).q("No update. No restore executions waiting for app update.");
                                return Optional.empty();
                            }
                            eexu eexuVar2 = eexuVar;
                            ((eksl) adjr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkRestoreExecutionsWaitingForAppUpdate", 230, "InAppUpdateDataServiceImpl.java")).q("Update available, restore executions waiting for app update found");
                            return Optional.of(adjw.b(eexuVar2, 1));
                        }
                    }, adjrVar.c);
                } else {
                    eijuVarE = eijx.e(Optional.empty());
                }
                if (((apve) fcsuVar.b()).a()) {
                    ahwd ahwdVar2 = (ahwd) adjrVar.h.b();
                    eijuVarE2 = auvw.c(ahwdVar2.e, fcyi.a, fdjz.a, new ahvf(ahwdVar2, null)).h(new ejvr() { // from class: adjp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar2 = adjr.a;
                            if (((List) obj2).isEmpty()) {
                                ((eksl) adjr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkRestoreExecutionsWaitingForAppUpdateReprompt", 259, "InAppUpdateDataServiceImpl.java")).q("No update. No restore executions waiting for app update reprompt.");
                                return Optional.empty();
                            }
                            eexu eexuVar2 = eexuVar;
                            ((eksl) adjr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkRestoreExecutionsWaitingForAppUpdateReprompt", 253, "InAppUpdateDataServiceImpl.java")).q("Update available, restore executions waiting for app update reprompt found");
                            return Optional.of(adjw.b(eexuVar2, 2));
                        }
                    }, adjrVar.c);
                } else {
                    eijuVarE2 = eijx.e(Optional.empty());
                }
                if (j >= Duration.ofDays(((Long) adjbVar.a.b()).longValue()).toDays()) {
                    eijuVarE3 = adjrVar.f().h(new ejvr() { // from class: adje
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            Duration durationOfSeconds;
                            long jLongValue;
                            int i3;
                            int i4 = i2;
                            eexu eexuVar2 = eexuVar;
                            adju adjuVar = (adju) obj2;
                            int iE2 = adjr.e(eexuVar2);
                            if (eexuVar2.a(eeyg.b(i4).a()) != null) {
                                adjr adjrVar2 = adjrVar;
                                if (i4 != 0) {
                                    adjb adjbVar2 = adjrVar2.f;
                                    durationOfSeconds = Duration.ofSeconds(((Long) adjbVar2.e.b()).longValue());
                                    jLongValue = ((Long) adjbVar2.c.b()).longValue();
                                    i3 = adjuVar.d;
                                } else {
                                    adjb adjbVar3 = adjrVar2.f;
                                    durationOfSeconds = Duration.ofSeconds(((Long) adjbVar3.d.b()).longValue());
                                    jLongValue = ((Long) adjbVar3.b.b()).longValue();
                                    i3 = adjuVar.c;
                                }
                                long j2 = i3;
                                Instant instantF = ((cogw) adjrVar2.d.b()).f();
                                evvp evvpVar = adjuVar.e;
                                if (evvpVar == null) {
                                    evvpVar = evvp.a;
                                }
                                Instant instantD = evwz.d(evvpVar);
                                if (instantF.isBefore(instantD.plus(durationOfSeconds))) {
                                    ((eksl) adjr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "shouldStartUpdateFlow", 387, "InAppUpdateDataServiceImpl.java")).z("No update due to cooldown period. Last prompt: %s, reprompt interval days: %s", instantD.getEpochSecond(), durationOfSeconds.toDays());
                                } else {
                                    long j3 = iE2;
                                    long days = Duration.ofDays(((Long) adjrVar2.f.f.b()).longValue()).toDays();
                                    boolean z = j2 < jLongValue;
                                    ((eksl) adjr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "shouldStartUpdateFlow", 397, "InAppUpdateDataServiceImpl.java")).J("Staleness day(s): %s, is under max retry count: %s, impression count: %s, max retry count: %s", Integer.valueOf(iE2), Boolean.valueOf(z), Long.valueOf(j2), Long.valueOf(jLongValue));
                                    if (j3 >= days || z) {
                                        return Optional.of(adjw.a(i4, eexuVar2));
                                    }
                                }
                            } else {
                                ((eksl) adjr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "shouldStartUpdateFlow", 360, "InAppUpdateDataServiceImpl.java")).q("No update due to update type not allowed.");
                            }
                            return Optional.empty();
                        }
                    }, adjrVar.c);
                } else {
                    ((eksl) ekspVar.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "checkRegularPromptNeeded", 269, "InAppUpdateDataServiceImpl.java")).r("No update. Low staleness: %s day(s)", iE);
                    eijuVarE3 = eijx.e(Optional.empty());
                }
                return eijx.k(eijuVarE, eijuVarE2, eijuVarE3).a(new Callable() { // from class: adjg
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        eksp ekspVar2 = adjr.a;
                        Optional optional2 = (Optional) eork.q(eijuVarE);
                        if (optional2.isPresent()) {
                            return optional2;
                        }
                        Optional optional3 = (Optional) eork.q(eijuVarE2);
                        return optional3.isPresent() ? optional3 : (Optional) eork.q(eijuVarE3);
                    }
                }, adjrVar.c);
            }
        }, eoscVar);
    }

    @Override // defpackage.adjc
    public final eiju c(final boolean z) {
        return ((cmfo) this.e.b()).j(new ejvr() { // from class: adjm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                adju adjuVar = (adju) obj;
                adjt adjtVar = (adjt) adjuVar.toBuilder();
                evvp evvpVarB = evwz.b(((cogw) this.a.d.b()).f());
                adjtVar.copyOnWrite();
                adju adjuVar2 = (adju) adjtVar.instance;
                evvpVarB.getClass();
                adjuVar2.e = evvpVarB;
                adjuVar2.b |= 4;
                if (z) {
                    int i = adjuVar.c + 1;
                    adjtVar.copyOnWrite();
                    adju adjuVar3 = (adju) adjtVar.instance;
                    adjuVar3.b |= 1;
                    adjuVar3.c = i;
                } else {
                    int i2 = adjuVar.d + 1;
                    adjtVar.copyOnWrite();
                    adju adjuVar4 = (adju) adjtVar.instance;
                    adjuVar4.b |= 2;
                    adjuVar4.d = i2;
                }
                return (adju) adjtVar.build();
            }
        }).h(new ejvr() { // from class: adjn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) adjr.a.h()).h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "savePromptSeenToDevice", 162, "InAppUpdateDataServiceImpl.java")).q("Saved impression to device");
                return null;
            }
        }, this.c);
    }

    @Override // defpackage.adjc
    public final eiju d() {
        return ((cmfo) this.e.b()).j(new ejvr() { // from class: adji
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                adjt adjtVar = (adjt) ((adju) obj).toBuilder();
                evvp evvpVarB = evwz.b(((cogw) this.a.d.b()).f());
                adjtVar.copyOnWrite();
                adju adjuVar = (adju) adjtVar.instance;
                evvpVarB.getClass();
                adjuVar.e = evvpVarB;
                adjuVar.b |= 4;
                return (adju) adjtVar.build();
            }
        }).h(new ejvr() { // from class: adjj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) adjr.a.h()).h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "updateLastPromptTimestamp", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "InAppUpdateDataServiceImpl.java")).q("Updated last impression timestamp");
                return null;
            }
        }, this.c);
    }

    public final eiju f() {
        return ((cmfo) this.e.b()).h().i(new eooz() { // from class: adjf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Instant instantOfEpochMilli;
                adju adjuVar = (adju) obj;
                boolean zG = adjr.g(adjuVar);
                adjr adjrVar = this.a;
                if (!zG) {
                    return eijx.e(adjuVar);
                }
                evvp evvpVar = adjuVar.e;
                if (evvpVar == null) {
                    evvpVar = evvp.a;
                }
                Instant instantD = evwz.d(evvpVar);
                try {
                    instantOfEpochMilli = Instant.ofEpochMilli(adjrVar.b.getPackageInfo("com.google.android.apps.messaging", 0).lastUpdateTime);
                } catch (Exception unused) {
                    ((eksl) ((eksl) adjr.a.j()).h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "getLastUpdateInstant", 298, "InAppUpdateDataServiceImpl.java")).q("Could not get the last update timestamp");
                    instantOfEpochMilli = Instant.EPOCH;
                }
                ((eksl) adjr.a.n().h("com/google/android/apps/messaging/inappupdate/dataservice/InAppUpdateDataServiceImpl", "getLastUpdateInstant", 302, "InAppUpdateDataServiceImpl.java")).t("Last update timestamp: %s", instantOfEpochMilli);
                return instantOfEpochMilli.isAfter(instantD) ? ((cmfo) adjrVar.e.b()).j(new ejvr() { // from class: adjo
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = adjr.a;
                        return adju.a;
                    }
                }) : eijx.e(adjuVar);
            }
        }, this.c);
    }
}
