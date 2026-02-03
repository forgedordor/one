package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbrc implements Supplier {
    final /* synthetic */ cbre a;

    public cbrc(cbre cbreVar) {
        this.a = cbreVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        cbre cbreVar = this.a;
        ConversationIdType conversationIdType = cbreVar.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(cbreVar.a));
    }
}
