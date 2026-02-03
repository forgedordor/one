package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationEncryptionStatusAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aykj implements ayms {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public aykj(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
        fcsuVar6.getClass();
        this.f = fcsuVar6;
    }

    public final /* synthetic */ Action a(ConversationIdType conversationIdType) {
        eosc eoscVar = (eosc) this.a.b();
        eoscVar.getClass();
        conversationIdType.getClass();
        return new UpdateConversationEncryptionStatusAction(eoscVar, this.b, this.c, this.d, this.e, this.f, conversationIdType);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        eosc eoscVar = (eosc) this.a.b();
        eoscVar.getClass();
        parcel.getClass();
        return new UpdateConversationEncryptionStatusAction(eoscVar, this.b, this.c, this.d, this.e, this.f, parcel);
    }
}
