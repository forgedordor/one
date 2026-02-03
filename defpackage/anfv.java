package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.api.messaging.message.BugleMessageId;
import com.google.android.apps.messaging.shared.api.messaging.message.internal.CoreBugleMessageId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anfv extends fcyz implements fdat {
    final /* synthetic */ bxoz a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ anfw c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ amuy e;
    final /* synthetic */ String f;
    final /* synthetic */ Uri g;
    final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anfv(bxoz bxozVar, ConversationId conversationId, anfw anfwVar, MessageId messageId, amuy amuyVar, String str, Uri uri, long j, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = bxozVar;
        this.b = conversationId;
        this.c = anfwVar;
        this.d = messageId;
        this.e = amuyVar;
        this.f = str;
        this.g = uri;
        this.h = j;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((anfv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        CoreBugleMessageId coreBugleMessageId = new CoreBugleMessageId(((BugleMessageId) this.d).c(), anfw.V(this.e));
        ConversationId conversationId = this.b;
        ejwl.a(conversationId instanceof RbmConversationId);
        ConversationIdType conversationIdType = ((RbmConversationId) conversationId).a;
        ((bxph) this.a.a).b(conversationIdType, coreBugleMessageId, this.g, this.h, new bxqj[0]);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anfv(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, fcxyVar);
    }
}
