package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bqbf implements Supplier {
    final /* synthetic */ bqbg a;

    public bqbf(bqbg bqbgVar) {
        this.a = bqbgVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bqbg bqbgVar = this.a;
        MessageIdType messageIdType = bqbgVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bqbgVar.b));
    }
}
