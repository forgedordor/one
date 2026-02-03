package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akbf extends fcyz implements fdat {
    int a;
    final /* synthetic */ akbi b;
    final /* synthetic */ BugleConversation c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbf(akbi akbiVar, BugleConversation bugleConversation, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akbiVar;
        this.c = bugleConversation;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akbf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        akbi akbiVar = this.b;
        BugleConversation bugleConversation = this.c;
        this.a = 1;
        if (akbiVar.c(bugleConversation, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akbf(this.b, this.c, fcxyVar);
    }
}
