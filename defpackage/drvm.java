package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class drvm {
    public final Runnable a;

    public drvm(Runnable runnable) {
        this.a = runnable;
    }

    public abstract void a(Executor executor);

    public abstract void b();
}
