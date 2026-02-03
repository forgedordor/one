package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class citd implements Callable {
    final /* synthetic */ ConversationIdType a;
    final /* synthetic */ cite b;

    public citd(cite citeVar, ConversationIdType conversationIdType) {
        this.a = conversationIdType;
        this.b = citeVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return ((bakt) this.b.d.b()).r(this.a);
    }
}
