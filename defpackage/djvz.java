package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djvz {
    public static final void a(final djwc djwcVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1244444239);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djwcVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            boolean z = djwcVar.d;
            hmlVarC.v(5004770);
            int i4 = i2 & 14;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 4 || objS == hmk.a) {
                objS = new fdap() { // from class: djvq
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((Boolean) obj).booleanValue();
                        djwcVar.f.invoke();
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmwVar.ab();
            dtdp.a(z, (fdap) objS, null, false, null, null, hmlVarC, 0, 60);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djvr
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    djvz.a(djwcVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final String str, final List list, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-570758912);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(str) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dijr.f(new diju(str, list, 4), null, null, ((ije) hmlVarC.e(gea.a)).i, (jyq) hmlVarC.e(gyj.a), null, 0L, null, false, null, null, null, null, hmlVar2, 0, 0, 8166);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djvt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i4 = i;
                    djvz.b(str2, list, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final String str, final int i, hml hmlVar, final int i2) {
        int i3;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1894141285);
        if (i4 == 0) {
            i3 = i2 | (true != hmlVarC.D(str) ? 2 : 4);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i3 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            hmlVar2 = hmlVarC;
        } else {
            hmlVar2 = hmlVarC;
            dthx.b(str, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, i, 0, null, null, hmlVar2, i3 & 14, ((i3 << 6) & 7168) | 48, 120830);
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djvu
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    String str2 = str;
                    int i5 = i2;
                    djvz.c(str2, i, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final djwc djwcVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1596002353);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djwcVar) ? 2 : 4) | i;
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
            ics icsVarC = dli.c(icsVar2, (ebk) objS, grb.a(false, 0.0f, 0L, 7), false, null, null, djwcVar.f, 28);
            String str = djwcVar.b;
            hmlVarC.v(454950350);
            hwv hwvVarD = str == null ? null : hxe.d(1618617770, new djvv(str, djwcVar), hmlVarC);
            hmwVar.ab();
            hmlVarC.v(454954256);
            boolean z = djwcVar.e;
            hwv hwvVarD2 = !z ? hxe.d(-824939336, new djvw(djwcVar), hmlVarC) : null;
            hmwVar.ab();
            hmlVarC.v(454958255);
            hwv hwvVarD3 = z ? hxe.d(2051863287, new djvx(djwcVar), hmlVarC) : null;
            hmwVar.ab();
            dtfr.a(hxe.d(-1409284333, new djvy(djwcVar), hmlVarC), icsVarC, null, hwvVarD, hwvVarD2, hwvVarD3, dtfp.a(ije.g, hmlVarC, 510), hmlVarC, 6, 388);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djvs
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djwc djwcVar2 = djwcVar;
                    int i4 = i;
                    djvz.d(djwcVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
