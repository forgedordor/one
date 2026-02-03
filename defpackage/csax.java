package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csax implements bayh {
    private final fcsu a;
    private final cohg b;

    public csax(fcsu fcsuVar) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = new cohf("AutomationDetectionMessageSentListener::onProcessSendSuccess");
    }

    @Override // defpackage.bayh
    public final void a(MessageCoreData messageCoreData) {
        if (crtr.a()) {
            fcsu fcsuVar = this.a;
            csbb csbbVar = (csbb) fcsuVar.b();
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            conversationIdTypeA.getClass();
            csbbVar.e(conversationIdTypeA);
            csbb csbbVar2 = (csbb) fcsuVar.b();
            basd basdVarF = messageCoreData.F();
            basdVarF.getClass();
            csbbVar2.f(basdVarF);
            cezn.a.c();
        }
    }

    @Override // defpackage.bayh, defpackage.baye
    public final eieu c() {
        return this.b.a();
    }
}
