package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpdd implements Supplier {
    final /* synthetic */ bpde a;

    public bpdd(bpde bpdeVar) {
        this.a = bpdeVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bpde bpdeVar = this.a;
        MessageIdType messageIdType = bpdeVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bpdeVar.a));
    }
}
