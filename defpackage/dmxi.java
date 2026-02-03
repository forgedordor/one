package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxi implements fdav {
    final /* synthetic */ oxm a;
    final /* synthetic */ dmvl b;
    final /* synthetic */ hsf c;

    public dmxi(oxm oxmVar, dmvl dmvlVar, hsf hsfVar) {
        this.a = oxmVar;
        this.b = dmvlVar;
        this.c = hsfVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        ((ekx) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if ((iIntValue2 & 145) == 144 && hmlVar.I()) {
            hmlVar.s();
        } else {
            Object objF = this.a.f(iIntValue);
            if (objF == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            final dojv dojvVar = (dojv) objF;
            ico icoVar = ics.e;
            hmlVar.v(-1633490746);
            final dmvl dmvlVar = this.b;
            boolean zF = hmlVar.F(dmvlVar) | hmlVar.F(dojvVar);
            Object objF2 = hmlVar.f();
            if (zF || objF2 == hmk.a) {
                objF2 = new fdae() { // from class: dmxh
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dmvlVar.e.invoke(dojvVar);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF2);
            }
            hmlVar.o();
            dmxm.f(dkl.a(dli.g(icoVar, false, null, (fdae) objF2, 255), glz.a(hmlVar).G, ikj.a), dojvVar, ((List) this.c.a()).indexOf(dojvVar), hmlVar, 0);
        }
        return fctx.a;
    }
}
