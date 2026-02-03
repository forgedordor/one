package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wco implements fdat {
    final /* synthetic */ djrr a;

    public wco(djrr djrrVar) {
        this.a = djrrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(this.a, hmlVar), jqu.b(R.string.close_button_content_description, hmlVar), null, dljt.f(hmlVar).h, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
