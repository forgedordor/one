package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azgo implements Supplier {
    final /* synthetic */ azgs a;

    public azgo(azgs azgsVar) {
        this.a = azgsVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azgs azgsVar = this.a;
        MessageIdType messageIdType = azgsVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(azgsVar.a));
    }
}
