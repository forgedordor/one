package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpkb implements Supplier {
    final /* synthetic */ bpkc a;

    public bpkb(bpkc bpkcVar) {
        this.a = bpkcVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bpkc bpkcVar = this.a;
        MessageIdType messageIdType = bpkcVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bpkcVar.a));
    }
}
