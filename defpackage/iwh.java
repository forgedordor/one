package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iwh {
    public static final fdat a(List list) {
        return new hxd(1271844412, true, new iwg(list));
    }

    @fcsv
    public static final void b(ics icsVar, fdat fdatVar, ixm ixmVar, hml hmlVar, int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1663319424);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.D(ixmVar) ? 128 : 256;
        }
        if (hmlVarC.J((i2 & 147) != 146, i2 & 1)) {
            int iA = hmg.a(hmlVarC);
            ics icsVarB = icj.b(hmlVarC, icsVar);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            int i4 = ((i2 << 3) & 896) | 6;
            fdae fdaeVar = jcr.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            hsk.b(hmlVarC, ixmVar, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            hsk.a(hmlVarC, iwe.a);
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            fdatVar.a(hmlVarC, Integer.valueOf((i4 >> 6) & 14));
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new iwf(icsVar, fdatVar, ixmVar, i);
        }
    }
}
