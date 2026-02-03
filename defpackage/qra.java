package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qra implements qqr {
    public final hox a;
    public final hox b;
    public final hox c;
    public final hox d;
    public final hox e;
    private final hox f;
    private final hox g;
    private final hsf h;
    private final hox i;
    private final hox j;
    private final hox k;
    private final hox l;
    private final hsf m;
    private final dok n;

    public qra() {
        hsi hsiVar = hsi.a;
        this.f = new hpl(false, hsiVar);
        this.g = new hpl(1, hsiVar);
        this.a = new hpl(1, hsiVar);
        this.b = new hpl(false, hsiVar);
        this.c = new hpl(null, hsiVar);
        this.d = new hpl(Float.valueOf(1.0f), hsiVar);
        this.e = new hpl(false, hsiVar);
        fdae fdaeVar = new fdae() { // from class: qqu
            @Override // defpackage.fdae
            public final Object invoke() {
                qra qraVar = this.a;
                return Float.valueOf((qraVar.p() && qraVar.g() % 2 == 0) ? -qraVar.f() : qraVar.f());
            }
        };
        hxn hxnVar = hrp.a;
        this.h = new hnt(fdaeVar, null);
        this.i = new hpl(null, hsiVar);
        Float fValueOf = Float.valueOf(0.0f);
        this.j = new hpl(fValueOf, hsiVar);
        this.k = new hpl(fValueOf, hsiVar);
        this.l = new hpl(Long.MIN_VALUE, hsiVar);
        this.m = new hnt(new fdae() { // from class: qqv
            @Override // defpackage.fdae
            public final Object invoke() {
                qra qraVar = this.a;
                qnm qnmVarJ = qraVar.j();
                float fA = 0.0f;
                if (qnmVarJ != null) {
                    if (qraVar.f() < 0.0f) {
                        qrn qrnVarK = qraVar.k();
                        if (qrnVarK != null) {
                            fA = qrnVarK.b(qnmVarJ);
                        }
                    } else {
                        qrn qrnVarK2 = qraVar.k();
                        fA = qrnVarK2 != null ? qrnVarK2.a(qnmVarJ) : 1.0f;
                    }
                }
                return Float.valueOf(fA);
            }
        }, null);
        new hnt(new fdae() { // from class: qqw
            @Override // defpackage.fdae
            public final Object invoke() {
                qra qraVar = this.a;
                boolean z = false;
                if (qraVar.g() == qraVar.h() && qraVar.e() == qraVar.d()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, null);
        this.n = new dok();
    }

    private final float s() {
        return ((Number) this.h.a()).floatValue();
    }

    private final float t() {
        return ((Number) this.j.a()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(long j) {
        this.l.b(Long.valueOf(j));
    }

    @Override // defpackage.hsf
    public final /* bridge */ /* synthetic */ Object a() {
        return Float.valueOf(e());
    }

    @Override // defpackage.qqr
    public final Object b(qnm qnmVar, int i, int i2, boolean z, float f, qrn qrnVar, float f2, int i3, fcxy fcxyVar) {
        Object objA = this.n.a(dod.a, new qqy(this, i, i2, z, f, qrnVar, qnmVar, f2, i3, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    @Override // defpackage.qqr
    public final Object c(qnm qnmVar, float f, boolean z, fcxy fcxyVar) {
        Object objA = this.n.a(dod.a, new qqz(this, qnmVar, f, z, null), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }

    public final float d() {
        return ((Number) this.m.a()).floatValue();
    }

    @Override // defpackage.qrk
    public final float e() {
        return ((Number) this.k.a()).floatValue();
    }

    @Override // defpackage.qrk
    public final float f() {
        return ((Number) this.d.a()).floatValue();
    }

    @Override // defpackage.qrk
    public final int g() {
        return ((Number) this.g.a()).intValue();
    }

    @Override // defpackage.qrk
    public final int h() {
        return ((Number) this.a.a()).intValue();
    }

    public final long i() {
        return ((Number) this.l.a()).longValue();
    }

    @Override // defpackage.qrk
    public final qnm j() {
        return (qnm) this.i.a();
    }

    @Override // defpackage.qrk
    public final qrn k() {
        return (qrn) this.c.a();
    }

    public final void l(qnm qnmVar) {
        this.i.b(qnmVar);
    }

    public final void m(int i) {
        this.g.b(Integer.valueOf(i));
    }

    public final void n(boolean z) {
        this.f.b(Boolean.valueOf(z));
    }

    public final void o(float f) {
        qnm qnmVarJ;
        this.j.b(Float.valueOf(f));
        if (((Boolean) this.e.a()).booleanValue() && (qnmVarJ = j()) != null) {
            f -= f % (1.0f / qnmVarJ.l);
        }
        this.k.b(Float.valueOf(f));
    }

    @Override // defpackage.qrk
    public final boolean p() {
        return ((Boolean) this.b.a()).booleanValue();
    }

    public final boolean q(int i, long j) {
        qnm qnmVarJ = j();
        if (qnmVarJ == null) {
            return true;
        }
        long jI = i() == Long.MIN_VALUE ? 0L : j - i();
        u(j);
        qrn qrnVarK = k();
        float fB = qrnVarK != null ? qrnVarK.b(qnmVarJ) : 0.0f;
        qrn qrnVarK2 = k();
        float fA = qrnVarK2 != null ? qrnVarK2.a(qnmVarJ) : 1.0f;
        float fA2 = ((jI / 1000000) / qnmVarJ.a()) * s();
        float fT = s() < 0.0f ? fB - (t() + fA2) : (t() + fA2) - fA;
        if (fT < 0.0f) {
            o(fddu.e(t(), fB, fA) + fA2);
            return true;
        }
        float f = fA - fB;
        int i2 = (int) (fT / f);
        int i3 = i2 + 1;
        if (g() + i3 > i) {
            o(d());
            m(i);
            return false;
        }
        m(g() + i3);
        float f2 = fT - (i2 * f);
        o(s() < 0.0f ? fA - f2 : fB + f2);
        return true;
    }
}
