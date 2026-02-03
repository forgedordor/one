package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkmz implements fdat {
    final /* synthetic */ dknk a;

    public dkmz(dknk dknkVar) {
        this.a = dknkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(this.a.b, hmlVar), jqu.b(R.string.progress_bar_overlay_retry_button_content_description, hmlVar), null, 0L, hmlVar, 0, 12);
        }
        return fctx.a;
    }
}
