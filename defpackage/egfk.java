package defpackage;

import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.UserManager;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egfk implements egcz {
    private final egfm a;
    private final Activity b;

    public egfk(egfm egfmVar, Activity activity) {
        this.a = egfmVar;
        this.b = activity;
    }

    @Override // defpackage.egcz
    public final ListenableFuture a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", false);
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
        Activity activity = this.b;
        final egfm egfmVar = this.a;
        try {
            final egdt egdtVar = egfmVar.b.a;
            final egdu egduVar = new egdu(bundle, activity);
            ListenableFuture listenableFutureN = eork.n(eiid.c(new eooy() { // from class: egdq
                @Override // defpackage.eooy
                public final ListenableFuture a() {
                    final SettableFuture settableFutureCreate = SettableFuture.create();
                    AccountManagerCallback<Bundle> accountManagerCallback = new AccountManagerCallback() { // from class: egdr
                        @Override // android.accounts.AccountManagerCallback
                        public final void run(AccountManagerFuture accountManagerFuture) {
                            egdt.a(settableFutureCreate, accountManagerFuture);
                        }
                    };
                    egdt egdtVar2 = egdtVar;
                    AccountManager accountManager = egdtVar2.a;
                    egdu egduVar2 = egduVar;
                    final AccountManagerFuture<Bundle> accountManagerFutureAddAccount = accountManager.addAccount(egduVar2.a, egduVar2.b, null, egduVar2.c, egduVar2.d, accountManagerCallback, egdtVar2.b);
                    settableFutureCreate.b(new Runnable() { // from class: egds
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (settableFutureCreate.isCancelled()) {
                                accountManagerFutureAddAccount.cancel(true);
                            }
                        }
                    }, eoqg.a);
                    return settableFutureCreate;
                }
            }), egdtVar.c);
            final boolean z = activity != null;
            ListenableFuture listenableFutureF = eooq.f(listenableFutureN, eiid.a(new ejvr() { // from class: egdv
                public final /* synthetic */ String b = "com.google";

                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Bundle bundle2 = (Bundle) obj;
                    if (z) {
                        ejwl.l(this.b.equals(bundle2.getString("accountType")));
                    }
                    return bundle2;
                }
            }), eoqg.a);
            StrictMode.setThreadPolicy(threadPolicy);
            return eooq.g(listenableFutureF, eiid.d(new eooz() { // from class: egfl
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return eooq.f(egfmVar.c.g(), new ejvt(((Bundle) obj).getString("authAccount")), eoqg.a);
                }
            }), eoqg.a);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    @Override // defpackage.egcz
    public final boolean b() {
        return !((UserManager) this.a.a.getSystemService(UserManager.class)).isDemoUser();
    }
}
