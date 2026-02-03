package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqg {
    public static final void a(final djqp djqpVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        djqpVar.getClass();
        hml hmlVarC = hmlVar.c(-1919041619);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(djqpVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            icsVar2 = ics.e;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVarC);
            long j = jB ^ (jB >>> 32);
            hmw hmwVar = (hmw) hmlVarC;
            hxi hxiVarAk = hmwVar.ak();
            ics icsVarB = icj.b(hmlVarC, icsVar2);
            fdae fdaeVar = jbb.a;
            hmlVarC.x();
            if (hmwVar.z) {
                hmlVarC.j(fdaeVar);
            } else {
                hmlVarC.z();
            }
            int i3 = (int) j;
            hsk.b(hmlVarC, ixmVarA, jbb.e);
            hsk.b(hmlVarC, hxiVarAk, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmwVar.z || !fdbq.f(hmwVar.S(), Integer.valueOf(i3))) {
                Integer numValueOf = Integer.valueOf(i3);
                hmwVar.af(numValueOf);
                hmlVarC.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVarC, icsVarB, jbb.c);
            edf edfVar = edf.a;
            gvk.e(djqpVar.c, null, false, glz.c(hmlVarC).a, ije.g, 0L, 0.0f, null, null, hxe.d(898431806, new djqf(djqpVar), hmlVarC), hmlVarC, 998);
            dihd dihdVar = djqpVar.d;
            hmlVarC.v(-324552943);
            if (dihdVar != null) {
                diww.a(edfVar, new diwx(dihdVar), null, null, hmlVarC, 6, 6);
            }
            hmwVar.ab();
            hmlVarC.n();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: djqe
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    djqp djqpVar2 = djqpVar;
                    int i4 = i;
                    djqg.a(djqpVar2, icsVar2, (hml) obj, hpy.a(i4 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
