package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ugu extends fcyz implements fdat {
    int a;
    final /* synthetic */ ugv b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugu(ugv ugvVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ugvVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ugu) c((bsbm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ugv ugvVar = this.b;
            ConversationIdType conversationIdType = this.c;
            fcyh fcyhVarA = eicg.a(ugvVar.a);
            ugt ugtVar = new ugt(null, ugvVar, conversationIdType);
            this.a = 1;
            obj = fdin.a(fcyhVarA, ugtVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ugu(this.b, this.c, fcxyVar);
    }
}
