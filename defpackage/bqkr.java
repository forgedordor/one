package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqkr implements Supplier {
    final /* synthetic */ bqks a;

    public bqkr(bqks bqksVar) {
        this.a = bqksVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqks bqksVar = this.a;
        MessageIdType messageIdType = bqksVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqksVar.b));
    }
}
