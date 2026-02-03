package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpmv implements Supplier {
    final /* synthetic */ bpmx a;

    public bpmv(bpmx bpmxVar) {
        this.a = bpmxVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bpmx bpmxVar = this.a;
        ConversationIdType conversationIdType = bpmxVar.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bpmxVar.a));
    }
}
