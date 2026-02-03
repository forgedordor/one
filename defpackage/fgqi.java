package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgqi extends fgmz {
    private static final long serialVersionUID = 6941492635554961361L;
    final int e;
    final fgql f;
    final fgql g;

    public fgqi(String str, int i, fgql fgqlVar, fgql fgqlVar2) {
        super(str);
        this.e = i;
        this.f = fgqlVar;
        this.g = fgqlVar2;
    }

    private final fgql n(long j) {
        long jA;
        int i = this.e;
        fgql fgqlVar = this.f;
        fgql fgqlVar2 = this.g;
        try {
            jA = fgqlVar.a(j, i, fgqlVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
            jA = j;
        }
        try {
            j = fgqlVar2.a(j, i, fgqlVar.c);
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return jA > j ? fgqlVar : fgqlVar2;
    }

    @Override // defpackage.fgmz
    public final int a(long j) {
        return this.e + n(j).c;
    }

    @Override // defpackage.fgmz
    public final int c(long j) {
        return this.e;
    }

    @Override // defpackage.fgmz
    public final long e(long j) {
        long jA;
        int i = this.e;
        fgql fgqlVar = this.f;
        fgql fgqlVar2 = this.g;
        try {
            jA = fgqlVar.a(j, i, fgqlVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
        if (j > 0 && jA < 0) {
            jA = j;
        }
        try {
            long jA2 = fgqlVar2.a(j, i, fgqlVar.c);
            if (j <= 0 || jA2 >= 0) {
                j = jA2;
            }
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        return jA > j ? j : jA;
    }

    @Override // defpackage.fgmz
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fgqi) {
            fgqi fgqiVar = (fgqi) obj;
            if (this.c.equals(fgqiVar.c) && this.e == fgqiVar.e && this.f.equals(fgqiVar.f) && this.g.equals(fgqiVar.g)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fgmz
    public final long f(long j) {
        long jB;
        int i = this.e;
        fgql fgqlVar = this.f;
        fgql fgqlVar2 = this.g;
        long j2 = j + 1;
        try {
            jB = fgqlVar.b(j2, i, fgqlVar2.c);
        } catch (ArithmeticException | IllegalArgumentException unused) {
        }
        if (j2 < 0 && jB > 0) {
            jB = j2;
        }
        try {
            long jB2 = fgqlVar2.b(j2, i, fgqlVar.c);
            if (j2 >= 0 || jB2 <= 0) {
                j2 = jB2;
            }
        } catch (ArithmeticException | IllegalArgumentException unused2) {
        }
        if (jB <= j2) {
            jB = j2;
        }
        return jB - 1;
    }

    @Override // defpackage.fgmz
    public final String g(long j) {
        return n(j).b;
    }

    @Override // defpackage.fgmz
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e), this.f, this.g});
    }

    @Override // defpackage.fgmz
    public final boolean k() {
        return false;
    }
}
