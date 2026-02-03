package com.google.android.apps.messaging.shared.net;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cent;
import defpackage.ehli;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.ejvr;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eork;
import defpackage.pzs;
import defpackage.qam;
import defpackage.qaq;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class VerifyTachyonOtpWorker extends qaq {
    private final cent e;
    private final eigp f;

    /* compiled from: PG */
    public interface a {
        eigp b();

        cent bV();
    }

    public VerifyTachyonOtpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        a aVar = (a) ehli.a(context, a.class);
        this.e = aVar.bV();
        this.f = aVar.b();
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        ListenableFuture listenableFutureE;
        eieh eiehVarC = this.f.c("VerifyTachyonOtpWorker.startWork", "com/google/android/apps/messaging/shared/net/VerifyTachyonOtpWorker", "startWork", 45);
        try {
            pzs pzsVarF = f();
            cent centVar = this.e;
            final String strD = pzsVarF.d("otpCode");
            if (TextUtils.isEmpty(strD)) {
                cent.a.r("Invalid input data: missing otp.");
                listenableFutureE = eork.i(new qam());
            } else {
                String strD2 = pzsVarF.d("msisdn");
                if (TextUtils.isEmpty(strD2)) {
                    cent.a.r("Invalid input data: missing phone number");
                    listenableFutureE = eork.i(new qam());
                } else {
                    eiju eijuVarI = centVar.b.b(strD2).i(new eooz() { // from class: cenp
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return ((cejg) obj).s(strD);
                        }
                    }, centVar.c);
                    eooz eoozVar = new eooz() { // from class: cenq
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) throws Exception {
                            Exception exc = (Exception) obj;
                            cent.a.o("Failed to verify tachyon registration", exc);
                            throw exc;
                        }
                    };
                    eoqg eoqgVar = eoqg.a;
                    listenableFutureE = eiju.g(eijuVarI.f(Exception.class, eoozVar, eoqgVar)).h(new ejvr() { // from class: cenr
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return new qao();
                        }
                    }, eoqgVar).e(Exception.class, new ejvr() { // from class: cens
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            cent.a.o("Failed to verify", (Exception) obj);
                            return new qam();
                        }
                    }, eoqgVar);
                }
            }
            eiehVarC.close();
            return listenableFutureE;
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
