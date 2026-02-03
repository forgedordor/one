package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bnfj implements Supplier {
    final /* synthetic */ bnfk a;

    public bnfj(bnfk bnfkVar) {
        this.a = bnfkVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bnfk bnfkVar = this.a;
        ConversationIdType conversationIdType = bnfkVar.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bnfkVar.b));
    }
}
