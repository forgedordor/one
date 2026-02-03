package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cplu extends cpti {
    private final ekgp a;

    public cplu(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    @Override // defpackage.cpti
    public final ekgp a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cpti) {
            return ekmi.m(this.a, ((cpti) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CmsMessageCalculatedObjectData{calculatedPartsData=" + String.valueOf(this.a) + "}";
    }
}
