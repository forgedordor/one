package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diuz {
    public final boolean a;

    public diuz(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof diuz) && this.a == ((diuz) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(zippyGaiaTosEnabled=" + this.a + ")";
    }

    public diuz() {
        this(false);
    }
}
