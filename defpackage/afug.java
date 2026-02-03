package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afug {
    public final boolean a;

    public afug(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afug) && this.a == ((afug) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableMultiShareCoolRanchPhase3=" + this.a + ")";
    }

    public afug() {
        this(false);
    }
}
