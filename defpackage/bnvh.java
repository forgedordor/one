package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bnvh implements Supplier {
    final /* synthetic */ bnvi a;

    public bnvh(bnvi bnviVar) {
        this.a = bnviVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bnvi bnviVar = this.a;
        MessageIdType messageIdType = bnviVar.d;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bnviVar.d));
    }
}
