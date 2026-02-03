package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecz {
    private static final cuz a = e(true);
    private static final cuz b = e(false);
    private static final ixm c = ecy.a;

    public static final ixm a(iby ibyVar, boolean z) {
        ixm ixmVar = (ixm) (z ? a : b).f(ibyVar);
        return ixmVar == null ? new edd(ibyVar, z) : ixmVar;
    }

    public static final void b(final ics icsVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-211209833);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (hmlVarC.J((i2 & 3) != 2, i2 & 1)) {
            ixm ixmVar = c;
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            ics icsVarB = icj.b(hmlVarC, icsVar);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i4 = (int) j;
            hsk.b(hmlVarC, ixmVar, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i4))) {
                Integer numValueOf = Integer.valueOf(i4);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hmlVarC.n();
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: ecw
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = hpy.a(i | 1);
                    ecz.b(icsVar, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }

    public static final void c(iyk iykVar, iyl iylVar, ixk ixkVar, kji kjiVar, int i, int i2, iby ibyVar) {
        iby ibyVar2;
        ecv ecvVarF = f(ixkVar);
        iykVar.t(iylVar, ((ecvVarF == null || (ibyVar2 = ecvVarF.a) == null) ? ibyVar : ibyVar2).a((iylVar.a << 32) | (iylVar.b & 4294967295L), (i << 32) | (i2 & 4294967295L), kjiVar), 0.0f);
    }

    public static final boolean d(ixk ixkVar) {
        ecv ecvVarF = f(ixkVar);
        if (ecvVarF != null) {
            return ecvVarF.b;
        }
        return false;
    }

    private static final cuz e(boolean z) {
        cuz cuzVar = new cuz(9);
        iby ibyVar = ibw.a;
        cuzVar.e(ibyVar, new edd(ibyVar, z));
        iby ibyVar2 = ibw.b;
        cuzVar.e(ibyVar2, new edd(ibyVar2, z));
        iby ibyVar3 = ibw.c;
        cuzVar.e(ibyVar3, new edd(ibyVar3, z));
        iby ibyVar4 = ibw.d;
        cuzVar.e(ibyVar4, new edd(ibyVar4, z));
        iby ibyVar5 = ibw.e;
        cuzVar.e(ibyVar5, new edd(ibyVar5, z));
        iby ibyVar6 = ibw.f;
        cuzVar.e(ibyVar6, new edd(ibyVar6, z));
        iby ibyVar7 = ibw.g;
        cuzVar.e(ibyVar7, new edd(ibyVar7, z));
        iby ibyVar8 = ibw.h;
        cuzVar.e(ibyVar8, new edd(ibyVar8, z));
        iby ibyVar9 = ibw.i;
        cuzVar.e(ibyVar9, new edd(ibyVar9, z));
        return cuzVar;
    }

    private static final ecv f(ixk ixkVar) {
        Object objF = ixkVar.f();
        if (objF instanceof ecv) {
            return (ecv) objF;
        }
        return null;
    }
}
