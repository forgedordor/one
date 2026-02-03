package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vrr {
    public final boolean a;

    public vrr(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vrr) && this.a == ((vrr) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(animateShowingAndHidingHugo=" + this.a + ")";
    }

    public vrr() {
        this(false);
    }
}
