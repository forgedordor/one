package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diod {
    public static final void a(final dile dileVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1296353160);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dileVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djuc.d(new djue(djrr.bP, dileVar.a, dileVar.b, false, true, 32), efm.b(icsVar, 2), hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dioa
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dile dileVar2 = dileVar;
                    int i4 = i;
                    diod.a(dileVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dilf dilfVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1298869760);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dilfVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            ics icsVarA = ecs.a(icsVar, 1.0f, false);
            Uri uri = dilfVar.a;
            Uri uri2 = dilfVar.b;
            String str = dilfVar.c;
            dike dikeVar = dilfVar.d;
            hmlVar2 = hmlVarC;
            djrv.a(uri, str, icsVarA, uri2, null, null, iuz.a, null, 0.0f, null, null, null, "ImageAttachment", null, dikeVar != null ? new dilo(dikeVar) : null, null, hmlVar2, 12582912, 196608, 360304);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dinz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dilf dilfVar2 = dilfVar;
                    int i4 = i;
                    diod.b(dilfVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1517696456);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            egt.a(dkto.a(ecs.a(icsVar, 1.0f, false), new ije(ije.g), new ije(glz.a(hmlVarC).v), true), hmlVarC);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dioc
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    diod.c(icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final dilh dilhVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(636920835);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dilhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = dilhVar instanceof dilg;
            ico icoVar = ics.e;
            if (z) {
                hmlVarC.v(-2099396000);
                c(icoVar, hmlVarC, (i3 >> 3) & 14);
                ((hmw) hmlVarC).ab();
            } else if (dilhVar instanceof dilf) {
                hmlVarC.v(-2099393755);
                b((dilf) dilhVar, icoVar, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            } else {
                if (!(dilhVar instanceof dile)) {
                    hmlVarC.v(-2099397553);
                    ((hmw) hmlVarC).ab();
                    throw new fctg();
                }
                hmlVarC.v(-2099391388);
                a((dile) dilhVar, icoVar, hmlVarC, i3 & 112);
                ((hmw) hmlVarC).ab();
            }
            icsVar = icoVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: diob
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dilh dilhVar2 = dilhVar;
                    int i4 = i;
                    diod.d(dilhVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
