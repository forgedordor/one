package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqrl implements Supplier {
    final /* synthetic */ bqrm a;

    public bqrl(bqrm bqrmVar) {
        this.a = bqrmVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqrm bqrmVar = this.a;
        MessageIdType messageIdType = bqrmVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqrmVar.b));
    }
}
