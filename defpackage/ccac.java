package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccac extends ccad {
    private final ccan a;

    public ccac(ccan ccanVar) {
        ccanVar.getClass();
        this.a = ccanVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccac) && fdbq.f(this.a, ((ccac) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Pending(innerResult=" + this.a + ")";
    }
}
