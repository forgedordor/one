package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egcp implements eora {
    final /* synthetic */ egcq a;

    public egcp(egcq egcqVar) {
        this.a = egcqVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        Iterator it = ((Set) this.a.e.b()).iterator();
        while (it.hasNext()) {
            egzh egzhVar = ((egdk) it.next()).a;
            ListenableFuture listenableFutureI = eork.i(null);
            egzhVar.a(listenableFutureI, "com.google.apps.tiktok.account.data.AllAccounts");
            egoc.d("com/google/apps/tiktok/account/data/AccountProviderSyncer$1", "onSuccess", 220, listenableFutureI, "AvailableAccountsInvalidatedObserver failed", new Object[0]);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
