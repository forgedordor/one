package defpackage;

import com.google.android.rcs.client.events.EventService;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmfd implements efaq, chyy {
    public final eygg b;
    private final eygg d;
    private final cmfe e;
    private final eygg f;
    private eiju g;
    private int h = 0;
    private final ejxr i;
    private final eosd j;
    private final boolean k;
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/service/RcsServiceListener");
    public static final Duration a = Duration.ofHours(1);

    public cmfd(eygg eyggVar, cmfe cmfeVar, eygg eyggVar2, eygg eyggVar3, eosd eosdVar, fcsu fcsuVar) {
        this.d = eyggVar;
        this.e = cmfeVar;
        this.f = eyggVar2;
        this.b = eyggVar3;
        this.j = eosdVar;
        this.k = !((arhb) fcsuVar.b()).a() || dfog.L();
        this.i = ejxx.a(new ejxr() { // from class: cmfb
            @Override // defpackage.ejxr
            public final Object get() {
                Duration duration = cmfd.a;
                elfq elfqVarC = elfq.c(Duration.ofSeconds(1L), 2.0d, 10);
                Duration duration2 = cmfd.a;
                return new elfn(elfqVarC, duration2.isZero() ? new elfl(48) : new elfk(duration2));
            }
        });
    }

    private final long a(elfq elfqVar) {
        Duration durationA = elfqVar.a(this.h);
        eiju eijuVar = this.g;
        if (eijuVar == null || eijuVar.isDone() || this.g.isCancelled()) {
            this.h++;
            this.g = eiju.g(this.j.schedule(new Runnable() { // from class: cmfc
                @Override // java.lang.Runnable
                public final void run() {
                    ((chza) ((cqbm) this.a.b.b()).a()).o(chyx.NO_HINT);
                }
            }, durationA.toMillis(), TimeUnit.MILLISECONDS));
        }
        return durationA.toMillis();
    }

    @Override // defpackage.chyy
    public final void c(chyz chyzVar) {
        if (this.k) {
            if (chyzVar.b() == enwr.AVAILABLE) {
                this.e.m();
            }
        } else {
            ekrw ekrwVarI = c.i();
            ekrwVarI.X(eksq.a, "BugleRcsJibe");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.V(10, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/service/RcsServiceListener", "onRcsAvailabilityUpdate", 106, "RcsServiceListener.java")).q("RcsServiceListener#onRcsAvailabilityUpdate called when dual reg sip  is disabled. Unregister this listener.");
        }
    }

    @Override // defpackage.efaq
    public final void d(String str, efap efapVar) {
        if (!this.k) {
            ekrw ekrwVarI = c.i();
            ekrwVarI.X(eksq.a, "BugleRcsJibe");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.V(10, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/service/RcsServiceListener", "handleServiceConnectFailed", 158, "RcsServiceListener.java")).q("RcsServiceListener#handleServiceConnectFailed called when dual reg sip is disabled. No JibeServiceListener should be attempting to connect.");
            return;
        }
        eieu eieuVarK = eiiy.k("RcsServiceListener#handleServiceConnectFailed");
        try {
            long jA = a((elfq) this.i.get());
            cqca.f("BugleRcsJibe", str + " RCS service failed to connect: " + String.valueOf(efapVar) + " [Will retry in " + jA + "ms]");
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaq
    public final void e(String str) {
        if (!this.k) {
            ekrw ekrwVarI = c.i();
            ekrwVarI.X(eksq.a, "BugleRcsJibe");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.V(10, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/service/RcsServiceListener", "handleServiceConnected", 121, "RcsServiceListener.java")).q("RcsServiceListener#handleServiceConnected called when dual reg sip is disabled. No JibeServiceListener should be attempting to connect.");
            return;
        }
        eieu eieuVarK = eiiy.k("RcsServiceListener#handleServiceConnected");
        try {
            cqca.i("BugleRcsJibe", a.x(str, " RCS service connected"));
            this.h = 0;
            cmfe cmfeVar = this.e;
            if (cmfeVar.b().isConnected() && cmfeVar.d().isConnected() && cmfeVar.c().isConnected() && cmfeVar.e().isConnected()) {
                try {
                    eieuVarK = eiiy.k("subscribe");
                    try {
                        EventService eventServiceB = cmfeVar.b();
                        clej clejVar = (clej) this.d.b();
                        if (!eventServiceB.isSubscribed(clejVar)) {
                            cqca.i("BugleRcsJibe", "subscribing to global rcs listener");
                            eventServiceB.subscribe(3, clejVar);
                            eventServiceB.subscribe(5, clejVar);
                            eventServiceB.subscribe(2, clejVar);
                        }
                        eieuVarK.close();
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (efao e) {
                    cqca.p("BugleRcsJibe", e, "exception subscribing to RCS events");
                }
                cqca.l("BugleRcsJibe", "kicking off RCS sending/receiving");
                ((cjpo) this.f.b()).o();
            }
            eieuVarK.close();
        } finally {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
    }

    @Override // defpackage.efaq
    public final void f(String str) {
        if (!this.k) {
            ekrw ekrwVarI = c.i();
            ekrwVarI.X(eksq.a, "BugleRcsJibe");
            ekrd ekrdVar = (ekrd) ekrwVarI;
            ekrdVar.V(10, TimeUnit.MINUTES);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/service/RcsServiceListener", "handleServiceDisconnected", 183, "RcsServiceListener.java")).q("RcsServiceListener#handleServiceDisconnected called when dual reg sip is disabled. No JibeServiceListener should be attempting to connect.");
            return;
        }
        eieu eieuVarK = eiiy.k("RcsServiceListener::ServiceDisconnected");
        try {
            cqca.f("BugleRcsJibe", str + " RCS service disconnected [Will reconnect in " + a((elfq) this.i.get()) + "ms]");
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
