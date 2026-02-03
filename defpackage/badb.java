package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class badb extends fcyz implements fdat {
    final /* synthetic */ bade a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public badb(fcxy fcxyVar, bade badeVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = badeVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((badb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((bakt) this.a.a.b()).r(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        badb badbVar = new badb(fcxyVar, this.a, this.b);
        badbVar.c = obj;
        return badbVar;
    }
}
