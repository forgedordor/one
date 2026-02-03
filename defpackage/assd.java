package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class assd extends assi {
    private final ekhx a;

    public assd(ekhx ekhxVar) {
        if (ekhxVar == null) {
            throw new NullPointerException("Null capabilityTags");
        }
        this.a = ekhxVar;
    }

    @Override // defpackage.assi
    public final ekhx a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof assi) {
            return this.a.equals(((assi) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RcsCapabilities{capabilityTags=" + this.a.toString() + "}";
    }
}
