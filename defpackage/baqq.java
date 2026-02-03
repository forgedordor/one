package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class baqq extends fcyz implements fdat {
    final /* synthetic */ baqs a;
    final /* synthetic */ ConversationIdType b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqq(baqs baqsVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = baqsVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqq) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ekfv.a(this.a.k(this.b, false));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new baqq(this.a, this.b, fcxyVar);
    }
}
