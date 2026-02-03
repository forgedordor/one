package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlnb implements fdat {
    final /* synthetic */ List a;
    final /* synthetic */ hox b;

    public dlnb(List list, hox hoxVar) {
        this.a = list;
        this.b = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(djrr.cC, hmlVar), jqu.b(R.string.top_app_bar_more, hmlVar), null, 0L, hmlVar, 0, 12);
            hmlVar.v(1871173751);
            List list = this.a;
            final hox hoxVar = this.b;
            boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
            hmlVar.v(5004770);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdae() { // from class: dlna
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        dlnj.g(hoxVar, false);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dlnj.l(list, zBooleanValue, (fdae) objF, hmlVar, 3072);
            hmlVar.o();
        }
        return fctx.a;
    }
}
