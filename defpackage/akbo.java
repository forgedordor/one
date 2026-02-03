package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akbo extends fcyz implements fdat {
    final /* synthetic */ ConversationId a;
    final /* synthetic */ akbl b;
    final /* synthetic */ akbq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akbo(ConversationId conversationId, akbl akblVar, akbq akbqVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = conversationId;
        this.b = akblVar;
        this.c = akbqVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akbo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ConversationId conversationId = this.a;
        akbl akblVar = this.b;
        int iOrdinal = akblVar.ordinal();
        ConversationIdType conversationIdType = ((BugleConversationId) conversationId).a;
        if (iOrdinal == 1) {
            cdmg.c(conversationIdType);
        } else {
            if (iOrdinal != 2) {
                throw new IllegalArgumentException(a.h(akblVar, "Parental approval status=", " is not supported"));
            }
            cdmg.b(conversationIdType);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akbo(this.a, this.b, this.c, fcxyVar);
    }
}
