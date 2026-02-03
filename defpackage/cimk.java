package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cimk implements Supplier {
    final /* synthetic */ ciml a;

    public cimk(ciml cimlVar) {
        this.a = cimlVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        ciml cimlVar = this.a;
        MessageIdType messageIdType = cimlVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(cimlVar.a));
    }
}
