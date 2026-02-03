package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwrr extends fcyz implements fdat {
    final /* synthetic */ cwsp a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwrr(fcxy fcxyVar, cwsp cwspVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = cwspVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwrr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        int iLongValue = (int) ((Number) crbf.bg.e()).longValue();
        return ((Boolean) ((cczi) crbf.aU.get()).e()).booleanValue() ? ((baxe) this.a.e.b()).K(crjq.b(this.b, iLongValue).b()) : ((baxe) this.a.e.b()).M(this.b, iLongValue);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cwrr cwrrVar = new cwrr(fcxyVar, this.a, this.b);
        cwrrVar.c = obj;
        return cwrrVar;
    }
}
