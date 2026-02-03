package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdye extends fdkn implements fcyw, fcxy {
    public final fdjq a;
    public final fcxy b;
    public Object c;
    public final Object d;
    public final fdhz f;

    public fdye(fdjq fdjqVar, fcxy fcxyVar) {
        super(-1);
        this.a = fdjqVar;
        this.b = fcxyVar;
        this.c = fdyf.a;
        this.d = fdzp.a(u());
        this.f = new fdhz(null, fdia.a);
    }

    public final void c(fcyh fcyhVar, Object obj) {
        this.c = obj;
        this.e = 1;
        this.a.h(fcyhVar, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fcxy, fcyw] */
    @Override // defpackage.fcyw
    public final fcyw dJ() {
        return this.b;
    }

    @Override // defpackage.fdkn
    public final Object p() {
        Object obj = this.c;
        boolean z = fdkb.a;
        this.c = fdyf.a;
        return obj;
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.a + ", " + fdkc.c(this.b) + "]";
    }

    @Override // defpackage.fcxy
    public final fcyh u() {
        return this.b.u();
    }

    @Override // defpackage.fcxy
    public final void w(Object obj) {
        Object objB = fdji.b(obj);
        fdjq fdjqVar = this.a;
        if (fdyf.c(fdjqVar, u())) {
            this.c = objB;
            this.e = 0;
            fdyf.b(fdjqVar, u(), this);
            return;
        }
        boolean z = fdkb.a;
        ThreadLocal threadLocal = fdmw.a;
        fdkw fdkwVarA = fdmw.a();
        if (fdkwVarA.q()) {
            this.c = objB;
            this.e = 0;
            fdkwVarA.o(this);
            return;
        }
        fdkwVarA.p(true);
        try {
            fcyh fcyhVarU = u();
            Object objB2 = fdzp.b(fcyhVarU, this.d);
            try {
                this.b.w(obj);
                while (fdkwVarA.s()) {
                }
            } finally {
                fdzp.c(fcyhVarU, objB2);
            }
        } catch (Throwable th) {
            try {
                K(th);
            } finally {
                fdkwVarA.n(true);
            }
        }
    }

    @Override // defpackage.fcyw
    public final void dK() {
    }

    @Override // defpackage.fdkn
    public final fcxy t() {
        return this;
    }
}
