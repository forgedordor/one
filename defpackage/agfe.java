package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agfe implements einb {
    private final String a;

    public agfe(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agfe) && fdbq.f(this.a, ((agfe) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Renamed(newName=" + this.a + ")";
    }
}
