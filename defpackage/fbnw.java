package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbnw {
    public final fbnv a;
    public final Status b;

    public fbnw(fbnv fbnvVar, Status status) {
        fbnvVar.getClass();
        this.a = fbnvVar;
        status.getClass();
        this.b = status;
    }

    public static fbnw a(fbnv fbnvVar) {
        ejwl.b(fbnvVar != fbnv.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new fbnw(fbnvVar, Status.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fbnw)) {
            return false;
        }
        fbnw fbnwVar = (fbnw) obj;
        return this.a.equals(fbnwVar.a) && this.b.equals(fbnwVar.b);
    }

    public final int hashCode() {
        Status status = this.b;
        return status.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Status status = this.b;
        if (status.f()) {
            return this.a.toString();
        }
        return this.a.toString() + "(" + status.toString() + ")";
    }
}
