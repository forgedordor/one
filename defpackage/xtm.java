package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xtm implements fdav {
    final /* synthetic */ List a;
    final /* synthetic */ xsi b;
    final /* synthetic */ fdap c;

    public xtm(List list, xsi xsiVar, fdap fdapVar) {
        this.a = list;
        this.b = xsiVar;
        this.c = fdapVar;
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
            xsi xsiVar = iIntValue == 0 ? null : (xsi) this.a.get(iIntValue - 1);
            boolean zF = fdbq.f(this.b, xsiVar);
            String strB = jqu.b(xsiVar != null ? xsiVar.c : R.string.default_theme, hmlVar);
            int i = iIntValue + 1;
            int size = this.a.size() + 1;
            hmlVar.v(-300708558);
            String strC = jqu.c(true != zF ? R.string.unselected_theme_content_description : R.string.selected_theme_content_description, new Object[]{strB, Integer.valueOf(i), Integer.valueOf(size)}, hmlVar);
            hmlVar.o();
            xtn.i(xsiVar != null ? xsiVar.b : null, hxe.d(1722176193, new xtl(iIntValue, strC, zF, xsiVar, this.c), hmlVar), hmlVar, 48);
        }
        return fctx.a;
    }
}
