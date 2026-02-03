package defpackage;

import android.content.res.Resources;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwz {
    public static final void a(final cvwx cvwxVar, hml hmlVar, final int i) throws Resources.NotFoundException {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2018364944);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(cvwxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ekqh it = cvwxVar.a.iterator();
            it.getClass();
            while (it.hasNext()) {
                djvp djvpVar = (djvp) it.next();
                if (djvpVar instanceof dkeg) {
                    hmlVarC.v(-1676501132);
                    dkef.k((dkeg) djvpVar, null, jyq.y(glz.d(hmlVarC).l, 0L, kjm.c(13), null, null, null, null, 0L, null, 0, 0, 0L, null, null, 0, 16777213), null, null, null, null, null, hmlVarC, 0, 0, 2042);
                    ((hmw) hmlVarC).ab();
                } else {
                    hmlVarC.v(-1676496539);
                    djvpVar.getClass();
                    djvo.a(djvpVar, null, hmlVarC, 0, 2);
                    ((hmw) hmlVarC).ab();
                }
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: cvwy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) throws Resources.NotFoundException {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cvwz.a(cvwxVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
