package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crzk implements Supplier {
    final /* synthetic */ crzm a;

    public crzk(crzm crzmVar) {
        this.a = crzmVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        crzm crzmVar = this.a;
        MessageIdType messageIdType = crzmVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(crzmVar.a));
    }
}
