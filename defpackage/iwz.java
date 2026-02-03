package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwz extends iyk {
    private final jde a;

    public iwz(jde jdeVar) {
        this.a = jdeVar;
    }

    @Override // defpackage.iyk
    public final int a() {
        return this.a.w();
    }

    @Override // defpackage.iyk
    public final ivy b() {
        jde jdeVar = this.a;
        ivy ivyVarJ = jdeVar.l ? null : jdeVar.J();
        if (ivyVarJ == null) {
            jdeVar.L().w.f();
        }
        return ivyVarJ;
    }

    @Override // defpackage.iyk, defpackage.kio
    public final float ed() {
        return this.a.ed();
    }

    @Override // defpackage.iyk, defpackage.kiy
    public final float ee() {
        return this.a.ee();
    }

    @Override // defpackage.iyk
    public final kji p() {
        return this.a.q();
    }

    @Override // defpackage.iyk
    public final float q(iyw iywVar) {
        int iE;
        fdat fdatVar = iywVar.a;
        if (fdatVar != null) {
            return ((Number) fdatVar.a(this, Float.valueOf(Float.NaN))).floatValue();
        }
        jde jdeVar = this.a;
        if (jdeVar.l) {
            return Float.NaN;
        }
        jde jdeVar2 = jdeVar;
        while (true) {
            jfx jfxVar = jdeVar2.n;
            float f = (jfxVar == null || (iE = fcur.E(jfxVar.b, iywVar)) < 0) ? Float.NaN : jfxVar.c[iE];
            if (!Float.isNaN(f)) {
                jdeVar2.P(jdeVar.L(), iywVar);
                return iywVar.a(f, jdeVar2.J(), jdeVar.J());
            }
            jde jdeVarO = jdeVar2.O();
            if (jdeVarO == null) {
                jdeVar2.P(jdeVar.L(), iywVar);
                return Float.NaN;
            }
            jdeVar2 = jdeVarO;
        }
    }
}
