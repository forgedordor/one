package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpld implements Supplier {
    final /* synthetic */ bple a;

    public bpld(bple bpleVar) {
        this.a = bpleVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bple bpleVar = this.a;
        MessageIdType messageIdType = bpleVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bpleVar.b));
    }
}
