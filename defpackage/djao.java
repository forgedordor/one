package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djao implements fdat {
    public static final djao a = new djao();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(djrr.aa, hmlVar), jqu.b(R.string.compose_subject_dismiss_content_description, hmlVar), null, glz.a(hmlVar).s, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
