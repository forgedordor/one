package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byeq {
    public final dqsn a;
    private final fcsu b;

    public byeq(fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = fcsuVar;
        this.a = (dqsn) fcsuVar2.b();
    }

    public final eiju a(final String str, final ejxr ejxrVar) {
        eieu eieuVarK = eiiy.k("AsyncTransactionManagerImpl#executeInTransaction");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: byep
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.a.a.c(str, ejxrVar);
                }
            }, (Executor) this.b.b());
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final eiju b(final String str, final Runnable runnable) {
        eieu eieuVarK = eiiy.k("AsyncTransactionManagerImpl#executeInTransaction");
        try {
            eiju eijuVarG = eijx.g(new Callable() { // from class: byeo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.a.a.d(str, runnable);
                    return null;
                }
            }, (Executor) this.b.b());
            eieuVarK.b(eijuVarG);
            eieuVarK.close();
            return eijuVarG;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
