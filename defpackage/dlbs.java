package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbs {
    public final boolean a;

    public dlbs(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlbs) && this.a == ((dlbs) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=" + this.a + ")";
    }

    public dlbs() {
        this(false);
    }
}
