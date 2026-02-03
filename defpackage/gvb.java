package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvb {
    public static final void a(final fdat fdatVar, fdat fdatVar2, fdat fdatVar3, jyq jyqVar, final long j, long j2, hml hmlVar, final int i) {
        int i2;
        fdat fdatVar4;
        jyq jyqVar2;
        fdat fdatVar5;
        long j3;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-931325388);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(fdatVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar3) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.D(jyqVar) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.C(j) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 65536 : 131072;
        }
        if (hmlVarC.J((74899 & i2) != 74898, i2 & 1)) {
            ico icoVar = ics.e;
            ics icsVarJ = efy.j(icoVar, 16.0f, 0.0f, fdatVar3 == null ? 8.0f : 0.0f, 0.0f, 10);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new gus();
                hmwVar.af(objS);
            }
            ixm ixmVar = (ixm) objS;
            int iA = hmg.a(hmlVarC);
            int i4 = i2;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarJ);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar6 = jbb.e;
            hsk.b(hmlVarC, ixmVar, fdatVar6);
            fdat fdatVar7 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar7);
            fdat fdatVar8 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar8);
            }
            fdat fdatVar9 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar9);
            ics icsVarI = efy.i(iwa.a(icoVar, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), 0.0f, 6.0f, 1);
            iby ibyVar = ibw.a;
            ixm ixmVarA = ecz.a(ibyVar, false);
            int iA2 = hmg.a(hmlVarC);
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarI);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, fdatVar6);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar7);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar8);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar9);
            fdatVar.a(hmlVarC, Integer.valueOf(i4 & 14));
            hmlVarC.n();
            if (fdatVar2 != null) {
                hmlVarC.v(-1014168080);
                ics icsVarA = iwa.a(icoVar, GroupManagementRequest.ACTION_TAG);
                ixm ixmVarA2 = ecz.a(ibyVar, false);
                int iA3 = hmg.a(hmlVarC);
                hxi hxiVarAk3 = hmwVar.ak();
                ics icsVarB3 = icj.b(hmlVarC, icsVarA);
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA2, fdatVar6);
                hsk.b(hmlVarC, hxiVarAk3, fdatVar7);
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA3))) {
                    Integer numValueOf3 = Integer.valueOf(iA3);
                    hmwVar.af(numValueOf3);
                    hmlVarC.h(numValueOf3, fdatVar8);
                }
                hsk.b(hmlVarC, icsVarB3, fdatVar9);
                jyqVar2 = jyqVar;
                fdatVar4 = fdatVar2;
                hnj.b(new hpu[]{gea.a.c(new ije(j)), gyj.a.c(jyqVar2)}, fdatVar4, hmlVarC, (i4 & 112) | 8);
                hmlVarC.n();
                hmwVar.ab();
            } else {
                fdatVar4 = fdatVar2;
                jyqVar2 = jyqVar;
                hmlVarC.v(-1013853833);
                hmwVar.ab();
            }
            if (fdatVar3 != null) {
                hmlVarC.v(-1013805504);
                ics icsVarA2 = iwa.a(icoVar, "dismissAction");
                ixm ixmVarA3 = ecz.a(ibyVar, false);
                int iA4 = hmg.a(hmlVarC);
                hxi hxiVarAk4 = hmwVar.ak();
                ics icsVarB4 = icj.b(hmlVarC, icsVarA2);
                hmlVarC.x();
                if (hmwVar.z) {
                    hmlVarC.j(fdaeVar);
                } else {
                    hmlVarC.z();
                }
                hsk.b(hmlVarC, ixmVarA3, fdatVar6);
                hsk.b(hmlVarC, hxiVarAk4, fdatVar7);
                if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA4))) {
                    Integer numValueOf4 = Integer.valueOf(iA4);
                    hmwVar.af(numValueOf4);
                    hmlVarC.h(numValueOf4, fdatVar8);
                }
                hsk.b(hmlVarC, icsVarB4, fdatVar9);
                j3 = j2;
                fdatVar5 = fdatVar3;
                hnj.a(gea.a.c(new ije(j3)), fdatVar5, hmlVarC, ((i4 >> 3) & 112) | 8);
                hmlVarC.n();
                hmwVar.ab();
            } else {
                fdatVar5 = fdatVar3;
                j3 = j2;
                hmlVarC.v(-1013537385);
                hmwVar.ab();
            }
            hmlVarC.n();
        } else {
            fdatVar4 = fdatVar2;
            jyqVar2 = jyqVar;
            fdatVar5 = fdatVar3;
            j3 = j2;
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            final long j4 = j3;
            final fdat fdatVar10 = fdatVar5;
            final jyq jyqVar3 = jyqVar2;
            final fdat fdatVar11 = fdatVar4;
            hpxVarL.d = new fdat() { // from class: guo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    fdat fdatVar12 = fdatVar;
                    fdat fdatVar13 = fdatVar11;
                    fdat fdatVar14 = fdatVar10;
                    jyq jyqVar4 = jyqVar3;
                    long j5 = j;
                    gvb.a(fdatVar12, fdatVar13, fdatVar14, jyqVar4, j5, j4, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final ics icsVar, final fdat fdatVar, final fdat fdatVar2, final ikp ikpVar, final long j, final long j2, final long j3, final long j4, final fdat fdatVar3, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1218779924);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.E(false) ? 1024 : 2048;
        }
        if ((i & 24576) == 0) {
            i2 |= true != hmlVarC.D(ikpVar) ? 8192 : 16384;
        }
        if ((196608 & i) == 0) {
            i2 |= true != hmlVarC.C(j) ? 65536 : 131072;
        }
        if ((1572864 & i) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 524288 : 1048576;
        }
        if ((12582912 & i) == 0) {
            i2 |= true != hmlVarC.C(j3) ? 4194304 : VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        }
        if ((100663296 & i) == 0) {
            i2 |= true != hmlVarC.C(j4) ? VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING : VCardConfig.FLAG_APPEND_TYPE_PARAM;
        }
        if ((805306368 & i) == 0) {
            i2 |= true != hmlVarC.F(fdatVar3) ? VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES : 536870912;
        }
        if (hmlVarC.J((306783379 & i2) != 306783378, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            gvk.c(icsVar, ikpVar, j, j2, 0.0f, 6.0f, null, hxe.d(-1343524879, new guu(fdatVar, fdatVar3, fdatVar2, j3, j4), hmlVarC), hmlVarC, 80);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: guq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    fdat fdatVar4 = fdatVar;
                    fdat fdatVar5 = fdatVar2;
                    ikp ikpVar2 = ikpVar;
                    long j5 = j;
                    long j6 = j2;
                    long j7 = j3;
                    long j8 = j4;
                    int i4 = i;
                    gvb.b(icsVar2, fdatVar4, fdatVar5, ikpVar2, j5, j6, j7, j8, fdatVar3, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final guk gukVar, ics icsVar, ikp ikpVar, long j, long j2, long j3, long j4, long j5, hml hmlVar, final int i) {
        int i2;
        hml hmlVar2;
        final ics icsVar2;
        final ikp ikpVar2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        ics icsVar3;
        long jG;
        long j11;
        long j12;
        long jG2;
        long jG3;
        ikp ikpVar3;
        hwv hwvVar;
        hml hmlVarC = hmlVar.c(274621471);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(gukVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 432;
        if ((i & 3072) == 0) {
            i3 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i3 |= 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        }
        if (hmlVarC.J((38347923 & i3) != 38347922, i3 & 1)) {
            int i4 = (-268434433) & i3;
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar3 = ics.e;
                ikp ikpVarE = gsc.e(5, hmlVarC);
                long jG4 = gdd.g(6, hmlVarC);
                long jG5 = gdd.g(4, hmlVarC);
                jG = gdd.g(5, hmlVarC);
                j11 = jG4;
                j12 = jG5;
                jG2 = gdd.g(5, hmlVarC);
                jG3 = gdd.g(4, hmlVarC);
                ikpVar3 = ikpVarE;
            } else {
                hmlVarC.s();
                icsVar3 = icsVar;
                ikpVar3 = ikpVar;
                j11 = j;
                j12 = j2;
                jG = j3;
                jG2 = j4;
                jG3 = j5;
            }
            hmlVarC.l();
            gul gulVar = gukVar.b;
            String str = gulVar.b;
            hwv hwvVarD = null;
            if (str != null) {
                hmlVarC.v(-663816012);
                hwv hwvVarD2 = hxe.d(-1378313599, new guy(jG, gukVar, str), hmlVarC);
                ((hmw) hmlVarC).ab();
                hwvVar = hwvVarD2;
            } else {
                hmlVarC.v(-663518009);
                ((hmw) hmlVarC).ab();
                hwvVar = null;
            }
            if (gulVar.c) {
                hmlVarC.v(-663365675);
                hwvVarD = hxe.d(-1812633777, new gva(gukVar), hmlVarC);
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(-662976377);
                ((hmw) hmlVarC).ab();
            }
            hmlVar2 = hmlVarC;
            b(efy.d(icsVar3, 12.0f), hwvVar, hwvVarD, ikpVar3, j11, j12, jG2, jG3, hxe.d(-1266389126, new guv(gukVar), hmlVarC), hmlVar2, ((i4 << 3) & 7168) | 805306368);
            icsVar2 = icsVar3;
            j8 = jG;
            ikpVar2 = ikpVar3;
            j6 = j11;
            j7 = j12;
            j9 = jG2;
            j10 = jG3;
        } else {
            hmlVar2 = hmlVarC;
            hmlVar2.s();
            icsVar2 = icsVar;
            ikpVar2 = ikpVar;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        hpx hpxVarL = hmlVar2.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: gup
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    guk gukVar2 = gukVar;
                    ics icsVar4 = icsVar2;
                    ikp ikpVar4 = ikpVar2;
                    long j13 = j6;
                    long j14 = j7;
                    long j15 = j8;
                    long j16 = j9;
                    int i5 = i;
                    gvb.c(gukVar2, icsVar4, ikpVar4, j13, j14, j15, j16, j10, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
