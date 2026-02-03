package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgnz extends fgov {
    private final fgnt a;

    public fgnz(fgnt fgntVar) {
        super(fgmu.k, 31556952000L);
        this.a = fgntVar;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int a(long j) {
        return this.a.X(j);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final int c() {
        return 292278993;
    }

    @Override // defpackage.fgms
    public final int d() {
        return -292275054;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long e(long j, int i) {
        return i == 0 ? j : h(j, a(j) + i);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long g(long j) {
        fgnt fgntVar = this.a;
        long jG = fgntVar.l.g(j);
        return fgntVar.U(jG) > 1 ? jG - ((r0 - 1) * 604800000) : jG;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final long h(long j, int i) {
        fgot.c(this, Math.abs(i), -292275054, 292278993);
        int iA = a(j);
        if (iA == i) {
            return j;
        }
        fgnt fgntVar = this.a;
        int iO = fgntVar.O(j);
        int iW = fgntVar.W(iA);
        int iW2 = fgntVar.W(i);
        if (iW2 < iW) {
            iW = iW2;
        }
        int iU = fgntVar.U(j);
        if (iU <= iW) {
            iW = iU;
        }
        long jAe = fgntVar.ae(j, i);
        int iA2 = a(jAe);
        if (iA2 < i) {
            jAe += 604800000;
        } else if (iA2 > i) {
            jAe -= 604800000;
        }
        return fgntVar.j.h(jAe + ((iW - fgntVar.U(jAe)) * 604800000), iO);
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final fgna r() {
        return this.a.d;
    }

    @Override // defpackage.fgms
    public final fgna s() {
        return null;
    }

    @Override // defpackage.fgoo, defpackage.fgms
    public final boolean t(long j) {
        fgnt fgntVar = this.a;
        return fgntVar.W(fgntVar.X(j)) > 52;
    }

    @Override // defpackage.fgov
    public final long x(long j, long j2) {
        return e(j, fgot.a(j2));
    }

    @Override // defpackage.fgms
    public final void v() {
    }
}
