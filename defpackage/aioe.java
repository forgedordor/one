package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aioe implements aipo, cqdb, cqci {
    public static final cqce a = cqce.g("BugleUsageStatistics", "TimerEventLoggerImpl");
    public static final cczv b = cdag.c(cdag.b, "action_breakdown_timer_percent", 0.0d);
    public final fcsu d;
    public final cogw e;
    public final eosc f;
    private final fcsu g;
    private final ejxr h;
    private final fcsu i;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    private boolean j = false;

    public aioe(fcsu fcsuVar, fcsu fcsuVar2, cogw cogwVar, ejxr ejxrVar, fcsu fcsuVar3, eosc eoscVar) {
        this.g = fcsuVar;
        this.d = fcsuVar2;
        this.e = cogwVar;
        this.h = ejxrVar;
        this.i = fcsuVar3;
        this.f = eoscVar;
    }

    private final ainv o(String str, ainv ainvVar) {
        if (!this.j) {
            a.m("Clearcut loggings are disabled.");
            return aioo.a;
        }
        ConcurrentHashMap concurrentHashMap = this.c;
        ainv ainvVar2 = (ainv) concurrentHashMap.get(str);
        if (ainvVar2 != null) {
            return ainvVar2;
        }
        ainv ainvVar3 = (ainv) concurrentHashMap.putIfAbsent(str, ainvVar);
        return ainvVar3 != null ? ainvVar3 : ainvVar;
    }

    private static String p(String str, String str2) {
        cqaz.f(TextUtils.isEmpty(str));
        return TextUtils.isEmpty(str2) ? str : String.valueOf(str).concat(String.valueOf(str2));
    }

    @Override // defpackage.aipo
    public final ainv a(String str, elgm elgmVar, String str2) {
        if (!ccze.a((Random) this.h.get(), b)) {
            return aioo.a;
        }
        String strP = p(str, str2);
        return o(strP, new aiob(this, str, elgmVar, strP, this.e.a()));
    }

    @Override // defpackage.aipo
    public final ainv b(String str) {
        return d(str, null, this.e.a());
    }

    @Override // defpackage.aipo
    public final ainv c(String str, String str2) {
        return d(str, str2, this.e.a());
    }

    @Override // defpackage.aipo
    public final ainv d(String str, String str2, long j) {
        String strP = p(str, str2);
        return o(strP, new aiod(this, str, strP, j));
    }

    @Override // defpackage.aipo
    public final void e(String str) {
        this.c.remove(p(str, null));
    }

    @Override // defpackage.aipo
    public final void f() {
        n(this.e.a() - 900000);
    }

    @Override // defpackage.aipo
    public final void g() {
        this.j = ((cqpz) this.g.b()).i("bugle_enable_analytics", true);
    }

    @Override // defpackage.cqdb
    public final void h(String str, long j, long j2) {
        ((cczn) this.i.b()).a();
        double dDoubleValue = ((Double) ccze.q.e()).doubleValue();
        if (this.j && j >= j2 * dDoubleValue && str.startsWith("Bugle.")) {
            ((ains) this.d.b()).g(str, j);
        }
        if (j <= j2) {
            cqbd cqbdVarD = a.d();
            cqbdVarD.I(str);
            cqbdVarD.I("asyncTask took");
            cqbdVarD.H(j);
            cqbdVarD.r();
        }
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        if (i == 15) {
            n(0L);
        } else {
            f();
        }
    }

    @Override // defpackage.aipo
    public final ainv j(int i, String str) {
        if (!ccze.a((Random) this.h.get(), b)) {
            return aioo.a;
        }
        String strP = p("Bugle.DataModel.Action.UpdateConversationEncryptionStatusAction.ExecuteAction.DownloadAndProcessRemoteInstanceData.Latency", str);
        return o(strP, new aioc(this, i, strP, this.e.a()));
    }

    @Override // defpackage.aipo
    public final void k(String str) {
        ainv ainvVar = (ainv) this.c.get(p(str, null));
        if (ainvVar != null) {
            ainvVar.c();
        }
    }

    @Override // defpackage.aipo
    public final eiju l(ejxr ejxrVar) {
        final long jA = this.e.a();
        return ((eiju) ejxrVar.get()).i(new eooz() { // from class: ainy
            @Override // defpackage.eooz
            public final ListenableFuture a(final Object obj) {
                final aioe aioeVar = this.a;
                final long jA2 = aioeVar.e.a();
                final long j = jA;
                return eijx.f(new Runnable() { // from class: ainz
                    public final /* synthetic */ String b = "Bugle.Cms.IncrementalBackup.ExecutionTime";

                    @Override // java.lang.Runnable
                    public final void run() {
                        ((ains) aioeVar.d.b()).g(this.b, jA2 - j);
                    }
                }, aioeVar.f).h(new ejvr() { // from class: aioa
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqce cqceVar = aioe.a;
                        return obj;
                    }
                }, eoqg.a);
            }
        }, eoqg.a);
    }

    @Override // defpackage.aipo
    public final void m(String str, String str2) {
        ainv ainvVar = (ainv) this.c.get(p(str, str2));
        if (ainvVar != null) {
            ainvVar.c();
        }
    }

    public final void n(long j) {
        ConcurrentHashMap concurrentHashMap = this.c;
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            if (((ainv) entry.getValue()).a() < j) {
                cqbd cqbdVarD = a.d();
                cqbdVarD.M("dropping timer", ((ainv) entry.getValue()).b());
                cqbdVarD.I("(age)");
                cqbdVarD.r();
                concurrentHashMap.remove(entry.getKey(), entry.getValue());
            }
        }
    }
}
