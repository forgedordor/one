package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kom implements Executor {
    public static final kom a;
    private static final /* synthetic */ kom[] b;

    static {
        kom komVar = new kom();
        a = komVar;
        b = new kom[]{komVar};
    }

    private kom() {
    }

    public static kom[] values() {
        return (kom[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
