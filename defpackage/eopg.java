package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eopg implements eora {
    final /* synthetic */ eopy a;
    final /* synthetic */ Executor b;

    public eopg(eopy eopyVar, Executor executor) {
        this.a = eopyVar;
        this.b = executor;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b.a.a((AutoCloseable) obj, this.b);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
