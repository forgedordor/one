package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihv implements Callable {
    final /* synthetic */ eifn a;
    final /* synthetic */ Callable b;

    public eihv(eifn eifnVar, Callable callable) {
        this.a = eifnVar;
        this.b = callable;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        eifn eifnVarH = eidc.h(eidc.b(), this.a);
        try {
            return this.b.call();
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
