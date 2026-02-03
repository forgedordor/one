package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihx implements Callable {
    final /* synthetic */ eifn a;
    final /* synthetic */ Callable b;

    public eihx(eifn eifnVar, Callable callable) {
        this.a = eifnVar;
        this.b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        eifn eifnVarI = eidc.i(eidc.b(), this.a);
        try {
            return this.b.call();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
