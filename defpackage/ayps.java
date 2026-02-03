package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ayps implements ayms {
    public abstract Action a(ezol ezolVar, String str, long j);

    public abstract Action b(ezol ezolVar, String str, ConversationIdType conversationIdType, boolean z);

    @Override // defpackage.ayms
    public abstract Action c(Parcel parcel);
}
