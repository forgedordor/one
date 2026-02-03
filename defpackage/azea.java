package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azea implements Supplier {
    final /* synthetic */ azec a;

    public azea(azec azecVar) {
        this.a = azecVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azec azecVar = this.a;
        MessageIdType messageIdType = azecVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(azecVar.a));
    }
}
