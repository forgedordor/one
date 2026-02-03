package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwcu {
    public final boolean a;

    public cwcu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwcu) && this.a == ((cwcu) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(disableSharedElementTransitionsInTests=" + this.a + ")";
    }

    public cwcu() {
        this(true);
    }
}
