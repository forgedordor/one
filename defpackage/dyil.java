package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyil extends dyiz {
    private final ejwi a;

    public dyil(ejwi ejwiVar) {
        this.a = ejwiVar;
    }

    @Override // defpackage.dyiz
    public final ejwi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyiz) {
            return this.a.equals(((dyiz) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return 2041338095;
    }

    public final String toString() {
        return "NonCollapsibleFlavorFeatureImpl{minimizableStorageCardRetriever=Optional.absent()}";
    }
}
