package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djam implements fdat {
    public static final djam a = new djam();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(djrr.ak, hmlVar), jqu.b(R.string.compose_icon_reply_snippet_dismiss_content_description, hmlVar), egq.h(ics.e, 20.0f), glz.a(hmlVar).s, hmlVar, 384, 0);
        }
        return fctx.a;
    }
}
