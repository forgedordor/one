package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azbh implements Supplier {
    final /* synthetic */ azbi a;

    public azbh(azbi azbiVar) {
        this.a = azbiVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        azbi azbiVar = this.a;
        MessageIdType messageIdType = azbiVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(azbiVar.a));
    }
}
