package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yaj implements fdav {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ hri c;

    public yaj(List list, int i, hri hriVar) {
        this.a = list;
        this.b = i;
        this.c = hriVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        eih eihVar = (eih) obj;
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (true != hmlVar.D(eihVar) ? 2 : 4) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if (hmlVar.J((i & 147) != 146, i & 1)) {
            xza xzaVar = (xza) this.a.get(iIntValue);
            hmlVar.v(133232756);
            hmlVar.v(281393857);
            int i2 = this.b;
            ics icsVarA = ics.e;
            if (iIntValue == i2 - 1) {
                hmlVar.v(5004770);
                Object objF = hmlVar.f();
                if (objF == hmk.a) {
                    yae yaeVar = new yae(this.c);
                    hmlVar.y(yaeVar);
                    objF = yaeVar;
                }
                hmlVar.o();
                icsVarA = ixy.a(icsVarA, (fdap) objF);
            }
            hmlVar.o();
            xzaVar.getClass();
            yam.a(icsVarA, xzaVar, hmlVar, 0);
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
