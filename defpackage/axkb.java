package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axkb implements Executor {
    private final axjc a;

    public axkb(axjd axjdVar) {
        this.a = axjdVar.a(2);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
