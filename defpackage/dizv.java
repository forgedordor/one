package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dizv {
    public final boolean a;

    public dizv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dizv) && this.a == ((dizv) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=" + this.a + ")";
    }

    public dizv() {
        this(false);
    }
}
