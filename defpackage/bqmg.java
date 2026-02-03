package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqmg implements Supplier {
    final /* synthetic */ bqmh a;

    public bqmg(bqmh bqmhVar) {
        this.a = bqmhVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqmh bqmhVar = this.a;
        MessageIdType messageIdType = bqmhVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqmhVar.b));
    }
}
