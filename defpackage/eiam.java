package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiam implements eiah {
    final /* synthetic */ eooz a;
    final /* synthetic */ eiaq b;

    public eiam(eooz eoozVar, eiaq eiaqVar) {
        this.a = eoozVar;
        this.b = eiaqVar;
    }

    @Override // defpackage.eiah
    public final ListenableFuture a(ListenableFuture listenableFuture, long j) {
        return eorv.a;
    }

    @Override // defpackage.eiah
    public final ListenableFuture b() {
        return this.a.a(this.b);
    }
}
