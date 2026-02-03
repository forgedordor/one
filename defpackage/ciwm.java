package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciwm extends fcyz implements fdat {
    int a;
    final /* synthetic */ ciwn b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ aubq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciwm(ciwn ciwnVar, ConversationIdType conversationIdType, aubq aubqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ciwnVar;
        this.c = conversationIdType;
        this.d = aubqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciwm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ciwn ciwnVar = this.b;
        ConversationIdType conversationIdType = this.c;
        aubq aubqVar = this.d;
        this.a = 1;
        Object objB = ciwnVar.b(conversationIdType, aubqVar, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciwm(this.b, this.c, this.d, fcxyVar);
    }
}
