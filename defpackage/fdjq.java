package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdjq extends fcxs implements fcya {
    public static final fdjp l = new fdjp();

    public fdjq() {
        super(fcya.k);
    }

    public abstract void a(fcyh fcyhVar, Runnable runnable);

    @Override // defpackage.fcya
    public final fcxy e(fcxy fcxyVar) {
        return new fdye(this, fcxyVar);
    }

    public boolean ey(fcyh fcyhVar) {
        return true;
    }

    @Override // defpackage.fcya
    public final void f(fcxy fcxyVar) {
        fdhz fdhzVar = ((fdye) fcxyVar).f;
        while (fdhzVar.a == fdyf.b) {
        }
        Object obj = fdhzVar.a;
        fdiu fdiuVar = obj instanceof fdiu ? (fdiu) obj : null;
        if (fdiuVar != null) {
            fdiuVar.z();
        }
    }

    @Override // defpackage.fcxs, defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        fcygVar.getClass();
        if (!(fcygVar instanceof fcxt)) {
            if (fcya.k == fcygVar) {
                return this;
            }
            return null;
        }
        fcxt fcxtVar = (fcxt) fcygVar;
        if (!fcxtVar.b(getKey())) {
            return null;
        }
        E e = (E) fcxtVar.a(this);
        if (e instanceof fcyf) {
            return e;
        }
        return null;
    }

    public void h(fcyh fcyhVar, Runnable runnable) {
        fdyf.b(this, fcyhVar, runnable);
    }

    public fdjq i(int i) {
        fdys.a(i);
        return new fdyr(this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (defpackage.fcya.k == r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        return defpackage.fcyi.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r2.a(r1) != null) goto L11;
     */
    @Override // defpackage.fcxs, defpackage.fcyh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fcyh minusKey(defpackage.fcyg<?> r2) {
        /*
            r1 = this;
            r2.getClass()
            boolean r0 = r2 instanceof defpackage.fcxt
            if (r0 == 0) goto L1a
            fcxt r2 = (defpackage.fcxt) r2
            fcyg r0 = r1.getKey()
            boolean r0 = r2.b(r0)
            if (r0 == 0) goto L21
            fcyf r2 = r2.a(r1)
            if (r2 == 0) goto L21
            goto L1e
        L1a:
            fcxz r0 = defpackage.fcya.k
            if (r0 != r2) goto L21
        L1e:
            fcyi r2 = defpackage.fcyi.a
            return r2
        L21:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdjq.minusKey(fcyg):fcyh");
    }

    public String toString() {
        return fdkc.a(this) + "@" + fdkc.b(this);
    }
}
