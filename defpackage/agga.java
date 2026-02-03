package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agga implements afzv {
    public final ctia a;
    private final int b = 3;

    public agga(ctia ctiaVar) {
        this.a = ctiaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agga)) {
            return false;
        }
        agga aggaVar = (agga) obj;
        int i = aggaVar.b;
        return fdbq.f(this.a, aggaVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 93;
    }

    public final String toString() {
        return cqcv.b(super.toString()).toString();
    }
}
