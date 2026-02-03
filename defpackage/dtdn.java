package defpackage;

import com.android.vcard.VCardConfig;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtdn {
    public static final void a(ics icsVar, ikp ikpVar, gba gbaVar, gbf gbfVar, dky dkyVar, final fdau fdauVar, hml hmlVar, final int i, final int i2) {
        ics icsVar2;
        int i3;
        ikp ikpVar2;
        gba gbaVar2;
        gbf gbfVar2;
        dky dkyVar2;
        ikp ikpVarB;
        gba gbaVarB;
        gbf gbfVarA;
        ics icsVar3;
        gbf gbfVar3;
        ikp ikpVar3;
        gba gbaVar3;
        hml hmlVar2;
        dky dkyVar3;
        final ics icsVar4;
        final ikp ikpVar4;
        final gba gbaVar4;
        final gbf gbfVar4;
        fdauVar.getClass();
        int i4 = i2 & 1;
        hml hmlVarC = hmlVar.c(1536405658);
        if (i4 != 0) {
            i3 = i | 6;
            icsVar2 = icsVar;
        } else if ((i & 6) == 0) {
            icsVar2 = icsVar;
            i3 = (true != hmlVarC.D(icsVar2) ? 2 : 4) | i;
        } else {
            icsVar2 = icsVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            int i5 = 16;
            if ((i2 & 2) == 0) {
                ikpVar2 = ikpVar;
                if (hmlVarC.D(ikpVar2)) {
                    i5 = 32;
                }
            } else {
                ikpVar2 = ikpVar;
            }
            i3 |= i5;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((i & 384) == 0) {
            int i6 = 128;
            if ((i2 & 4) == 0) {
                gbaVar2 = gbaVar;
                if (hmlVarC.D(gbaVar2)) {
                    i6 = 256;
                }
            } else {
                gbaVar2 = gbaVar;
            }
            i3 |= i6;
        } else {
            gbaVar2 = gbaVar;
        }
        if ((i & 3072) == 0) {
            int i7 = 1024;
            if ((i2 & 8) == 0) {
                gbfVar2 = gbfVar;
                if (hmlVarC.D(gbfVar2)) {
                    i7 = 2048;
                }
            } else {
                gbfVar2 = gbfVar;
            }
            i3 |= i7;
        } else {
            gbfVar2 = gbfVar;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
            dkyVar2 = dkyVar;
        } else {
            dkyVar2 = dkyVar;
            if ((i & 24576) == 0) {
                i3 |= true != hmlVarC.D(dkyVar2) ? 8192 : 16384;
            }
        }
        if ((196608 & i) == 0) {
            i3 |= true != hmlVarC.F(fdauVar) ? 65536 : 131072;
        }
        if ((74899 & i3) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar4 = icsVar2;
            ikpVar4 = ikpVar2;
            gbaVar4 = gbaVar2;
            gbfVar4 = gbfVar2;
        } else {
            int i9 = i2 & 8;
            int i10 = i2 & 4;
            int i11 = i2 & 2;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                ics icsVar5 = i4 != 0 ? ics.e : icsVar2;
                if (i11 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                    hmlVarC.v(-1167381787);
                    ikpVarB = dtgs.b(13, hmlVarC);
                    ((hmw) hmlVarC).ab();
                } else {
                    ikpVarB = ikpVar2;
                }
                if (i10 != 0) {
                    gbaVarB = dtdj.b(0L, 0L, hmlVarC, 15);
                    i3 &= -897;
                } else {
                    gbaVarB = gbaVar2;
                }
                if (i9 != 0) {
                    gbfVarA = dtdj.a(hmlVarC);
                    i3 &= -7169;
                } else {
                    gbfVarA = gbfVar2;
                }
                if (i8 != 0) {
                    icsVar3 = icsVar5;
                    gbfVar3 = gbfVarA;
                    ikpVar3 = ikpVarB;
                    gbaVar3 = gbaVarB;
                    hmlVar2 = hmlVarC;
                    dkyVar3 = null;
                    hmlVar2.l();
                    gbl.a(icsVar3, ikpVar3, gbaVar3, gbfVar3, dkyVar3, fdauVar, hmlVar2, i3 & 524286);
                    dkyVar2 = dkyVar3;
                    hmlVarC = hmlVar2;
                    icsVar4 = icsVar3;
                    ikpVar4 = ikpVar3;
                    gbaVar4 = gbaVar3;
                    gbfVar4 = gbfVar3;
                } else {
                    icsVar3 = icsVar5;
                    gbfVar3 = gbfVarA;
                    ikpVar3 = ikpVarB;
                    gbaVar3 = gbaVarB;
                }
            } else {
                hmlVarC.s();
                if (i11 != 0) {
                    i3 &= NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
                }
                if (i10 != 0) {
                    i3 &= -897;
                }
                if (i9 != 0) {
                    i3 &= -7169;
                }
                icsVar3 = icsVar2;
                ikpVar3 = ikpVar2;
                gbaVar3 = gbaVar2;
                gbfVar3 = gbfVar2;
            }
            hmlVar2 = hmlVarC;
            dkyVar3 = dkyVar2;
            hmlVar2.l();
            gbl.a(icsVar3, ikpVar3, gbaVar3, gbfVar3, dkyVar3, fdauVar, hmlVar2, i3 & 524286);
            dkyVar2 = dkyVar3;
            hmlVarC = hmlVar2;
            icsVar4 = icsVar3;
            ikpVar4 = ikpVar3;
            gbaVar4 = gbaVar3;
            gbfVar4 = gbfVar3;
        }
        final dky dkyVar4 = dkyVar2;
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtdm
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar6 = icsVar4;
                    ikp ikpVar5 = ikpVar4;
                    gba gbaVar5 = gbaVar4;
                    gbf gbfVar5 = gbfVar4;
                    dky dkyVar5 = dkyVar4;
                    dtdn.a(icsVar6, ikpVar5, gbaVar5, gbfVar5, dkyVar5, fdauVar, (hml) obj, hpy.a(i | 1), i2);
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final fdae fdaeVar, final ics icsVar, boolean z, final ikp ikpVar, final gba gbaVar, gbf gbfVar, final fdau fdauVar, hml hmlVar, final int i) {
        fdae fdaeVar2;
        int i2;
        ikp ikpVar2;
        fdau fdauVar2;
        boolean z2;
        gbf gbfVarA;
        hml hmlVar2;
        final boolean z3;
        final gbf gbfVar2;
        fdauVar.getClass();
        hml hmlVarC = hmlVar.c(-2043141941);
        if ((i & 6) == 0) {
            fdaeVar2 = fdaeVar;
            i2 = (true != hmlVarC.F(fdaeVar2) ? 2 : 4) | i;
        } else {
            fdaeVar2 = fdaeVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            ikpVar2 = ikpVar;
            i3 |= true != hmlVarC.D(ikpVar2) ? 1024 : 2048;
        } else {
            ikpVar2 = ikpVar;
        }
        if ((i & 24576) == 0) {
            i3 |= true != hmlVarC.D(gbaVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        int i4 = i3 | 14155776;
        if ((100663296 & i) == 0) {
            fdauVar2 = fdauVar;
            i4 |= true != hmlVarC.F(fdauVar2) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        } else {
            fdauVar2 = fdauVar;
        }
        if ((38347923 & i4) == 38347922 && hmlVarC.I()) {
            hmlVarC.s();
            z3 = z;
            gbfVar2 = gbfVar;
            hmlVar2 = hmlVarC;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                z2 = true;
                gbfVarA = dtdj.a(hmlVarC);
            } else {
                hmlVarC.s();
                z2 = z;
                gbfVarA = gbfVar;
            }
            hmlVarC.l();
            hmlVar2 = hmlVarC;
            gbl.b(fdaeVar2, icsVar, z2, ikpVar2, gbaVar, gbfVarA, fdauVar2, hmlVar2, i4 & 267976702);
            z3 = z2;
            gbfVar2 = gbfVarA;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtdk
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdae fdaeVar3 = fdaeVar;
                    ics icsVar2 = icsVar;
                    boolean z4 = z3;
                    ikp ikpVar3 = ikpVar;
                    gba gbaVar2 = gbaVar;
                    gbf gbfVar3 = gbfVar2;
                    dtdn.b(fdaeVar3, icsVar2, z4, ikpVar3, gbaVar2, gbfVar3, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final ics icsVar, ikp ikpVar, final gba gbaVar, gbf gbfVar, dky dkyVar, final fdau fdauVar, hml hmlVar, final int i) {
        int i2;
        ikp ikpVar2;
        gbf gbfVar2;
        dky dkyVar2;
        final ikp ikpVar3;
        final gbf gbfVar3;
        final dky dkyVar3;
        fdauVar.getClass();
        hml hmlVarC = hmlVar.c(488271448);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(gbaVar) ? 128 : 256;
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
        if ((74899 & i2) == 74898 && hmlVarC.I()) {
            hmlVarC.s();
            ikpVar3 = ikpVar;
            gbfVar3 = gbfVar;
            dkyVar3 = dkyVar;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                hmlVarC.v(-2063131167);
                ikp ikpVarB = dtgs.b(13, hmlVarC);
                hmw hmwVar = (hmw) hmlVarC;
                hmwVar.ab();
                hmlVarC.v(-463571699);
                gbf gbfVar4 = new gbf(0.0f);
                hmwVar.ab();
                hmlVarC.v(652558697);
                hmlVarC.v(1354274434);
                long jC = dtdu.c(25, hmlVarC);
                hmwVar.ab();
                dky dkyVarA = dkz.a(1.0f, jC);
                hmwVar.ab();
                ikpVar2 = ikpVarB;
                gbfVar2 = gbfVar4;
                dkyVar2 = dkyVarA;
            } else {
                hmlVarC.s();
                ikpVar2 = ikpVar;
                gbfVar2 = gbfVar;
                dkyVar2 = dkyVar;
            }
            hmlVarC.l();
            a(icsVar, ikpVar2, gbaVar, gbfVar2, dkyVar2, fdauVar, hmlVarC, i2 & 459662, 0);
            ikpVar3 = ikpVar2;
            gbfVar3 = gbfVar2;
            dkyVar3 = dkyVar2;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dtdl
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    ikp ikpVar4 = ikpVar3;
                    gba gbaVar2 = gbaVar;
                    gbf gbfVar5 = gbfVar3;
                    dky dkyVar4 = dkyVar3;
                    dtdn.c(icsVar2, ikpVar4, gbaVar2, gbfVar5, dkyVar4, fdauVar, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
