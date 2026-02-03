package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ayzk implements Supplier {
    final /* synthetic */ ayzl a;

    public ayzk(ayzl ayzlVar) {
        this.a = ayzlVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ayzl ayzlVar = this.a;
        MessageIdType messageIdType = ayzlVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(ayzlVar.b));
    }
}
