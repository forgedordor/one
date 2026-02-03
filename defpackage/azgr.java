package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azgr implements Supplier {
    final /* synthetic */ azgs a;

    public azgr(azgs azgsVar) {
        this.a = azgsVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azgs azgsVar = this.a;
        ConversationIdType conversationIdType = azgsVar.g;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(azgsVar.g));
    }
}
