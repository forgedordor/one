package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cypf implements ehaw {
    final /* synthetic */ cypi a;

    public cypf(cypi cypiVar) {
        this.a = cypiVar;
    }

    @Override // defpackage.ehaw
    public final /* bridge */ /* synthetic */ egyk a() {
        return new egyb("BARCODE_DETECTOR");
    }

    @Override // defpackage.ehaw
    public final ListenableFuture b() {
        return eijx.g(new Callable() { // from class: cype
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new cypb();
            }
        }, this.a.a);
    }
}
