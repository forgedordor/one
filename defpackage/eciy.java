package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eciy implements ecid {
    private final ecja a;

    public eciy(ecja ecjaVar) {
        this.a = ecjaVar;
    }

    @Override // defpackage.ecid
    public final ListenableFuture a(ListenableFuture listenableFuture) {
        return eclq.a(this.a.d(listenableFuture));
    }
}
