package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nne {
    public final nmy a;
    protected final nnd b;
    protected nna c;
    private final int d;

    protected nne(nnb nnbVar, nnd nndVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = nndVar;
        this.d = i;
        this.a = new nmy(nnbVar, j, j2, j3, j4, j5);
    }

    protected static final int e(nns nnsVar, long j, non nonVar) {
        if (j == ((nni) nnsVar).b) {
            return 0;
        }
        nonVar.a = j;
        return 1;
    }

    protected static final boolean f(nns nnsVar, long j) {
        long j2 = j - ((nni) nnsVar).b;
        if (j2 < 0 || j2 > 262144) {
            return false;
        }
        nnsVar.l((int) j2);
        return true;
    }

    public final int a(nns nnsVar, non nonVar) {
        while (true) {
            nna nnaVar = this.c;
            mee.g(nnaVar);
            long j = nnaVar.e;
            long j2 = nnaVar.f - j;
            int i = this.d;
            long j3 = nnaVar.g;
            if (j2 <= i) {
                d();
                return e(nnsVar, j, nonVar);
            }
            if (!f(nnsVar, j3)) {
                return e(nnsVar, j3, nonVar);
            }
            nnsVar.k();
            nnc nncVarA = this.b.a(nnsVar, nnaVar.b);
            int i2 = nncVarA.b;
            if (i2 == -3) {
                d();
                return e(nnsVar, j3, nonVar);
            }
            if (i2 == -2) {
                long j4 = nncVarA.c;
                long j5 = nncVarA.d;
                nnaVar.c = j4;
                nnaVar.e = j5;
                nnaVar.b();
            } else {
                if (i2 != -1) {
                    long j6 = nncVarA.d;
                    f(nnsVar, j6);
                    d();
                    return e(nnsVar, j6, nonVar);
                }
                long j7 = nncVarA.c;
                long j8 = nncVarA.d;
                nnaVar.d = j7;
                nnaVar.f = j8;
                nnaVar.b();
            }
        }
    }

    public final void b(long j) {
        nna nnaVar = this.c;
        if (nnaVar == null || nnaVar.a != j) {
            nmy nmyVar = this.a;
            this.c = new nna(j, nmyVar.a.a(j), nmyVar.b, nmyVar.c, nmyVar.d, nmyVar.e);
        }
    }

    public final boolean c() {
        return this.c != null;
    }

    protected final void d() {
        this.c = null;
        this.b.b();
    }
}
