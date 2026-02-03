package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djuo {
    public static final void a(final Integer num, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        fdauVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1455696825);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(num) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVarC);
            long j = (jB >>> 32) ^ jB;
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            edf edfVar = edf.a;
            hmlVarC.v(1110588378);
            if (num != null) {
                ics icsVarB2 = edfVar.b(icoVar);
                hmlVarC.v(5004770);
                int i5 = i2 & 14;
                Object objS = hmwVar.S();
                if (i5 == 4 || objS == hmk.a) {
                    objS = new fdap() { // from class: djum
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj) {
                            Context context = (Context) obj;
                            context.getClass();
                            View view = new View(context);
                            view.setId(num.intValue());
                            return view;
                        }
                    };
                    hmwVar.af(objS);
                }
                hmwVar.ab();
                kli.b((fdap) objS, icsVarB2, null, hmlVarC, 0, 4);
            }
            hmwVar.ab();
            fdauVar.a(edfVar, hmlVarC, Integer.valueOf((i2 & 112) | 6));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djun
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    Integer num2 = num;
                    int i6 = i;
                    djuo.a(num2, fdauVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
