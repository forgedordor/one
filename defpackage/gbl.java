package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gbl {
    public static final void a(final ics icsVar, final ikp ikpVar, final gba gbaVar, final gbf gbfVar, final dky dkyVar, final fdau fdauVar, hml hmlVar, final int i) {
        ics icsVar2;
        int i2;
        dky dkyVar2;
        hml hmlVar2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1359693790);
        if (i3 == 0) {
            icsVar2 = icsVar;
            i2 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(ikpVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(gbaVar) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(gbfVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            dkyVar2 = dkyVar;
            i2 |= true != hmlVarC.D(dkyVar2) ? 8192 : 16384;
        } else {
            dkyVar2 = dkyVar;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 65536 : 131072;
        }
        if (hmlVarC.J((74899 & i2) != 74898, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            gvk.c(icsVar2, ikpVar, gbaVar.a(true), gbaVar.b(true), 0.0f, ((kir) gbfVar.a(true, null, hmlVarC, ((i2 >> 3) & 896) | 54).a()).a, dkyVar2, hxe.d(-97109725, new gbj(fdauVar), hmlVarC), hmlVar2, 16);
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gbi
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar3 = icsVar;
                    ikp ikpVar2 = ikpVar;
                    gba gbaVar2 = gbaVar;
                    gbf gbfVar2 = gbfVar;
                    dky dkyVar3 = dkyVar;
                    gbl.a(icsVar3, ikpVar2, gbaVar2, gbfVar2, dkyVar3, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdae fdaeVar, final ics icsVar, final boolean z, final ikp ikpVar, final gba gbaVar, final gbf gbfVar, final fdau fdauVar, hml hmlVar, final int i) {
        fdae fdaeVar2;
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(2136075085);
        if (i3 == 0) {
            fdaeVar2 = fdaeVar;
            i2 = (true != hmlVarC.F(fdaeVar2) ? 2 : 4) | i;
        } else {
            fdaeVar2 = fdaeVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(ikpVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(gbaVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.D(gbfVar) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.D(null) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.D(null) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if (hmlVarC.J((38347923 & i2) != 38347922, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(1577884014);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new ebk();
                hmwVar.af(objS);
            }
            ebk ebkVar = (ebk) objS;
            hmwVar.ab();
            int i4 = i2;
            fdae fdaeVar3 = fdaeVar2;
            gvk.e(fdaeVar3, icsVar, z, ikpVar, gbaVar.a(z), gbaVar.b(z), ((kir) gbfVar.a(z, ebkVar, hmlVarC, ((i4 >> 9) & 896) | ((i4 >> 6) & 14)).a()).a, null, ebkVar, hxe.d(-1347531112, new gbk(fdauVar), hmlVarC), hmlVarC, 64);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gbg
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar4 = fdaeVar;
                    ics icsVar2 = icsVar;
                    boolean z2 = z;
                    ikp ikpVar2 = ikpVar;
                    gba gbaVar2 = gbaVar;
                    gbf gbfVar2 = gbfVar;
                    gbl.b(fdaeVar4, icsVar2, z2, ikpVar2, gbaVar2, gbfVar2, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ics icsVar, ikp ikpVar, gba gbaVar, gbf gbfVar, dky dkyVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        final ikp ikpVar2;
        final gba gbaVar2;
        final gbf gbfVar2;
        final dky dkyVar2;
        ikp ikpVar3;
        gbf gbfVar3;
        dky dkyVar3;
        gba gbaVar3;
        hml hmlVarC = hmlVar.c(-1945643296);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.F(fdauVar) ? 65536 : 131072;
        }
        if (hmlVarC.J((74899 & i2) != 74898, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                ikp ikpVarE = gsc.e(13, hmlVarC);
                gda gdaVarA = glz.a(hmlVarC);
                gba gbaVar4 = gdaVarA.O;
                if (gbaVar4 == null) {
                    long jF = gdd.f(gdaVarA, 35);
                    long jA = gdd.a(gdaVarA, gdd.f(gdaVarA, 35));
                    long jF2 = gdd.f(gdaVarA, 35);
                    long jA2 = gdd.a(gdaVarA, gdd.f(gdaVarA, 35));
                    gba gbaVar5 = new gba(jF, jA, jF2, ijg.f(ije.d(jA2), ije.c(jA2), ije.b(jA2), 0.38f, ije.f(jA2)));
                    gdaVarA.O = gbaVar5;
                    gbaVar4 = gbaVar5;
                }
                gbf gbfVar4 = new gbf(0.0f);
                hmlVarC.v(2106932974);
                long jG = gdd.g(25, hmlVarC);
                hmw hmwVar = (hmw) hmlVarC;
                hmwVar.ab();
                boolean zC = hmlVarC.C(jG);
                Object objS = hmwVar.S();
                if (zC || objS == hmk.a) {
                    objS = dkz.a(1.0f, jG);
                    hmwVar.af(objS);
                }
                ikpVar3 = ikpVarE;
                gbfVar3 = gbfVar4;
                dkyVar3 = (dky) objS;
                gbaVar3 = gbaVar4;
            } else {
                hmlVarC.s();
                ikpVar3 = ikpVar;
                gbaVar3 = gbaVar;
                gbfVar3 = gbfVar;
                dkyVar3 = dkyVar;
            }
            hmlVarC.l();
            a(icsVar, ikpVar3, gbaVar3, gbfVar3, dkyVar3, fdauVar, hmlVarC, i2 & 458766);
            ikpVar2 = ikpVar3;
            gbaVar2 = gbaVar3;
            gbfVar2 = gbfVar3;
            dkyVar2 = dkyVar3;
        } else {
            hmlVarC.s();
            ikpVar2 = ikpVar;
            gbaVar2 = gbaVar;
            gbfVar2 = gbfVar;
            dkyVar2 = dkyVar;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gbh
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    ikp ikpVar4 = ikpVar2;
                    gba gbaVar6 = gbaVar2;
                    gbf gbfVar5 = gbfVar2;
                    dky dkyVar4 = dkyVar2;
                    gbl.c(icsVar2, ikpVar4, gbaVar6, gbfVar5, dkyVar4, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
