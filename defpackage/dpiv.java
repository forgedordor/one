package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpiv extends dpix {
    public final dpji a;

    public dpiv(dpji dpjiVar) {
        this.a = dpjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpiv) && fdbq.f(this.a, ((dpiv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Attached(detector=" + this.a + ")";
    }
}
