package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akmf extends fcyz implements fdat {
    int a;
    final /* synthetic */ akml b;
    final /* synthetic */ akzk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akmf(akml akmlVar, akzk akzkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akmlVar;
        this.c = akzkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akmf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarH = ((ajvr) this.b.b.b()).h(this.c);
            this.a = 1;
            obj = fdxs.c(eijuVarH, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ekgb<ConversationId> ekgbVar = (ekgb) obj;
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
        for (ConversationId conversationId : ekgbVar) {
            conversationId.getClass();
            arrayList.add(new RbmConversationId(((BugleConversationId) conversationId).a));
        }
        return ekfv.a(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akmf(this.b, this.c, fcxyVar);
    }
}
