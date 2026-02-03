package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zzw {
    public static final void a(final zzo zzoVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1960437657);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(zzoVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            Object obj = hmk.a;
            if (objS == obj) {
                hpl hplVar = new hpl(Integer.valueOf(zzoVar.b), hsi.a);
                hmwVar.af(hplVar);
                objS = hplVar;
            }
            final hox hoxVar = (hox) objS;
            hmwVar.ab();
            egc egcVarH = efy.h(0.0f, 26.0f, 0.0f, 24.0f, 5);
            hmlVarC.v(-1746271574);
            boolean zE = hmlVarC.E(false) | ((i2 & 14) == 4);
            Object objS2 = hmwVar.S();
            if (zE || objS2 == obj) {
                objS2 = new fdap() { // from class: zzp
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj2) {
                        eio eioVar = (eio) obj2;
                        eioVar.getClass();
                        zzo zzoVar2 = zzoVar;
                        String str = zzoVar2.c;
                        if (str != null) {
                            ejk.a(eioVar, null, new hxd(-1526219694, true, new zzr(str)), 3);
                        }
                        String str2 = zzoVar2.d;
                        if (str2 != null) {
                            ejk.a(eioVar, null, new hxd(-1564310533, true, new zzs(str2)), 3);
                        }
                        hox hoxVar2 = hoxVar;
                        List list = zzoVar2.a;
                        eioVar.a(list.size(), null, new zzu(list), new hxd(2039820996, true, new zzv(list, hoxVar2)));
                        return fctx.a;
                    }
                };
                hmwVar.af(objS2);
            }
            hmwVar.ab();
            eig.a(null, null, egcVarH, false, null, null, null, false, null, (fdap) objS2, hmlVarC, 384, 507);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zzq
                @Override // defpackage.fdat
                public final Object a(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int i4 = i;
                    zzw.a(zzoVar, (hml) obj2, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
