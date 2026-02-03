package defpackage;

import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqng implements ThreadFactory {
    public final dqnb a;
    private final ThreadFactory b;

    public dqng(ThreadFactory threadFactory, dqnb dqnbVar) {
        this.b = threadFactory;
        this.a = dqnbVar;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return this.b.newThread(new Runnable() { // from class: dqnf
            @Override // java.lang.Runnable
            public final void run() {
                long id = Thread.currentThread().getId();
                dqng dqngVar = this.a;
                dqngVar.a.e(id);
                try {
                    runnable.run();
                } finally {
                    dqngVar.a.d(id);
                }
            }
        });
    }
}
