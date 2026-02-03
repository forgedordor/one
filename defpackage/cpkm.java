package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cpkm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cpkp b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpkm(cpkp cpkpVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cpkpVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpkm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        cpkp cpkpVar = this.b;
        ConversationIdType conversationIdType = this.c;
        this.a = 1;
        Object objB = cpkpVar.b(conversationIdType, this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cpkm(this.b, this.c, fcxyVar);
    }
}
