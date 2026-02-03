package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aznv implements Supplier {
    final /* synthetic */ aznw a;

    public aznv(aznw aznwVar) {
        this.a = aznwVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        aznw aznwVar = this.a;
        MessageIdType messageIdType = aznwVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(aznwVar.b));
    }
}
