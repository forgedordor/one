package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzra extends dzqp implements dzlo, dzqg {
    public final Context a;
    public final eosd b;
    public final diep c;
    public final eygg d;
    public final dzlm e;
    public final dzrg f;
    final AtomicReference g = new AtomicReference(dzqh.a);
    final ConcurrentHashMap h = new ConcurrentHashMap();
    private final dzfu i;
    private final boolean j;
    private volatile ListenableFuture k;
    private final dzqo l;

    public dzra(dzln dzlnVar, diep diepVar, Context context, dzqo dzqoVar, eosd eosdVar, eygg eyggVar, dzrg dzrgVar, dzfu dzfuVar, fcsu fcsuVar, Executor executor) {
        this.l = dzqoVar;
        this.i = dzfuVar;
        this.e = dzlnVar.a(executor, eyggVar, fcsuVar);
        this.a = context;
        this.b = eosdVar;
        this.c = diepVar;
        this.d = eyggVar;
        this.f = dzrgVar;
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        this.j = bool.booleanValue();
    }

    public static final boolean h(int i) {
        return i != 1;
    }

    @Override // defpackage.dzqg
    public final void a(dzfh dzfhVar) {
        ConcurrentHashMap concurrentHashMap = this.h;
        String str = dzfhVar.a;
        ListenableFuture listenableFuture = (ListenableFuture) concurrentHashMap.remove(str);
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "cancelDiffMeasurement", 332, "MemoryMetricServiceImpl.java")).t("Canceled memory diff measurement for custom event %s", str);
        }
    }

    @Override // defpackage.dzqg
    public final void b(dzfh dzfhVar) {
        final String str = dzfhVar.a;
        eork.n(new eooy() { // from class: dzqt
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dzra dzraVar = this.a;
                if (!dzraVar.e.d()) {
                    return eorv.a;
                }
                String str2 = str;
                ConcurrentHashMap concurrentHashMap = dzraVar.h;
                if (concurrentHashMap.size() >= 10) {
                    ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "startDiffMeasurement", 290, "MemoryMetricServiceImpl.java")).t("Max snapshots reached, memory diff measurement for custom event %s not started", str2);
                    return eork.g();
                }
                ListenableFuture listenableFutureF = dzraVar.f();
                ListenableFuture listenableFuture = (ListenableFuture) concurrentHashMap.put(str2, listenableFutureF);
                if (listenableFuture == null || listenableFutureF == listenableFuture) {
                    ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "startDiffMeasurement", 303, "MemoryMetricServiceImpl.java")).t("Starting memory diff measurement for custom event %s", str2);
                } else {
                    ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "startDiffMeasurement", 299, "MemoryMetricServiceImpl.java")).t("Replaced memory diff measurement for custom event %s", str2);
                    listenableFuture.cancel(true);
                }
                return eooq.f(listenableFutureF, new ejvt(null), eoqg.a);
            }
        }, this.b);
    }

    @Override // defpackage.dzqg
    public final void c(final dzfh dzfhVar) {
        ConcurrentHashMap concurrentHashMap = this.h;
        String str = dzfhVar.a;
        final ListenableFuture listenableFuture = (ListenableFuture) concurrentHashMap.remove(str);
        if (listenableFuture == null) {
            eork.h(new IllegalStateException("Could not find the start memory diff measurement for custom event: ".concat(String.valueOf(str))));
        } else {
            final ListenableFuture listenableFutureF = f();
            eork.d(listenableFuture, listenableFutureF).b(new eooy() { // from class: dzqu
                /* JADX WARN: Removed duplicated region for block: B:144:0x0380  */
                @Override // defpackage.eooy
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a() {
                    /*
                        Method dump skipped, instructions count: 1034
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dzqu.a():com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.b).b(new Runnable() { // from class: dzqv
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.h.remove(dzfhVar.a);
                }
            }, eoqg.a);
        }
    }

    @Override // defpackage.dzqp
    public final void d() {
        dzqn dzqnVar = new dzqn() { // from class: dzqw
            @Override // defpackage.dzqn
            public final void a(int i, String str) {
                this.a.i(null, i, str, null);
            }
        };
        final dzqo dzqoVar = this.l;
        dzqoVar.d = dzqnVar;
        if (dzqoVar.c.getAndSet(true)) {
            return;
        }
        eork.n(new eooy() { // from class: dzqj
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ((dzqf) dzqoVar.a.b()).k();
                return eorv.a;
            }
        }, dzqoVar.b);
    }

    @Override // defpackage.dzqp
    public final void e(dzfh dzfhVar, feeg feegVar) {
        i(dzfhVar.a, 1, null, feegVar);
    }

    final ListenableFuture f() {
        AtomicReference atomicReference = this.g;
        synchronized (atomicReference) {
            if (this.k != null) {
                return this.k;
            }
            dzqh dzqhVar = (dzqh) atomicReference.get();
            if (dzqhVar != dzqh.a && this.c.a() - dzqhVar.b <= 1000) {
                return eork.i(dzqhVar);
            }
            if (atomicReference.get() != dzqhVar) {
                return eork.i((dzqh) atomicReference.get());
            }
            ListenableFuture listenableFutureG = this.i.a ? eork.g() : eork.n(new eooy() { // from class: dzqr
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    dzra dzraVar = this.a;
                    if (!dzraVar.e.d()) {
                        ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "scheduleSnapshot", 160, "MemoryMetricServiceImpl.java")).q("Memory service not enabled, snapshot cancelled");
                        return eork.g();
                    }
                    dzrg dzrgVar = dzraVar.f;
                    diep diepVar = dzraVar.c;
                    feep feepVarC = dzrgVar.c(1, null);
                    long jA = diepVar.a();
                    ejwl.a(jA > 0);
                    feepVarC.getClass();
                    return eork.i(new dzqh(jA, feepVarC));
                }
            }, this.b);
            this.k = listenableFutureG;
            eork.r(this.k, new dzqz(this), eoqg.a);
            return listenableFutureG;
        }
    }

    public final void i(final String str, final int i, final String str2, final feeg feegVar) {
        if (this.i.a) {
            eork.g();
        } else {
            eork.n(new eooy() { // from class: dzqq
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final dzra dzraVar = this.a;
                    final dzqf dzqfVar = (dzqf) dzraVar.d.b();
                    final int i2 = i;
                    boolean zH = dzra.h(i2);
                    final String str3 = str;
                    long jA = zH ? true != dzqfVar.c() ? -1L : 1000L : dzraVar.e.a(str3);
                    if (jA == -1) {
                        return eorv.a;
                    }
                    if (dzqfVar.f()) {
                        System.gc();
                        System.runFinalization();
                        System.gc();
                    }
                    feeg feegVar2 = feegVar;
                    ListenableFuture listenableFutureI = eork.i(feegVar2);
                    if (feegVar2 == null) {
                        dzqfVar.d();
                    }
                    final long j = jA;
                    final String str4 = str2;
                    eoqt eoqtVarT = eoqt.t(listenableFutureI);
                    ejvr ejvrVar = new ejvr() { // from class: dzqx
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g((RuntimeException) obj)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "record", 419, "MemoryMetricServiceImpl.java")).q("Metric extension provider failed.");
                            return null;
                        }
                    };
                    eosd eosdVar = dzraVar.b;
                    return eooq.g(eooh.f(eoqtVarT, RuntimeException.class, ejvrVar, eosdVar), new eooz() { // from class: dzqy
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            int i3 = i2;
                            String str5 = str4;
                            long j2 = j;
                            String str6 = str3;
                            dzra dzraVar2 = dzraVar;
                            feeg feegVar3 = (feeg) obj;
                            if (!dzqfVar.g()) {
                                feiw feiwVar = (feiw) feix.a.createBuilder();
                                feep feepVarC = dzraVar2.f.c(i3, str5);
                                feiwVar.copyOnWrite();
                                feix feixVar = (feix) feiwVar.instance;
                                feepVarC.getClass();
                                feixVar.f = feepVarC;
                                feixVar.b |= 8;
                                feix feixVar2 = (feix) feiwVar.build();
                                dzle dzleVarN = dzlf.n();
                                dzkw dzkwVar = (dzkw) dzleVarN;
                                dzkwVar.a = str6;
                                dzleVarN.c(true);
                                dzkwVar.d = Long.valueOf(j2);
                                dzleVarN.f(feixVar2);
                                dzkwVar.b = feegVar3;
                                if (dzra.h(i3)) {
                                    dzleVarN.d(true);
                                }
                                return dzraVar2.e.b(dzleVarN.a());
                            }
                            Context context = dzraVar2.a;
                            final dzju dzjuVarA = dzjr.a(context, "recordMemoryPerProcess");
                            if (!((dzjo) dzjuVarA).a) {
                                return eorv.a;
                            }
                            ArrayList arrayList = new ArrayList(dzjuVarA.c().size());
                            context.getPackageName();
                            ekgb ekgbVarC = dzjuVarA.c();
                            int size = ekgbVarC.size();
                            int i4 = 0;
                            while (i4 < size) {
                                ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) ekgbVarC.get(i4);
                                feiw feiwVar2 = (feiw) feix.a.createBuilder();
                                int i5 = size;
                                int i6 = i4;
                                feep feepVarB = dzraVar2.f.b(i3, runningAppProcessInfo.pid, runningAppProcessInfo.processName, str5, new ejxr() { // from class: dzqs
                                    @Override // defpackage.ejxr
                                    public final Object get() {
                                        return dzjuVarA;
                                    }
                                });
                                feiwVar2.copyOnWrite();
                                feix feixVar3 = (feix) feiwVar2.instance;
                                feepVarB.getClass();
                                feixVar3.f = feepVarB;
                                feixVar3.b |= 8;
                                feix feixVar4 = (feix) feiwVar2.build();
                                dzle dzleVarN2 = dzlf.n();
                                dzkw dzkwVar2 = (dzkw) dzleVarN2;
                                dzkwVar2.a = str6;
                                dzleVarN2.c(true);
                                dzkwVar2.d = Long.valueOf(j2);
                                dzleVarN2.f(feixVar4);
                                dzkwVar2.b = feegVar3;
                                if (dzra.h(i3)) {
                                    dzleVarN2.d(true);
                                }
                                arrayList.add(dzraVar2.e.b(dzleVarN2.a()));
                                i4 = i6 + 1;
                                size = i5;
                            }
                            return eork.c(arrayList).a(new eopa(null), eoqg.a);
                        }
                    }, eosdVar);
                }
            }, this.b);
        }
    }

    @Override // defpackage.dzlo
    public final void n() {
        if (this.j) {
            d();
        }
    }
}
