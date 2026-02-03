package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djii {
    public static final void a(final djcy djcyVar, final djfn djfnVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1826242253);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(djfnVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            djfm.a(djfnVar, hmlVarC, (i2 >> 3) & 14);
            ibx ibxVar = ibw.k;
            ico icoVar = ics.e;
            ixm ixmVarA = edl.a(ecr.c, ibxVar, hmlVarC, 48);
            int iA = djid.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            djcv djcvVar = djcyVar.a;
            hmlVarC.v(-457016962);
            djgx djgxVar = djcvVar.g;
            if (djgxVar != null) {
                egt.a(egq.e(icoVar, 8.0f), hmlVarC);
                djco.b(djgxVar, 0, hmlVarC, 0, 2);
            }
            hmwVar.ab();
            djes.c(djcyVar.d, false, false, null, hmlVarC, 0, 14);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djif
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar2 = djcyVar;
                    int i4 = i;
                    djii.a(djcyVar2, djfnVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final djcy djcyVar, final djfn djfnVar, final int i, final float f, final ics icsVar, final igr igrVar, final djga djgaVar, hml hmlVar, final int i2) {
        int i3;
        icsVar.getClass();
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(-1581516938);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(djcyVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(djfnVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.B(i + (-1)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.A(f) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != hmlVarC.D(icsVar) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            i3 |= true != hmlVarC.D(igrVar) ? 65536 : 131072;
        }
        if ((1572864 & i2) == 0) {
            i3 |= true != hmlVarC.D(djgaVar) ? 524288 : 1048576;
        }
        int i5 = i3;
        if ((599187 & i5) == 599186 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarI = efy.i(icsVar, 0.0f, 8.0f, 1);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA = djid.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarI);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            icc iccVar = ibw.o;
            ico icoVar = ics.e;
            ixm ixmVarA2 = egk.a(ecr.a, iccVar, hmlVarC, 48);
            int iA2 = djid.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icoVar);
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            egt.a(egq.o(icoVar, 8.0f), hmlVarC);
            int i6 = i5 >> 3;
            djaw.b(djcyVar.c, i, f, false, hxe.d(-1229251129, new djih(djcyVar, i, f, igrVar, djgaVar, djfnVar), hmlVarC), hmlVarC, (i6 & 112) | 24576 | (i6 & 896), 8);
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djie
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djcy djcyVar2 = djcyVar;
                    djfn djfnVar2 = djfnVar;
                    int i7 = i;
                    float f2 = f;
                    ics icsVar2 = icsVar;
                    igr igrVar2 = igrVar;
                    djii.b(djcyVar2, djfnVar2, i7, f2, icsVar2, igrVar2, djgaVar, (hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
