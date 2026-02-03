package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aywe implements Supplier {
    final /* synthetic */ aywg a;

    public aywe(aywg aywgVar) {
        this.a = aywgVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        aywg aywgVar = this.a;
        ConversationIdType conversationIdType = aywgVar.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(aywgVar.a));
    }
}
