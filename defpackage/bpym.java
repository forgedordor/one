package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bpym implements Supplier {
    final /* synthetic */ bpyn a;

    public bpym(bpyn bpynVar) {
        this.a = bpynVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bpyn bpynVar = this.a;
        MessageIdType messageIdType = bpynVar.c;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bpynVar.c));
    }
}
