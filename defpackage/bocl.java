package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bocl implements Supplier {
    final /* synthetic */ bocm a;

    public bocl(bocm bocmVar) {
        this.a = bocmVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bocm bocmVar = this.a;
        ConversationIdType conversationIdType = bocmVar.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bocmVar.b));
    }
}
