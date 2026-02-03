package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iel {
    public static final void a(jgg jggVar, fdap fdapVar) {
        if (fdapVar.invoke(jggVar) != jgf.a) {
            return;
        }
        jgh.d(jggVar, fdapVar);
    }

    public static final boolean b(iek iekVar, long j) {
        if (!iekVar.s.C) {
            return false;
        }
        jer jerVarW = jbg.d(iekVar).w();
        if (!jerVarW.u()) {
            return false;
        }
        long jA = ivz.a(jerVarW);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
        long j2 = iekVar.c;
        float f = ((int) (j2 >> 32)) + fIntBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + fIntBitsToFloat2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (fIntBitsToFloat <= fIntBitsToFloat3 && fIntBitsToFloat3 <= f) {
            float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
            if (fIntBitsToFloat2 <= fIntBitsToFloat4 && fIntBitsToFloat4 <= f2) {
                return true;
            }
        }
        return false;
    }

    public static final void c(iek iekVar, ief iefVar) {
        iekVar.f(iefVar);
    }
}
