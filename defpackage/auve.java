package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auve implements eora {
    private final Function a;
    private final RuntimeException b;

    public auve(Function function, RuntimeException runtimeException) {
        this.a = function;
        this.b = runtimeException;
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        auvh.g(th, this.b, this.a);
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
    }
}
