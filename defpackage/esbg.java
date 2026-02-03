package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esbg implements Executor, defb {
    public final dcfm a;
    public final Queue b = new ArrayDeque();
    public int c = 0;
    private final Handler d;

    public esbg(dcfm dcfmVar) {
        this.a = dcfmVar;
        this.d = new ddmy(dcfmVar.i);
    }

    @Override // defpackage.defb
    public final void a(defn defnVar) {
        esbf esbfVar;
        Queue queue = this.b;
        synchronized (queue) {
            if (this.c == 2) {
                esbfVar = (esbf) queue.peek();
                dclh.h(esbfVar != null);
            } else {
                esbfVar = null;
            }
            this.c = 0;
        }
        if (esbfVar != null) {
            esbfVar.a();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.post(runnable);
    }
}
