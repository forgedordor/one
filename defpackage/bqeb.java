package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqeb implements Supplier {
    final /* synthetic */ bqec a;

    public bqeb(bqec bqecVar) {
        this.a = bqecVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqec bqecVar = this.a;
        MessageIdType messageIdType = bqecVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqecVar.b));
    }
}
