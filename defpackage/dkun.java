package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkun {
    public static final void a(final dkur dkurVar, ics icsVar, dpn dpnVar, boolean z, hml hmlVar, final int i) {
        int i2;
        ics icsVar2;
        final dpn dpnVarA;
        boolean zBooleanValue;
        final ics icsVar3;
        final boolean z2;
        hml hmlVarC = hmlVar.c(-441107032);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dkurVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 = i2 | 176;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i3 & 1171) == 1170 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar3 = icsVar;
            dpnVarA = dpnVar;
            z2 = z;
        } else {
            hmlVarC.t();
            if ((i & 1) == 0 || hmlVarC.G()) {
                icsVar2 = ics.e;
                dpnVarA = dpc.a(0, hmlVarC, 0, 1);
                zBooleanValue = ((Boolean) dljt.b(hmlVarC).c.invoke()).booleanValue();
            } else {
                hmlVarC.s();
                icsVar2 = icsVar;
                dpnVarA = dpnVar;
                zBooleanValue = z;
            }
            hmlVarC.l();
            dkuq dkuqVar = dkurVar.b;
            ics icsVarA = efm.a(dpc.c(icsVar2, dpnVarA, false, true, false), 1);
            boolean z3 = dkurVar.c;
            hmlVarC.v(509840176);
            if (z3) {
                ico icoVar = ics.e;
                long j = glz.a(hmlVarC).a;
                icsVarA = icsVarA.a(dkl.a(icoVar, ijg.f(ije.d(j), ije.c(j), ije.b(j), 0.3f, ije.f(j)), ikj.a));
            }
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            String str = dkurVar.f;
            hmlVarC.v(-1816743994);
            ico icoVar2 = ics.e;
            ics icsVarA2 = icsVarA.a(dihi.a(icoVar2, str, true));
            hmwVar.ab();
            ixm ixmVarA = egk.a(ecr.g(8.0f), ibw.m, hmlVarC, 6);
            long jB = hmg.b(hmlVarC);
            long j2 = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA2);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j2;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            hmlVarC.v(-585504502);
            Iterator it = dkurVar.a.iterator();
            while (it.hasNext()) {
                dkvo.k((dkxu) it.next(), true, zBooleanValue, egq.b(egq.f(egq.o(icoVar2, dkuqVar.a), 112.0f, dkuqVar.b), 1.0f), hmlVarC, 48);
            }
            hmwVar.ab();
            hmlVarC.n();
            icsVar3 = icsVar2;
            z2 = zBooleanValue;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkum
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dkur dkurVar2 = dkurVar;
                    ics icsVar4 = icsVar3;
                    dpn dpnVar2 = dpnVarA;
                    dkun.a(dkurVar2, icsVar4, dpnVar2, z2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
