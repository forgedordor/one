package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdon extends fdnw {
    private final int f;
    private final int g;

    public fdon(int i, int i2) {
        super(i);
        this.f = i;
        this.g = i2;
        if (i2 != 1) {
            if (i <= 0) {
                throw new IllegalArgumentException(a.e(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
            return;
        }
        int i3 = fdcj.a;
        throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + new fdbi(fdnw.class).c() + " instead");
    }

    private final Object E(Object obj) {
        fdoh fdohVarU;
        int i;
        fdon fdonVar;
        fdzi fdziVar = fdny.d;
        fdoh fdohVar = (fdoh) this.c.a;
        while (true) {
            long jB = this.a.b();
            long j = 1152921504606846975L & jB;
            boolean z = super.z(jB);
            long j2 = fdny.b;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (fdohVar.b != j3) {
                fdohVarU = super.u(j3, fdohVar);
                if (fdohVarU != null) {
                    fdonVar = this;
                    i = i2;
                } else if (z) {
                    return new fdoe(q());
                }
            } else {
                fdohVarU = fdohVar;
                i = i2;
                fdonVar = this;
            }
            Object obj2 = obj;
            int iC = super.c(fdohVarU, i, obj2, j, fdziVar, z);
            fdohVar = fdohVarU;
            if (iC == 0) {
                fdohVar.p();
                return fctx.a;
            }
            if (iC == 1) {
                return fctx.a;
            }
            if (iC == 2) {
                if (z) {
                    fdohVar.t();
                    return new fdoe(q());
                }
                v((fdohVar.b * j2) + i);
                return fctx.a;
            }
            if (iC == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iC == 4) {
                if (j < g()) {
                    fdohVar.p();
                }
                return new fdoe(q());
            }
            fdohVar.p();
            obj = obj2;
        }
    }

    @Override // defpackage.fdnw
    protected final boolean A() {
        return this.g == 2;
    }

    @Override // defpackage.fdnw, defpackage.fdow
    public final Object a(Object obj, fcxy fcxyVar) throws Throwable {
        Object objE = E(obj);
        if (!(objE instanceof fdoe)) {
            return fctx.a;
        }
        fdog.b(objE);
        throw q();
    }

    @Override // defpackage.fdnw, defpackage.fdow
    public final Object b(Object obj) {
        return E(obj);
    }
}
