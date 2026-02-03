package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akeb extends fcyz implements fdat {
    int a;
    final /* synthetic */ akee b;
    final /* synthetic */ akzk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akeb(akee akeeVar, akzk akzkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akeeVar;
        this.c = akzkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akeb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            akee akeeVar = this.b;
            eiju eijuVarH = akeeVar.b.h(this.c);
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
            arrayList.add(new EmergencyConversationId(((BugleConversationId) conversationId).a));
        }
        return ekfv.a(arrayList);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akeb(this.b, this.c, fcxyVar);
    }
}
