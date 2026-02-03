package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eooq extends eoqs implements Runnable {
    ListenableFuture a;
    Object b;

    public eooq(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.a = listenableFuture;
        obj.getClass();
        this.b = obj;
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, ejvr ejvrVar, Executor executor) {
        eoop eoopVar = new eoop(listenableFuture, ejvrVar);
        listenableFuture.b(eoopVar, eosj.c(executor, eoopVar));
        return eoopVar;
    }

    public static ListenableFuture g(ListenableFuture listenableFuture, eooz eoozVar, Executor executor) {
        eooo eoooVar = new eooo(listenableFuture, eoozVar);
        listenableFuture.b(eoooVar, eosj.c(executor, eoooVar));
        return eoooVar;
    }

    public abstract Object d(Object obj, Object obj2);

    public abstract void e(Object obj);

    @Override // defpackage.eooi
    protected final String gu() {
        ListenableFuture listenableFuture = this.a;
        Object obj = this.b;
        String strGu = super.gu();
        String strB = listenableFuture != null ? a.b(listenableFuture, "inputFuture=[", "], ") : "";
        if (obj == null) {
            if (strGu != null) {
                return strB.concat(strGu);
            }
            return null;
        }
        return strB + "function=[" + obj.toString() + "]";
    }

    @Override // defpackage.eooi
    protected final void gv() {
        m(this.a);
        this.a = null;
        this.b = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.a;
        Object obj = this.b;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.a = null;
        if (listenableFuture.isCancelled()) {
            o(listenableFuture);
            return;
        }
        try {
            try {
                Object objD = d(obj, eork.q(listenableFuture));
                this.b = null;
                e(objD);
            } catch (Throwable th) {
                try {
                    eosk.b(th);
                    setException(th);
                } finally {
                    this.b = null;
                }
            }
        } catch (Error e) {
            setException(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            setException(e2.getCause());
        } catch (Exception e3) {
            setException(e3);
        }
    }
}
