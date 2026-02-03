package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyp extends icr implements jcd {
    public boolean a;
    public dew b;
    public boolean c;
    public ddp d;
    public ddp e;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public ebk h;

    public gyp(ebk ebkVar, boolean z, dew dewVar) {
        this.h = ebkVar;
        this.a = z;
        this.b = dewVar;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        boolean z = false;
        if (ixkVar.a(kil.b(j)) != 0 && ixkVar.b(kil.a(j)) != 0) {
            z = true;
        }
        float fEn = ixpVar.en(this.c ? 28.0f : (z || this.a) ? 24.0f : 16.0f);
        ddp ddpVar = this.e;
        int iFloatValue = (int) (ddpVar != null ? ((Number) ddpVar.d()).floatValue() : fEn);
        final iyl iylVarE = ixkVar.e(kik.c(iFloatValue, iFloatValue));
        final float fEn2 = ixpVar.en((32.0f - ixpVar.eh(fEn)) / 2.0f);
        float fEn3 = ixpVar.en(24.0f);
        if (this.c) {
            fEn2 = this.a ? fEn3 - ixpVar.en(2.0f) : ixpVar.en(2.0f);
        } else if (this.a) {
            fEn2 = fEn3;
        }
        ddp ddpVar2 = this.e;
        if (!fdbq.e(ddpVar2 != null ? (Float) ddpVar2.c() : null, fEn)) {
            fdil.d(E(), null, null, new gyl(this, fEn, null), 3);
        }
        ddp ddpVar3 = this.d;
        if (!fdbq.e(ddpVar3 != null ? (Float) ddpVar3.c() : null, fEn2)) {
            fdil.d(E(), null, null, new gym(this, fEn2, null), 3);
        }
        if (Float.isNaN(this.g) && Float.isNaN(this.f)) {
            this.g = fEn;
            this.f = fEn2;
        }
        return ixpVar.ej(iFloatValue, iFloatValue, fcvp.a, new fdap() { // from class: gyk
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                iyk iykVar = (iyk) obj;
                ddp ddpVar4 = this.d;
                iyk.A(iykVar, iylVarE, (int) (ddpVar4 != null ? ((Number) ddpVar4.d()).floatValue() : fEn2), 0);
                return fctx.a;
            }
        });
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.icr
    public final void dU() {
        fdil.d(E(), null, null, new gyo(this, null), 3);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int e(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.a(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int f(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.b(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int g(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.c(this, ivuVar, ivtVar, i);
    }

    @Override // defpackage.jcd
    public final /* synthetic */ int h(ivu ivuVar, ivt ivtVar, int i) {
        return jcc.d(this, ivuVar, ivtVar, i);
    }
}
