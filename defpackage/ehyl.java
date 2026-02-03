package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class ehyl implements Runnable {
    public final /* synthetic */ ListenableFuture a;

    public /* synthetic */ ehyl(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ehym.l(this.a);
    }
}
