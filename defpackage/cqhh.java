package defpackage;

import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import j$.util.function.Consumer$CC;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqhh implements cqgm {
    public static final eksp a = eksp.c("BugleConnectivity");
    public final Consumer b;
    public final cqho c;
    public final int d;
    public final AtomicReference f;
    public final AtomicReference g;
    private final eosc h;
    private final egpm i;
    private cqhg j;
    private final TelephonyManager k;
    public final Object e = new Object();
    private int l = 1;

    public cqhh(crot crotVar, eosc eoscVar, egpm egpmVar, cqho cqhoVar, Consumer consumer, int i) {
        cqgl cqglVar = cqgl.UNKNOWN;
        this.f = new AtomicReference(cqglVar);
        this.g = new AtomicReference(cqglVar);
        this.k = crotVar.a(i);
        this.h = eoscVar;
        this.i = egpmVar;
        this.c = cqhoVar;
        this.b = consumer;
        this.d = i;
    }

    private final void e() {
        this.k.registerTelephonyCallback(this.h, this.j);
        this.l = 3;
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "registerTelephonyCallback", 143, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState registered for subId %d.", this.d);
    }

    @Override // defpackage.cqgm
    public final cqgl a() {
        return (cqgl) this.f.get();
    }

    @Override // defpackage.cqgm
    public final void b() {
        synchronized (this.e) {
            int i = this.l;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.l = 2;
                this.j = new cqhg(new Consumer() { // from class: cqhe
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cqhh cqhhVar = this.a;
                        int i3 = cqhhVar.d;
                        cqgl cqglVarA = cqhhVar.c.a((ServiceState) obj, i3);
                        cqgl cqglVar = (cqgl) cqhhVar.f.getAndSet(cqglVarA);
                        cqhhVar.g.set(cqglVar);
                        eksl ekslVar = (eksl) cqhh.a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "onNetworkStateChanged", 161, "NetworkStateMonitorSPlusServiceState.java");
                        Integer numValueOf = Integer.valueOf(i3);
                        ekslVar.I("NetworkStateMonitorSPlusServiceState onNetworkStateChanged for subId %d: %s to %s", numValueOf, cqglVar, cqglVarA);
                        cqhhVar.b.z(numValueOf);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                e();
            } else if (i2 == 1) {
                ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "startMonitoring", 87, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState is being registered asynchronously for subId %d.", this.d);
            } else if (i2 == 2) {
                ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "startMonitoring", 93, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState has already been registered for subId %d.", this.d);
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
            java.lang.Object r0 = r6.e
            java.lang.String r1 = "NetworkStateMonitorSPlusServiceState.java"
            monitor-enter(r0)
            int r2 = r6.l     // Catch: java.lang.Throwable -> L43
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
            egpm r1 = r6.i     // Catch: java.lang.Throwable -> L43
            cqhf r2 = new cqhf     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            r1.post(r2)     // Catch: java.lang.Throwable -> L43
            goto L3f
        L26:
            eksp r2 = defpackage.cqhh.a     // Catch: java.lang.Throwable -> L43
            ekrw r2 = r2.n()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState"
            java.lang.String r4 = "stopMonitoring"
            r5 = 116(0x74, float:1.63E-43)
            ekrw r1 = r2.h(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L43
            eksl r1 = (defpackage.eksl) r1     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "NetworkStateMonitorSPlusServiceState isn't registered for subId %d."
            int r3 = r6.d     // Catch: java.lang.Throwable -> L43
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqhh.c():void");
    }

    public final void d() {
        this.k.unregisterTelephonyCallback(this.j);
        this.l = 4;
        this.f.set(cqgl.UNKNOWN);
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorSPlusServiceState", "unregisterTelephonyCallback", 153, "NetworkStateMonitorSPlusServiceState.java")).r("NetworkStateMonitorSPlusServiceState unregistered for subId %d.", this.d);
    }
}
