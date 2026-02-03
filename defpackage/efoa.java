package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class efoa {
    static efoa d(ContentType contentType, Class cls, Supplier supplier) {
        if (contentType != null) {
            return new efmz(contentType, cls, supplier);
        }
        throw new NullPointerException("Null contentType");
    }

    public abstract ContentType a();

    public abstract Class b();

    public abstract Supplier c();

    final efoe e() {
        return (efoe) c().get();
    }
}
