package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vlb extends fcyz implements fdat {
    int a;
    final /* synthetic */ ajts b;
    final /* synthetic */ vlc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlb(ajts ajtsVar, vlc vlcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ajtsVar;
        this.c = vlcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vlb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ajts ajtsVar = this.b;
            elwp elwpVar = ajtsVar.I().ordinal() != 1 ? elwp.SEND_MODE_AUTO : elwp.SEND_MODE_XMS;
            vlc vlcVar = this.c;
            ConversationId conversationIdD = ajtsVar.d();
            conversationIdD.getClass();
            eiju eijuVarP = vlcVar.c.P(conversationIdD, elwpVar);
            this.a = 1;
            obj = fdxs.c(eijuVarP, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vlb(this.b, this.c, fcxyVar);
    }
}
