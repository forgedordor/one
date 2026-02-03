package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cscr extends fcyz implements fdat {
    final /* synthetic */ cscs a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cscr(fcxy fcxyVar, cscs cscsVar, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = cscsVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cscr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return ((bakt) this.a.e.b()).s(this.b);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cscr cscrVar = new cscr(fcxyVar, this.a, this.b);
        cscrVar.c = obj;
        return cscrVar;
    }
}
