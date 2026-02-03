package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqac implements Supplier {
    final /* synthetic */ bqad a;

    public bqac(bqad bqadVar) {
        this.a = bqadVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqad bqadVar = this.a;
        MessageIdType messageIdType = bqadVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqadVar.a));
    }
}
