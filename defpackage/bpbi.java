package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpbi implements Supplier {
    final /* synthetic */ bpbj a;

    public bpbi(bpbj bpbjVar) {
        this.a = bpbjVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bpbj bpbjVar = this.a;
        ConversationIdType conversationIdType = bpbjVar.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bpbjVar.a));
    }
}
