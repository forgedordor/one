package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlay implements fdat {
    public static final dlay a = new dlay();

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dtfn.a(djrs.b(djrr.ak, hmlVar), jqu.b(R.string.scam_alert_card_close_icon, hmlVar), null, glz.a(hmlVar).s, hmlVar, 0, 4);
        }
        return fctx.a;
    }
}
