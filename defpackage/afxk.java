package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afxk implements fdav {
    final /* synthetic */ List a;

    public afxk(List list) {
        this.a = list;
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
            afwv afwvVar = (afwv) this.a.get(iIntValue);
            hmlVar.v(-2041675693);
            djyg.e(afwvVar.a().a, null, null, null, hmlVar, 0, 14);
            hmlVar.o();
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
