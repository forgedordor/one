package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpmw {
    public static final void a(final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        fdatVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1707938378);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dpgp.a(true, null, hxe.d(825250781, new dpmv(fdatVar), hmlVarC), hmlVarC, 390, 2);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpml
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dpmw.a(fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1672319336);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? hmlVarC.D(null) : hmlVarC.F(null)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(781117143);
            ((hmw) hmlVarC).ab();
            fdatVar.a(hmlVarC, Integer.valueOf((i2 >> 3) & 14));
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpmj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dpmw.b(fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dpmg dpmgVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1741601735);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dpmgVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(null) ? 16 : 32;
        }
        if (((i2 | 384) & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            cye.b(dpmgVar != null, null, null, null, null, hxe.d(1414963183, new dpmu(dpmgVar), hmlVarC), hmlVarC, 196608, 30);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dpmk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    dpmw.c(dpmgVar, (hml) obj, hpy.a(i3 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
