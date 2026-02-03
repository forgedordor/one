package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bmku implements Supplier {
    final /* synthetic */ bmkv a;

    public bmku(bmkv bmkvVar) {
        this.a = bmkvVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bmkv bmkvVar = this.a;
        ConversationIdType conversationIdType = bmkvVar.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bmkvVar.b));
    }
}
