package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbob implements Executor {
    public static final fbob a;
    private static final /* synthetic */ fbob[] b;

    static {
        fbob fbobVar = new fbob();
        a = fbobVar;
        b = new fbob[]{fbobVar};
    }

    private fbob() {
    }

    public static fbob[] values() {
        return (fbob[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Context.DirectExecutor";
    }
}
