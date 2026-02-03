package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyui extends dyuq {
    private final dyup a;

    public dyui(dyup dyupVar) {
        this.a = dyupVar;
    }

    @Override // defpackage.dyuq
    public final dyup a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyuq) {
            return equals(((dyuq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return hashCode() ^ 1000003;
    }

    public final String toString() {
        return "LogoViewFeature{logoViewInflater=" + toString() + "}";
    }
}
