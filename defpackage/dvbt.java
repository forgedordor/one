package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbt implements fdap {
    final /* synthetic */ ListenableFuture a;

    public dvbt(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.cancel(false);
        return fctx.a;
    }
}
