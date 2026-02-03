package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cokj implements Supplier {
    final /* synthetic */ cokk a;

    public cokj(cokk cokkVar) {
        this.a = cokkVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        cokk cokkVar = this.a;
        MessageIdType messageIdType = cokkVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(cokkVar.a));
    }
}
