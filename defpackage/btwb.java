package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class btwb implements Supplier {
    final /* synthetic */ btwc a;

    public btwb(btwc btwcVar) {
        this.a = btwcVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        btwc btwcVar = this.a;
        MessageIdType messageIdType = btwcVar.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(btwcVar.a));
    }
}
