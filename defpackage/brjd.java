package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class brjd implements Supplier {
    final /* synthetic */ brje a;

    public brjd(brje brjeVar) {
        this.a = brjeVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        brje brjeVar = this.a;
        MessageIdType messageIdType = brjeVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(brjeVar.b));
    }
}
