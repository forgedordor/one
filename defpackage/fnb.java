package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fnb {
    public static final boolean a(fmx fmxVar, boolean z) {
        ivy ivyVarE;
        faj fajVar = fmxVar.d;
        if (fajVar == null || (ivyVarE = fajVar.e()) == null) {
            return false;
        }
        return flh.c(flh.b(ivyVarE), fmxVar.a(z));
    }

    public static final void b(final boolean z, final int i, final fmx fmxVar, hml hmlVar, final int i2) {
        int i3;
        fda fdaVarD;
        jyi jyiVar;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1344558920);
        if (i4 == 0) {
            i3 = (true != hmlVarC.E(z) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.F(fmxVar) ? 128 : 256;
        }
        if (hmlVarC.J((i3 & 147) != 146, i3 & 1)) {
            boolean z2 = (i3 & 14) == 4;
            boolean zD = hmlVarC.D(fmxVar) | z2;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fmj(fmxVar, z);
                hmwVar.af(objS);
            }
            fbh fbhVar = (fbh) objS;
            boolean zF = hmlVarC.F(fmxVar) | z2;
            Object objS2 = hmwVar.S();
            if (zF || objS2 == hmk.a) {
                objS2 = new fmz(fmxVar, z);
                hmwVar.af(objS2);
            }
            fih fihVar = (fih) objS2;
            boolean zJ = jyo.j(fmxVar.f().c);
            int iE = z ? jyo.e(fmxVar.f().c) : jyo.a(fmxVar.f().c);
            faj fajVar = fmxVar.d;
            float fA = 0.0f;
            if (fajVar != null && (fdaVarD = fajVar.d()) != null && (jyiVar = fdaVarD.a) != null) {
                fA = fcz.a(jyiVar, iE);
            }
            float f = fA;
            ico icoVar = ics.e;
            boolean zF2 = hmlVarC.F(fbhVar);
            Object objS3 = hmwVar.S();
            if (zF2 || objS3 == hmk.a) {
                objS3 = new fna(fbhVar);
                hmwVar.af(objS3);
            }
            fhv.d(fihVar, z, i, zJ, 0L, f, itf.a(icoVar, fbhVar, (PointerInputEventHandler) objS3), hmlVarC, (i3 << 3) & 1008);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fmy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    boolean z3 = z;
                    int i5 = i;
                    int i6 = i2;
                    fnb.b(z3, i5, fmxVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
