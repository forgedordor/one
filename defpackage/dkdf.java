package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkdf {
    public static final void a(final djrr djrrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1505284584);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfn.a(djrs.b(djrrVar, hmlVarC), null, null, 0L, hmlVarC, 0, 12);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkda
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkdf.a(djrrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dkdh dkdhVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(758838255);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkdhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            hmlVarC.v(1849434622);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            hmwVar.ab();
            icsVar2 = icsVar;
            ics icsVarC = dli.c(icsVar2, (ebk) objS, grb.a(false, 0.0f, 0L, 7), false, null, null, dkdhVar.e, 28);
            djrr djrrVar = dkdhVar.b;
            hmlVarC.v(-900867024);
            hwv hwvVarD = djrrVar == null ? null : hxe.d(-1398916670, new dkdb(djrrVar), hmlVarC);
            hmwVar.ab();
            hmlVarC.v(-900861622);
            hmwVar.ab();
            dtfr.a(hxe.d(-165155631, new dkdc(dkdhVar), hmlVarC), icsVarC, null, null, hwvVarD, hxe.d(372065900, new dkde(dkdhVar), hmlVarC), dtfp.a(ije.g, hmlVarC, 510), hmlVarC, 196614, 388);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkcy
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkdh dkdhVar2 = dkdhVar;
                    int i4 = i;
                    dkdf.b(dkdhVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final String str, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-784300445);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(false) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, Alert.DURATION_SHOW_INDEFINITELY, 0, null, null, hmlVar2, i2 & 14, 48, 120830);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkcz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dkdf.c(str, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
