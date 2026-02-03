package com.google.android.apps.messaging.shared.net.tachyonrefresh;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.cejj;
import defpackage.cezu;
import defpackage.cgaf;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.ehli;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.pzs;
import defpackage.qam;
import defpackage.qao;
import defpackage.qaq;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class TachyonRefreshWorker extends qaq {
    public static final cqce e = cqce.g("BugleNetwork", "TachyonRefreshWorker");
    public static final cczi f = cdag.f(cdag.b, "refresh_initial_delay_seconds", 10);
    private final Context g;

    /* compiled from: PG */
    public interface a {
        eigp b();

        Optional eW();
    }

    public TachyonRefreshWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = context;
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        eiju eijuVarE;
        a aVar = (a) ehli.a(this.g, a.class);
        if (aVar.eW().isEmpty()) {
            e.m("Skip refresh due to absent TachyonRefreshWorkerHelper");
            return eijx.e(new qao());
        }
        pzs pzsVarF = f();
        String strD = pzsVarF.d("tachyon_refresh_app");
        String strD2 = pzsVarF.d("tachyon_refresh_id");
        if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(strD2)) {
            e.m("Skip refresh due to empty parameter");
            return eijx.e(new qam());
        }
        eieh eiehVarC = aVar.b().c("TachyonRefreshWorker.startWork", "com/google/android/apps/messaging/shared/net/tachyonrefresh/TachyonRefreshWorker", "startWork", 81);
        try {
            Object obj = aVar.eW().get();
            int iE = e();
            cqce cqceVar = cgaf.a;
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.I("TachyonRefreshWorkerHelper started");
            cqbdVarC.A("app", strD);
            cqbdVarC.y("runAttemptCount", iE);
            cqbdVarC.r();
            if (iE > ((Integer) cgaf.b.e()).intValue()) {
                cqceVar.p("Failed due to exceeeding max run attempt count");
                eijuVarE = eijx.e(new qam());
            } else if (TextUtils.equals(strD, "RCS")) {
                if (cezu.a()) {
                    cqceVar.p("Handling phone number TachyonRefresh retry");
                    eiju eijuVarC = ((cejj) ((cgaf) obj).c.b()).c(strD2);
                    eooz eoozVar = new eooz() { // from class: cgac
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            return ((cejg) obj2).B();
                        }
                    };
                    eosc eoscVar = ((cgaf) obj).d;
                    eijuVarE = eijuVarC.i(eoozVar, eoscVar).h(new ejvr() { // from class: cgad
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cqce cqceVar2 = cgaf.a;
                            return new qao();
                        }
                    }, eoqg.a).e(Throwable.class, new ejvr() { // from class: cgae
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            Throwable th = (Throwable) obj2;
                            cqce cqceVar2 = cgaf.a;
                            if (cems.d(th)) {
                                cgaf.a.s("TachyonRefreshWorker failed with a retriable error", th);
                                return new qan();
                            }
                            cgaf.a.s("TachyonRefreshWorker failed with a non-retriable error", th);
                            return new qam();
                        }
                    }, eoscVar);
                } else {
                    cqceVar.m("Skip refresh work. Phone registration is not enabled.");
                    eijuVarE = eijx.e(new qao());
                }
            } else {
                cqbd cqbdVarC2 = cqceVar.c();
                cqbdVarC2.I("Skip refresh work. Unrecognized app name");
                cqbdVarC2.A("app", strD);
                cqbdVarC2.r();
                eijuVarE = eijx.e(new qao());
            }
            eiehVarC.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
