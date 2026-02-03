package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afsa implements fdav {
    final /* synthetic */ List a;
    final /* synthetic */ afrs b;

    public afsa(List list, afrs afrsVar) {
        this.a = list;
        this.b = afrsVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        hml hmlVar = (hml) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        ((eih) obj).getClass();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= true != hmlVar.B(iIntValue) ? 16 : 32;
        }
        if ((iIntValue2 & 145) == 144 && hmlVar.I()) {
            hmlVar.s();
        } else {
            List list = this.a;
            djyu djyuVar = ((aftc) list.get(iIntValue)).b;
            afrs afrsVar = this.b;
            ico icoVar = ics.e;
            boolean z = afrsVar.g.a;
            ics icsVarI = (!z || iIntValue == 0) ? icoVar : efy.i(icoVar, 12.0f, 0.0f, 2);
            hmlVar.v(-967006532);
            eve eveVarA = null;
            ije ijeVar = z ? new ije(dljt.a(hmlVar).F) : null;
            hmlVar.o();
            hmlVar.v(-967000326);
            if (z) {
                eveVarA = djyh.a(iIntValue == 1, iIntValue == fcva.e(list), hmlVar);
            }
            hmlVar.o();
            djyg.e(djyuVar, icsVarI, ijeVar, eveVarA, hmlVar, 0, 0);
            if (z && iIntValue != 0 && iIntValue != fcva.e(list)) {
                egt.a(egq.e(icoVar, 2.0f), hmlVar);
            }
        }
        return fctx.a;
    }
}
