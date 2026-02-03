package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgfz implements Executor {
    private final Executor a;

    public fgfz(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        fgfy fgfyVar = new fgfy(runnable, Thread.currentThread());
        this.a.execute(fgfyVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = fgfyVar.b;
        if (inlineExecutionProhibitedException != null) {
            throw inlineExecutionProhibitedException;
        }
        fgfyVar.a = null;
    }
}
