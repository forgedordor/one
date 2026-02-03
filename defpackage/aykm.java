package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationInteractiveTimestampAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aykm implements ayms {
    private final fcsu a;
    private final fcsu b;

    public aykm(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
    }

    public final /* bridge */ /* synthetic */ Action a(ConversationIdType conversationIdType, long j) {
        dqsn dqsnVar = (dqsn) this.b.b();
        dqsnVar.getClass();
        conversationIdType.getClass();
        return new UpdateConversationInteractiveTimestampAction(this.a, dqsnVar, conversationIdType, j);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        dqsn dqsnVar = (dqsn) this.b.b();
        dqsnVar.getClass();
        parcel.getClass();
        return new UpdateConversationInteractiveTimestampAction(this.a, dqsnVar, parcel);
    }
}
