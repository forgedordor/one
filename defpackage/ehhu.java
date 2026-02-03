package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final /* synthetic */ class ehhu extends fdbo implements fdap {
    public ehhu(Object obj) {
        super(1, obj, ehhv.class, "getFromFallbackCacheOrImmediate", "getFromFallbackCacheOrImmediate(Lcom/google/apps/tiktok/experiments/FlagSnapshot;)Lcom/google/common/util/concurrent/ListenableFuture;", 0);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        ehdh ehdhVar = (ehdh) obj;
        ehdhVar.getClass();
        ehhv ehhvVar = (ehhv) this.g;
        ehdg ehdgVar = (ehdg) ehdh.a.createBuilder();
        ehdgVar.getClass();
        if (!fdbq.f(ehdhVar, ehdi.a(ehdgVar))) {
            return eork.i(ehdhVar);
        }
        ListenableFuture listenableFutureA = ((ecjh) ehhvVar.q.get()).a();
        listenableFutureA.getClass();
        return listenableFutureA;
    }
}
