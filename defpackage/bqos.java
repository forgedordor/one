package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqos implements Supplier {
    final /* synthetic */ bqou a;

    public bqos(bqou bqouVar) {
        this.a = bqouVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqou bqouVar = this.a;
        MessageIdType messageIdType = bqouVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqouVar.b));
    }
}
