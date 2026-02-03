package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoqg implements Executor {
    public static final eoqg a;
    private static final /* synthetic */ eoqg[] b;

    static {
        eoqg eoqgVar = new eoqg();
        a = eoqgVar;
        b = new eoqg[]{eoqgVar};
    }

    private eoqg() {
    }

    public static eoqg[] values() {
        return (eoqg[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
