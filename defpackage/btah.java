package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class btah implements Supplier {
    final /* synthetic */ btai a;

    public btah(btai btaiVar) {
        this.a = btaiVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        btai btaiVar = this.a;
        MessageIdType messageIdType = btaiVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(btaiVar.b));
    }
}
