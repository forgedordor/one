package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class btha implements Supplier {
    final /* synthetic */ bthb a;

    public btha(bthb bthbVar) {
        this.a = bthbVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bthb bthbVar = this.a;
        ConversationIdType conversationIdType = bthbVar.c;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bthbVar.c));
    }
}
