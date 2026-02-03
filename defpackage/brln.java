package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class brln implements Supplier {
    final /* synthetic */ brlo a;

    public brln(brlo brloVar) {
        this.a = brloVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        brlo brloVar = this.a;
        MessageIdType messageIdType = brloVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(brloVar.b));
    }
}
