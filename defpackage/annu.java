package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class annu extends fcyz implements fdat {
    int a;
    final /* synthetic */ annv b;
    final /* synthetic */ aoff c;
    final /* synthetic */ BugleConversationId d;
    final /* synthetic */ anpj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public annu(annv annvVar, aoff aoffVar, BugleConversationId bugleConversationId, anpj anpjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = annvVar;
        this.c = aoffVar;
        this.d = bugleConversationId;
        this.e = anpjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((annu) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        annv annvVar = this.b;
        aoff aoffVar = this.c;
        BugleConversationId bugleConversationId = this.d;
        anpj anpjVar = this.e;
        this.a = 1;
        if (annvVar.b(aoffVar, bugleConversationId, anpjVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new annu(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
