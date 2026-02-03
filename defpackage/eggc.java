package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class eggc implements Executor {
    public final /* synthetic */ eggg a;
    public final /* synthetic */ Executor b;

    public /* synthetic */ eggc(eggg egggVar, Executor executor) {
        this.a = egggVar;
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        final Executor executor = this.b;
        this.a.b.execute(new Runnable() { // from class: egge
            @Override // java.lang.Runnable
            public final void run() {
                executor.execute(runnable);
            }
        });
    }
}
