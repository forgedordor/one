package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SendReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayhr extends ayqn {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public ayhr(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    @Override // defpackage.ayqn
    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType, ConversationIdType conversationIdType, int i, elny elnyVar) {
        ayqn ayqnVar = (ayqn) this.a.b();
        ayqnVar.getClass();
        cjpo cjpoVar = (cjpo) this.b.b();
        cjpoVar.getClass();
        cjnr cjnrVar = (cjnr) this.c.b();
        cjnrVar.getClass();
        messageIdType.getClass();
        conversationIdType.getClass();
        elnyVar.getClass();
        return new SendReportAction(ayqnVar, cjpoVar, cjnrVar, messageIdType, conversationIdType, i, elnyVar);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        ayqn ayqnVar = (ayqn) this.a.b();
        ayqnVar.getClass();
        cjpo cjpoVar = (cjpo) this.b.b();
        cjpoVar.getClass();
        cjnr cjnrVar = (cjnr) this.c.b();
        cjnrVar.getClass();
        parcel.getClass();
        return new SendReportAction(ayqnVar, cjpoVar, cjnrVar, parcel);
    }
}
