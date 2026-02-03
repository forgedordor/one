package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agdx extends fcyz implements fdat {
    int a;
    final /* synthetic */ agdz b;
    final /* synthetic */ ConversationId c;
    final /* synthetic */ String d;
    final /* synthetic */ Recipient e;
    final /* synthetic */ String f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agdx(fcxy fcxyVar, agdz agdzVar, ConversationId conversationId, String str, Recipient recipient, String str2) {
        super(2, fcxyVar);
        this.b = agdzVar;
        this.c = conversationId;
        this.d = str;
        this.e = recipient;
        this.f = str2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((agdx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cqdn cqdnVar = (cqdn) this.b.c.b();
            ConversationId conversationId = this.c;
            String str = this.d;
            Recipient recipient = this.e;
            eiju eijuVarB = cqdnVar.b(conversationId, str, recipient != null ? recipient.g() : null, this.f, false);
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return (Boolean) obj;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        agdx agdxVar = new agdx(fcxyVar, this.b, this.c, this.d, this.e, this.f);
        agdxVar.g = obj;
        return agdxVar;
    }
}
