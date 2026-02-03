package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqea implements Supplier {
    final /* synthetic */ bqec a;

    public bqea(bqec bqecVar) {
        this.a = bqecVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqec bqecVar = this.a;
        MessageIdType messageIdType = bqecVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqecVar.a));
    }
}
