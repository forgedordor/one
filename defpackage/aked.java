package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aked extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ akee d;
    final /* synthetic */ EmergencyConversation e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aked(akee akeeVar, EmergencyConversation emergencyConversation, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = akeeVar;
        this.e = emergencyConversation;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aked) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            obj3 = this.b;
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            akee akeeVar = this.d;
            EmergencyConversation emergencyConversation = this.e;
            ConversationIdType conversationIdTypeA = ajwb.a(emergencyConversation.i);
            eiju eijuVarB = emergencyConversation.i().b();
            eijuVarB.getClass();
            ccxr ccxrVar = akeeVar.c;
            this.a = ccxrVar;
            this.b = conversationIdTypeA;
            this.c = 1;
            Object objC = fdxs.c(eijuVarB, this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            obj2 = ccxrVar;
            obj = objC;
            obj3 = conversationIdTypeA;
        }
        obj.getClass();
        alqm alqmVarG = ((ResolvedRecipient) fcva.N((List) obj)).g();
        alqmVarG.getClass();
        obj3.getClass();
        ccxu ccxuVar = (ccxu) obj2;
        if (ccxuVar.g) {
            auvw.k(ccxuVar.b, null, null, new ccxs(ccxuVar, alqmVarG, (ConversationIdType) obj3, null), 3);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aked(this.d, this.e, fcxyVar);
    }
}
