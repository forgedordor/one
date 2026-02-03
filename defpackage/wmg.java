package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wmg implements fdap {
    final /* synthetic */ auwm a;
    final /* synthetic */ wmp b;

    public wmg(auwm auwmVar, wmp wmpVar) {
        this.a = auwmVar;
        this.b = wmpVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ahat ahatVar = (ahat) obj;
        ahatVar.getClass();
        wmc wmcVar = new wmc(ahatVar);
        auwm auwmVar = this.a;
        auwmVar.a(wmcVar);
        wmp wmpVar = this.b;
        return new djmj(wmp.n(wmpVar, R.string.message_might_not_be_delivered_notice_text), null, null, wmp.n(wmpVar, R.string.attachment_limit_reached_notice_title), false, false, new dktq(wmp.n(wmpVar, android.R.string.ok), new wmd(auwmVar)), new dktq(wmp.n(wmpVar, R.string.send_anyway_button_text), new wme(auwmVar)), new wmf(auwmVar), 54);
    }
}
