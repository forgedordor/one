package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgpc extends fgor {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int b;

    public fgpc(fgna fgnaVar, fgnc fgncVar) {
        super(fgnaVar, fgncVar);
        this.b = 100;
    }

    @Override // defpackage.fgor, defpackage.fgna
    public final long a(long j, int i) {
        return this.a.b(j, i * 100);
    }

    @Override // defpackage.fgor, defpackage.fgna
    public final long b(long j, long j2) {
        long j3 = j2 * 100;
        if (j3 / 100 == j2) {
            return this.a.b(j, j3);
        }
        throw new ArithmeticException(a.A(j2, "Multiplication overflows a long: ", " * 100"));
    }

    @Override // defpackage.fgor, defpackage.fgna
    public final long c() {
        return this.a.c() * 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgpc) {
            fgpc fgpcVar = (fgpc) obj;
            if (this.a.equals(fgpcVar.a) && this.d == fgpcVar.d) {
                int i = fgpcVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + 100 + this.a.hashCode();
    }
}
