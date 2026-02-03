package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afof {
    public static final void a(final afoc afocVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        long jF;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1602939458);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(afocVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                objS = new igr();
                hmwVar.af(objS);
            }
            igr igrVar = (igr) objS;
            hmwVar.ab();
            djgb djgbVar = (djgb) hro.a(afocVar.a, hmlVarC).a();
            ico icoVar = ics.e;
            if (z) {
                hmlVarC.v(1723309824);
                jF = glz.a(hmlVarC).F;
                hmwVar.ab();
            } else {
                hmlVarC.v(1723379605);
                long j = glz.a(hmlVarC).p;
                jF = ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.96f, ije.f(j));
                hmwVar.ab();
            }
            djdo.a(djgbVar, dkl.a(icoVar, jF, ikj.a), igrVar, hmlVarC, 384, 0);
            View view = (View) hmlVarC.e(AndroidCompositionLocals_androidKt.f);
            dpir dpirVar = (dpir) hmlVarC.e(dpjg.a);
            hmlVarC.v(-1633490746);
            boolean zF = hmlVarC.F(dpirVar) | hmlVarC.F(view);
            Object objS2 = hmwVar.S();
            if (zF || objS2 == obj) {
                objS2 = new afoe(dpirVar, view, null);
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            hob.g(igrVar, (fdat) objS2, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afod
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    afoc afocVar2 = afocVar;
                    int i4 = i;
                    afof.a(afocVar2, z, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
