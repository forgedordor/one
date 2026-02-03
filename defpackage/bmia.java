package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bmia implements Supplier {
    final /* synthetic */ bmib a;

    public bmia(bmib bmibVar) {
        this.a = bmibVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bmib bmibVar = this.a;
        ConversationIdType conversationIdType = bmibVar.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bmibVar.b));
    }
}
