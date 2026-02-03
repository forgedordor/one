package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class boto implements Supplier {
    final /* synthetic */ botp a;

    public boto(botp botpVar) {
        this.a = botpVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        botp botpVar = this.a;
        ConversationIdType conversationIdType = botpVar.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(botpVar.a));
    }
}
