package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqhl implements Supplier {
    final /* synthetic */ bqhm a;

    public bqhl(bqhm bqhmVar) {
        this.a = bqhmVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqhm bqhmVar = this.a;
        MessageIdType messageIdType = bqhmVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqhmVar.a));
    }
}
