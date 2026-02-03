package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class boaq implements Supplier {
    final /* synthetic */ boar a;

    public boaq(boar boarVar) {
        this.a = boarVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        boar boarVar = this.a;
        ConversationIdType conversationIdType = boarVar.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(boarVar.b));
    }
}
