package defpackage;

import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwko {
    private final fcsu a;
    private final Executor b;
    private Optional c = Optional.empty();

    public bwko(fcsu fcsuVar, Executor executor) {
        this.a = fcsuVar;
        this.b = executor;
    }

    final bwkq a() {
        return new bwkq(this.a, this.c, this.b);
    }

    final void b(elss elssVar) {
        this.c = Optional.of(elssVar);
    }
}
