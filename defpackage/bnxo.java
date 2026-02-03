package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ConversationNotificationSettingsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bnxo implements Supplier {
    final /* synthetic */ ConversationNotificationSettingsTable.BindData a;

    public bnxo(ConversationNotificationSettingsTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ConversationNotificationSettingsTable.BindData bindData = this.a;
        ConversationIdType conversationIdType = bindData.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bindData.a));
    }
}
