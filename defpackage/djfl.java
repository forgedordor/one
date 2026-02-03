package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djfl implements fdau {
    final /* synthetic */ djfn a;
    final /* synthetic */ fdae b;

    public djfl(djfn djfnVar, fdae fdaeVar) {
        this.a = djfnVar;
        this.b = fdaeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final djfn djfnVar = this.a;
            final fdae fdaeVar = this.b;
            List list = djfnVar.a;
            boolean z = false;
            final int i = 0;
            for (Object obj4 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    fcva.m();
                }
                final djex djexVar = (djex) obj4;
                ico icoVar = ics.e;
                hmlVar.v(-1746271574);
                boolean zD = hmlVar.D(djfnVar) | hmlVar.D(djexVar) | hmlVar.D(fdaeVar);
                Object objF = hmlVar.f();
                if (zD || objF == hmk.a) {
                    objF = new fdae() { // from class: djfj
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            djfnVar.c.invoke(djexVar);
                            fdaeVar.invoke();
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF);
                }
                hmlVar.o();
                ics icsVarE = dli.e(icoVar, z, null, (fdae) objF, 15);
                hmlVar.v(-1633490746);
                boolean zD2 = hmlVar.D(djfnVar) | hmlVar.B(i);
                Object objF2 = hmlVar.f();
                if (zD2 || objF2 == hmk.a) {
                    objF2 = new fdap() { // from class: djfk
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj5) {
                            jto jtoVar = (jto) obj5;
                            jtoVar.getClass();
                            Integer num = djfnVar.b;
                            boolean z2 = false;
                            if (num != null) {
                                if (num.intValue() == i) {
                                    z2 = true;
                                }
                            }
                            jtk.r(jtoVar, z2);
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF2);
                }
                hmlVar.o();
                ics icsVarC = jsh.c(icsVarE, true, (fdap) objF2);
                ixm ixmVarA = egk.a(ecr.a, ibw.n, hmlVar, 48);
                long jB = hmg.b(hmlVar);
                long j = jB ^ (jB >>> 32);
                hxi hxiVarN = hmlVar.N();
                ics icsVarB = icj.b(hmlVar, icsVarC);
                fdae fdaeVar2 = jbb.a;
                hmlVar.M();
                hmlVar.x();
                if (hmlVar.H()) {
                    hmlVar.j(fdaeVar2);
                } else {
                    hmlVar.z();
                }
                int i3 = (int) j;
                hsk.b(hmlVar, ixmVarA, jbb.e);
                hsk.b(hmlVar, hxiVarN, jbb.d);
                fdat fdatVar = jbb.f;
                if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(i3))) {
                    Integer numValueOf = Integer.valueOf(i3);
                    hmlVar.y(numValueOf);
                    hmlVar.h(numValueOf, fdatVar);
                }
                hsk.b(hmlVar, icsVarB, jbb.c);
                z = false;
                djfm.g(djexVar.c, djexVar.a, djexVar.b, hmlVar, 0);
                hmlVar.n();
                hmlVar.v(-470825753);
                if (i != fcva.e(list)) {
                    dtev.a(efy.i(icoVar, 0.0f, 8.0f, 1), 0.0f, 0L, hmlVar, 6, 6);
                }
                hmlVar.o();
                i = i2;
            }
        }
        return fctx.a;
    }
}
