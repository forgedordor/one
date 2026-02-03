package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class defv extends defn {
    public final Object a = new Object();
    public final defp b = new defp();
    public boolean c;
    public volatile boolean d;
    public Exception e;
    private Object f;

    private final void A() {
        if (this.c) {
            if (!l()) {
                throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excH = h();
        }
    }

    private final void B() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }

    private final void y() {
        dclh.i(this.c, "Task is not yet complete");
    }

    private final void z() {
        if (this.d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    @Override // defpackage.defn
    public final defn a(defh defhVar) {
        q(defu.a, defhVar);
        return this;
    }

    @Override // defpackage.defn
    public final defn b(deeq deeqVar) {
        return c(defu.a, deeqVar);
    }

    @Override // defpackage.defn
    public final defn c(Executor executor, deeq deeqVar) {
        defv defvVar = new defv();
        this.b.a(new dees(executor, deeqVar, defvVar));
        B();
        return defvVar;
    }

    @Override // defpackage.defn
    public final defn d(deeq deeqVar) {
        return e(defu.a, deeqVar);
    }

    @Override // defpackage.defn
    public final defn e(Executor executor, deeq deeqVar) {
        defv defvVar = new defv();
        this.b.a(new deeu(executor, deeqVar, defvVar));
        B();
        return defvVar;
    }

    @Override // defpackage.defn
    public final defn f(defm defmVar) {
        return g(defu.a, defmVar);
    }

    @Override // defpackage.defn
    public final defn g(Executor executor, defm defmVar) {
        defv defvVar = new defv();
        this.b.a(new defj(executor, defmVar, defvVar));
        B();
        return defvVar;
    }

    @Override // defpackage.defn
    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.e;
        }
        return exc;
    }

    @Override // defpackage.defn
    public final Object i() {
        Object obj;
        synchronized (this.a) {
            y();
            z();
            Exception exc = this.e;
            if (exc != null) {
                throw new defl(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.defn
    public final Object j(Class cls) {
        Object obj;
        synchronized (this.a) {
            y();
            z();
            if (cls.isInstance(this.e)) {
                throw ((Throwable) cls.cast(this.e));
            }
            Exception exc = this.e;
            if (exc != null) {
                throw new defl(exc);
            }
            obj = this.f;
        }
        return obj;
    }

    @Override // defpackage.defn
    public final boolean k() {
        return this.d;
    }

    @Override // defpackage.defn
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.defn
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d && this.e == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.defn
    public final void n(Executor executor, deey deeyVar) {
        this.b.a(new deex(executor, deeyVar));
        B();
    }

    @Override // defpackage.defn
    public final void o(Executor executor, defb defbVar) {
        this.b.a(new defa(executor, defbVar));
        B();
    }

    @Override // defpackage.defn
    public final void p(Executor executor, defe defeVar) {
        this.b.a(new defd(executor, defeVar));
        B();
    }

    @Override // defpackage.defn
    public final void q(Executor executor, defh defhVar) {
        this.b.a(new defg(executor, defhVar));
        B();
    }

    @Override // defpackage.defn
    public final void r(deey deeyVar) {
        n(defu.a, deeyVar);
    }

    @Override // defpackage.defn
    public final void s(defb defbVar) {
        o(defu.a, defbVar);
    }

    @Override // defpackage.defn
    public final void t(defe defeVar) {
        p(defu.a, defeVar);
    }

    public final void u(Exception exc) {
        dclh.n(exc, "Exception must not be null");
        synchronized (this.a) {
            A();
            this.c = true;
            this.e = exc;
        }
        this.b.b(this);
    }

    public final void v(Object obj) {
        synchronized (this.a) {
            A();
            this.c = true;
            this.f = obj;
        }
        this.b.b(this);
    }

    public final boolean w(Object obj) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = obj;
            this.b.b(this);
            return true;
        }
    }

    public final void x() {
        synchronized (this.a) {
            if (this.c) {
                return;
            }
            this.c = true;
            this.d = true;
            this.b.b(this);
        }
    }
}
