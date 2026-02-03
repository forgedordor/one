package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwsm extends fcyz implements fdat {
    final /* synthetic */ cwso a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwsm(fcxy fcxyVar, cwso cwsoVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = cwsoVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwsm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int iLongValue = (int) ((Number) crbf.bg.e()).longValue();
        return ((Boolean) ((cczi) crbf.aU.get()).e()).booleanValue() ? ((baxe) this.a.e.b()).K(crjq.b(this.b, iLongValue).b()) : ((baxe) this.a.e.b()).M(this.b, iLongValue);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cwsm cwsmVar = new cwsm(fcxyVar, this.a, this.b);
        cwsmVar.c = obj;
        return cwsmVar;
    }
}
