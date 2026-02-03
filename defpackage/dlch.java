package defpackage;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlch implements fdau {
    final /* synthetic */ dlbt a;

    public dlch(dlbt dlbtVar) {
        this.a = dlbtVar;
    }

    public static final void b(hox hoxVar, boolean z) {
        hoxVar.b(Boolean.valueOf(z));
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((ego) obj).getClass();
        if ((iIntValue & 17) != 16 || !hmlVar.I()) {
            dlcm.d(hmlVar, 0);
            dlbt dlbtVar = this.a;
            ico icoVar = ics.e;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icoVar);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            int i = (int) j;
            hsk.b(hmlVar, ixmVarA, jbb.e);
            hsk.b(hmlVar, hxiVarN, jbb.d);
            fdat fdatVar = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i))) {
                Integer numValueOf = Integer.valueOf(i);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar);
            }
            hsk.b(hmlVar, icsVarB, jbb.c);
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            Object obj4 = hmk.a;
            if (objF == obj4) {
                hpl hplVar = new hpl(false, hsi.a);
                hmlVar.y(hplVar);
                objF = hplVar;
            }
            final hox hoxVar = (hox) objF;
            hmlVar.o();
            for (dlbu dlbuVar : dlbtVar.b) {
                if (fdbq.f(dlbuVar.a, dlbtVar.a)) {
                    String str = dlbuVar.b;
                    dlcr dlcrVar = dlbuVar.d;
                    hmlVar.v(5004770);
                    Object objF2 = hmlVar.f();
                    if (objF2 == obj4) {
                        objF2 = new fdae() { // from class: dlcd
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                dlch.b(hoxVar, true);
                                return fctx.a;
                            }
                        };
                        hmlVar.y(objF2);
                    }
                    hmlVar.o();
                    dlcm.h(str, dlcrVar, (fdae) objF2, hmlVar, 384);
                    boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
                    hmlVar.v(5004770);
                    Object objF3 = hmlVar.f();
                    if (objF3 == obj4) {
                        objF3 = new fdae() { // from class: dlce
                            @Override // defpackage.fdae
                            public final Object invoke() {
                                dlch.b(hoxVar, false);
                                return fctx.a;
                            }
                        };
                        hmlVar.y(objF3);
                    }
                    hmlVar.o();
                    dlcm.a(zBooleanValue, (fdae) objF3, hxe.d(-1710513094, new dlcg(dlbtVar, hoxVar), hmlVar), hmlVar, 432);
                    hmlVar.n();
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        hmlVar.s();
        return fctx.a;
    }
}
