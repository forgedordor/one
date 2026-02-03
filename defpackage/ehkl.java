package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehkl implements eooy {
    final /* synthetic */ fdap a;
    final /* synthetic */ ehkk b;

    public ehkl(fdap fdapVar, ehkk ehkkVar) {
        this.a = fdapVar;
        this.b = ehkkVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    @Override // defpackage.eooy
    public final ListenableFuture a() {
        return this.a.invoke(this.b.e);
    }
}
