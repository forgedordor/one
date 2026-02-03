package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epm {
    public fdlr a;
    public deb b;

    public epm() {
        dib dibVar = diu.a;
        Float fValueOf = Float.valueOf(0.0f);
        this.b = new deb(dibVar, fValueOf, (deh) dibVar.a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public final float a() {
        return ((Number) this.b.a()).floatValue();
    }

    public final void b(float f, kio kioVar, fdjx fdjxVar) {
        if (f <= kioVar.en(1.0f)) {
            return;
        }
        hzg hzgVarA = hzf.a();
        fdap fdapVarK = hzgVarA != null ? hzgVarA.k() : null;
        hzg hzgVarB = hzf.b(hzgVarA);
        try {
            float fFloatValue = ((Number) this.b.a()).floatValue();
            fdlr fdlrVar = this.a;
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            deb debVar = this.b;
            if (debVar.d) {
                this.b = dec.c(debVar, fFloatValue - f, 0.0f, 30);
            } else {
                this.b = new deb(diu.a, Float.valueOf(-f), null, 60);
            }
            this.a = fdil.d(fdjxVar, null, null, new epl(this, null), 3);
        } finally {
            hzf.e(hzgVarA, hzgVarB, fdapVarK);
        }
    }
}
