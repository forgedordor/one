package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qmf implements Executor {
    final /* synthetic */ qmg a;

    public qmf(qmg qmgVar) {
        this.a = qmgVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.c.post(runnable);
    }
}
