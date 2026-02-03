package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bquk implements Supplier {
    final /* synthetic */ MessagesTable.BindData a;

    public bquk(MessagesTable.BindData bindData) {
        this.a = bindData;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        MessagesTable.BindData bindData = this.a;
        ConversationIdType conversationIdType = bindData.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bindData.b));
    }
}
