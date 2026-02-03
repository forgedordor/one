package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djak implements fdat {
    public static final djak a = new djak();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(djrr.bS, hmlVar), jqu.b(R.string.compose_icon_mms_compression, hmlVar), null, glz.a(hmlVar).s, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
