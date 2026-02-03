package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccaa extends ccad {
    private final ccan a;

    public ccaa(ccan ccanVar) {
        ccanVar.getClass();
        this.a = ccanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccaa) && fdbq.f(this.a, ((ccaa) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Other(innerResult=" + this.a + ")";
    }
}
