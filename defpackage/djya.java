package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djya implements fdat {
    final /* synthetic */ djyr a;

    public djya(djyr djyrVar) {
        this.a = djyrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djyr djyrVar = this.a;
            if (djyrVar.f.a) {
                hmlVar.v(-96981023);
                dtfk.b(djyrVar.e, null, false, null, null, djwe.a, hmlVar, 1572864, 62);
                hmlVar.o();
            } else {
                hmlVar.v(-96737208);
                dtfn.a(djrs.b(djrr.aj, hmlVar), jqu.b(R.string.list_item_redirect_caret, hmlVar), null, 0L, hmlVar, 0, 12);
                hmlVar.o();
            }
        }
        return fctx.a;
    }
}
