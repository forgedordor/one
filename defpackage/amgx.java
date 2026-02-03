package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amgx implements alzb {
    private final fdjx a;
    private final fcsu b;
    private final amdy c;
    private final fcsu d;

    public amgx(fdjx fdjxVar, fcsu fcsuVar, amdy amdyVar, fcsu fcsuVar2) {
        fdjxVar.getClass();
        fcsuVar.getClass();
        amdyVar.getClass();
        fcsuVar2.getClass();
        this.a = fdjxVar;
        this.b = fcsuVar;
        this.c = amdyVar;
        this.d = fcsuVar2;
    }

    @Override // defpackage.alzb
    public final alza a(BugleConversationId bugleConversationId, anpj anpjVar, anpj anpjVar2, anpj anpjVar3, alxh alxhVar, boolean z, boolean z2) {
        anpjVar.getClass();
        anpjVar2.getClass();
        anpjVar3.getClass();
        return new amgw(this.a, this.d, this.b, this.c.b(bugleConversationId, anpjVar, anpjVar2, anpjVar3, alxhVar, z, z2, null));
    }
}
