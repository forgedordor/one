package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wrj extends fcyz implements fdat {
    final /* synthetic */ wrt a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrj(fcxy fcxyVar, wrt wrtVar) {
        super(2, fcxyVar);
        this.a = wrtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wrj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ConversationIdType conversationIdTypeB = barn.b(this.a.b.b());
        bpct bpctVarA = bpcy.a();
        bpctVarA.A("drafts.queryOnConversationId");
        bpctVarA.q();
        bpcx bpcxVar = new bpcx();
        bpcxVar.b(conversationIdTypeB);
        bpctVarA.k(new bpcw(bpcxVar));
        return (bpbj) dqru.c(bpctVarA.b());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wrj wrjVar = new wrj(fcxyVar, this.a);
        wrjVar.b = obj;
        return wrjVar;
    }
}
