package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ffr {
    public static final int a(jvc jvcVar, long j, jou jouVar) {
        float fA = jouVar != null ? jouVar.a() : 0.0f;
        int i = (int) (4294967295L & j);
        int iG = jvcVar.g(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) >= jvcVar.c(iG) - fA && Float.intBitsToFloat(i) <= jvcVar.a(iG) + fA) {
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) >= (-fA)) {
                if (Float.intBitsToFloat(i2) <= jvcVar.d + fA) {
                    return iG;
                }
            }
        }
        return -1;
    }

    public static final int b(faj fajVar, long j, jou jouVar) {
        jyi jyiVar;
        ivy ivyVarE;
        long jM;
        jvc jvcVar;
        int iA;
        fda fdaVarD = fajVar.d();
        if (fdaVarD == null || (jyiVar = fdaVarD.a) == null || (ivyVarE = fajVar.e()) == null || (iA = a((jvcVar = jyiVar.b), (jM = ivyVarE.m(j)), jouVar)) == -1) {
            return -1;
        }
        return jvcVar.h(ihs.j(jM, (jvcVar.c(iA) + jvcVar.a(iA)) / 2.0f, 1));
    }

    public static final long c(faj fajVar, ihu ihuVar, int i, jyf jyfVar) {
        jyi jyiVar;
        fda fdaVarD = fajVar.d();
        jvc jvcVar = null;
        if (fdaVarD != null && (jyiVar = fdaVarD.a) != null) {
            jvcVar = jyiVar.b;
        }
        ivy ivyVarE = fajVar.e();
        return (jvcVar == null || ivyVarE == null) ? jyo.a : jvcVar.i(ihuVar.f(ivyVarE.m(0L)), i, jyfVar);
    }

    public static final long d(faj fajVar, ihu ihuVar, ihu ihuVar2, int i, jyf jyfVar) {
        long jC = c(fajVar, ihuVar, i, jyfVar);
        if (jyo.i(jC)) {
            return jyo.a;
        }
        long jC2 = c(fajVar, ihuVar2, i, jyfVar);
        if (jyo.i(jC2)) {
            return jyo.a;
        }
        return jyp.a(Math.min(jyo.e(jC), jyo.e(jC)), Math.max(jyo.a(jC2), jyo.a(jC2)));
    }

    public static final long e(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final boolean f(jyi jyiVar, int i) {
        int iH = jyiVar.h(i);
        return (i == jyiVar.j(iH) || i == jyiVar.g(iH, false)) ? jyiVar.u(i) != jyiVar.t(i) : jyiVar.t(i) != jyiVar.t(i + (-1));
    }

    public static final boolean g(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean h(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean i(int i) {
        int type;
        return (!h(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }
}
