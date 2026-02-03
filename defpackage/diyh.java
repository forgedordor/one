package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyh implements fdav {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ ejy c;
    final /* synthetic */ diyl d;
    final /* synthetic */ hox e;

    public diyh(List list, int i, ejy ejyVar, diyl diylVar, hox hoxVar) {
        this.a = list;
        this.b = i;
        this.c = ejyVar;
        this.d = diylVar;
        this.e = hoxVar;
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
            hmlVar.v(-1165659960);
            Integer numB = diyi.b(this.e);
            diyj.f(numB != null ? numB.intValue() : this.b, this.c, this.d.a, iIntValue, hmlVar, ((i & 126) << 6) & 7168);
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
