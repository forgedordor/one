package defpackage;

import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqhm implements cqgm {
    public static final eksp a = eksp.c("BugleConnectivity");
    public final Consumer b;
    public final int c;
    public final AtomicReference e;
    public final AtomicReference f;
    private final eosc g;
    private final egpm h;
    private cqhl i;
    private final TelephonyManager j;
    public final Object d = new Object();
    private int k = 1;

    public cqhm(crot crotVar, eosc eoscVar, egpm egpmVar, Consumer consumer, int i) {
        cqgl cqglVar = cqgl.UNKNOWN;
        this.e = new AtomicReference(cqglVar);
        this.f = new AtomicReference(cqglVar);
        this.j = crotVar.a(i);
        this.g = eoscVar;
        this.h = egpmVar;
        this.b = consumer;
        this.c = i;
    }

    private final void e() {
        this.j.registerTelephonyCallback(this.g, this.i);
        this.k = 3;
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "registerTelephonyCallback", 138, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength registered for subId %d.", this.c);
    }

    @Override // defpackage.cqgm
    public final cqgl a() {
        return (cqgl) this.e.get();
    }

    @Override // defpackage.cqgm
    public final void b() {
        synchronized (this.d) {
            int i = this.k;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.k = 2;
                this.i = new cqhl(new Consumer() { // from class: cqhk
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int level = ((SignalStrength) obj).getLevel();
                        cqgl cqglVar = (level == 1 || level == 2 || level == 3 || level == 4) ? cqgl.AVAILABLE : cqgl.UNKNOWN;
                        cqhm cqhmVar = this.a;
                        cqgl cqglVar2 = (cqgl) cqhmVar.e.getAndSet(cqglVar);
                        cqhmVar.f.set(cqglVar2);
                        eksl ekslVar = (eksl) cqhm.a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "onNetworkStateChanged", 156, "NetworkStateMonitorSSignalStrength.java");
                        Integer numValueOf = Integer.valueOf(cqhmVar.c);
                        ekslVar.I("NetworkStateMonitorSSignalStrength onNetworkStateChanged for subId %d: %s to %s", numValueOf, cqglVar2, cqglVar);
                        cqhmVar.b.accept(numValueOf);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                e();
            } else if (i2 == 1) {
                ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "startMonitoring", 83, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength is being registered asynchronously for subId %d.", this.c);
            } else if (i2 == 2) {
                ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "startMonitoring", 88, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength has already been registered for subId %d.", this.c);
            } else if (i2 == 3) {
                e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[Catch: all -> 0x0043, TryCatch #0 {, blocks: (B:4:0x0005, B:17:0x003f, B:14:0x0017, B:15:0x001b, B:16:0x0026, B:20:0x0042), top: B:24:0x0005 }] */
    @Override // defpackage.cqgm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            java.lang.String r1 = "NetworkStateMonitorSSignalStrength.java"
            monitor-enter(r0)
            int r2 = r6.k     // Catch: java.lang.Throwable -> L43
            int r3 = r2 + (-1)
            if (r2 == 0) goto L41
            if (r3 == 0) goto L26
            r2 = 1
            if (r3 == r2) goto L1b
            r2 = 2
            if (r3 == r2) goto L17
            r2 = 3
            if (r3 == r2) goto L26
            goto L3f
        L17:
            r6.d()     // Catch: java.lang.Throwable -> L43
            goto L3f
        L1b:
            egpm r1 = r6.h     // Catch: java.lang.Throwable -> L43
            cqhj r2 = new cqhj     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            r1.post(r2)     // Catch: java.lang.Throwable -> L43
            goto L3f
        L26:
            eksp r2 = defpackage.cqhm.a     // Catch: java.lang.Throwable -> L43
            ekrw r2 = r2.n()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength"
            java.lang.String r4 = "stopMonitoring"
            r5 = 112(0x70, float:1.57E-43)
            ekrw r1 = r2.h(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L43
            eksl r1 = (defpackage.eksl) r1     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "NetworkStateMonitorSSignalStrength isn't registered for subId %d."
            int r3 = r6.c     // Catch: java.lang.Throwable -> L43
            r1.r(r2, r3)     // Catch: java.lang.Throwable -> L43
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            return
        L41:
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> L43
        L43:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L43
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqhm.c():void");
    }

    public final void d() {
        this.j.unregisterTelephonyCallback(this.i);
        this.k = 4;
        this.e.set(cqgl.UNKNOWN);
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSSignalStrength", "unregisterTelephonyCallback", 148, "NetworkStateMonitorSSignalStrength.java")).r("NetworkStateMonitorSSignalStrength unregistered for subId %d.", this.c);
    }
}
