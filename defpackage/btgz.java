package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class btgz implements Supplier {
    final /* synthetic */ bthb a;

    public btgz(bthb bthbVar) {
        this.a = bthbVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bthb bthbVar = this.a;
        MessageIdType messageIdType = bthbVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bthbVar.b));
    }
}
