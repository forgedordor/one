package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bnvg implements Supplier {
    final /* synthetic */ bnvi a;

    public bnvg(bnvi bnviVar) {
        this.a = bnviVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bnvi bnviVar = this.a;
        ConversationIdType conversationIdType = bnviVar.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bnviVar.b));
    }
}
