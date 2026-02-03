package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqis implements Supplier {
    final /* synthetic */ bqit a;

    public bqis(bqit bqitVar) {
        this.a = bqitVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqit bqitVar = this.a;
        MessageIdType messageIdType = bqitVar.d;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqitVar.d));
    }
}
