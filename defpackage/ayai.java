package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayai extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayai(fcxy fcxyVar, aybe aybeVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayai) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((baxe) this.a.g.b()).o(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayai ayaiVar = new ayai(fcxyVar, this.a, this.b);
        ayaiVar.c = obj;
        return ayaiVar;
    }
}
