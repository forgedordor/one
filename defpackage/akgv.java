package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akgv extends fcyz implements fdap {
    int a;
    final /* synthetic */ akgw b;
    final /* synthetic */ BugleConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akgv(akgw akgwVar, BugleConversationId bugleConversationId, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = akgwVar;
        this.c = bugleConversationId;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        akgw akgwVar = this.b;
        akgu akguVar = new akgu(akgwVar, this.c, null);
        this.a = 1;
        Object objA = eicj.a(akgwVar.b, akguVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new akgv(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
