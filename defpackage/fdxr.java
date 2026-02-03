package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdxr implements fdap {
    final /* synthetic */ ListenableFuture a;

    public fdxr(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.cancel(false);
        return fctx.a;
    }
}
