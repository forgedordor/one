package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnuk {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public cnuk(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    final cnuj a(BiConsumer biConsumer) {
        cnun cnunVar = (cnun) this.b.b();
        cnunVar.getClass();
        Executor executor = (Executor) this.c.b();
        executor.getClass();
        return new cnuj(this.a, cnunVar, executor, biConsumer);
    }
}
