package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwfp {
    public final boolean a;

    public cwfp(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwfp) && this.a == ((cwfp) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(disableSharedElementTransitionsInTests=" + this.a + ")";
    }

    public cwfp() {
        this(true);
    }
}
