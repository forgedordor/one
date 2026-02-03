package defpackage;

import android.graphics.drawable.Drawable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rth implements rtd, rti {
    private final int a;
    private final int b;
    private Object c;
    private rte d;
    private boolean e;
    private boolean f;
    private boolean g;
    private rhs h;

    public rth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private final synchronized Object i(Long l) {
        if (!isDone()) {
            rvk.i();
        }
        if (this.e) {
            throw new CancellationException();
        }
        if (this.g) {
            throw new ExecutionException(this.h);
        }
        if (!this.f) {
            if (l == null) {
                wait(0L);
            } else if (l.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    wait(jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.g) {
                throw new ExecutionException(this.h);
            }
            if (this.e) {
                throw new CancellationException();
            }
            if (!this.f) {
                throw new TimeoutException();
            }
        }
        return this.c;
    }

    @Override // defpackage.rua
    public final synchronized void a(Drawable drawable) {
    }

    @Override // defpackage.rua
    public final synchronized void b(Object obj, ruk rukVar) {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            if (isDone()) {
                return false;
            }
            this.e = true;
            notifyAll();
            rte rteVar = null;
            if (z) {
                rte rteVar2 = this.d;
                this.d = null;
                rteVar = rteVar2;
            }
            if (rteVar != null) {
                rteVar.c();
            }
            return true;
        }
    }

    @Override // defpackage.rua
    public final void d(rtz rtzVar) {
        rtzVar.g(this.a, this.b);
    }

    @Override // defpackage.rua
    public final synchronized rte eW() {
        return this.d;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return i(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.rua
    public final synchronized void h(rte rteVar) {
        this.d = rteVar;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.e;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        if (!this.e && !this.f) {
            if (!this.g) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        rte rteVar;
        String str;
        String strValueOf = String.valueOf(super.toString());
        synchronized (this) {
            rteVar = null;
            if (this.e) {
                str = "CANCELLED";
            } else if (this.g) {
                str = "FAILURE";
            } else if (this.f) {
                str = "SUCCESS";
            } else {
                str = "PENDING";
                rteVar = this.d;
            }
        }
        String strConcat = strValueOf.concat("[status=");
        if (rteVar == null) {
            return strConcat + str + "]";
        }
        return strConcat + str + ", request=[" + rteVar.toString() + "]]";
    }

    @Override // defpackage.rti
    public final synchronized boolean a(rhs rhsVar, Object obj, rua ruaVar, boolean z) {
        this.g = true;
        this.h = rhsVar;
        notifyAll();
        return false;
    }

    @Override // defpackage.rti
    public final synchronized boolean b(Object obj, Object obj2, rua ruaVar, reb rebVar, boolean z) {
        this.f = true;
        this.c = obj;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return i(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.rrx
    public final void m() {
    }

    @Override // defpackage.rrx
    public final void n() {
    }

    @Override // defpackage.rrx
    public final void o() {
    }

    @Override // defpackage.rua
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.rua
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.rua
    public final void g(rtz rtzVar) {
    }
}
