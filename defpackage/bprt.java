package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bprt implements Supplier {
    final /* synthetic */ bpru a;

    public bprt(bpru bpruVar) {
        this.a = bpruVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bpru bpruVar = this.a;
        ConversationIdType conversationIdType = bpruVar.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bpruVar.b));
    }
}
