package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpqq {
    public static final void a(final hox hoxVar, final etv etvVar, final List list, final fdae fdaeVar, hml hmlVar, final int i) {
        int i2;
        fdae fdaeVar2;
        etvVar.getClass();
        list.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-597989557);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(hoxVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(etvVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(list) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            fdaeVar2 = fdaeVar;
            i2 |= true != hmlVarC.F(fdaeVar2) ? 1024 : 2048;
        } else {
            fdaeVar2 = fdaeVar;
        }
        if ((i2 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(-1224400529);
            boolean zF = ((i2 & 112) == 32) | hmlVarC.F(list);
            boolean z = (i2 & 7168) == 2048;
            boolean z2 = (i2 & 14) == 4;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if ((z2 | zF | z) || objS == hmk.a) {
                dpqp dpqpVar = new dpqp(etvVar, list, fdaeVar2, hoxVar, null);
                hmwVar.af(dpqpVar);
                objS = dpqpVar;
            }
            hmwVar.ab();
            hob.f(etvVar, list, (fdat) objS, hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpql
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    hox hoxVar2 = hoxVar;
                    etv etvVar2 = etvVar;
                    List list2 = list;
                    dpqq.a(hoxVar2, etvVar2, list2, fdaeVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
