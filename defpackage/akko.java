package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akko extends fcyz implements fdat {
    int a;
    final /* synthetic */ akkp b;
    final /* synthetic */ ConversationId c;
    final /* synthetic */ cgrc d;
    final /* synthetic */ cgra e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akko(akkp akkpVar, ConversationId conversationId, cgrc cgrcVar, cgra cgraVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akkpVar;
        this.c = conversationId;
        this.d = cgrcVar;
        this.e = cgraVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akko) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        akkp akkpVar = this.b;
        ConversationId conversationId = this.c;
        cgrc cgrcVar = this.d;
        cgra cgraVar = this.e;
        this.a = 1;
        Object objC = ejaa.a(akkpVar.c, akkp.b, new akkn(cgrcVar, cgraVar, akkpVar, conversationId, null)).c(this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akko(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
