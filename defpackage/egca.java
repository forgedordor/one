package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egca {
    public static final ekrg a = ekrg.c("com/google/apps/tiktok/account/data/AccountInvalidator");
    public final egcq b;

    public egca(egcq egcqVar) {
        this.b = egcqVar;
    }

    public final ListenableFuture a() {
        ekph ekphVar = new ekph("google");
        egcq egcqVar = this.b;
        ListenableFuture listenableFutureG = eooh.g(egcqVar.b(ekphVar), Throwable.class, eiid.d(new eooz() { // from class: egbz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) egca.a.i()).g((Throwable) obj)).h("com/google/apps/tiktok/account/data/AccountInvalidator", "invalidateAccounts", '/', "AccountInvalidator.java")).q("Account sync failed");
                return this.a.b.f();
            }
        }), eoqg.a);
        egcqVar.d(listenableFutureG);
        return listenableFutureG;
    }

    public final ListenableFuture b() {
        egcq egcqVar = this.b;
        ListenableFuture listenableFutureG = eooh.g(egcqVar.a(), Throwable.class, eiid.d(new eooz() { // from class: egby
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                ((ekrd) ((ekrd) ((ekrd) egca.a.i()).g((Throwable) obj)).h("com/google/apps/tiktok/account/data/AccountInvalidator", "invalidateAllAccounts", 'F', "AccountInvalidator.java")).q("Account sync failed");
                return this.a.b.f();
            }
        }), eoqg.a);
        egcqVar.d(listenableFutureG);
        return listenableFutureG;
    }
}
