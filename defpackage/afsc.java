package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afsc implements fdau {
    final /* synthetic */ aftb a;

    public afsc(aftb aftbVar) {
        this.a = aftbVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((eih) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarE = egq.e(egq.d(icoVar, 1.0f), 40.0f);
            final aftb aftbVar = this.a;
            ixm ixmVarA = ecz.a(ibw.a, false);
            long jB = hmg.b(hmlVar);
            long j = jB ^ (jB >>> 32);
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarE);
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
            String str = aftbVar.a;
            edf edfVar = edf.a;
            hmlVar.v(-1714504606);
            jul julVar = new jul((byte[]) null);
            julVar.a(new jxx(glz.a(hmlVar).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            julVar.i("load_text_tag", str);
            julVar.f(str);
            julVar.g();
            julVar.b();
            juo juoVarB = julVar.b();
            hmlVar.o();
            jyq jyqVar = glz.d(hmlVar).m;
            ics icsVarA = edfVar.a(icoVar, ibw.e);
            hmlVar.v(1849434622);
            Object objF = hmlVar.f();
            Object obj4 = hmk.a;
            if (objF == obj4) {
                objF = new ebk();
                hmlVar.y(objF);
            }
            ebk ebkVar = (ebk) objF;
            hmlVar.o();
            hmlVar.v(5004770);
            boolean zD = hmlVar.D(aftbVar);
            Object objF2 = hmlVar.f();
            if (zD || objF2 == obj4) {
                objF2 = new fdae() { // from class: afsb
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        aftbVar.b.invoke();
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            hmlVar.o();
            gyj.b(juoVarB, dli.c(icsVarA, ebkVar, null, false, null, null, (fdae) objF2, 28), 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, jyqVar, hmlVar, 0, 0, 262140);
            hmlVar.n();
        }
        return fctx.a;
    }
}
