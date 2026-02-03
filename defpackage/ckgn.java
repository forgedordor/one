package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckgn implements egsc {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("BugleRcsWorker");
    private final Context c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final eosc j;
    private final fcsu k;
    private final fcsu l;
    private final aqaw m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;

    public ckgn(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, eosc eoscVar, fcsu fcsuVar7, fcsu fcsuVar8, aqaw aqawVar, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13) {
        this.c = context;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = eoscVar;
        this.k = fcsuVar7;
        this.l = fcsuVar8;
        this.m = aqawVar;
        this.n = fcsuVar9;
        this.o = fcsuVar10;
        this.p = fcsuVar11;
        this.q = fcsuVar12;
        this.r = fcsuVar13;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.qap e(defpackage.ckja r20, defpackage.enwr r21, java.lang.String r22, boolean r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckgn.e(ckja, enwr, java.lang.String, boolean):qap");
    }

    private final dgiq f(String str) {
        fcsu fcsuVar = this.d;
        dgiq dgiqVarF = ((dgrs) fcsuVar.b()).f(str);
        dgiqVarF.H(-4);
        dgiqVarF.M(0);
        dgiqVarF.I(true);
        ((dgrs) fcsuVar.b()).x(str, dgiqVarF);
        return dgiqVarF;
    }

    private final void g(HttpURLConnection httpURLConnection) {
        ((dgkn) this.g.b()).a(httpURLConnection, null, "DisableRcsWorker");
    }

    private final void h(String str) {
        ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "clearConfig", 398, "DisableRcsWorker.java")).t("Clearing local RCS Configuration for simId: %s.", str);
        ((dgrs) this.d.b()).x(str, new Configuration());
    }

    private final void i(String str, boolean z, qap qapVar) {
        ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "scheduleReprovisioningIfNeeded", 334, "DisableRcsWorker.java")).G("scheduleReprovisioningIfNeeded with forceDisableThenReprovision = %s, result = %s", z, qapVar);
        if (!z || new qan().equals(qapVar)) {
            return;
        }
        ((cjyi) this.o.b()).i(new dggp(str), false);
        ((ckhh) this.l.b()).e(new dggp(str), ewjm.TRIGGER_PHENOTYPE_FLAG_UPDATE, enxe.REPROVISIONING_CAMPAIGN);
    }

    private final boolean j(enwr enwrVar) {
        if (enwrVar != enwr.DISABLED_VIA_FLAGS) {
            return (((arup) this.r.b()).a() && enwrVar == enwr.DISABLED_FOR_WEAR) || enwrVar == enwr.DISABLED_BY_EMM;
        }
        return true;
    }

    @Override // defpackage.egsp
    public final /* synthetic */ ListenableFuture a(WorkerParameters workerParameters) {
        return egso.a();
    }

    @Override // defpackage.egsc, defpackage.egsp
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        return eijx.g(new Callable() { // from class: ckgm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                pzs pzsVar = workerParameters.b;
                return this.a.d(pzsVar.h("force_disable_then_reprovision"), ejwk.b(pzsVar.d("sim_id")));
            }
        }, this.j);
    }

    public final qap d(boolean z, String str) {
        eksp ekspVar = b;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 141, "DisableRcsWorker.java")).E("disableRcsRequestWork for simId: %s, forceDisableThenReprovision: %s", str, z);
        fcsu fcsuVar = this.d;
        dgiq dgiqVarF = ((dgrs) fcsuVar.b()).f(str);
        if (!z && (!dgiqVarF.Q() || !dgiqVarF.ab())) {
            ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 149, "DisableRcsWorker.java")).H("Wrong configuration, hasToken: %s, isValidAndUpdated: %s", dgiqVarF.Q(), dgiqVarF.ab());
            return new qam();
        }
        if (z) {
            dgiqVarF = f(str);
        }
        enwr enwrVarV = ((chza) ((cqbm) this.h.b()).a()).v(new dggp(str));
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 163, "DisableRcsWorker.java")).t("Current availability is %s", enwrVarV);
        enwr enwrVar = enwr.DISABLED_FROM_PREFERENCES;
        if (enwrVarV == enwrVar) {
            Optional optionalB = ((cefq) this.p.b()).b(new dggp(str));
            if (optionalB.isEmpty()) {
                ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "clearAuthToken", 412, "DisableRcsWorker.java")).q("Skip clearing auth token because messaging identity is not present.");
            } else {
                String strL = ((alqm) optionalB.get()).l();
                if (strL == null) {
                    ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "clearAuthToken", 417, "DisableRcsWorker.java")).q("Skip clearing auth token because normalized phone number is null.");
                } else {
                    ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "clearAuthToken", 421, "DisableRcsWorker.java")).q("Clearing auth token when the user manually disables RCS.");
                    ((cejk) this.q.b()).a(new cfre(strL)).v();
                }
            }
        }
        if (!z ? enwrVarV == enwrVar || j(enwrVarV) : !this.m.a() ? !dfpi.T() : !(dfpi.T() || ((cebq) this.n.b()).c(str).R)) {
            if (j(enwrVarV)) {
                h(str);
            }
            ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 226, "DisableRcsWorker.java")).q("Cannot send disable request due to availability mismatch");
            i(str, z, new qam());
            return new qam();
        }
        if (!z) {
            try {
                dgiqVarF = f(str);
            } catch (RuntimeException e) {
                e.printStackTrace();
                i(str, z, new qam());
                return new qam();
            } catch (MalformedURLException unused) {
                ((eksl) ((eksl) b.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/DisableRcsWorker", "disableRcsRequestWork", 215, "DisableRcsWorker.java")).q("malformed URL has occurred");
                i(str, z, new qam());
                return new qam();
            }
        }
        dgiq dgiqVar = dgiqVarF;
        String strF = z ? ((dgrs) fcsuVar.b()).d(str).d : dfpi.z() ? ((dgtg) this.e.b()).f(str) : ((dgtg) this.e.b()).e();
        int iB = dfpi.z() ? ((dgtg) this.e.b()).b(str) : ((dgtg) this.e.b()).a();
        String str2 = dgiqVar.k().mValue;
        ckiz ckizVarM = ckja.m(3);
        ((dgnj) this.f.b()).e(this.c, strF, dgiqVar, "", str2, iB, null, str, ckizVarM);
        return e(ckizVarM.j(), enwrVarV, str, z);
    }

    @Override // defpackage.egsp
    public final /* synthetic */ void c(egsf egsfVar) {
    }
}
