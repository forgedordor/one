package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chsy extends fcyz implements fdat {
    int a;
    final /* synthetic */ chtk b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chsy(chtk chtkVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = chtkVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chsy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            chtk chtkVar = this.b;
            ConversationIdType conversationIdType = this.c;
            this.a = 1;
            obj = chtkVar.j(conversationIdType, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Optional.ofNullable(obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chsy(this.b, this.c, fcxyVar);
    }
}
