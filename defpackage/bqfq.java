package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqfq implements Supplier {
    final /* synthetic */ bqfr a;

    public bqfq(bqfr bqfrVar) {
        this.a = bqfrVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqfr bqfrVar = this.a;
        MessageIdType messageIdType = bqfrVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqfrVar.b));
    }
}
