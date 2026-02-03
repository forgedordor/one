package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chti extends fcyz implements fdat {
    int a;
    final /* synthetic */ chtk b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chti(chtk chtkVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chtkVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chti) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objK;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objK = ((fctk) obj).a;
        } else {
            chtk chtkVar = this.b;
            ConversationIdType conversationIdType = this.c;
            this.a = 1;
            objK = chtkVar.k(conversationIdType, 2, this);
            if (objK == fcylVar) {
                return fcylVar;
            }
        }
        fctl.b(objK);
        return objK;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chti(this.b, this.c, fcxyVar);
    }
}
