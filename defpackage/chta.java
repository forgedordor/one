package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chta extends fcyz implements fdat {
    final /* synthetic */ chtk a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chta(fcxy fcxyVar, chtk chtkVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = chtkVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chta) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((bakt) this.a.b.b()).r(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        chta chtaVar = new chta(fcxyVar, this.a, this.b);
        chtaVar.c = obj;
        return chtaVar;
    }
}
