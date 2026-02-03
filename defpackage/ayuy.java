package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayuy implements Supplier {
    final /* synthetic */ ayuz a;

    public ayuy(ayuz ayuzVar) {
        this.a = ayuzVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ayuz ayuzVar = this.a;
        ConversationIdType conversationIdType = ayuzVar.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(ayuzVar.b));
    }
}
