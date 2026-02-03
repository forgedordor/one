package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eoqp extends AtomicReference implements Executor, Runnable {
    eoqr a;
    Executor b;
    Runnable c;
    Thread d;

    public eoqp(Executor executor, eoqr eoqrVar) {
        super(eoqo.NOT_RUN);
        this.b = executor;
        this.a = eoqrVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == eoqo.CANCELLED) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            eoqr eoqrVar = this.a;
            eoqrVar.getClass();
            eoqq eoqqVar = eoqrVar.a;
            if (eoqqVar.a == this.d) {
                this.a = null;
                ejwl.l(eoqqVar.b == null);
                eoqqVar.b = runnable;
                Executor executor = this.b;
                executor.getClass();
                eoqqVar.c = executor;
                this.b = null;
            } else {
                Executor executor2 = this.b;
                executor2.getClass();
                this.b = null;
                this.c = runnable;
                executor2.execute(this);
            }
        } finally {
            this.d = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.d) {
            Runnable runnable = this.c;
            runnable.getClass();
            this.c = null;
            runnable.run();
            return;
        }
        eoqq eoqqVar = new eoqq();
        eoqqVar.a = threadCurrentThread;
        eoqr eoqrVar = this.a;
        eoqrVar.getClass();
        eoqrVar.a = eoqqVar;
        this.a = null;
        try {
            Runnable runnable2 = this.c;
            runnable2.getClass();
            this.c = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = eoqqVar.b;
                if (runnable3 == null || (executor = eoqqVar.c) == null) {
                    break;
                }
                eoqqVar.b = null;
                eoqqVar.c = null;
                executor.execute(runnable3);
            }
        } finally {
            eoqqVar.a = null;
        }
    }
}
