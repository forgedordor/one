package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctpi {
    public final fdvc a;
    public final fdae b;

    public ctpi(fdvc fdvcVar, fdae fdaeVar) {
        this.a = fdvcVar;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctpi)) {
            return false;
        }
        ctpi ctpiVar = (ctpi) obj;
        return fdbq.f(this.a, ctpiVar.a) && fdbq.f(this.b, ctpiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DestinationsDialogUiData(destinations=" + this.a + ", onDismiss=" + this.b + ")";
    }
}
