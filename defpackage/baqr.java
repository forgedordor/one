package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baqr extends fcyz implements fdat {
    final /* synthetic */ baqs a;
    final /* synthetic */ ConversationIdType b;
    final /* synthetic */ aubq c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public baqr(fcxy fcxyVar, baqs baqsVar, ConversationIdType conversationIdType, aubq aubqVar) {
        super(2, fcxyVar);
        this.a = baqsVar;
        this.b = conversationIdType;
        this.c = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((baqr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.g(this.b, this.c));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        baqr baqrVar = new baqr(fcxyVar, this.a, this.b, this.c);
        baqrVar.d = obj;
        return baqrVar;
    }
}
