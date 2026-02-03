package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqir implements Supplier {
    final /* synthetic */ bqit a;

    public bqir(bqit bqitVar) {
        this.a = bqitVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqit bqitVar = this.a;
        MessageIdType messageIdType = bqitVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqitVar.b));
    }
}
