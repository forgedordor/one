package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztt extends dztr implements dzix, dzlo {
    public static final long a = TimeUnit.HOURS.toMillis(12);
    public final dzlm b;
    public final Context c;
    public final eygg d;
    public final dzvo e;
    private final dzjd f;
    private final Executor g;

    public dztt(dzln dzlnVar, Context context, dzjd dzjdVar, Executor executor, eygg eyggVar, dzvo dzvoVar, fcsu fcsuVar) {
        this.b = dzlnVar.a(executor, eyggVar, fcsuVar);
        this.g = executor;
        this.c = context;
        this.d = eyggVar;
        this.e = dzvoVar;
        this.f = dzjdVar;
    }

    @Override // defpackage.dzix
    public final void i(dzfh dzfhVar) {
        this.f.b(this);
        eork.n(new eooy() { // from class: dzts
            @Override // defpackage.eooy
            public final ListenableFuture a() throws PackageManager.NameNotFoundException, IOException {
                long j;
                dztt dzttVar = this.a;
                eygg eyggVar = dzttVar.d;
                ((dztq) eyggVar.b()).f();
                Context context = dzttVar.c;
                if (!dqyw.h(context)) {
                    ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 109, "StorageMetricServiceImpl.java")).q("Device locked.");
                    return eorv.a;
                }
                ecem.b();
                dzvo dzvoVar = dzttVar.e;
                long j2 = dztt.a;
                ecem.b();
                Context context2 = dzvoVar.a;
                if (dqyw.h(context2)) {
                    long j3 = dqyw.h(context2) ? ((SharedPreferences) dzvoVar.c.b()).getLong("primes.packageMetric.lastSendTime", -1L) : -1L;
                    long jA = dzvoVar.b.a();
                    if (jA < j3) {
                        if (((SharedPreferences) dzvoVar.c.b()).edit().remove("primes.packageMetric.lastSendTime").commit()) {
                            j = -1;
                        } else {
                            j = -1;
                            ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/sampling/PersistentRateLimiting", "hasRecentTimeStamp", 51, "PersistentRateLimiting.java")).q("Failure storing timestamp to SharedPreferences");
                        }
                        j3 = j;
                    } else {
                        j = -1;
                    }
                    if (j3 != j && jA <= j3 + j2) {
                        ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 113, "StorageMetricServiceImpl.java")).q("Ignoring storage metric request, storage metric collection occurred too recently.");
                        return eorv.a;
                    }
                }
                dzlm dzlmVar = dzttVar.b;
                if (!dzlmVar.c(null)) {
                    return eorv.a;
                }
                ecem.b();
                PackageStats packageStatsA = dztn.a(context);
                if (packageStatsA == null) {
                    return eork.h(new IllegalStateException("PackageStats capture failed."));
                }
                feiw feiwVar = (feiw) feix.a.createBuilder();
                feij feijVar = (feij) feim.a.createBuilder();
                long j4 = packageStatsA.cacheSize;
                feijVar.copyOnWrite();
                feim feimVar = (feim) feijVar.instance;
                feimVar.b |= 1;
                feimVar.c = j4;
                long j5 = packageStatsA.codeSize;
                feijVar.copyOnWrite();
                feim feimVar2 = (feim) feijVar.instance;
                feimVar2.b |= 2;
                feimVar2.d = j5;
                long j6 = packageStatsA.dataSize;
                feijVar.copyOnWrite();
                feim feimVar3 = (feim) feijVar.instance;
                feimVar3.b |= 4;
                feimVar3.e = j6;
                long j7 = packageStatsA.externalCacheSize;
                feijVar.copyOnWrite();
                feim feimVar4 = (feim) feijVar.instance;
                feimVar4.b |= 8;
                feimVar4.f = j7;
                long j8 = packageStatsA.externalCodeSize;
                feijVar.copyOnWrite();
                feim feimVar5 = (feim) feijVar.instance;
                feimVar5.b |= 16;
                feimVar5.g = j8;
                long j9 = packageStatsA.externalDataSize;
                feijVar.copyOnWrite();
                feim feimVar6 = (feim) feijVar.instance;
                feimVar6.b |= 32;
                feimVar6.h = j9;
                long j10 = packageStatsA.externalMediaSize;
                feijVar.copyOnWrite();
                feim feimVar7 = (feim) feijVar.instance;
                feimVar7.b |= 64;
                feimVar7.i = j10;
                long j11 = packageStatsA.externalObbSize;
                feijVar.copyOnWrite();
                feim feimVar8 = (feim) feijVar.instance;
                feimVar8.b |= 128;
                feimVar8.j = j11;
                feij feijVar2 = (feij) ((feim) feijVar.build()).toBuilder();
                ((dztq) eyggVar.b()).d();
                feiwVar.copyOnWrite();
                feix feixVar = (feix) feiwVar.instance;
                feim feimVar9 = (feim) feijVar2.build();
                feimVar9.getClass();
                feixVar.j = feimVar9;
                feixVar.b |= 128;
                if (!dqyw.h(context2) || !((SharedPreferences) dzvoVar.c.b()).edit().putLong("primes.packageMetric.lastSendTime", dzvoVar.b.a()).commit()) {
                    ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/storage/StorageMetricServiceImpl", "sendInBackgroundInternal", 146, "StorageMetricServiceImpl.java")).q("Failure storing timestamp persistently");
                }
                dzle dzleVarN = dzlf.n();
                dzleVarN.f((feix) feiwVar.build());
                return dzlmVar.b(dzleVarN.a());
            }
        }, this.g);
    }

    @Override // defpackage.dzlo
    public final void n() {
        this.f.a(this);
    }

    @Override // defpackage.dzix
    public final /* synthetic */ void j(dzfh dzfhVar) {
    }
}
