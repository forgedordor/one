package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class brnr implements Supplier {
    final /* synthetic */ brns a;

    public brnr(brns brnsVar) {
        this.a = brnsVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        brns brnsVar = this.a;
        ConversationIdType conversationIdType = brnsVar.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(brnsVar.a));
    }
}
