package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayth implements Supplier {
    final /* synthetic */ ayti a;

    public ayth(ayti aytiVar) {
        this.a = aytiVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ayti aytiVar = this.a;
        ConversationIdType conversationIdType = aytiVar.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(aytiVar.b));
    }
}
