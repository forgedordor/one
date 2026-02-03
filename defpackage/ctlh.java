package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctlh implements fdav {
    final /* synthetic */ ctju a;
    final /* synthetic */ List b;

    public ctlh(ctju ctjuVar, List list) {
        this.a = ctjuVar;
        this.b = list;
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
        } else if (this.a.b) {
            hmlVar.v(-473558635);
            List list = this.b;
            djyu djyuVar = ((cubn) list.get(iIntValue)).a().a;
            ico icoVar = ics.e;
            djyg.e(djyuVar, efy.i(icoVar, 12.0f, 0.0f, 2), new ije(dljt.a(hmlVar).F), djyh.a(iIntValue == 0, iIntValue == fcva.e(list), hmlVar), hmlVar, 0, 0);
            if (iIntValue < fcva.e(list)) {
                egt.a(egq.e(icoVar, 2.0f), hmlVar);
            }
            hmlVar.o();
        } else {
            hmlVar.v(-472920500);
            djyg.e(((cubn) this.b.get(iIntValue)).a().a, null, null, null, hmlVar, 0, 14);
            hmlVar.o();
        }
        return fctx.a;
    }
}
