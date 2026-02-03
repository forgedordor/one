package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azck implements Supplier {
    final /* synthetic */ azcl a;

    public azck(azcl azclVar) {
        this.a = azclVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azcl azclVar = this.a;
        MessageIdType messageIdType = azclVar.d;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(azclVar.d));
    }
}
