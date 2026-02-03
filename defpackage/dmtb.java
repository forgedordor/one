package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmtb {
    public static final void a(final List list, final ics icsVar, final float f, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(-246728506);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.F(list) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.A(f) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icsVar = ics.e;
            if (list.isEmpty()) {
                hpx hpxVarL = hmlVarC.L();
                if (hpxVarL != null) {
                    hpxVarL.d = new fdat() { // from class: dmsz
                        @Override // defpackage.fdat
                        public final Object a(Object obj, Object obj2) {
                            ((Integer) obj2).intValue();
                            List list2 = list;
                            ics icsVar2 = icsVar;
                            int i4 = i;
                            dmtb.a(list2, icsVar2, f, (hml) obj, hpy.a(i4 | 1));
                            return fctx.a;
                        }
                    };
                    return;
                }
                return;
            }
            ics icsVarA = iex.a(icsVar, evn.b(24.0f));
            long jD = ijg.d(4280427042L);
            ics icsVarD = efy.d(dkl.a(icsVarA, ijg.f(ije.d(jD), ije.c(jD), ije.b(jD), 0.86f, ije.f(jD)), ikj.a), 5.0f);
            ixm ixmVarA = egk.a(ecr.g(16.0f), ibw.n, hmlVarC, 54);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
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
            hmlVarC.v(-550148748);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dmsw.a((dmsy) it.next(), f, hmlVarC, (i3 >> 3) & 112);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL2 = hmlVarC.L();
        if (hpxVarL2 != null) {
            hpxVarL2.d = new fdat() { // from class: dmta
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    List list2 = list;
                    ics icsVar2 = icsVar;
                    int i5 = i;
                    dmtb.a(list2, icsVar2, f, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
