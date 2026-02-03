package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbte {
    private final Status a;
    private final Object b;

    public fbte(Status status, Object obj) {
        this.a = status;
        this.b = obj;
    }

    public static fbte b(Status status) {
        status.getClass();
        fbte fbteVar = new fbte(status, null);
        ejwl.f(!status.f(), "cannot use OK status: %s", status);
        return fbteVar;
    }

    public final Status a() {
        Status status = this.a;
        return status == null ? Status.b : status;
    }

    public final Object c() {
        if (this.a == null) {
            return this.b;
        }
        throw new IllegalStateException("No value present.");
    }

    public final boolean d() {
        return this.a == null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fbte)) {
            return false;
        }
        fbte fbteVar = (fbte) obj;
        if (d() == fbteVar.d()) {
            return d() ? ejwh.a(this.b, fbteVar.b) : ejwh.a(this.a, fbteVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ejwf ejwfVarB = ejwg.b(this);
        Status status = this.a;
        if (status == null) {
            ejwfVarB.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, this.b);
        } else {
            ejwfVarB.b("error", status);
        }
        return ejwfVarB.toString();
    }
}
