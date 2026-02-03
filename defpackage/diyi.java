package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diyi implements fdau {
    final /* synthetic */ diyl a;

    public diyi(diyl diylVar) {
        this.a = diylVar;
    }

    public static final Integer b(hox hoxVar) {
        return (Integer) hoxVar.a();
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        edk edkVar = (edk) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        edkVar.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.D(edkVar) ? 2 : 4;
        }
        if ((iIntValue & 19) == 18 && hmlVar.I()) {
            hmlVar.s();
        } else {
            final ejy ejyVarA = ekb.a(0, hmlVar, 3);
            eau eauVar = eau.a;
            boolean zD = hmlVar.D(ejyVarA);
            Object objF = hmlVar.f();
            if (zD || objF == hmk.a) {
                objF = new ead(ejyVarA, eauVar);
                hmlVar.y(objF);
            }
            eat eatVar = (eat) objF;
            hng hngVar = jmh.e;
            Object obj4 = (kio) hmlVar.e(hngVar);
            dep depVarA = ddi.a(hmlVar);
            boolean zD2 = hmlVar.D(obj4) | hmlVar.D(eatVar) | hmlVar.D(depVarA);
            Object objF2 = hmlVar.f();
            if (zD2 || objF2 == hmk.a) {
                objF2 = new ean(eatVar, depVarA, dea.b(0.0f, 400.0f, null, 5));
                hmlVar.y(objF2);
            }
            dzo dzoVar = (dzo) objF2;
            hmlVar.v(1849434622);
            Object objF3 = hmlVar.f();
            Object obj5 = hmk.a;
            if (objF3 == obj5) {
                Object hplVar = new hpl(null, hsi.a);
                hmlVar.y(hplVar);
                objF3 = hplVar;
            }
            final hox hoxVar = (hox) objF3;
            hmlVar.o();
            final int iEp = ((kio) hmlVar.e(hngVar)).ep(edkVar.d());
            hmlVar.v(1932533555);
            ics icsVarA = ics.e;
            if (b(hoxVar) == null) {
                hmlVar.v(5004770);
                Object objF4 = hmlVar.f();
                if (objF4 == obj5) {
                    objF4 = new fdap() { // from class: diyc
                        @Override // defpackage.fdap
                        public final Object invoke(Object obj6) {
                            ivy ivyVar = (ivy) obj6;
                            ivyVar.getClass();
                            hoxVar.b(Integer.valueOf((int) (ivyVar.g() >> 32)));
                            return fctx.a;
                        }
                    };
                    hmlVar.y(objF4);
                }
                hmlVar.o();
                icsVarA = ixy.a(icsVarA, (fdap) objF4);
            }
            hmlVar.o();
            ecj ecjVarG = ecr.g(8.0f);
            hmlVar.v(-1224400529);
            final diyl diylVar = this.a;
            boolean zD3 = hmlVar.D(diylVar) | hmlVar.B(iEp) | hmlVar.D(ejyVarA);
            Object objF5 = hmlVar.f();
            if (zD3 || objF5 == obj5) {
                objF5 = new fdap() { // from class: diyd
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj6) {
                        eio eioVar = (eio) obj6;
                        eioVar.getClass();
                        fdat fdatVar = new fdat() { // from class: diye
                            @Override // defpackage.fdat
                            public final Object a(Object obj7, Object obj8) {
                                Integer num = (Integer) obj7;
                                num.intValue();
                                ((dixo) obj8).getClass();
                                return num;
                            }
                        };
                        diyl diylVar2 = diylVar;
                        List list = diylVar2.a;
                        eioVar.a(list.size(), new diyf(fdatVar, list), new diyg(list), new hxd(2039820996, true, new diyh(list, iEp, ejyVarA, diylVar2, hoxVar)));
                        return fctx.a;
                    }
                };
                hmlVar.y(objF5);
            }
            hmlVar.o();
            eig.b(icsVarA, ejyVarA, null, ecjVarG, null, dzoVar, false, null, (fdap) objF5, hmlVar, 24576, 428);
        }
        return fctx.a;
    }
}
