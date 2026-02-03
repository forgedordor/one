package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axjd {
    private final fcsu a;

    public axjd(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    final axjc a(int i) {
        Executor executor = (Executor) this.a.b();
        executor.getClass();
        return new axjc(executor, i);
    }
}
