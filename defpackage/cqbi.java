package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class cqbi {
    private final Executor a;

    public cqbi(Executor executor) {
        this.a = executor;
    }

    public final void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
