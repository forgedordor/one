package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksj {
    public final boolean a;

    public dksj(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dksj) && this.a == ((dksj) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableZippyToS=" + this.a + ")";
    }

    public dksj() {
        this(false);
    }
}
