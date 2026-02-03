package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vmm extends fcyz implements fdat {
    int a;
    final /* synthetic */ Recipient b;
    final /* synthetic */ ajlk c;
    final /* synthetic */ vmo d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vmm(Recipient recipient, ajlk ajlkVar, vmo vmoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = recipient;
        this.c = ajlkVar;
        this.d = vmoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vmm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ConversationId conversationIdD;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        boolean z = true;
        fctl.b(obj);
        if (i == 0) {
            Recipient recipient = this.b;
            if (recipient == null) {
                conversationIdD = this.c.d();
            } else {
                vmo vmoVar = this.d;
                eiju eijuVarM = vmoVar.d.m(ekgb.r(recipient), null);
                eijuVarM.getClass();
                this.a = 1;
                obj = fdxs.c(eijuVarM, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                conversationIdD = ((Conversation) obj).d();
            }
        } else {
            conversationIdD = ((Conversation) obj).d();
        }
        ConversationId conversationId = conversationIdD;
        conversationId.getClass();
        Recipient recipient2 = this.b;
        if ((recipient2 == null || !recipient2.D()) && this.c.c() != ajlj.RBM) {
            z = false;
        }
        agbs agbsVar = new agbs(conversationId, false, true, 6, null, z, false, 230);
        vmo vmoVar2 = this.d;
        vmoVar2.c.h(new agbq(agbsVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vmm(this.b, this.c, this.d, fcxyVar);
    }
}
