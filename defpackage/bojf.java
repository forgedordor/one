package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bojf implements Supplier {
    final /* synthetic */ bojh a;

    public bojf(bojh bojhVar) {
        this.a = bojhVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bojh bojhVar = this.a;
        ConversationIdType conversationIdType = bojhVar.ai;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bojhVar.ai));
    }
}
