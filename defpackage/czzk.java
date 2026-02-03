package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czzk implements eind {
    final /* synthetic */ czzj a;

    public czzk(czzj czzjVar) {
        this.a = czzjVar;
    }

    @Override // defpackage.eind
    public final /* bridge */ /* synthetic */ eine a(einb einbVar) {
        bacr bacrVar = ((dadm) einbVar).a;
        String str = bacrVar.c;
        str.getClass();
        qxf qxfVarB = bacrVar.b(bacrVar.c(0));
        czzj czzjVar = this.a;
        Recipient recipientI = ((anty) czzjVar.n.b()).i(qxfVarB);
        czzjVar.j.h(new egpq(((bxwh) czzjVar.r.b()).a(str)), new egpo(recipientI), czzjVar.A);
        return eine.a;
    }
}
