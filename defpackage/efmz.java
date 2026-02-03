package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efmz extends efoa {
    private final ContentType a;
    private final Class b;
    private final Supplier c;

    public efmz(ContentType contentType, Class cls, Supplier supplier) {
        this.a = contentType;
        this.b = cls;
        this.c = supplier;
    }

    @Override // defpackage.efoa
    public final ContentType a() {
        return this.a;
    }

    @Override // defpackage.efoa
    public final Class b() {
        return this.b;
    }

    @Override // defpackage.efoa
    public final Supplier c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efoa) {
            efoa efoaVar = (efoa) obj;
            if (this.a.equals(efoaVar.a()) && this.b.equals(efoaVar.b()) && this.c.equals(efoaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        Supplier supplier = this.c;
        Class cls = this.b;
        return "Configuration{contentType=" + this.a.toString() + ", messageType=" + cls.toString() + ", factory=" + supplier.toString() + "}";
    }
}
