package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwez implements bvur {
    @Override // defpackage.bvur
    public final int a(int i) {
        return (int) ((i - ((Integer) ((cczi) bwbt.r.get()).e()).intValue()) / ((Double) ((cczi) bwbt.s.get()).e()).doubleValue());
    }

    @Override // defpackage.bvur
    public final int b() {
        return ((Integer) bwbv.b.e()).intValue();
    }

    @Override // defpackage.bvur
    public final String c() {
        return (String) bwbt.o.e();
    }

    @Override // defpackage.bvur
    public final String d() {
        return (String) bwbt.l.e();
    }

    @Override // defpackage.bvur
    public final String e() {
        return (String) bwbt.j.e();
    }

    @Override // defpackage.bvur
    public final void f(int i) {
        bwbv.l = i;
    }

    @Override // defpackage.bvur
    public final boolean g() {
        return bwbt.d();
    }

    @Override // defpackage.bvur
    public final boolean h() {
        return bwbv.g();
    }

    @Override // defpackage.bvur
    public final boolean i() {
        return bwbv.g() && ((Boolean) ((cczi) bwbv.h.get()).e()).booleanValue();
    }

    @Override // defpackage.bvur
    public final boolean j() {
        return bwbt.b() || bwbv.g();
    }

    @Override // defpackage.bvur
    public final boolean k() {
        if (bwbt.d()) {
            return true;
        }
        return ((Boolean) bwbt.p.e()).booleanValue() && bwbt.e();
    }

    @Override // defpackage.bvur
    public final boolean l() {
        return ((Boolean) bwbt.h.e()).booleanValue() && bwbt.e();
    }

    @Override // defpackage.bvur
    public final boolean m() {
        return ((Boolean) bwbt.k.e()).booleanValue() && bwbt.e();
    }

    @Override // defpackage.bvur
    public final boolean n() {
        return bwbt.e();
    }

    @Override // defpackage.bvur
    public final boolean o() {
        return ((Boolean) bwbt.A.e()).booleanValue();
    }

    @Override // defpackage.bvur
    public final boolean p() {
        return bwbt.a();
    }

    @Override // defpackage.bvur
    public final boolean q() {
        return ((Boolean) bwbt.i.e()).booleanValue() && bwbt.e();
    }

    @Override // defpackage.bvur
    public final int r(int i) {
        return Math.min(i, 8192);
    }

    @Override // defpackage.bvur
    public final int s() {
        return bwbv.a(2, false);
    }
}
