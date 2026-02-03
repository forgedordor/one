package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgol extends fgop {
    private static final long serialVersionUID = -485345310999208286L;
    final fgna a;
    final boolean b;
    final fgmz c;

    public fgol(fgna fgnaVar, fgmz fgmzVar) {
        super(fgnaVar.d());
        if (!fgnaVar.f()) {
            throw new IllegalArgumentException();
        }
        this.a = fgnaVar;
        this.b = fgom.O(fgnaVar);
        this.c = fgmzVar;
    }

    private final int g(long j) {
        int iB = this.c.b(j);
        long j2 = iB;
        if (((j - j2) ^ j) >= 0 || (j ^ j2) >= 0) {
            return iB;
        }
        throw new ArithmeticException("Subtracting time zone offset caused overflow");
    }

    private final int h(long j) {
        int iA = this.c.a(j);
        long j2 = iA;
        if (((j + j2) ^ j) >= 0 || (j ^ j2) < 0) {
            return iA;
        }
        throw new ArithmeticException("Adding time zone offset caused overflow");
    }

    @Override // defpackage.fgna
    public final long a(long j, int i) {
        int iH = h(j);
        boolean z = this.b;
        long jA = this.a.a(j + iH, i);
        if (!z) {
            iH = g(jA);
        }
        return jA - iH;
    }

    @Override // defpackage.fgna
    public final long b(long j, long j2) {
        int iH = h(j);
        boolean z = this.b;
        long jB = this.a.b(j + iH, j2);
        if (!z) {
            iH = g(jB);
        }
        return jB - iH;
    }

    @Override // defpackage.fgna
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.fgna
    public final boolean e() {
        return this.b ? this.a.e() : this.a.e() && this.c.k();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgol) {
            fgol fgolVar = (fgol) obj;
            if (this.a.equals(fgolVar.a) && this.c.equals(fgolVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        fgmz fgmzVar = this.c;
        return fgmzVar.hashCode() ^ this.a.hashCode();
    }
}
