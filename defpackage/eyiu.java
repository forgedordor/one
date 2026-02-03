package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyiu implements eyir {
    public final ListenableFuture a;
    final /* synthetic */ eyiw b;

    public eyiu(eyiw eyiwVar) {
        this.b = eyiwVar;
        eyiv eyivVar = eyiwVar.a;
        if (!eyivVar.isDone()) {
            Runnable eyisVar = new eyis(eyivVar);
            eyivVar.b(eyisVar, eoqg.a);
            eyivVar = eyisVar;
        }
        this.a = eyivVar;
    }

    @Override // defpackage.eyir
    public final ListenableFuture d() {
        this.b.d();
        return this.a;
    }
}
