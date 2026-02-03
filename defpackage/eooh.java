package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eooh extends eoqs implements Runnable {
    ListenableFuture a;
    Class b;
    Object c;

    public eooh(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.a = listenableFuture;
        this.b = cls;
        this.c = obj;
    }

    public static ListenableFuture f(ListenableFuture listenableFuture, Class cls, ejvr ejvrVar, Executor executor) {
        eoog eoogVar = new eoog(listenableFuture, cls, ejvrVar);
        listenableFuture.b(eoogVar, eosj.c(executor, eoogVar));
        return eoogVar;
    }

    public static ListenableFuture g(ListenableFuture listenableFuture, Class cls, eooz eoozVar, Executor executor) {
        eoof eoofVar = new eoof(listenableFuture, cls, eoozVar);
        listenableFuture.b(eoofVar, eosj.c(executor, eoofVar));
        return eoofVar;
    }

    public abstract Object d(Object obj, Throwable th);

    public abstract void e(Object obj);

    @Override // defpackage.eooi
    protected final String gu() {
        ListenableFuture listenableFuture = this.a;
        Class cls = this.b;
        Object obj = this.c;
        String strGu = super.gu();
        String strB = listenableFuture != null ? a.b(listenableFuture, "inputFuture=[", "], ") : "";
        if (cls == null || obj == null) {
            if (strGu != null) {
                return strB.concat(strGu);
            }
            return null;
        }
        return strB + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // defpackage.eooi
    protected final void gv() {
        m(this.a);
        this.a = null;
        this.b = null;
        this.c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.a;
        Class cls = this.b;
        Object obj = this.c;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.a = null;
        try {
            th = listenableFuture instanceof eotf ? ((eotf) listenableFuture).j() : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + String.valueOf(listenableFuture.getClass()) + " threw " + String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        Object objQ = th == null ? eork.q(listenableFuture) : null;
        if (th == null) {
            set(objQ);
            return;
        }
        if (!cls.isInstance(th)) {
            o(listenableFuture);
            return;
        }
        try {
            Object objD = d(obj, th);
            this.b = null;
            this.c = null;
            e(objD);
        } catch (Throwable th2) {
            try {
                eosk.b(th2);
                setException(th2);
            } finally {
                this.b = null;
                this.c = null;
            }
        }
    }
}
