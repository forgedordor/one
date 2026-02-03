package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bodr implements Supplier {
    final /* synthetic */ bods a;

    public bodr(bods bodsVar) {
        this.a = bodsVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bods bodsVar = this.a;
        MessageIdType messageIdType = bodsVar.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            return null;
        }
        return Long.valueOf(bary.a(bodsVar.b));
    }
}
