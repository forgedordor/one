package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axiv implements Executor {
    private final axjc a;

    public axiv(axjd axjdVar) {
        this.a = axjdVar.a(4);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
