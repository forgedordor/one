package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mae implements mcg {
    protected final mck a = new mck();

    protected mae() {
    }

    private final int Z() {
        int iV = v();
        if (iV == 1) {
            return 0;
        }
        return iV;
    }

    private final void aa() {
        int iB = b();
        if (iB == -1) {
            ab();
        } else if (iB == aE()) {
            ac();
        } else {
            ad(iB);
        }
    }

    private final void ab() {
        r(-1, -9223372036854775807L, false);
    }

    private final void ac() {
        r(aE(), -9223372036854775807L, true);
    }

    private final void ad(int i) {
        r(i, -9223372036854775807L, false);
    }

    private final void ae(long j) {
        long jY = y() + j;
        long jZ = z();
        if (jZ != -9223372036854775807L) {
            jY = Math.min(jY, jZ);
        }
        s(Math.max(jY, 0L));
    }

    public final int a() {
        mcl mclVarH = H();
        if (mclVarH.q()) {
            return -1;
        }
        return mclVarH.j(aE(), Z(), X());
    }

    public final int b() {
        mcl mclVarH = H();
        if (mclVarH.q()) {
            return -1;
        }
        return mclVarH.k(aE(), Z(), X());
    }

    @Override // defpackage.mcg
    public final long c() {
        mcl mclVarH = H();
        if (mclVarH.q()) {
            return -9223372036854775807L;
        }
        return mclVarH.p(aE(), this.a).b();
    }

    @Override // defpackage.mcg
    public final void d() {
        Q(false);
    }

    @Override // defpackage.mcg
    public final void e() {
        Q(true);
    }

    @Override // defpackage.mcg
    public final void f() {
        ae(-B());
    }

    @Override // defpackage.mcg
    public final void g() {
        ae(C());
    }

    @Override // defpackage.mcg
    public final void h() {
        ad(aE());
    }

    @Override // defpackage.mcg
    public final void i() {
        if (H().q() || Y()) {
            ab();
            return;
        }
        if (!k()) {
            if (o() && n()) {
                ad(aE());
                return;
            } else {
                ab();
                return;
            }
        }
        int iA = a();
        if (iA == -1) {
            ab();
        } else if (iA == aE()) {
            ac();
        } else {
            ad(iA);
        }
    }

    @Override // defpackage.mcg
    public final void j() {
        if (H().q() || Y()) {
            ab();
            return;
        }
        boolean zL = l();
        if (o() && !p()) {
            if (zL) {
                aa();
                return;
            } else {
                ab();
                return;
            }
        }
        if (!zL || y() > A()) {
            s(0L);
        } else {
            aa();
        }
    }

    @Override // defpackage.mcg
    public final boolean k() {
        return a() != -1;
    }

    @Override // defpackage.mcg
    public final boolean l() {
        return b() != -1;
    }

    @Override // defpackage.mcg
    public final boolean m(int i) {
        return G().a.c(i);
    }

    @Override // defpackage.mcg
    public final boolean n() {
        mcl mclVarH = H();
        return !mclVarH.q() && mclVarH.p(aE(), this.a).i;
    }

    @Override // defpackage.mcg
    public final boolean o() {
        mcl mclVarH = H();
        return !mclVarH.q() && mclVarH.p(aE(), this.a).c();
    }

    @Override // defpackage.mcg
    public final boolean p() {
        mcl mclVarH = H();
        return !mclVarH.q() && mclVarH.p(aE(), this.a).h;
    }

    @Override // defpackage.mcg
    public final boolean q() {
        return t() == 3 && W() && u() == 0;
    }

    public abstract void r(int i, long j, boolean z);

    public final void s(long j) {
        r(aE(), j, false);
    }
}
