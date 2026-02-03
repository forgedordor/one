package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dten {
    public static final void a(final fdae fdaeVar, final fdat fdatVar, final ics icsVar, final fdat fdatVar2, ikp ikpVar, float f, geq geqVar, knl knlVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        ikp ikpVar2;
        geq geqVarA;
        knl knlVar2;
        float f2;
        hml hmlVar2;
        final ikp ikpVar3;
        final float f3;
        final geq geqVar2;
        final knl knlVar3;
        fdatVar.getClass();
        fdauVar.getClass();
        hml hmlVarC = hmlVar.c(1124347902);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(fdaeVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        int i3 = i2 | 12582912;
        if ((100663296 & i) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((38347923 & i3) == 38347922 && hmlVarC.I()) {
            hmlVarC.s();
            ikpVar3 = ikpVar;
            f3 = f;
            geqVar2 = geqVar;
            knlVar3 = knlVar;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                hmlVarC.v(155797517);
                ikp ikpVarB = dtgs.b(2, hmlVarC);
                ((hmw) hmlVarC).ab();
                ikpVar2 = ikpVarB;
                geqVarA = dtel.a(hmlVarC);
                knlVar2 = new knl(false, 3);
                f2 = 6.0f;
            } else {
                hmlVarC.s();
                ikpVar2 = ikpVar;
                f2 = f;
                geqVarA = geqVar;
                knlVar2 = knlVar;
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            gfb.a(fdaeVar, fdatVar, icsVar, fdatVar2, ikpVar2, f2, geqVarA, knlVar2, fdauVar, hmlVar2, i3 & 264249342);
            ikpVar3 = ikpVar2;
            f3 = f2;
            geqVar2 = geqVarA;
            knlVar3 = knlVar2;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtem
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar2 = fdaeVar;
                    fdat fdatVar3 = fdatVar;
                    ics icsVar2 = icsVar;
                    fdat fdatVar4 = fdatVar2;
                    ikp ikpVar4 = ikpVar3;
                    float f4 = f3;
                    geq geqVar3 = geqVar2;
                    knl knlVar4 = knlVar3;
                    dten.a(fdaeVar2, fdatVar3, icsVar2, fdatVar4, ikpVar4, f4, geqVar3, knlVar4, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
