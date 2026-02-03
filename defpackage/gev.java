package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gev {
    public static final gev a = new gev();
    public static final fddq b = new fddq(1900, 2100);

    private gev() {
    }

    public final void a(final Long l, final int i, final gfd gfdVar, final ics icsVar, final long j, hml hmlVar, final int i2) {
        int i3;
        gev gevVar;
        hml hmlVar2;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1913724796);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(l) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? hmlVarC.D(gfdVar) : hmlVarC.F(gfdVar)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.C(j) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            gevVar = this;
            i3 |= true != hmlVarC.D(gevVar) ? 65536 : 131072;
        } else {
            gevVar = this;
        }
        if (hmlVarC.J((74899 & i3) != 74898, i3 & 1)) {
            hmlVarC.t();
            if ((i2 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            Locale localeA = gay.a(hmlVarC);
            String strA = gfdVar.a(l, localeA, false);
            String strA2 = gfdVar.a(l, localeA, true);
            String strB = "";
            if (strA2 == null) {
                hmlVarC.v(380183947);
                if (giy.a(i, 0)) {
                    hmlVarC.v(843549807);
                    strA2 = hjw.b(R.string.m3c_date_picker_no_selection_description, hmlVarC);
                    ((hmw) hmlVarC).ab();
                } else if (giy.a(i, 1)) {
                    hmlVarC.v(843552778);
                    strA2 = hjw.b(R.string.m3c_date_input_no_input_description, hmlVarC);
                    ((hmw) hmlVarC).ab();
                } else {
                    hmlVarC.v(380405378);
                    ((hmw) hmlVarC).ab();
                    strA2 = "";
                }
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(843542225);
                ((hmw) hmlVarC).ab();
            }
            if (strA == null) {
                hmlVarC.v(380505603);
                if (giy.a(i, 0)) {
                    hmlVarC.v(843560193);
                    strA = hjw.b(R.string.m3c_date_picker_headline, hmlVarC);
                    ((hmw) hmlVarC).ab();
                } else if (giy.a(i, 1)) {
                    hmlVarC.v(843562720);
                    strA = hjw.b(R.string.m3c_date_input_headline, hmlVarC);
                    ((hmw) hmlVarC).ab();
                } else {
                    hmlVarC.v(380703970);
                    ((hmw) hmlVarC).ab();
                    strA = "";
                }
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(843557344);
                ((hmw) hmlVarC).ab();
            }
            if (giy.a(i, 0)) {
                hmlVarC.v(843570380);
                strB = hjw.b(R.string.m3c_date_picker_headline_description, hmlVarC);
                ((hmw) hmlVarC).ab();
            } else if (giy.a(i, 1)) {
                hmlVarC.v(843573259);
                strB = hjw.b(R.string.m3c_date_input_headline_description, hmlVarC);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(381041250);
                ((hmw) hmlVarC).ab();
            }
            final String str = String.format(strB, Arrays.copyOf(new Object[]{strA2}, 1));
            str.getClass();
            boolean zD = hmlVarC.D(str);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new fdap() { // from class: ger
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        jto jtoVar = (jto) obj;
                        gev gevVar2 = gev.a;
                        jtk.n(jtoVar, 0);
                        jtk.k(jtoVar, str);
                        return fctx.a;
                    }
                };
                hmwVar.af(objS);
            }
            hmlVar2 = hmlVarC;
            gyj.c(strA, jsh.c(icsVar, false, (fdap) objS), j, 0L, null, null, 0L, null, 0L, 0, false, 1, 0, null, null, hmlVar2, (i3 >> 6) & 896, 24576, 245752);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            final gev gevVar2 = gevVar;
            hpxVarL.d = new fdat() { // from class: ges
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gev gevVar3 = this.a;
                    Long l2 = l;
                    int i5 = i;
                    gfd gfdVar2 = gfdVar;
                    ics icsVar2 = icsVar;
                    gevVar3.a(l2, i5, gfdVar2, icsVar2, j, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public final void b(final int i, final ics icsVar, final long j, hml hmlVar, final int i2) {
        int i3;
        gev gevVar;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-390880814);
        if (i4 == 0) {
            i3 = (true != hmlVarC.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.C(j) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            gevVar = this;
            i3 |= true != hmlVarC.D(gevVar) ? 1024 : 2048;
        } else {
            gevVar = this;
        }
        if (hmlVarC.J((i3 & 1171) != 1170, i3 & 1)) {
            hmlVarC.t();
            if ((i2 & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            if (giy.a(i, 0)) {
                hmlVarC.v(-1974299197);
                gyj.c(hjw.b(R.string.m3c_date_picker_title, hmlVarC), icsVar, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVarC, i3 & 1008, 0, 262136);
                ((hmw) hmlVarC).ab();
            } else if (giy.a(i, 1)) {
                hmlVarC.v(-1974291934);
                gyj.c(hjw.b(R.string.m3c_date_input_title, hmlVarC), icsVar, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hmlVarC, i3 & 1008, 0, 262136);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-1073328752);
                ((hmw) hmlVarC).ab();
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final gev gevVar2 = gevVar;
            hpxVarL.d = new fdat() { // from class: get
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gev gevVar3 = this.a;
                    int i5 = i;
                    ics icsVar2 = icsVar;
                    gevVar3.b(i5, icsVar2, j, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
