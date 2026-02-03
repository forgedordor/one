package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiht implements eooy {
    final /* synthetic */ eifn a;
    final /* synthetic */ eooy b;

    public eiht(eifn eifnVar, eooy eooyVar) {
        this.a = eifnVar;
        this.b = eooyVar;
    }

    @Override // defpackage.eooy
    public final ListenableFuture a() {
        eifi eifiVarB = eidc.b();
        eifn eifnVarH = eidc.h(eifiVarB, this.a);
        try {
            ListenableFuture listenableFutureA = this.b.a();
            eidc.h(eifiVarB, eifnVarH);
            listenableFutureA.getClass();
            return listenableFutureA;
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
