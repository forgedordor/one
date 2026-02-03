package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmf extends fcyz implements fdat {
    final /* synthetic */ cdmg a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdmf(fcxy fcxyVar, cdmg cdmgVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = cdmgVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdmf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(cdmg.a(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdmf cdmfVar = new cdmf(fcxyVar, this.a, this.b);
        cdmfVar.c = obj;
        return cdmfVar;
    }
}
