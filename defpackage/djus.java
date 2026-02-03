package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djus {
    public static final void a(final ics icsVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        fdatVar.getClass();
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(66525670);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(icsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.A(0.62f) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            hmlVarC.v(5004770);
            int i4 = i2 & 112;
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (i4 == 32 || objS == hmk.a) {
                objS = new djur();
                hmwVar.af(objS);
            }
            ixm ixmVar = (ixm) objS;
            hmwVar.ab();
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar);
            int i5 = (((((i2 << 3) & 112) | ((i2 >> 6) & 14)) << 6) & 896) | 6;
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i6 = (int) j;
            hsk.b(hmlVarC, ixmVar, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i6))) {
                Integer numValueOf = Integer.valueOf(i6);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVar.a(hmlVarC, Integer.valueOf((i5 >> 6) & 14));
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djup
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ics icsVar2 = icsVar;
                    int i7 = i;
                    djus.a(icsVar2, fdatVar, (hml) obj, hpy.a(i7 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
