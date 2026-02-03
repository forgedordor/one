package defpackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdj implements cqae {
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final eosd g;
    private static final long f = TimeUnit.SECONDS.toMillis(2);
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager");

    public abdj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, eosd eosdVar, fcsu fcsuVar4) {
        this.c = fcsuVar;
        this.b = fcsuVar2;
        this.d = fcsuVar3;
        this.g = eosdVar;
        this.e = fcsuVar4;
    }

    @Override // defpackage.cqae
    public final void a() {
        eieu eieuVarK = eiiy.k("TachyonBindApplicationStateManager#onFirstActivityStarted_tachyonReceiverManager");
        try {
            eosd eosdVar = this.g;
            Runnable runnableK = eiid.k(new Runnable() { // from class: abdg
                @Override // java.lang.Runnable
                public final void run() {
                    abdj abdjVar = this.a;
                    byte[] bArrR = ((crqv) abdjVar.c.b()).r("ditto_active_desktop_id");
                    if (bArrR == null) {
                        ekrw ekrwVarH = abdj.a.h();
                        ekrwVarH.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "hasDittoActiveAnonymousDesktopId", 150, "TachyonBindApplicationStateManager.java")).q("No need to start anonymous Tachyon binding due to no active desktop id");
                        return;
                    }
                    try {
                        if (!((ezol) evsn.parseFrom(ezol.a, bArrR, evrr.a())).d.equals("Bugle")) {
                            ekrw ekrwVarH2 = abdj.a.h();
                            ekrwVarH2.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "hasDittoActiveAnonymousDesktopId", 160, "TachyonBindApplicationStateManager.java")).q("No need to start anonymous Tachyon binding for non-anonymous app");
                        } else {
                            ekrw ekrwVarH3 = abdj.a.h();
                            ekrwVarH3.X(eksq.a, "BugleNetwork");
                            ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "onFirstActivityStarted", 76, "TachyonBindApplicationStateManager.java")).q("Start anonymous Tachyon binding for Bugle app");
                            ((cfzf) abdjVar.b.b()).d();
                        }
                    } catch (evtj e) {
                        ekrw ekrwVarJ = abdj.a.j();
                        ekrwVarJ.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "hasDittoActiveAnonymousDesktopId", (char) 162, "TachyonBindApplicationStateManager.java")).q("Skip anonymous Tachyon binding because unable to parse desktop id");
                    }
                }
            });
            long j = f;
            eieuVarK.b(eiju.g(eosdVar.schedule(runnableK, j, TimeUnit.MILLISECONDS)));
            eieuVarK.close();
            eieu eieuVarK2 = eiiy.k("TachyonBindApplicationStateManager#onFirstActivityStarted_gaiaBindManagerMap");
            try {
                eieuVarK2.b(eiju.g(this.g.schedule(eiid.k(new Runnable() { // from class: abdh
                    @Override // java.lang.Runnable
                    public final void run() {
                        fcsu fcsuVar = this.a.d;
                        for (String str : ((Map) fcsuVar.b()).keySet()) {
                            if (str.equals("CMS")) {
                                ((cfic) ((Map) fcsuVar.b()).get(str)).g();
                            } else {
                                ((cfic) ((Map) fcsuVar.b()).get(str)).d();
                            }
                        }
                    }
                }), j, TimeUnit.MILLISECONDS)));
                eieuVarK2.close();
                eosd eosdVar2 = this.g;
                eieuVarK2 = eiiy.k("TachyonBindApplicationStateManager#scheduleBindTachygramChannels");
                try {
                    eieuVarK2.b(eosdVar2.schedule(eiid.k(new Runnable() { // from class: abdi
                        @Override // java.lang.Runnable
                        public final void run() {
                            ceno cenoVar = (ceno) this.a.e.b();
                            auvw.c(cenoVar.b, fcyi.a, fdjz.a, new cenm(cenoVar, null));
                        }
                    }), j, TimeUnit.MILLISECONDS));
                    eieuVarK2.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cqae
    public final void b() {
        ((cfzf) this.b.b()).f();
    }
}
