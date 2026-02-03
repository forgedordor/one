package defpackage;

import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auvg implements eora {
    private final Consumer a;
    private final Function b;
    private final RuntimeException c;

    public auvg(Consumer consumer, Function function, RuntimeException runtimeException) {
        this.a = consumer;
        this.b = function;
        this.c = runtimeException;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            auvh.g(th, this.c, this.b);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        auvh.g(th, this.c, this.b);
    }
}
