package defpackage;

import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhdt extends InitializeAndStartRcsTransportRequest {
    private final ewwr a;

    public dhdt(ewwr ewwrVar) {
        if (ewwrVar == null) {
            throw new NullPointerException("Null requestProto");
        }
        this.a = ewwrVar;
    }

    @Override // com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest
    public final ewwr a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InitializeAndStartRcsTransportRequest) {
            return this.a.equals(((InitializeAndStartRcsTransportRequest) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "InitializeAndStartRcsTransportRequest{requestProto=" + this.a.toString() + "}";
    }
}
