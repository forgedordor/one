package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anom extends fcyz implements fdat {
    final /* synthetic */ anon a;
    final /* synthetic */ MessageIdType b;
    final /* synthetic */ enkm c;
    final /* synthetic */ ConversationId d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anom(anon anonVar, MessageIdType messageIdType, enkm enkmVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = anonVar;
        this.b = messageIdType;
        this.c = enkmVar;
        this.d = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((anom) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        anon anonVar = this.a;
        auvh.h(anonVar.b.a(this.b));
        anonVar.c.a(this.c, this.d);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anom(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
