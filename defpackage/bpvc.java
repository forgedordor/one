package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpvc implements Supplier {
    final /* synthetic */ bpvd a;

    public bpvc(bpvd bpvdVar) {
        this.a = bpvdVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bpvd bpvdVar = this.a;
        MessageIdType messageIdType = bpvdVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bpvdVar.b));
    }
}
