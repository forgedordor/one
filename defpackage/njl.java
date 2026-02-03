package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njl implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ meo b;

    public njl(Executor executor, meo meoVar) {
        this.a = executor;
        this.b = meoVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
