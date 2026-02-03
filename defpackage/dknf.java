package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknf {
    public static final void a(final dknh dknhVar, final ics icsVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        int i3 = i & 6;
        hml hmlVarC = hmlVar.c(491705083);
        if (i3 == 0) {
            i2 = (true != hmlVarC.D(dknhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != hmlVarC.D(icsVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            int i4 = dknhVar.c - 1;
            iby ibyVar = i4 != 0 ? i4 != 1 ? ibw.e : ibw.i : ibw.g;
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibyVar, false);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i5 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar2 = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i5))) {
                Integer numValueOf = Integer.valueOf(i5);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar2);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            fdatVar.a(hmlVarC, Integer.valueOf((i2 >> 6) & 14));
            dknc.g(dknhVar.a, icsVar, hmlVarC, i2 & 112);
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dkne
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dknh dknhVar2 = dknhVar;
                    ics icsVar2 = icsVar;
                    int i6 = i;
                    dknf.a(dknhVar2, icsVar2, fdatVar, (hml) obj, hpy.a(i6 | 1));
                    return fctx.a;
                }
            };
        }
    }

    public static final void b(final dknh dknhVar, final ics icsVar, final fdat fdatVar, hml hmlVar, final int i) {
        int i2;
        hml hmlVarC = hmlVar.c(1332884603);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(dknhVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= true != hmlVarC.F(fdatVar) ? 128 : 256;
        }
        if ((i3 & 147) == 146 && hmlVarC.I()) {
            hmlVarC.s();
        } else {
            icsVar = ics.e;
            if (dknhVar == null) {
                hmlVarC.v(992735604);
                fdatVar.a(hmlVarC, Integer.valueOf((i3 >> 6) & 14));
                ((hmw) hmlVarC).ab();
            } else {
                hmlVarC.v(992775284);
                a(diho.b(hmlVarC) ? new dknh(2, dknhVar.a, dknhVar.b) : dknhVar, efy.c(icsVar, new egd(8.0f, 8.0f, 8.0f, 8.0f)), fdatVar, hmlVarC, i3 & 896);
                ((hmw) hmlVarC).ab();
            }
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: dknd
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    dknh dknhVar2 = dknhVar;
                    ics icsVar2 = icsVar;
                    int i4 = i;
                    dknf.b(dknhVar2, icsVar2, fdatVar, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
