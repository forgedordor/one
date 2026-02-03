package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class swh implements swi {
    public final exxw a;

    public swh(exxw exxwVar) {
        this.a = exxwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swh) && fdbq.f(this.a, ((swh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Result(sodaEvent=" + this.a + ")";
    }
}
