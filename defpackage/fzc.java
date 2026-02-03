package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzc {
    public static final ivj a = new ivj();
    public static final izs b = new izs();

    public static final void a(final ics icsVar, final long j, final long j2, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(1428256508);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.C(j) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.C(j2) ? 128 : 256;
        }
        if ((i & 3072) == 0) {
            i2 |= true != hmlVarC.F(null) ? 1024 : 2048;
        }
        if (hmlVarC.J((i2 & 1171) != 1170, i2 & 1)) {
            hmlVarC.t();
            if ((i & 1) != 0 && !hmlVarC.G()) {
                hmlVarC.s();
            }
            hmlVarC.l();
            hmlVarC.v(-1050955529);
            ikp ikpVarE = gsc.e(7, hmlVarC);
            hmw hmwVar = (hmw) hmlVarC;
            hmwVar.ab();
            ics icsVarA = dkl.a(egq.a(icsVar, 6.0f, 6.0f), j, ikpVarE).a(ics.e);
            ixm ixmVarA = egk.a(ecr.e, ibw.n, hmlVarC, 54);
            int iA = hmg.a(hmlVarC);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVarA);
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
            hmlVarC.v(1346140842);
            hmwVar.ab();
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: fyz
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    long j3 = j;
                    fzc.a(icsVar2, j3, j2, (hml) obj, hpy.a(i | 1));
                    return fctx.a;
                }
            };
        }
    }
}
