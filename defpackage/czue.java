package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czue implements actl {
    final /* synthetic */ String a;
    final /* synthetic */ czuf b;

    public czue(czuf czufVar, String str) {
        this.a = str;
        this.b = czufVar;
    }

    @Override // defpackage.actl
    public final void n() {
        czuf czufVar = this.b;
        String str = this.a;
        czufVar.e(str, 4);
        ((czty) czufVar.e.b()).a(str, emfc.RCS_PROVISIONING_PHONE_NUMBER_PROMO_PRESENTED);
    }
}
