package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feaz extends febf implements feav {
    public final fdhz a;

    public feaz() {
        super(1);
        this.a = new fdhz(feba.a, fdia.a);
    }

    @Override // defpackage.feav
    public final boolean a() {
        return Math.max(this.c.c, 0) == 0;
    }

    @Override // defpackage.feav
    public final Object b(fcxy fcxyVar) {
        if (c()) {
            return fctx.a;
        }
        fdiu fdiuVarA = fdiw.a(fcym.c(fcxyVar));
        try {
            e(new feay(this, fdiuVarA));
            Object objM = fdiuVarA.m();
            fcyl fcylVar = fcyl.a;
            if (objM == fcylVar) {
                fcxyVar.getClass();
            }
            if (objM != fcylVar) {
                objM = fctx.a;
            }
            return objM != fcylVar ? fctx.a : objM;
        } catch (Throwable th) {
            fdiuVarA.E();
            throw th;
        }
    }

    @Override // defpackage.feav
    public final boolean c() {
        while (true) {
            fdhx fdhxVar = this.c;
            int i = this.b;
            int i2 = fdhxVar.c;
            if (i2 > i) {
                super.f();
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (fdhxVar.c(i2, i2 - 1)) {
                    boolean z = fdkb.a;
                    this.a.c(null);
                    return true;
                }
            }
        }
    }

    @Override // defpackage.feav
    public final void d() {
        while (a()) {
            fdhz fdhzVar = this.a;
            Object obj = fdhzVar.a;
            fdzi fdziVar = feba.a;
            if (obj != fdziVar && fdhzVar.d(obj, fdziVar)) {
                h();
                return;
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final String toString() {
        return "Mutex@" + fdkc.b(this) + "[isLocked=" + a() + ",owner=" + this.a.a + "]";
    }
}
