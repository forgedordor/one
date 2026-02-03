package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import android.os.Process;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckgt implements egsc {
    private static final cqce a = cqce.g("Bugle", "NotifyRcsUnavailableWorker");
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker");
    private final Context c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final eosc h;
    private final fcsu i;
    private final fcsu j;

    public ckgt(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, eosc eoscVar, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.c = context;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = eoscVar;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(WorkerParameters workerParameters) {
        final String strD = workerParameters.b.d("sim_id");
        strD.getClass();
        return eijx.g(new Callable() { // from class: ckgq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.d(strD);
            }
        }, this.h);
    }

    public final qap d(String str) throws Throwable {
        qap qanVar;
        dgkn dgknVar;
        HttpURLConnection httpURLConnectionA;
        int responseCode;
        fcsu fcsuVar = this.g;
        enwr enwrVarV = ((chza) ((cqbm) fcsuVar.b()).a()).v(new dggp(str));
        fcsu fcsuVar2 = this.i;
        String str2 = (String) ((cmlb) fcsuVar2.b()).h(cmla.a).map(new Function() { // from class: ckgr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cmmh) obj).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
        int iIntValue = ((Integer) ((cmlb) fcsuVar2.b()).j(new dggp(str)).map(new Function() { // from class: ckgs
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
        }).orElse(-1)).intValue();
        boolean z = false;
        boolean z2 = iIntValue != -1 && ((cmlb) fcsuVar2.b()).s(iIntValue);
        boolean zEquals = str.equals(str2);
        boolean z3 = zEquals && z2;
        boolean z4 = enwrVarV == enwr.AVAILABLE;
        if (z3 && z4) {
            z = true;
        }
        if (!zEquals) {
            ((ekrd) ((ekrd) b.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker", "shouldSendNotifyRcsUnavailableRequest", 186, "NotifyRcsUnavailableWorker.java")).q("NotifyRcsUnavailableWorker: SIM to mark unavailable is not the same as current default sim");
        }
        if (!z2) {
            ((ekrd) ((ekrd) b.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker", "shouldSendNotifyRcsUnavailableRequest", 191, "NotifyRcsUnavailableWorker.java")).q("NotifyRcsUnavailableWorker: SIM to mark unavailable is not loaded");
        }
        if (!z4) {
            ((ekrd) ((ekrd) b.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/NotifyRcsUnavailableWorker", "shouldSendNotifyRcsUnavailableRequest", 194, "NotifyRcsUnavailableWorker.java")).q("NotifyRcsUnavailableWorker: SIM to mark unavailable is not available");
        }
        if (z) {
            a.p("skipping request because conditions are not met");
            return new qao();
        }
        fcsu fcsuVar3 = this.d;
        dgiq dgiqVarF = ((dgrs) fcsuVar3.b()).f(str);
        if (!dgiqVarF.Q()) {
            a.r("skipping request because there is no config token");
            return new qam();
        }
        cjua cjuaVarD = ((dgrs) fcsuVar3.b()).d(str);
        String str3 = cjuaVarD.d;
        String str4 = dgiqVarF.k().mValue;
        int i = ((cebq) this.j.b()).c(str).k;
        String str5 = cjuaVarD.e;
        int iB = dgiqVarF.b();
        dgiqVarF.H(-99);
        ckiz ckizVarM = ckja.m(4);
        enwr enwrVarV2 = ((chza) ((cqbm) fcsuVar.b()).a()).v(new dggp(str));
        a.p("Current availability is ".concat(String.valueOf(String.valueOf(enwrVarV2))));
        if (enwrVarV2 == enwr.DISABLED_NOT_DEFAULT_SMS_APP) {
            ckizVarM.l("default_sms_app", Integer.toString(2));
        }
        try {
            dgnj dgnjVar = (dgnj) this.e.b();
            Context context = this.c;
            dgnjVar.a.e(str3, dgiqVarF, null, str4, i, dgnjVar.a(context, str5, str), Optional.of(ckizVarM));
            ckja ckjaVarJ = ckizVarM.j();
            dggp dggpVar = new dggp(str);
            try {
                try {
                    dgknVar = (dgkn) this.f.b();
                    deyo deyoVar = dgknVar.b;
                    String str6 = ((ckip) ckjaVarJ).a;
                    deyoVar.k(context, ckjaVarJ, str6, dggpVar);
                    TrafficStats.setThreadStatsTag(Process.myPid());
                    try {
                        httpURLConnectionA = dgknVar.c.a(ckjaVarJ);
                        try {
                            ejxm ejxmVarC = ejxm.c(ejsz.a);
                            responseCode = httpURLConnectionA.getResponseCode();
                            long jA = ejxmVarC.a(TimeUnit.MILLISECONDS);
                            ckjc ckjcVarF = ckjd.f(4, str6, ((ckip) ckjaVarJ).b);
                            ewlq ewlqVarB = ckjcVarF.b();
                            ewlqVarB.copyOnWrite();
                            ewlr ewlrVar = (ewlr) ewlqVarB.instance;
                            ewlr ewlrVar2 = ewlr.a;
                            ewlrVar.b |= 1;
                            ewlrVar.c = responseCode;
                            int iMin = (int) Math.min(2147483647L, jA);
                            ewlqVarB.copyOnWrite();
                            ewlr ewlrVar3 = (ewlr) ewlqVarB.instance;
                            ewlrVar3.b |= 2;
                            ewlrVar3.d = iMin;
                            deyoVar.l(context, ckjcVarF.a(), dggpVar);
                        } catch (Throwable th) {
                            th = th;
                            if (httpURLConnectionA != null) {
                                dgknVar.a(httpURLConnectionA, null, "PROVISIONING_ENGINE_NOTIFY_RCS_UNAVAILABLE_WORKER");
                            }
                            TrafficStats.clearThreadStatsTag();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        httpURLConnectionA = null;
                    }
                } catch (MalformedURLException unused) {
                    a.r("skipping request due to MalformedURLException");
                    return new qam();
                }
            } catch (dgka e) {
                a.s("Unexpected HTTP response", e);
                qanVar = e.a == 503 ? new qan() : new qam();
            } catch (IOException e2) {
                a.o("IOException while connecting to server", e2);
                qanVar = new qan();
            }
            if (responseCode != 200) {
                throw new dgka(responseCode);
            }
            if (httpURLConnectionA != null) {
                dgknVar.a(httpURLConnectionA, null, "PROVISIONING_ENGINE_NOTIFY_RCS_UNAVAILABLE_WORKER");
            }
            TrafficStats.clearThreadStatsTag();
            qanVar = new qao();
            dgiqVarF.H(iB);
            dgiqVarF.I(true);
            ((dgrs) this.d.b()).x(str, dgiqVarF);
            return qanVar;
        } catch (MalformedURLException unused2) {
        }
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
