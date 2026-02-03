package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxt {
    public final boolean a;

    public daxt(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof daxt) && this.a == ((daxt) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(useProfilePrimitive=" + this.a + ")";
    }

    public daxt() {
        this(false);
    }
}
