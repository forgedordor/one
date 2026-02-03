package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpa extends fgop {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long a;

    public fgpa(fgnc fgncVar, long j) {
        super(fgncVar);
        this.a = j;
    }

    @Override // defpackage.fgna
    public final long a(long j, int i) {
        return fgot.b(j, i * this.a);
    }

    @Override // defpackage.fgna
    public final long b(long j, long j2) {
        long j3 = this.a;
        if (j2 != 1) {
            long j4 = 0;
            if (j2 != 0) {
                j4 = j2 * j3;
                if (j4 / j3 != j2) {
                    throw new ArithmeticException(a.F(j3, j2, "Multiplication overflows a long: ", " * "));
                }
            }
            j3 = j4;
        }
        return fgot.b(j, j3);
    }

    @Override // defpackage.fgna
    public final long c() {
        return this.a;
    }

    @Override // defpackage.fgna
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgpa) {
            fgpa fgpaVar = (fgpa) obj;
            if (this.d == fgpaVar.d && this.a == fgpaVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.a) + this.d.hashCode();
    }
}
