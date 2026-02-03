package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RequestSmartSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayeo implements ayms {
    private final fcsu a;
    private final fcsu b;

    public ayeo(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
    }

    public final /* bridge */ /* synthetic */ Action a(ConversationIdType conversationIdType, MessageIdType messageIdType, int i) {
        ayez ayezVar = (ayez) this.a.b();
        ayezVar.getClass();
        conversationIdType.getClass();
        messageIdType.getClass();
        return new RequestSmartSuggestionsAction(ayezVar, this.b, conversationIdType, messageIdType, i);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        ayez ayezVar = (ayez) this.a.b();
        ayezVar.getClass();
        parcel.getClass();
        return new RequestSmartSuggestionsAction(ayezVar, this.b, parcel);
    }
}
