package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.scheduledsend.database.ScheduledSendTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmbd implements Supplier {
    final /* synthetic */ ScheduledSendTable.BindData a;

    public cmbd(ScheduledSendTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ScheduledSendTable.BindData bindData = this.a;
        ConversationIdType conversationIdType = bindData.c;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bindData.c));
    }
}
