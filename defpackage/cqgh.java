package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.telephony.ims.ImsMmTelManager;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqgh implements cqey, cmiv {
    private final fcsu B;
    private final fcsu C;
    private final eygg D;
    private final fcsu G;
    private final fcsu H;
    private final fcsu I;
    private final fcsu J;
    private final ejxr K;
    private ejxr L;
    private final fcsu M;
    private final fcsu N;
    private final fcsu O;
    private final fcsu P;
    private final fcsu Q;
    public final Context d;
    public final cqen e;
    public final fcsu f;
    public final IntentFilter g;
    public final eosc h;
    public final Executor i;
    public final eosc j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final AtomicReference r;
    public final AtomicReference s;
    public final AtomicBoolean t;
    public final AtomicInteger u;
    public final Map v;
    public final Map w;
    public final fcsu x;
    public final fcsu y;
    public static final ekrg c = ekrg.c("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl");
    private static final ekgb z = ekgb.v(new cqek(2, cqex.BLUETOOTH), new cqek(0, cqex.CELLULAR), new cqek(3, cqex.ETHERNET), new cqek(4, cqex.VPN), new cqek(1, cqex.WIFI));
    private static final Duration A = Duration.ofSeconds(3);
    private final eoqr E = new eoqr();
    private final eoqr F = new eoqr();
    public final List o = new ArrayList();
    public final List p = new ArrayList();
    public final Semaphore q = new Semaphore(1, true);

    public cqgh(fcsu fcsuVar, fcsu fcsuVar2, Context context, fcsu fcsuVar3, fcsu fcsuVar4, eygg eyggVar, eosc eoscVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, eosc eoscVar2, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18) {
        clie clieVar = clie.a;
        this.r = new AtomicReference(clieVar);
        this.s = new AtomicReference(clieVar);
        this.t = new AtomicBoolean(false);
        this.u = new AtomicInteger(4);
        this.v = new ConcurrentHashMap();
        this.w = new ConcurrentHashMap();
        this.M = fcsuVar;
        this.N = fcsuVar2;
        this.d = context;
        this.f = fcsuVar3;
        this.C = fcsuVar4;
        this.D = eyggVar;
        this.i = new eoss(eoscVar);
        this.h = eoscVar;
        this.B = fcsuVar5;
        this.G = fcsuVar6;
        this.J = fcsuVar7;
        this.k = fcsuVar8;
        this.H = fcsuVar10;
        this.I = fcsuVar9;
        this.l = fcsuVar11;
        this.m = fcsuVar12;
        this.O = fcsuVar13;
        this.x = fcsuVar15;
        IntentFilter intentFilter = new IntentFilter();
        this.g = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        this.e = new cqen(this);
        this.n = fcsuVar14;
        this.j = eoscVar2;
        this.P = fcsuVar16;
        this.Q = fcsuVar17;
        this.y = fcsuVar18;
        this.K = ejxx.b(new ejxr() { // from class: cqfn
            @Override // defpackage.ejxr
            public final Object get() {
                boolean zB = dhhi.b(this.a.d);
                ekrw ekrwVarE = cqgh.c.e();
                ekrwVarE.X(eksq.a, "BugleConnectivity");
                ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "<init>", 258, "ConnectivityUtilImpl.java");
                Boolean boolValueOf = Boolean.valueOf(zB);
                ekrdVar.t("cached wifi connection %s", boolValueOf);
                return boolValueOf;
            }
        }, A);
    }

    private final boolean I(int i) {
        return (((aqsg) this.M.b()).a() ? ((Boolean) ((cmlb) this.N.b()).i(i).map(new Function() { // from class: cqfr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cmmh) obj).o);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue() : ((dhes) this.B.b()).t()) && w();
    }

    private static boolean J(ImsMmTelManager imsMmTelManager, Method method, int i) {
        try {
            return Boolean.TRUE.equals(method.invoke(imsMmTelManager, 8, Integer.valueOf(i)));
        } catch (IllegalAccessException e) {
            ekrw ekrwVarI = c.i();
            ekrwVarI.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isImsCapabilityAvailable", 448, "ConnectivityUtilImpl.java")).u("IsImsCapabilityAvailable(%d, %d) method not accessible.", 8, i);
            return false;
        } catch (InvocationTargetException e2) {
            ekrw ekrwVarI2 = c.i();
            ekrwVarI2.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(e2)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isImsCapabilityAvailable", 452, "ConnectivityUtilImpl.java")).I("IsImsCapabilityAvailable(%d, %d) method threw exception. %s", 8, Integer.valueOf(i), e2);
            return false;
        }
    }

    public final void A(String str) {
        ekrw ekrwVarH = c.h();
        ekrwVarH.X(eksq.a, "BugleConnectivity");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "logConnectionStateOnEvent", 1287, "ConnectivityUtilImpl.java")).J("Connection state change: %s, data connection: %s, manual connection eligibility: %b, ntn roaming: %b", str, this.r, Boolean.valueOf(G()), Boolean.valueOf(this.t.get()));
    }

    public final void B(final clif clifVar, final awxn awxnVar, String str) {
        ekrw ekrwVarH = c.h();
        ekrwVarH.X(eksq.a, "BugleConnectivity");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "notifySatelliteEvent", 1013, "ConnectivityUtilImpl.java")).I("[%s] Notifying satellite event for state %s on identity: %s", str, clifVar, awxnVar.b());
        ((awlc) this.I.b()).d(new Consumer() { // from class: cqfj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                cqgh cqghVar = this.a;
                awxn awxnVar2 = awxnVar;
                cliu cliuVar = (cliu) obj;
                int iOrdinal = clifVar.ordinal();
                if (iOrdinal == 0) {
                    cliuVar.f(awxnVar2.b());
                    return;
                }
                if (iOrdinal == 1) {
                    if (cqghVar.H(awxnVar2)) {
                        cliuVar.b(awxnVar2.b());
                    }
                } else if (iOrdinal == 2) {
                    if (cqghVar.H(awxnVar2)) {
                        cliuVar.e(awxnVar2.b());
                    }
                } else if (iOrdinal == 3) {
                    awxnVar2.b();
                    cliuVar.g();
                } else if (iOrdinal == 4 && !cqghVar.H(awxnVar2)) {
                    cliuVar.a(awxnVar2.b());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void C(final clif clifVar, final String str) throws InterruptedException {
        if (((asar) this.n.b()).a()) {
            auvh.h(eiju.g(this.E.b(eiid.c(new eooy() { // from class: cqfs
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final cqgh cqghVar = this.a;
                    eiju eijuVarB = ((awzf) cqghVar.k.b()).b();
                    final clif clifVar2 = clifVar;
                    final String str2 = str;
                    return eijuVarB.h(new ejvr() { // from class: cqfe
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            Iterator it = ((Iterable) obj).iterator();
                            while (it.hasNext()) {
                                String str3 = str2;
                                cqghVar.B(clifVar2, (awxn) it.next(), str3);
                            }
                            return null;
                        }
                    }, cqghVar.j);
                }
            }), this.j)));
            return;
        }
        try {
            this.q.acquire();
            auvh.h(eijx.f(new Runnable() { // from class: cqfa
                @Override // java.lang.Runnable
                public final void run() {
                    final cqgh cqghVar = this.a;
                    eiju eijuVarB = ((awzf) cqghVar.k.b()).b();
                    final clif clifVar2 = clifVar;
                    final String str2 = str;
                    eijuVarB.h(new ejvr() { // from class: cqff
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            Iterator it = ((Iterable) obj).iterator();
                            while (true) {
                                cqgh cqghVar2 = cqghVar;
                                if (!it.hasNext()) {
                                    cqghVar2.q.release();
                                    return true;
                                }
                                cqghVar2.B(clifVar2, (awxn) it.next(), str2);
                            }
                        }
                    }, cqghVar.i);
                }
            }, this.i));
        } catch (InterruptedException e) {
            ekrw ekrwVarJ = c.j();
            ekrwVarJ.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "notifySatelliteEventForIdentities", (char) 1007, "ConnectivityUtilImpl.java")).q("Failed to notify satellite event due to thread interruption");
        }
    }

    public final void D(Runnable runnable) {
        auvh.h(eiju.g(this.F.a(Executors.callable(runnable), this.j)));
    }

    public final void E(clie clieVar) {
        AtomicReference atomicReference = this.r;
        clie clieVar2 = (clie) atomicReference.getAndSet(clieVar);
        AtomicReference atomicReference2 = this.s;
        atomicReference2.set(clieVar2);
        ekrw ekrwVarE = c.e();
        ekrwVarE.X(eksq.a, "BugleConnectivity");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "setDataConnection", 951, "ConnectivityUtilImpl.java")).D("Data connection changed from %s to %s", atomicReference2.get(), atomicReference.get());
    }

    public final void F(Network network) throws InterruptedException {
        NetworkCapabilities networkCapabilities = ((ConnectivityManager) this.f.b()).getNetworkCapabilities(network);
        if (networkCapabilities == null || !craf.h) {
            ekrw ekrwVarH = c.h();
            ekrwVarH.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 903, "ConnectivityUtilImpl.java")).q("Not updating default data network");
            return;
        }
        if (craf.i && networkCapabilities.hasTransport(10)) {
            ekrw ekrwVarH2 = c.h();
            ekrwVarH2.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 908, "ConnectivityUtilImpl.java")).q("New default data network: satellite");
            E(clie.b);
            return;
        }
        try {
            if (networkCapabilities.hasTransport(10)) {
                ekrw ekrwVarH3 = c.h();
                ekrwVarH3.X(eksq.a, "BugleConnectivity");
                ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 913, "ConnectivityUtilImpl.java")).q("New default data network: satellite");
                E(clie.b);
                return;
            }
        } catch (IllegalArgumentException unused) {
            ekrw ekrwVarE = c.e();
            ekrwVarE.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "networkCapabilitiesHasSatellite", 944, "ConnectivityUtilImpl.java")).q("IllegalArgumentException: Satellite features not supported");
        }
        if (networkCapabilities.hasTransport(0)) {
            ekrw ekrwVarH4 = c.h();
            ekrwVarH4.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 918, "ConnectivityUtilImpl.java")).q("New default data network: cellular");
            E(clie.c);
            return;
        }
        if (networkCapabilities.hasTransport(1)) {
            ekrw ekrwVarH5 = c.h();
            ekrwVarH5.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH5).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 921, "ConnectivityUtilImpl.java")).q("New default data network: wifi");
            E(clie.d);
            return;
        }
        E(clie.f);
        ekrg ekrgVar = c;
        ekrw ekrwVarH6 = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH6.X(ekrzVar, "BugleConnectivity");
        ((ekrd) ((ekrd) ekrwVarH6).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 925, "ConnectivityUtilImpl.java")).q("New default data network: other");
        if (!G() || this.t.get()) {
            return;
        }
        ekrw ekrwVarH7 = ekrgVar.h();
        ekrwVarH7.X(ekrzVar, "BugleConnectivity");
        ((ekrd) ((ekrd) ekrwVarH7).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "updateDefaultDataNetwork", 927, "ConnectivityUtilImpl.java")).q("Manual satellite eligible and no active ntn roaming. Notifying listeners of eligibility.");
        C(clif.a, "updateDefaultDataNetwork");
    }

    public final boolean G() {
        return this.w.containsValue(true);
    }

    public final boolean H(awxn awxnVar) {
        return ((Boolean) ((awyu) this.H.b()).a(awxnVar).d().map(new Function() { // from class: cqfo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.a.v(((Integer) obj).intValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue();
    }

    @Override // defpackage.cmiv
    public final /* synthetic */ void a(Set set) {
        set.getClass();
    }

    @Override // defpackage.cmiv
    public final void b(Set set) throws InterruptedException {
        A("SIM removed");
        Stream map = Collection.EL.stream(set).map(new Function() { // from class: cqfp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((cmmh) obj).d);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        final ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        boolean zG = G();
        Collection.EL.removeIf(this.w.keySet(), new Predicate() { // from class: cqfq
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
            public final boolean test(Object obj) {
                ekrg ekrgVar = cqgh.c;
                return ekgbVar.contains((Integer) obj);
            }
        });
        if (!zG || G() || this.t.get()) {
            return;
        }
        ekrw ekrwVarH = c.h();
        ekrwVarH.X(eksq.a, "BugleConnectivity");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "handleSimRemoved", 851, "ConnectivityUtilImpl.java")).q("Previously eligible SIM is no longer available and no other SIMs are satellite eligible. Notifying listeners of lost manual satellite eligibility.");
        C(clif.e, "onSimStateChanged");
    }

    @Override // defpackage.cqey
    public final int c() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.b()).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return -1;
        }
        return activeNetworkInfo.getType();
    }

    @Override // defpackage.cqey
    public final cqgk d(int i, int i2) {
        if (i == 0) {
            return g(i2);
        }
        if (i == 1) {
            return e(i2);
        }
        if (i == 3) {
            return f();
        }
        if (i == 7) {
            return cqgk.AVAILABLE;
        }
        throw new IllegalArgumentException(a.g(i, "The message protocol is invalid: "));
    }

    @Override // defpackage.cqey
    public final cqgk e(int i) {
        boolean zIsConnected;
        NetworkInfo networkInfo;
        if (I(i)) {
            return cqgk.AVAILABLE;
        }
        fcsu fcsuVar = this.f;
        Network[] allNetworks = ((ConnectivityManager) fcsuVar.b()).getAllNetworks();
        int length = allNetworks.length;
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                Network network = allNetworks[i2];
                if (network != null && (networkInfo = ((ConnectivityManager) fcsuVar.b()).getNetworkInfo(network)) != null && networkInfo.getType() == 0) {
                    zIsConnected = networkInfo.isConnected();
                    break;
                }
                i2++;
            } else {
                zIsConnected = false;
                break;
            }
        }
        if (((asak) this.P.b()).a() && craf.j && t()) {
            z2 = true;
        }
        cqgl cqglVarZ = z(i);
        return (cqglVarZ == cqgl.UNAVAILABLE || cqglVarZ == cqgl.EMERGENCY_ONLY) ? cqgk.UNAVAILABLE : (r() && (zIsConnected || z2)) ? cqgk.AVAILABLE : cqgk.UNKNOWN;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082  */
    @Override // defpackage.cqey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cqgk f() {
        /*
            r9 = this;
            boolean r0 = r9.r()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L54
            fcsu r0 = r9.C
            java.lang.Object r0 = r0.b()
            android.os.PowerManager r0 = (android.os.PowerManager) r0
            boolean r0 = r0.isDeviceIdleMode()
            fcsu r3 = r9.f
            java.lang.Object r3 = r3.b()
            android.net.ConnectivityManager r3 = (android.net.ConnectivityManager) r3
            android.net.NetworkInfo r3 = r3.getActiveNetworkInfo()
            if (r3 == 0) goto L2a
            boolean r3 = r3.isAvailable()
            if (r3 == 0) goto L2a
            r3 = r1
            goto L2b
        L2a:
            r3 = r2
        L2b:
            ekrg r4 = defpackage.cqgh.c
            ekrw r4 = r4.g()
            ekrz r5 = defpackage.eksq.a
            java.lang.String r6 = "BugleConnectivity"
            r4.X(r5, r6)
            ekrd r4 = (defpackage.ekrd) r4
            r5 = 673(0x2a1, float:9.43E-43)
            java.lang.String r6 = "ConnectivityUtilImpl.java"
            java.lang.String r7 = "com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl"
            java.lang.String r8 = "isNetworkAvailableButDeviceInDozeMode"
            ekrw r4 = r4.h(r7, r8, r5, r6)
            ekrd r4 = (defpackage.ekrd) r4
            java.lang.String r5 = "dozing: %b, network available: %b"
            r4.H(r5, r0, r3)
            if (r0 == 0) goto L52
            if (r3 == 0) goto L52
            goto L54
        L52:
            r0 = r2
            goto L55
        L54:
            r0 = r1
        L55:
            fcsu r3 = r9.J
            java.lang.Object r3 = r3.b()
            aqsa r3 = (defpackage.aqsa) r3
            boolean r3 = r3.a()
            if (r3 != 0) goto L84
            if (r0 == 0) goto L82
            eygg r0 = r9.D
            java.lang.Object r0 = r0.b()
            cqhd r0 = (defpackage.cqhd) r0
            fcsu r3 = r0.d
            java.lang.Object r3 = r3.b()
            crny r3 = (defpackage.crny) r3
            int r3 = r3.f()
            cqgl r0 = r0.a(r3)
            cqgl r3 = defpackage.cqgl.EMERGENCY_ONLY
            if (r0 == r3) goto L82
            goto L85
        L82:
            r1 = r2
            goto L85
        L84:
            r1 = r0
        L85:
            if (r1 == 0) goto L8a
            cqgk r0 = defpackage.cqgk.AVAILABLE
            return r0
        L8a:
            cqgk r0 = defpackage.cqgk.UNAVAILABLE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqgh.f():cqgk");
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026d  */
    @Override // defpackage.cqey
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cqgk g(int r20) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cqgh.g(int):cqgk");
    }

    @Override // defpackage.cqey
    public final ekhx h() {
        try {
            fcsu fcsuVar = this.f;
            Network activeNetwork = ((ConnectivityManager) fcsuVar.b()).getActiveNetwork();
            if (activeNetwork == null) {
                return ekon.a;
            }
            final NetworkCapabilities networkCapabilities = ((ConnectivityManager) fcsuVar.b()).getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                return ekon.a;
            }
            final ekhv ekhvVar = new ekhv();
            Collection.EL.stream(z).filter(new Predicate() { // from class: cqfg
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
                public final boolean test(Object obj) {
                    ekrg ekrgVar = cqgh.c;
                    return networkCapabilities.hasTransport(((cqgg) obj).a());
                }
            }).map(new Function() { // from class: cqfh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((cqgg) obj).b();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).forEach(new Consumer() { // from class: cqfi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ekhvVar.c((cqex) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (networkCapabilities.hasTransport(5)) {
                ekhvVar.c(cqex.OTHER);
            }
            if (networkCapabilities.hasTransport(6)) {
                ekhvVar.c(cqex.OTHER);
            }
            return ekhvVar.g();
        } catch (SecurityException e) {
            ekrw ekrwVarJ = c.j();
            ekrwVarJ.X(eksq.a, "BugleConnectivity");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "getActiveNetworkTransports", (char) 713, "ConnectivityUtilImpl.java")).q("Failed to get active network transports due to missing ACCESS_NETWORK_STATE permissions");
            return ekon.a;
        }
    }

    @Override // defpackage.cqey
    public final ListenableFuture i() {
        return !r() ? eork.i(false) : this.h.submit(eiid.l(new Callable() { // from class: cqft
            @Override // java.util.concurrent.Callable
            public final Object call() {
                boolean z2;
                ekrg ekrgVar = cqgh.c;
                try {
                    try {
                        Socket socket = new Socket();
                        try {
                            TrafficStats.setThreadStatsTag(8960);
                            socket.connect(new InetSocketAddress("8.8.8.8", 53), 1500);
                            socket.close();
                            TrafficStats.clearThreadStatsTag();
                            z2 = true;
                        } catch (Throwable th) {
                            try {
                                socket.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException unused) {
                        ekrw ekrwVarE = cqgh.c.e();
                        ekrwVarE.X(eksq.a, "BugleConnectivity");
                        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isGoogleDnsAvailable", 694, "ConnectivityUtilImpl.java")).q("Cannot connect to Google DNS");
                        TrafficStats.clearThreadStatsTag();
                        z2 = false;
                    }
                    return Boolean.valueOf(z2);
                } catch (Throwable th3) {
                    TrafficStats.clearThreadStatsTag();
                    throw th3;
                }
            }
        }));
    }

    @Override // defpackage.cqey
    public final void j() {
        this.L = ejxx.a(new ejxr() { // from class: cqfb
            @Override // defpackage.ejxr
            public final Object get() {
                return new cqgf(this.a);
            }
        });
    }

    @Override // defpackage.cqey
    public final void k() {
        auwa.a(new Runnable() { // from class: cqfl
            @Override // java.lang.Runnable
            public final void run() {
                cqgh cqghVar = this.a;
                Iterator it = cqghVar.o.iterator();
                while (it.hasNext()) {
                    ((cvtr) it.next()).getClass();
                    auwa.a(new Runnable() { // from class: cqfk
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw null;
                        }
                    }, cqghVar.h);
                }
            }
        }, this.i);
    }

    @Override // defpackage.cqey
    public final void l(final cqev cqevVar) {
        auwa.a(new Runnable() { // from class: cqfm
            @Override // java.lang.Runnable
            public final void run() {
                cqgh cqghVar = this.a;
                List list = cqghVar.p;
                if (list.isEmpty()) {
                    cqghVar.d.registerReceiver(cqghVar.e, cqghVar.g, 2);
                }
                list.add(cqevVar);
            }
        }, this.i);
    }

    @Override // defpackage.cqey
    public final void m(final cqew cqewVar, cqeu cqeuVar) {
        int iF;
        final cqhd cqhdVar = (cqhd) this.D.b();
        eksl ekslVar = (eksl) cqhd.a.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "registerConnectivityStateListener", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "NetworkStateMonitorManager.java");
        cqet cqetVarB = cqet.b(cqeuVar.c);
        if (cqetVarB == null) {
            cqetVarB = cqet.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        ekslVar.B("registerConnectivityStateListener: subscription type %s, subId %d.", cqetVarB, cqeuVar.d);
        int i = cqeuVar.c;
        cqet cqetVarB2 = cqet.b(i);
        if (cqetVarB2 == null) {
            cqetVarB2 = cqet.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        cqet cqetVar = cqet.SUBSCRIPTION_TYPE_UNSPECIFIED;
        if (cqetVarB2 != cqetVar) {
            cqet cqetVarB3 = cqet.b(i);
            if (cqetVarB3 == null) {
                cqetVarB3 = cqetVar;
            }
            cqet cqetVar2 = cqet.SPECIFIED_SUBSCRIPTION;
            if (cqetVarB3 != cqetVar2 || (cqeuVar.b & 2) != 0) {
                if (cqhdVar.d()) {
                    cqhdVar.e.registerReceiver(cqhdVar.f, cqhdVar.g, 4);
                }
                int i2 = cqeuVar.c;
                cqet cqetVarB4 = cqet.b(i2);
                if (cqetVarB4 == null) {
                    cqetVarB4 = cqetVar;
                }
                if (cqetVarB4 == cqet.ALL_ACTIVE_SUBSCRIPTIONS) {
                    ((crny) cqhdVar.d.b()).o(new crnx() { // from class: cqgw
                        @Override // defpackage.crnx
                        public final boolean a(int i3) {
                            cqhd cqhdVar2 = cqhdVar;
                            cqew cqewVar2 = cqewVar;
                            synchronized (cqhdVar2.j) {
                                cqhdVar2.c(i3);
                                cqhdVar2.b(cqewVar2, -1);
                            }
                            return true;
                        }
                    });
                    return;
                }
                cqet cqetVarB5 = cqet.b(i2);
                if (cqetVarB5 != null) {
                    cqetVar = cqetVarB5;
                }
                if (cqetVar != cqetVar2 || (iF = cqeuVar.d) < 0) {
                    iF = ((crny) cqhdVar.d.b()).f();
                }
                synchronized (cqhdVar.j) {
                    cqhdVar.c(iF);
                    cqhdVar.b(cqewVar, iF);
                }
                return;
            }
        }
        cqet cqetVarB6 = cqet.b(i);
        if (cqetVarB6 != null) {
            cqetVar = cqetVarB6;
        }
        throw new IllegalArgumentException("Register ConnectivityStateListener for invalid subscription: subscription_type " + cqetVar.name() + ", subscription_id " + cqeuVar.d);
    }

    @Override // defpackage.cqey
    public final void n(cqew cqewVar, cqeu cqeuVar) {
        int iF;
        cqgm cqgmVar;
        cqhd cqhdVar = (cqhd) this.D.b();
        eksp ekspVar = cqhd.a;
        eksl ekslVar = (eksl) ekspVar.n().h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "unregisterConnectivityStateListener", 153, "NetworkStateMonitorManager.java");
        cqet cqetVarB = cqet.b(cqeuVar.c);
        if (cqetVarB == null) {
            cqetVarB = cqet.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        ekslVar.B("unregisterConnectivityStateListener: subscription type %s, subId %d.", cqetVarB, cqeuVar.d);
        int i = cqeuVar.c;
        cqet cqetVarB2 = cqet.b(i);
        if (cqetVarB2 == null) {
            cqetVarB2 = cqet.SUBSCRIPTION_TYPE_UNSPECIFIED;
        }
        if (cqetVarB2 == cqet.ALL_ACTIVE_SUBSCRIPTIONS) {
            iF = -1;
        } else {
            cqet cqetVarB3 = cqet.b(i);
            if (cqetVarB3 == null) {
                cqetVarB3 = cqet.SUBSCRIPTION_TYPE_UNSPECIFIED;
            }
            if (cqetVarB3 != cqet.SPECIFIED_SUBSCRIPTION || (iF = cqeuVar.d) < 0) {
                iF = ((crny) cqhdVar.d.b()).f();
            }
        }
        synchronized (cqhdVar.j) {
            Map map = cqhdVar.i;
            Integer numValueOf = Integer.valueOf(iF);
            List list = (List) map.get(numValueOf);
            if (list == null) {
                ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "removeConnectivityStateListener", 320, "NetworkStateMonitorManager.java")).r("removeConnectivityStateListener: Entry in connectivityListenerListsMap not found for subId %d.", iF);
            } else {
                boolean zRemove = list.remove(cqewVar);
                if (list.isEmpty()) {
                    map.remove(numValueOf);
                }
                if (zRemove) {
                    boolean zE = cqhdVar.e(-1);
                    Map map2 = cqhdVar.h;
                    ekqg ekqgVarListIterator = ekhx.o(map2.keySet()).listIterator();
                    while (ekqgVarListIterator.hasNext()) {
                        Integer num = (Integer) ekqgVarListIterator.next();
                        int iIntValue = num.intValue();
                        if (zE && cqhdVar.e(iIntValue) && (cqgmVar = (cqgm) map2.remove(num)) != null) {
                            cqgmVar.c();
                        }
                    }
                } else {
                    ((eksl) ((eksl) ekspVar.g()).h("com/google/android/apps/messaging/shared/util/connectivity/NetworkStateMonitorManager", "removeConnectivityStateListener", 331, "NetworkStateMonitorManager.java")).r("removeConnectivityStateListener: ConnectivityStateListener not found for subId %d.", iF);
                }
            }
        }
        if (cqhdVar.d()) {
            try {
                cqhdVar.e.unregisterReceiver(cqhdVar.f);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // defpackage.cqey
    public final boolean o(int i) {
        return (((asak) this.P.b()).a() && craf.j) ? !v(i) || t() || ((Boolean) this.K.get()).booleanValue() : !v(i) || ((Boolean) this.K.get()).booleanValue();
    }

    @Override // defpackage.cqey
    public final boolean p() {
        return ((ConnectivityManager) this.f.b()).isActiveNetworkMetered();
    }

    @Override // defpackage.cqey
    public final boolean q() {
        return this.v.containsValue(true);
    }

    @Override // defpackage.cqey
    public final boolean r() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f.b()).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // defpackage.cqey
    public final boolean s() throws InterruptedException {
        if (!craf.h) {
            return false;
        }
        AtomicReference atomicReference = this.r;
        if (((clie) atomicReference.get()).equals(clie.a)) {
            ejxr ejxrVar = this.L;
            if (ejxrVar != null) {
            } else {
                ekrw ekrwVarJ = c.j();
                ekrwVarJ.X(eksq.a, "BugleConnectivity");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "registerSatelliteNetworkCallbacks", 1059, "ConnectivityUtilImpl.java")).q("defaultDataRegisterer has not been initialized");
            }
            Network activeNetwork = ((ConnectivityManager) this.f.b()).getActiveNetwork();
            if (activeNetwork != null) {
                F(activeNetwork);
                ekrw ekrwVarH = c.h();
                ekrwVarH.X(eksq.a, "BugleConnectivity");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isDefaultDataOverSatellite", 781, "ConnectivityUtilImpl.java")).t("Active connection is = %s", atomicReference.get());
            }
        }
        return ((clie) atomicReference.get()).equals(clie.b);
    }

    @Override // defpackage.cqey
    public final boolean t() {
        return ((asaq) this.y.b()).a() ? s() : s() && !G();
    }

    @Override // defpackage.cqey
    public final boolean u() {
        return !((asaq) this.y.b()).a() && s() && G();
    }

    @Override // defpackage.cqey
    public final boolean v(int i) {
        Map map = this.v;
        boolean z2 = ((Boolean) Map.EL.getOrDefault(map, Integer.valueOf(i), false)).booleanValue() || z(i).equals(cqgl.SATELLITE);
        if (((asah) this.Q.b()).a()) {
            ekrg ekrgVar = c;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "BugleConnectivity");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isOnSatellite", 739, "ConnectivityUtilImpl.java")).x("isOnSatellite(%d): %b", i, z2);
            if (!z2) {
                if (map.containsValue(true)) {
                    Optional optionalFindFirst = Collection.EL.stream(map.entrySet()).filter(new Predicate() { // from class: cqfc
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
                        public final boolean test(Object obj) {
                            ekrg ekrgVar2 = cqgh.c;
                            return ((Boolean) ((Map.Entry) obj).getValue()).equals(Boolean.TRUE);
                        }
                    }).map(new Function() { // from class: cqfd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (Integer) ((Map.Entry) obj).getKey();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).findFirst();
                    ekrw ekrwVarH2 = ekrgVar.h();
                    ekrwVarH2.X(ekrzVar, "BugleConnectivity");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isOnSatellite", 748, "ConnectivityUtilImpl.java")).w("%d is not on satellite. Subscription on satellite is: %d", i, optionalFindFirst.orElse(-1));
                    return z2;
                }
                ekrw ekrwVarH3 = ekrgVar.h();
                ekrwVarH3.X(ekrzVar, "BugleConnectivity");
                ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/util/connectivity/ConnectivityUtilImpl", "isOnSatellite", 752, "ConnectivityUtilImpl.java")).r("%d is not on satellite and no other subscriptions are on satellite", i);
            }
        }
        return z2;
    }

    @Override // defpackage.cqey
    public final boolean w() {
        return dhhi.b(this.d);
    }

    @Override // defpackage.cqey
    public final boolean x() {
        return craf.a;
    }

    @Override // defpackage.cqey
    public final int y() {
        int iOrdinal = ((clie) this.r.get()).ordinal();
        if (iOrdinal == 1) {
            return 2;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return 3;
        }
        int i = 4;
        if (iOrdinal != 4) {
            i = 5;
            if (iOrdinal != 5) {
                return 1;
            }
        }
        return i;
    }

    public final cqgl z(int i) {
        return ((cqhd) this.D.b()).a(i);
    }
}
