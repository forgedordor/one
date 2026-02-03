package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class buxo implements Supplier {
    final /* synthetic */ buxp a;

    public buxo(buxp buxpVar) {
        this.a = buxpVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        buxp buxpVar = this.a;
        MessageIdType messageIdType = buxpVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(buxpVar.b));
    }
}
