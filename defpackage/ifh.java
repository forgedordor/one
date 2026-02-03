package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifh extends icr implements jcd, jbp {
    public inz a;
    public boolean b;
    public iby c;
    public iva d;
    public float e;
    public ijf f;

    public ifh(inz inzVar, boolean z, iby ibyVar, iva ivaVar, float f, ijf ijfVar) {
        this.a = inzVar;
        this.b = z;
        this.c = ibyVar;
        this.d = ivaVar;
        this.e = f;
        this.f = ijfVar;
    }

    private final long a(long j) {
        char c;
        boolean z = kil.i(j) && kil.h(j);
        boolean z2 = kil.k(j) && kil.j(j);
        if ((!i() && z) || z2) {
            return kil.m(j, kil.b(j), 0, kil.a(j), 0, 10);
        }
        long jA = this.a.a();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(kim.c(j, k(jA) ? Math.round(Float.intBitsToFloat((int) (jA >> 32))) : kil.d(j))) << 32) | (Float.floatToRawIntBits(kim.b(j, j(jA) ? Math.round(Float.intBitsToFloat((int) (jA & 4294967295L))) : kil.c(j))) & 4294967295L);
        if (i()) {
            int i = (int) (jFloatToRawIntBits >> 32);
            float fIntBitsToFloat = !k(this.a.a()) ? Float.intBitsToFloat(i) : Float.intBitsToFloat((int) (this.a.a() >> 32));
            float fIntBitsToFloat2 = !j(this.a.a()) ? Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) : Float.intBitsToFloat((int) (this.a.a() & 4294967295L));
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat2);
            long j2 = jFloatToRawIntBits2 << 32;
            long j3 = jFloatToRawIntBits3 & 4294967295L;
            if (Float.intBitsToFloat(i) == 0.0f) {
                c = ' ';
            } else {
                c = ' ';
                if (Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) != 0.0f) {
                    long j4 = j2 | j3;
                    jFloatToRawIntBits = izb.a(j4, this.d.a(j4, jFloatToRawIntBits));
                }
            }
            jFloatToRawIntBits = 0;
        } else {
            c = ' ';
        }
        return kil.m(j, kim.c(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits >> c)))), 0, kim.b(j, Math.round(Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)))), 0, 10);
    }

    private final boolean i() {
        return this.b && this.a.a() != 9205357640488583168L;
    }

    private static final boolean j(long j) {
        return !ihz.f(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    private static final boolean k(long j) {
        return !ihz.f(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Alert.DURATION_SHOW_INDEFINITELY) < 2139095040;
    }

    @Override // defpackage.jcd
    public final ixn b(ixp ixpVar, ixk ixkVar, long j) {
        iyl iylVarE = ixkVar.e(a(j));
        return ixpVar.ej(iylVarE.a, iylVarE.b, fcvp.a, new ifg(iylVarE));
    }

    @Override // defpackage.icr
    public final boolean dN() {
        return false;
    }

    @Override // defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        if (!i()) {
            return ivtVar.a(i);
        }
        long jA = a(kim.k(0, i, 0, 13));
        return Math.max(kil.c(jA), ivtVar.a(i));
    }

    @Override // defpackage.jcd
    public final int f(ivu ivuVar, ivt ivtVar, int i) {
        if (!i()) {
            return ivtVar.b(i);
        }
        long jA = a(kim.k(0, 0, i, 7));
        return Math.max(kil.d(jA), ivtVar.b(i));
    }

    @Override // defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        if (!i()) {
            return ivtVar.c(i);
        }
        long jA = a(kim.k(0, i, 0, 13));
        return Math.max(kil.c(jA), ivtVar.c(i));
    }

    @Override // defpackage.jcd
    public final int h(ivu ivuVar, ivt ivtVar, int i) {
        if (!i()) {
            return ivtVar.d(i);
        }
        long jA = a(kim.k(0, 0, i, 7));
        return Math.max(kil.d(jA), ivtVar.d(i));
    }

    @Override // defpackage.jbp
    public final void r(imw imwVar) {
        long jA;
        long jA2 = this.a.a();
        float fIntBitsToFloat = k(jA2) ? Float.intBitsToFloat((int) (jA2 >> 32)) : Float.intBitsToFloat((int) (imwVar.b() >> 32));
        float fIntBitsToFloat2 = j(jA2) ? Float.intBitsToFloat((int) (jA2 & 4294967295L)) : Float.intBitsToFloat((int) (imwVar.b() & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L;
        if (Float.intBitsToFloat((int) (imwVar.b() >> 32)) == 0.0f || Float.intBitsToFloat((int) (imwVar.b() & 4294967295L)) == 0.0f) {
            jA = 0;
        } else {
            long j = jFloatToRawIntBits2 | jFloatToRawIntBits;
            jA = izb.a(j, this.d.a(j, imwVar.b()));
        }
        long j2 = jA;
        long jA3 = this.c.a((Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32), (Math.round(Float.intBitsToFloat((int) (imwVar.b() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (imwVar.b() & 4294967295L))) & 4294967295L), imwVar.q());
        float fA = kjb.a(jA3);
        float fB = kjb.b(jA3);
        imwVar.t().c.e(fA, fB);
        float f = -fA;
        float f2 = -fB;
        try {
            this.a.e(imwVar, j2, this.e, this.f);
            imwVar.t().c.e(f, f2);
            imwVar.p();
        } catch (Throwable th) {
            imwVar.t().c.e(f, f2);
            throw th;
        }
    }

    public final String toString() {
        return "PainterModifier(painter=" + this.a + ", sizeToIntrinsics=" + this.b + ", alignment=" + this.c + ", alpha=" + this.e + ", colorFilter=" + this.f + ')';
    }

    @Override // defpackage.jbp
    public final /* synthetic */ void t() {
    }
}
