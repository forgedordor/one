package defpackage;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhbw implements fhbm {
    final /* synthetic */ Type a;
    final /* synthetic */ Executor b;

    public fhbw(Type type, Executor executor) {
        this.a = type;
        this.b = executor;
    }

    @Override // defpackage.fhbm
    public final /* bridge */ /* synthetic */ Object adapt(fhbk fhbkVar) {
        Executor executor = this.b;
        return executor == null ? fhbkVar : new fhca(executor, fhbkVar);
    }

    @Override // defpackage.fhbm
    public final Type responseType() {
        return this.a;
    }
}
