package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwbi {
    public final boolean a;

    public cwbi(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cwbi) && this.a == ((cwbi) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=" + this.a + ")";
    }

    public cwbi() {
        this(false);
    }
}
