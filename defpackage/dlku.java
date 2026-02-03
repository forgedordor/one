package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlku {
    public static final void a(final ics icsVar, final List list, boolean z, hml hmlVar, final int i) {
        int i2;
        hmw hmwVar;
        long j;
        float f;
        final boolean z2 = z;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(883360582);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(list) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarI = efy.i(icsVar, 0.0f, 8.0f, 1);
            hmlVarC.v(1849434622);
            hmw hmwVar2 = (hmw) hmlVarC;
            Object objS = hmwVar2.S();
            if (objS == hmk.a) {
                objS = new fdap() { // from class: dlkr
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        ((jto) obj).getClass();
                        return fctx.a;
                    }
                };
                hmwVar2.af(objS);
            }
            hmwVar2.ab();
            ics icsVarC = jsh.c(icsVarI, true, (fdap) objS);
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVarC, 0);
            int iA = dlko.a(hmg.b(hmlVarC));
            hxi hxiVarAk = hmwVar2.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarC);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar2.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            fdat fdatVar = jbb.e;
            hsk.b(hmlVarC, ixmVarA, fdatVar);
            fdat fdatVar2 = jbb.d;
            hsk.b(hmlVarC, hxiVarAk, fdatVar2);
            fdat fdatVar3 = jbb.f;
            if (hmwVar2.z || !fdbq.f(hmwVar2.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar2.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar3);
            }
            fdat fdatVar4 = jbb.c;
            hsk.b(hmlVarC, icsVarB, fdatVar4);
            ico icoVar = ics.e;
            hmlVarC.v(88871036);
            if (z2) {
                hmwVar = hmwVar2;
                j = glz.a(hmlVarC).I;
            } else {
                hmwVar = hmwVar2;
                j = ije.g;
            }
            hmwVar.ab();
            ics icsVarD = egq.d(dkl.a(icoVar, j, ikj.a), 1.0f);
            if (z2) {
                f = 10.0f;
                z2 = true;
            } else {
                z2 = false;
                f = 0.0f;
            }
            ics icsVarE = efy.e(icsVarD, 24.0f, f);
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            int iA2 = dlko.a(hmg.b(hmlVarC));
            hxi hxiVarAk2 = hmwVar.ak();
            ics icsVarB2 = icj.b(hmlVarC, icsVarE);
            hmlVarC.x();
            hmw hmwVar3 = hmwVar;
            if (hmwVar3.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVarA2, fdatVar);
            hsk.b(hmlVarC, hxiVarAk2, fdatVar2);
            if (hmwVar3.z || !fdbq.f(hmwVar3.S(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmwVar3.af(numValueOf2);
                hmlVarC.h(numValueOf2, fdatVar3);
            }
            hsk.b(hmlVarC, icsVarB2, fdatVar4);
            hmlVarC.v(1593377637);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b((dlkv) it.next(), hmlVarC, 0);
            }
            hmwVar3.ab();
            hmlVarC.n();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlks
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    List list2 = list;
                    int i4 = i;
                    dlku.a(icsVar2, list2, z2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dlkv dlkvVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2053730280);
        if (i3 == 0) {
            i2 = i | (true != hmlVarC.D(dlkvVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            ics icsVarD = egq.d(ics.e, 1.0f);
            ixm ixmVarA = egk.a(ecr.e, ibw.m, hmlVarC, 54);
            int iA = dlko.a(hmg.b(hmlVarC));
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarD);
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
            djrr djrrVar = dlkvVar.b;
            hmlVarC.v(-1059980378);
            if (djrrVar != null) {
                d(djrrVar, hmlVarC, 0);
            }
            hmwVar.ab();
            dijr.f(dlkvVar, null, null, glz.a(hmlVarC).s, jyq.y(glz.d(hmlVarC).l, 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 0, 16744447), null, 0L, null, false, null, null, null, null, hmlVarC, i2 & 14, 0, 8166);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlkq
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlku.b(dlkvVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(final dlky dlkyVar, final ics icsVar, final boolean z, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-2049216313);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dlkyVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else if (dlkyVar instanceof dlkx) {
            hmlVarC.v(462149585);
            a(icsVar, fcva.b(((dlkx) dlkyVar).a), z, hmlVarC, ((i2 >> 3) & 14) | (i2 & 896));
            ((hmw) hmlVarC).ab();
        } else {
            if (!(dlkyVar instanceof dlkw)) {
                hmlVarC.v(2093116502);
                ((hmw) hmlVarC).ab();
                throw new fctg();
            }
            hmlVarC.v(462263448);
            a(icsVar, ((dlkw) dlkyVar).a, z, hmlVarC, ((i2 >> 3) & 14) | (i2 & 896));
            ((hmw) hmlVarC).ab();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlkt
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dlky dlkyVar2 = dlkyVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dlku.c(dlkyVar2, icsVar2, z, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void d(final djrr djrrVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(281482614);
        if (i3 == 0) {
            i2 = (true != hmlVarC.B(djrrVar.ordinal()) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(null) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            dtfn.a(djrs.b(djrrVar, hmlVarC), null, egq.k(efy.j(ics.e, 0.0f, 2.0f, 4.0f, 0.0f, 9), ((kio) hmlVarC.e(jmh.e)).ee() * 12.0f), glz.a(hmlVarC).s, hmlVarC, i2 & 112, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dlkp
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    dlku.d(djrrVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
