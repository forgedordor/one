package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eope implements Callable {
    final /* synthetic */ eopn a;
    final /* synthetic */ eopm b;

    public eope(eopn eopnVar, eopm eopmVar) {
        this.a = eopnVar;
        this.b = eopmVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b.a);
    }

    public final String toString() {
        return this.a.toString();
    }
}
