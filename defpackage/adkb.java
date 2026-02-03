package defpackage;

import com.google.android.apps.messaging.joinvialink.JoinViaLinkViewModel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adkb implements fdat {
    final /* synthetic */ adkj a;

    public adkb(adkj adkjVar) {
        this.a = adkjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            adlw.d(((adkv) ((JoinViaLinkViewModel) this.a.c.a()).a.b()).a(), hmlVar, 0);
        }
        return fctx.a;
    }
}
