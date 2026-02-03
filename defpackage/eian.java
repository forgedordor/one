package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eian implements eiah {
    final /* synthetic */ eiar a;
    final /* synthetic */ ehwf b;

    public eian(eiar eiarVar, ehwf ehwfVar) {
        this.a = eiarVar;
        this.b = ehwfVar;
    }

    @Override // defpackage.eiah
    public final ListenableFuture a(ListenableFuture listenableFuture, long j) {
        return this.a.a(listenableFuture, this.b, j);
    }

    @Override // defpackage.eiah
    public final ListenableFuture b() {
        return this.a.b(this.b);
    }
}
