package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqnx {
    private static final String[] c = {"COLLECTION_BASIS_VERIFIER"};
    public static boolean a = false;
    public static final Object b = new Object();

    public static void a(dqnl dqnlVar, dqny dqnyVar) {
        final ExecutorService threadPoolExecutor;
        dcfe dcfeVar = ddys.a;
        dqni dqniVar = (dqni) dqnlVar;
        Context context = dqniVar.a;
        final ddzn ddznVar = new ddzn(context);
        String strValueOf = String.valueOf(context.getPackageName());
        if (dqnyVar.a == null) {
            try {
                dqnyVar.a = Integer.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                dqnyVar.a = -1;
            }
        }
        final String strConcat = "com.google.android.libraries.consentverifier#".concat(strValueOf);
        defn defnVarC = ddznVar.c(strConcat, dqnyVar.a.intValue(), c, null);
        if (dqnn.a(dqniVar.a)) {
            ddmw ddmwVar = ddmx.a;
            threadPoolExecutor = ddmw.d(10);
        } else {
            RejectedExecutionHandler rejectedExecutionHandler = dqob.a;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
            eosw eoswVar = new eosw();
            eoswVar.d("ConsentVerifierLibraryThread-%d");
            threadPoolExecutor = new ThreadPoolExecutor(0, 10, 10L, TimeUnit.SECONDS, linkedBlockingQueue, eosw.b(eoswVar), dqob.a);
        }
        try {
            defnVarC.q(threadPoolExecutor, new defh() { // from class: dqnu
                @Override // defpackage.defh
                public final void e(Object obj) {
                    boolean z = dqnx.a;
                    ddzn ddznVar2 = ddznVar;
                    final String str = strConcat;
                    ddznVar2.f(str).p(threadPoolExecutor, new defe() { // from class: dqnw
                        @Override // defpackage.defe
                        public final void d(Exception exc) {
                            boolean z2 = dqnx.a;
                            Log.w("CBVerifier", String.format("Committing phenotypeflags for %s failed. %s", str, exc));
                        }
                    });
                }
            });
            defnVarC.p(threadPoolExecutor, new defe() { // from class: dqnv
                @Override // defpackage.defe
                public final void d(Exception exc) {
                    boolean z = dqnx.a;
                    Log.w("CBVerifier", String.format("Fail to register phenotypeflags for %s. %s", strConcat, exc));
                }
            });
        } catch (RejectedExecutionException e) {
            Log.w("CBVerifier", String.format("Execution failure when updating phenotypeflags for %s. %s", strConcat, e));
        }
    }
}
