package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azfl implements Supplier {
    final /* synthetic */ azfm a;

    public azfl(azfm azfmVar) {
        this.a = azfmVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azfm azfmVar = this.a;
        MessageIdType messageIdType = azfmVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(azfmVar.b));
    }
}
