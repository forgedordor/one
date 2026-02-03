package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afpq implements afpr {
    public final vvw a;

    public afpq(vvw vvwVar) {
        vvwVar.getClass();
        this.a = vvwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afpq) && fdbq.f(this.a, ((afpq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Enabled(draft=" + this.a + ")";
    }
}
