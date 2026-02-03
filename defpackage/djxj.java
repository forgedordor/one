package defpackage;

import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djxj implements fdat {
    final /* synthetic */ hox a;
    final /* synthetic */ List b;

    public djxj(hox hoxVar, List list) {
        this.a = hoxVar;
        this.b = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(djrr.cC, hmlVar), jqu.b(R.string.list_item_actionable_more, hmlVar), null, 0L, hmlVar, 0, 12);
            final hox hoxVar = this.a;
            boolean zBooleanValue = ((Boolean) hoxVar.a()).booleanValue();
            hmlVar.v(5004770);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new fdae() { // from class: djxf
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        djyg.t(hoxVar);
                        return fctx.a;
                    }
                };
                hmlVar.y(objF);
            }
            hmlVar.o();
            dtfz.b(zBooleanValue, (fdae) objF, null, 0L, null, null, glz.c(hmlVar).f, 0L, 0.0f, hxe.d(-1554769429, new djxi(this.b, hoxVar), hmlVar), hmlVar, 48, 48, 1980);
        }
        return fctx.a;
    }
}
