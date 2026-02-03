package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wlz implements fdap {
    final /* synthetic */ auwm a;
    final /* synthetic */ wmp b;

    public wlz(auwm auwmVar, wmp wmpVar) {
        this.a = auwmVar;
        this.b = wmpVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ahat ahatVar = (ahat) obj;
        ahatVar.getClass();
        wlv wlvVar = new wlv(ahatVar);
        auwm auwmVar = this.a;
        auwmVar.a(wlvVar);
        wmp wmpVar = this.b;
        return new djmj(wmp.n(wmpVar, R.string.missing_encryption_notice_text), null, null, null, false, false, new dktq(wmp.n(wmpVar, R.string.send_anyway_button_text), new wlw(auwmVar)), new dktq(wmp.n(wmpVar, R.string.cancel_send_button_text), new wlx(auwmVar)), new wly(auwmVar), 62);
    }
}
