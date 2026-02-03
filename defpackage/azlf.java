package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azlf implements Supplier {
    final /* synthetic */ azlg a;

    public azlf(azlg azlgVar) {
        this.a = azlgVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azlg azlgVar = this.a;
        MessageIdType messageIdType = azlgVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(azlgVar.b));
    }
}
