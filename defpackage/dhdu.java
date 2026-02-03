package defpackage;

import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhdu extends StopAllRcsTransportsExceptRequest {
    private final ewwv a;

    public dhdu(ewwv ewwvVar) {
        if (ewwvVar == null) {
            throw new NullPointerException("Null requestProto");
        }
        this.a = ewwvVar;
    }

    @Override // com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest
    public final ewwv a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof StopAllRcsTransportsExceptRequest) {
            return this.a.equals(((StopAllRcsTransportsExceptRequest) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "StopAllRcsTransportsExceptRequest{requestProto=" + this.a.toString() + "}";
    }
}
