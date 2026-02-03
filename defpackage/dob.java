package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dob extends icr implements jcd, jbp, ift {
    public int c;
    public final hox e;
    public final hox f;
    public final hox g;
    public final ddp h;
    private fdlr i;
    private ini j;
    private final hsf k;
    public int a = Alert.DURATION_SHOW_INDEFINITELY;
    public int b = 1200;
    public float d = 30.0f;
    private final hri l = new hph(0);
    private final hri m = new hph(0);

    public dob(int i, doc docVar) {
        this.c = i;
        hsi hsiVar = hsi.a;
        this.e = new hpl(false, hsiVar);
        this.f = new hpl(docVar, hsiVar);
        this.g = new hpl(new dns(), hsiVar);
        this.h = ddq.a(0.0f);
        fdae fdaeVar = new fdae() { // from class: dnw
            @Override // defpackage.fdae
            public final Object invoke() {
                dob dobVar = this.a;
                jbg.g(dobVar);
                dobVar.j();
                return Integer.valueOf(fdcu.b(dobVar.i() * 0.33333334f));
            }
        };
        hxn hxnVar = hrp.a;
        this.k = new hnt(fdaeVar, null);
    }

    public final float a() {
        float fSignum = Math.signum(this.d);
        int iOrdinal = jbg.h(this).ordinal();
        int i = 1;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new fctg();
            }
            i = -1;
        }
        return fSignum * i;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        final iyl iylVarE = ixkVar.e(kil.m(j, 0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13));
        this.m.i(kim.c(j, iylVarE.a));
        this.l.i(iylVarE.a);
        return ixpVar.ej(i(), iylVarE.b, fcvp.a, new fdap() { // from class: dnv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                dob dobVar = this;
                iyk.D(iykVar, iylVarE, fdcu.b((-((Number) dobVar.h.d()).floatValue()) * dobVar.a()), 0, null, 12);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.icr
    public final void dU() {
        ini iniVar = this.j;
        iie iieVarK = jbg.k(this);
        if (iniVar != null) {
            iieVarK.b(iniVar);
        }
        this.j = iieVarK.a();
        l();
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        return ivtVar.a(Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        return ivtVar.b(i);
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        return ivtVar.c(Alert.DURATION_SHOW_INDEFINITELY);
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        return 0;
    }

    public final int i() {
        return this.m.c();
    }

    public final int j() {
        return this.l.c();
    }

    public final int k() {
        return ((Number) this.k.a()).intValue();
    }

    public final void l() {
        fdlr fdlrVar = this.i;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        if (this.C) {
            this.i = fdil.d(E(), null, null, new dnx(fdlrVar, this, null), 3);
        }
    }

    @Override // defpackage.ift
    public final void n(igx igxVar) {
        this.e.b(Boolean.valueOf(igxVar.a()));
    }

    @Override // defpackage.jbp
    public final void r(final imw imwVar) {
        ddp ddpVar = this.h;
        float fFloatValue = ((Number) ddpVar.d()).floatValue() * a();
        boolean z = a() != 1.0f ? ((Number) ddpVar.d()).floatValue() < ((float) i()) : ((Number) ddpVar.d()).floatValue() < ((float) j());
        boolean z2 = a() != 1.0f ? ((Number) ddpVar.d()).floatValue() > ((float) k()) : ((Number) ddpVar.d()).floatValue() > ((float) ((j() + k()) - i()));
        int iJ = a() == 1.0f ? j() + k() : (-j()) - k();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (imwVar.b() & 4294967295L));
        ini iniVar = this.j;
        if (iniVar != null) {
            imwVar.s(iniVar, (j() << 32) | (fdcu.b(fIntBitsToFloat) & 4294967295L), new fdap() { // from class: dnu
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    imwVar.p();
                    return fctx.a;
                }
            });
        }
        float fI = fFloatValue + i();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & imwVar.b()));
        imt imtVarT = imwVar.t();
        long jA = imtVarT.a();
        imtVarT.b().l();
        try {
            imtVarT.c.b(fFloatValue, 0.0f, fI, fIntBitsToFloat2, 1);
            ini iniVar2 = this.j;
            float f = iJ;
            if (iniVar2 != null) {
                if (z) {
                    inm.a(imwVar, iniVar2);
                }
                if (z2) {
                    imwVar.t().c.e(f, 0.0f);
                    try {
                        inm.a(imwVar, iniVar2);
                        imwVar.t().c.e(-f, 0.0f);
                    } finally {
                    }
                }
            } else {
                if (z) {
                    imwVar.p();
                }
                if (z2) {
                    imwVar.t().c.e(f, 0.0f);
                    try {
                        imwVar.p();
                        imwVar.t().c.e(-f, 0.0f);
                    } finally {
                    }
                }
            }
        } finally {
            imtVarT.b().j();
            imtVarT.h(jA);
        }
    }

    @Override // defpackage.icr
    public final void s() {
        fdlr fdlrVar = this.i;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.i = null;
        ini iniVar = this.j;
        if (iniVar != null) {
            jbg.k(this).b(iniVar);
            this.j = null;
        }
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}
