package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjnx extends fcyz implements fdat {
    int a;
    final /* synthetic */ cjob b;
    final /* synthetic */ axcm c;
    final /* synthetic */ ConversationIdType d;
    final /* synthetic */ awjl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjnx(cjob cjobVar, axcm axcmVar, ConversationIdType conversationIdType, awjl awjlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cjobVar;
        this.c = axcmVar;
        this.d = conversationIdType;
        this.e = awjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjnx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return null;
        }
        cjob cjobVar = this.b;
        ConversationIdType conversationIdType = this.d;
        awjl awjlVar = this.e;
        this.a = 1;
        if (cjobVar.g(conversationIdType, awjlVar, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjnx(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
