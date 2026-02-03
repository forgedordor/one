package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tfz extends fcyz implements fdat {
    int a;
    final /* synthetic */ tga b;
    final /* synthetic */ acyx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfz(tga tgaVar, acyx acyxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = tgaVar;
        this.c = acyxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tfz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            tga tgaVar = this.b;
            ConversationIdType conversationIdTypeW = this.c.w();
            this.a = 1;
            Object objC = tgaVar.a.c(conversationIdTypeW, 4, aukf.CONVERSATION_CLASSIFICATION_TYPE_BIRTHDAY, this);
            if (objC != fcylVar) {
                objC = fctx.a;
            }
            if (objC == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tfz(this.b, this.c, fcxyVar);
    }
}
