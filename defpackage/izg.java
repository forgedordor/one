package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izg {
    public static final izc a = new izc();

    public static final void a(ics icsVar, fdat fdatVar, hml hmlVar, int i, int i2) {
        int i3;
        hml hmlVarC = hmlVar.c(-1298353104);
        if (i2 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if (hmlVarC.J((i3 & 19) != 18, i3 & 1)) {
            if (i2 != 0) {
                icsVar = ics.e;
            }
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (objS == hmk.a) {
                objS = new izl(ixw.a);
                hmwVar.af(objS);
            }
            b((izl) objS, icsVar, fdatVar, hmlVarC, (i3 << 3) & 1008);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new izd(icsVar, fdatVar, i, i2);
        }
    }

    public static final void b(izl izlVar, ics icsVar, fdat fdatVar, hml hmlVar, int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-511989831);
        if (i3 == 0) {
            i2 = (true != hmlVarC.F(izlVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hnb hnbVarC = hmg.c(hmlVarC);
            ics icsVarB = icj.b(hmlVarC, icsVar);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            fdae fdaeVar = jcr.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, izlVar, izlVar.c);
            hsk.b(hmlVarC, hnbVarC, izlVar.d);
            hsk.b(hmlVarC, fdatVar, izlVar.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hmlVarC.n();
            if (hmlVarC.I()) {
                hmlVarC.v(-1259218039);
                hmwVar.ab();
            } else {
                hmlVarC.v(-1259276660);
                boolean zF = hmlVarC.F(izlVar);
                Object objS = hmwVar.S();
                if (zF || objS == hmk.a) {
                    objS = new ize(izlVar);
                    hmwVar.af(objS);
                }
                hob.i((fdae) objS, hmlVarC);
                hmwVar.ab();
            }
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new izf(izlVar, icsVar, fdatVar, i);
        }
    }
}
