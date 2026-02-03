package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbro {
    public final Status a;
    public final Object b;

    public fbro(Object obj) {
        this.b = obj;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            fbro fbroVar = (fbro) obj;
            if (ejwh.a(this.a, fbroVar.a) && ejwh.a(this.b, fbroVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        Object obj = this.b;
        if (obj != null) {
            ejwf ejwfVarB = ejwg.b(this);
            ejwfVarB.b("config", obj);
            return ejwfVarB.toString();
        }
        ejwf ejwfVarB2 = ejwg.b(this);
        ejwfVarB2.b("error", this.a);
        return ejwfVarB2.toString();
    }

    public fbro(Status status) {
        this.b = null;
        this.a = status;
        ejwl.f(!status.f(), "cannot use OK status: %s", status);
    }
}
