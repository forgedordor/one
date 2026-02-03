package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cinn extends fcyz implements fdat {
    int a;
    final /* synthetic */ cino b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cinn(cino cinoVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cinoVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cinn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cino cinoVar = this.b;
            cion cionVar = (cion) cinoVar.f.b();
            ConversationIdType conversationIdType = this.c;
            dzfh dzfhVar = cino.b;
            dzfh dzfhVar2 = cino.c;
            cinm cinmVar = new cinm(cinoVar, conversationIdType, null);
            this.a = 1;
            if (cionVar.a(dzfhVar, dzfhVar2, cinmVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cinn(this.b, this.c, fcxyVar);
    }
}
