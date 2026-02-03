package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avpx implements Supplier {
    final /* synthetic */ avpy a;

    public avpx(avpy avpyVar) {
        this.a = avpyVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        avpy avpyVar = this.a;
        ConversationIdType conversationIdType = avpyVar.d;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(avpyVar.d));
    }
}
