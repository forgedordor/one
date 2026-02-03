package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afsw {
    public static final void a(hml hmlVar, int i) {
        hml hmlVarC = hmlVar.c(1332360788);
        final int i2 = 0;
        if (i != 0) {
            djzp.d(hmlVarC, 0);
            i2 = i;
        } else if (hmlVarC.I()) {
            hmlVarC.s();
        } else {
            i = 0;
            djzp.d(hmlVarC, 0);
            i2 = i;
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afsv
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    afsw.a((hml) obj, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.afss r9, final defpackage.afta r10, final boolean r11, boolean r12, defpackage.hml r13, final int r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afsw.b(afss, afta, boolean, boolean, hml, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [ics] */
    public static final void c(final afss afssVar, final boolean z, boolean z2, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(-1742921006);
        final boolean z3 = true;
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(afssVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.E(z) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.E(z2) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
            z3 = z2;
        } else {
            ico icoVar = ics.e;
            ics icsVarD = egq.d(icoVar, 1.0f);
            ixm ixmVarA = edl.a(ecr.c, ibw.j, hmlVarC, 0);
            long jB = hmg.b(hmlVarC);
            long j = (jB >>> 32) ^ jB;
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
            djyg.e(new djyp(afssVar.c), z2 ? efy.j(icoVar, 2.0f, 0.0f, 0.0f, 0.0f, 14) : icoVar, null, null, hmlVarC, 0, 12);
            djyu djyuVar = afssVar.b;
            ics icsVarA = joj.a(icoVar, "contact_row_test_prefix_".concat(afssVar.a));
            if (z2) {
                icsVarA = icsVarA.a(efy.i(icoVar, 12.0f, 0.0f, 2));
            }
            hmlVarC.v(567856551);
            eve eveVarA = null;
            ije ijeVar = z2 ? new ije(dljt.a(hmlVarC).F) : null;
            hmwVar.ab();
            hmlVarC.v(567861423);
            if (z2) {
                eveVarA = djyh.a(true, z, hmlVarC);
            } else {
                z3 = false;
            }
            hmwVar.ab();
            djyg.e(djyuVar, icsVarA, ijeVar, eveVarA, hmlVarC, 0, 0);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: afst
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    afss afssVar2 = afssVar;
                    boolean z4 = z;
                    int i5 = i;
                    afsw.c(afssVar2, z4, z3, (hml) obj, hpy.a(i5 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
