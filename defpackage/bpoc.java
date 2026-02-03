package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpoc implements Supplier {
    final /* synthetic */ bpod a;

    public bpoc(bpod bpodVar) {
        this.a = bpodVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bpod bpodVar = this.a;
        ConversationIdType conversationIdType = bpodVar.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bpodVar.a));
    }
}
