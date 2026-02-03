package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crzl implements Supplier {
    final /* synthetic */ crzm a;

    public crzl(crzm crzmVar) {
        this.a = crzmVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        crzm crzmVar = this.a;
        ConversationIdType conversationIdType = crzmVar.c;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(crzmVar.c));
    }
}
