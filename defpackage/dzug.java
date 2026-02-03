package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzug extends dzuc implements dzlo, dztw {
    static final ekhx a = ekhx.v("Cold startup", "Cold startup interactive", "Cold startup interactive before onDraw", "Warm startup", "Warm startup interactive", "Warm startup interactive before onDraw", "Warm startup activity onStart", "Cold startup class loading", "Cold startup from process creation", "Cold startup interactive before onDraw from process creation", "Cold startup interactive from process creation");
    public static final /* synthetic */ int g = 0;
    public final dzlm b;
    final ConcurrentHashMap c = new ConcurrentHashMap();
    public final eygg d;
    public final eygg e;
    public final ejxr f;
    private final Executor h;

    public dzug(dzln dzlnVar, Executor executor, final eygg eyggVar, eygg eyggVar2, fcsu fcsuVar, final dzvq dzvqVar) {
        this.b = dzlnVar.a(eoqg.a, eyggVar, fcsuVar);
        this.h = executor;
        this.d = eyggVar;
        this.e = eyggVar2;
        this.f = ejxx.a(new ejxr() { // from class: dzuf
            @Override // defpackage.ejxr
            public final Object get() {
                int i = dzug.g;
                return dzvqVar.a(((dztz) eyggVar.b()).d());
            }
        });
    }

    private final ListenableFuture i(final String str, final long j, final dzub dzubVar, final feeg feegVar) {
        return eork.n(new eooy() { // from class: dzue
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                dzug dzugVar = this.a;
                if (!((dzvp) dzugVar.f.get()).a()) {
                    ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "recordSystemHealthMetricInBackground", 435, "TimerMetricServiceImpl.java")).q("TimerMetric not recorded, metric was rejected by sampling configuration.");
                    return eorv.a;
                }
                dzub dzubVar2 = dzubVar;
                long j2 = j;
                ((dztz) dzugVar.d.b()).e();
                dzlm dzlmVar = dzugVar.b;
                dzle dzleVarN = dzlf.n();
                int i = 1;
                dzleVarN.c(true);
                dzkw dzkwVar = (dzkw) dzleVarN;
                dzkwVar.d = Long.valueOf(j2);
                ejwi ejwiVar = (ejwi) dzugVar.e.b();
                feiw feiwVar = (feiw) feix.a.createBuilder();
                boolean zBooleanValue = ((Boolean) ejwiVar.b(new ejvr() { // from class: dzud
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((dzkz) obj).a();
                        return false;
                    }
                }).e(false)).booleanValue();
                feiy feiyVar = (feiy) feiz.a.createBuilder();
                long jB = zBooleanValue ? dzubVar2.b() : dzubVar2.a();
                feiyVar.copyOnWrite();
                feiz feizVar = (feiz) feiyVar.instance;
                feizVar.b |= 1;
                feizVar.c = jB;
                int iOrdinal = dzubVar2.c.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        i = 3;
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                throw new RuntimeException(null, null);
                            }
                            i = 4;
                        }
                    } else {
                        i = 2;
                    }
                }
                feeg feegVar2 = feegVar;
                String str2 = str;
                feiyVar.copyOnWrite();
                feiz feizVar2 = (feiz) feiyVar.instance;
                feizVar2.d = i - 1;
                feizVar2.b = 2 | feizVar2.b;
                feiz feizVar3 = (feiz) feiyVar.build();
                feiwVar.copyOnWrite();
                feix feixVar = (feix) feiwVar.instance;
                feizVar3.getClass();
                feixVar.g = feizVar3;
                feixVar.b |= 16;
                dzleVarN.f((feix) feiwVar.build());
                dzkwVar.a = str2;
                dzkwVar.b = feegVar2;
                return dzlmVar.b(dzleVarN.a());
            }
        }, this.h);
    }

    private final synchronized ListenableFuture j(dzub dzubVar, String str, feeg feegVar, dzua dzuaVar) throws Throwable {
        Throwable th;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (dzub.e(dzubVar)) {
                    return eorv.a;
                }
                long jA = this.b.a(str);
                if (jA == -1) {
                    return eorv.a;
                }
                dzubVar.c();
                dzubVar.d(dzuaVar);
                return (dzub.e(dzubVar) || ejwk.c(str)) ? eork.h(new IllegalArgumentException("Can't record an event that was never started or has been stopped already")) : a.contains(str) ? eork.h(new IllegalArgumentException(String.format(Locale.US, "%s is reserved event. Dropping timer.", str))) : i(str, jA, dzubVar, feegVar);
            } catch (Throwable th3) {
                th = th3;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    private final synchronized ListenableFuture k(String str, String str2, feeg feegVar, dzua dzuaVar) throws Throwable {
        Throwable th;
        try {
            try {
                dzub dzubVar = (dzub) this.c.remove(str);
                if (dzub.e(dzubVar)) {
                    try {
                        ((ekrd) ((ekrd) dzfq.a.f()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "stopGlobal", 308, "TimerMetricServiceImpl.java")).t("Can't stop global event '%s' that was never started or has already been stopped", str);
                        return eorv.a;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                long jA = this.b.a(str);
                if (jA == -1) {
                    return eorv.a;
                }
                dzubVar.c();
                dzubVar.d(dzuaVar);
                ((ekrd) ((ekrd) dzfq.a.f()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "stopGlobal", 323, "TimerMetricServiceImpl.java")).I("Stopped global timer for event name %s. realtime: %d ms, uptime: %d ms", str, Long.valueOf(dzubVar.a()), Long.valueOf(dzubVar.b()));
                return i(true == ejwk.c(str2) ? str : str2, jA, dzubVar, feegVar);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.dztw
    public final ListenableFuture a(dzfh dzfhVar, long j, long j2, feeg feegVar) {
        return h(dzfhVar.a, new dzub(j, j2, dzua.UNKNOWN), feegVar);
    }

    @Override // defpackage.dztw
    public final ListenableFuture b(dzfh dzfhVar, long j, long j2, dzua dzuaVar) {
        return h(dzfhVar.a, new dzub(j, j2, dzuaVar), null);
    }

    @Override // defpackage.dzuc
    public final dzub c(dzfh dzfhVar) {
        ConcurrentHashMap concurrentHashMap = this.c;
        String str = dzfhVar.a;
        dzub dzubVar = (dzub) concurrentHashMap.remove(str);
        if (dzub.e(dzubVar)) {
            ((ekrd) ((ekrd) dzfq.a.f()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "cancelGlobal", 388, "TimerMetricServiceImpl.java")).t("Can't cancel global event '%s' that was never started or has already been stopped", str);
            return dzub.a;
        }
        ((ekrd) ((ekrd) dzfq.a.f()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "cancelGlobal", 393, "TimerMetricServiceImpl.java")).t("Cancelled global timer for event name %s", str);
        return dzubVar;
    }

    @Override // defpackage.dzuc
    public final dzub d() {
        return !this.b.d() ? dzub.a : new dzub();
    }

    @Override // defpackage.dzuc
    public final dzub e(dzfh dzfhVar) {
        ekhx ekhxVar = a;
        String str = dzfhVar.a;
        if (ekhxVar.contains(str)) {
            ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "startGlobal", 133, "TimerMetricServiceImpl.java")).t("%s is reserved event. Dropping timer.", str);
            return dzub.a;
        }
        if (!this.b.d()) {
            return dzub.a;
        }
        dzub dzubVar = new dzub();
        this.c.put(str, dzubVar);
        return dzubVar;
    }

    @Override // defpackage.dzuc
    public final ListenableFuture f(dzub dzubVar, dzfh dzfhVar, feeg feegVar, dzua dzuaVar) {
        return j(dzubVar, dzfhVar.a, feegVar, dzuaVar);
    }

    @Override // defpackage.dzuc
    public final ListenableFuture g(dzfh dzfhVar, dzfh dzfhVar2, feeg feegVar, dzua dzuaVar) {
        return k(dzfhVar.a, dzfh.d(dzfhVar2), feegVar, dzuaVar);
    }

    final ListenableFuture h(String str, dzub dzubVar, feeg feegVar) {
        long jA = this.b.a(str);
        return jA == -1 ? eorv.a : i(str, jA, dzubVar, feegVar);
    }

    @Override // defpackage.dzlo
    public final /* synthetic */ void n() {
    }
}
