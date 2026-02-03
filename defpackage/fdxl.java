package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdxl implements ListenableFuture {
    private final fdlr a;
    private final SettableFuture b = SettableFuture.create();
    private boolean c;

    public fdxl(fdlr fdlrVar) {
        this.a = fdlrVar;
    }

    private static final void d(Object obj) throws Throwable {
        if (obj instanceof fdxk) {
            throw new CancellationException().initCause(((fdxk) obj).a);
        }
    }

    public final void a(Object obj) {
        this.b.set(obj);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void b(Runnable runnable, Executor executor) {
        this.b.b(runnable, executor);
    }

    public final void c(Throwable th) {
        if (th instanceof CancellationException) {
            this.b.set(new fdxk((CancellationException) th));
        } else if (this.b.setException(th)) {
            this.c = true;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (!this.b.cancel(z)) {
            return false;
        }
        this.a.t(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws Throwable {
        Object objQ = this.b.q();
        d(objQ);
        return objQ;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        SettableFuture settableFuture = this.b;
        if (settableFuture.isCancelled()) {
            return true;
        }
        if (!isDone() || this.c) {
            return false;
        }
        try {
        } catch (CancellationException unused) {
            return true;
        } catch (ExecutionException unused2) {
            this.c = true;
        }
        return eote.a(settableFuture) instanceof fdxk;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isDone()) {
            try {
                Object objA = eote.a(this.b);
                if (objA instanceof fdxk) {
                    sb.append("CANCELLED, cause=[" + ((fdxk) objA).a + "]");
                } else {
                    sb.append(a.h(objA, "SUCCESS, result=[", "]"));
                }
            } catch (CancellationException unused) {
                sb.append("CANCELLED");
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[" + e.getCause() + "]");
            } catch (Throwable th) {
                sb.append("UNKNOWN, cause=[" + th.getClass() + " thrown from get()]");
            }
        } else {
            sb.append("PENDING, delegate=[" + this.b + "]");
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws Throwable {
        Object objR = this.b.r(j, timeUnit);
        d(objR);
        return objR;
    }
}
