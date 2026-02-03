package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qfb extends fdbr implements fdap {
    final /* synthetic */ qaq a;
    final /* synthetic */ ListenableFuture b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfb(qaq qaqVar, ListenableFuture listenableFuture) {
        super(1);
        this.a = qaqVar;
        this.b = listenableFuture;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof qei) {
            this.a.i(((qei) th).a);
        }
        this.b.cancel(false);
        return fctx.a;
    }
}
