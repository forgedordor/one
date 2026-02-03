package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baki extends fcyz implements fdat {
    final /* synthetic */ bakl a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ aukf c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baki(fcxy fcxyVar, bakl baklVar, ConversationIdType conversationIdType, aukf aukfVar) {
        super(2, fcxyVar);
        this.a = baklVar;
        this.b = conversationIdType;
        this.c = aukfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baki) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.a.a(this.b, this.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        baki bakiVar = new baki(fcxyVar, this.a, this.b, this.c);
        bakiVar.d = obj;
        return bakiVar;
    }
}
