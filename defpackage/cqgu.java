package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqgu implements cqgm {
    public static final eksp a = eksp.c("BugleConnectivity");
    public final eosc b;
    public final eigp c;
    public final Consumer d;
    public final cqho e;
    public final int f;
    public PhoneStateListener h;
    public final AtomicReference i;
    public final AtomicReference j;
    private final egpm k;
    private final TelephonyManager l;
    public final Object g = new Object();
    private int m = 1;

    public cqgu(crot crotVar, eosc eoscVar, egpm egpmVar, eigp eigpVar, cqho cqhoVar, Consumer consumer, int i) {
        cqgl cqglVar = cqgl.UNKNOWN;
        this.i = new AtomicReference(cqglVar);
        this.j = new AtomicReference(cqglVar);
        this.l = crotVar.a(i);
        this.b = eoscVar;
        this.k = egpmVar;
        this.c = eigpVar;
        this.e = cqhoVar;
        this.d = consumer;
        this.f = i;
    }

    @Override // defpackage.cqgm
    public final cqgl a() {
        return (cqgl) this.i.get();
    }

    @Override // defpackage.cqgm
    public final void b() {
        synchronized (this.g) {
            int i = this.m;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                this.m = 2;
                if (craf.c) {
                    this.h = new cqgr(this, this.b, new cqgp(this));
                    d();
                } else {
                    this.k.post(new Runnable() { // from class: cqgq
                        @Override // java.lang.Runnable
                        public final void run() {
                            cqgu cqguVar = this.a;
                            synchronized (cqguVar.g) {
                                cqguVar.h = new cqgt(cqguVar, new cqgp(cqguVar));
                                cqguVar.d();
                            }
                        }
                    });
                }
            } else if (i2 == 1) {
                ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "startMonitoring", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState is being registered asynchronously for subId %d.", this.f);
            } else if (i2 == 2) {
                ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "startMonitoring", 107, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState has already been registered for subId %d.", this.f);
            } else if (i2 == 3) {
                d();
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
            java.lang.Object r0 = r6.g
            java.lang.String r1 = "NetworkStateMonitorLThroughRServiceState.java"
            monitor-enter(r0)
            int r2 = r6.m     // Catch: java.lang.Throwable -> L43
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
            r6.e()     // Catch: java.lang.Throwable -> L43
            goto L3f
        L1b:
            egpm r1 = r6.k     // Catch: java.lang.Throwable -> L43
            cqgo r2 = new cqgo     // Catch: java.lang.Throwable -> L43
            r2.<init>()     // Catch: java.lang.Throwable -> L43
            r1.post(r2)     // Catch: java.lang.Throwable -> L43
            goto L3f
        L26:
            eksp r2 = defpackage.cqgu.a     // Catch: java.lang.Throwable -> L43
            ekrw r2 = r2.n()     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = "com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState"
            java.lang.String r4 = "stopMonitoring"
            r5 = 172(0xac, float:2.41E-43)
            ekrw r1 = r2.h(r3, r4, r5, r1)     // Catch: java.lang.Throwable -> L43
            eksl r1 = (defpackage.eksl) r1     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "NetworkStateMonitorLThroughRServiceState isn't registered for subId %d."
            int r3 = r6.f     // Catch: java.lang.Throwable -> L43
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqgu.c():void");
    }

    public final void d() {
        this.l.listen(this.h, 1);
        this.m = 3;
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "registerPhoneStateListener", 194, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState registered for subId %d.", this.f);
    }

    public final void e() {
        this.l.listen(this.h, 0);
        this.m = 4;
        this.i.set(cqgl.UNKNOWN);
        ((eksl) a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorLThroughRServiceState", "unregisterPhoneStateListener", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "NetworkStateMonitorLThroughRServiceState.java")).r("NetworkStateMonitorLThroughRServiceState unregistered for subId %d.", this.f);
    }
}
