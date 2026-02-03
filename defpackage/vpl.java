package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vpl extends fcyz implements fdat {
    final /* synthetic */ vpp a;
    final /* synthetic */ ekgb b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpl(vpp vppVar, ekgb ekgbVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = vppVar;
        this.b = ekgbVar;
        this.c = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vpl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        csyj csyjVar = (csyj) this.a.c.b();
        Object objX = fcva.X(this.b);
        objX.getClass();
        csyjVar.h((ResolvedRecipient) objX, this.c);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vpl(this.a, this.b, this.c, fcxyVar);
    }
}
