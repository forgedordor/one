package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdop extends fcyz implements fdat {
    int a;
    final /* synthetic */ cdoq b;
    final /* synthetic */ ConversationIdType c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdop(cdoq cdoqVar, ConversationIdType conversationIdType, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cdoqVar;
        this.c = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdop) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cdoq cdoqVar = this.b;
            BugleConversationId bugleConversationId = new BugleConversationId(this.c);
            this.a = 1;
            obj = cdoqVar.c.h(bugleConversationId, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        cdoq cdoqVar2 = this.b;
        cdmg.e(this.c, new akbj((akbk) obj));
        cdoqVar2.b();
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cdop(this.b, this.c, fcxyVar);
    }
}
