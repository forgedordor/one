package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihu implements eooz {
    final /* synthetic */ eifn a;
    final /* synthetic */ eooz b;

    public eihu(eifn eifnVar, eooz eoozVar) {
        this.a = eifnVar;
        this.b = eoozVar;
    }

    @Override // defpackage.eooz
    public final ListenableFuture a(Object obj) {
        eifn eifnVarH = eidc.h(eidc.b(), this.a);
        try {
            ListenableFuture listenableFutureA = this.b.a(obj);
            if (listenableFutureA != null) {
                return listenableFutureA;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
