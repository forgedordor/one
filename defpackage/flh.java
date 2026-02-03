package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class flh {
    public static final ihu a = new ihu(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    public static final long a(flg flgVar, long j, fik fikVar) {
        ivy ivyVar;
        ivy ivyVarK;
        int i;
        float fE;
        fii fiiVarE = flgVar.e(fikVar);
        if (fiiVarE == null || (ivyVar = flgVar.g) == null || (ivyVarK = fiiVarE.k()) == null || (i = fikVar.a) > fiiVarE.e()) {
            return 9205357640488583168L;
        }
        ihs ihsVar = (ihs) flgVar.i.a();
        ihsVar.getClass();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ivyVarK.h(ivyVar, ihsVar.a) >> 32));
        long jG = fiiVarE.g(i);
        if (jyo.i(jG)) {
            fE = fiiVarE.c(i);
        } else {
            float fC = fiiVarE.c(jyo.e(jG));
            float fD = fiiVarE.d(jyo.a(jG) - 1);
            fE = fddu.e(fIntBitsToFloat, Math.min(fC, fD), Math.max(fC, fD));
        }
        if (fE == -1.0f) {
            return 9205357640488583168L;
        }
        if (!kjg.e(j, 0L) && Math.abs(fIntBitsToFloat - fE) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        if (fiiVarE.a(i) != -1.0f) {
            return ivyVar.h(ivyVarK, (Float.floatToRawIntBits(fE) << 32) | (4294967295L & Float.floatToRawIntBits(r9)));
        }
        return 9205357640488583168L;
    }

    public static final ihu b(ivy ivyVar) {
        ihu ihuVarF = ivz.f(ivyVar);
        long jN = ivyVar.n(ihuVarF.c());
        float f = ihuVarF.d;
        float f2 = ihuVarF.e;
        long j = jN >> 32;
        long jN2 = ivyVar.n((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
        return new ihu(Float.intBitsToFloat((int) j), Float.intBitsToFloat((int) (jN & 4294967295L)), Float.intBitsToFloat((int) (jN2 >> 32)), Float.intBitsToFloat((int) (jN2 & 4294967295L)));
    }

    public static final boolean c(ihu ihuVar, long j) {
        float f = ihuVar.b;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > ihuVar.d) {
            return false;
        }
        float f2 = ihuVar.c;
        float f3 = ihuVar.e;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f2 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f3;
    }
}
