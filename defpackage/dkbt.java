package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbt {
    public static final void a(final dkbu dkbuVar, final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1836232411);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dkbuVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarE = dli.e(icsVar, false, null, dkbuVar.c, 15);
            String str = dkbuVar.b;
            hmlVarC.v(-612201770);
            hwv hwvVarD = str != null ? hxe.d(131627732, new dkbq(str), hmlVarC) : null;
            ((hmw) hmlVarC).ab();
            dtfr.a(hxe.d(1786014397, new dkbr(dkbuVar), hmlVarC), icsVarE, null, hwvVarD, hxe.d(1690523961, new dkbs(dkbuVar), hmlVarC), null, dtfp.a(ije.g, hmlVarC, 510), hmlVarC, 24582, 420);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkbo
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkbu dkbuVar2 = dkbuVar;
                    int i4 = i;
                    dkbt.a(dkbuVar2, icsVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dlcr dlcrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(613119596);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlcrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = dkl.a(icoVar, glz.a(hmlVarC).I, evn.a);
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            dlcq.a(dlcrVar, efy.d(icoVar, 8.0f), hmlVarC, (i2 & 14) | 48, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkbp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i5 = i;
                    dkbt.b(dlcrVar, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
