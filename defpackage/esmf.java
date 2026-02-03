package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esmf extends esmv {
    public final ekhx a;

    public esmf(ekhx ekhxVar) {
        this.a = ekhxVar;
    }

    @Override // defpackage.esmv
    public final ekhx a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esmv) {
            return this.a.equals(((esmv) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GrpcServiceConfig{grpcMethodConfigs=" + this.a.toString() + "}";
    }
}
