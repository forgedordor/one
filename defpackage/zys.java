package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zys {
    public static final void a(final zym zymVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1212826495);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(zymVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            egc egcVarH = efy.h(0.0f, 30.0f, 0.0f, 20.0f, 5);
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: zyn
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        eio eioVar = (eio) obj;
                        eioVar.getClass();
                        zym zymVar2 = zymVar;
                        ejk.a(eioVar, null, new hxd(-1833900852, true, new zyp(zymVar2)), 3);
                        List list = zymVar2.a;
                        eioVar.a(list.size(), null, new zyq(list), new hxd(802480018, true, new zyr(list)));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            eig.a(null, null, egcVarH, false, null, null, null, false, null, (fdap) objS, hmlVarC, 384, 507);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zyo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    zys.a(zymVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
