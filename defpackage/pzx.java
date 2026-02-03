package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzx implements Executor {
    public static final pzx a;
    private static final /* synthetic */ pzx[] b;

    static {
        pzx pzxVar = new pzx();
        a = pzxVar;
        pzx[] pzxVarArr = {pzxVar};
        b = pzxVarArr;
        fczb.a(pzxVarArr);
    }

    private pzx() {
    }

    public static pzx[] values() {
        return (pzx[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
