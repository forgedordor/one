package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drkq implements Executor {
    static final drkq a = new drkq();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        drjz.a();
        runnable.run();
    }
}
