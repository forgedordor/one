package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afrr {
    public final boolean a;

    public afrr(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afrr) && this.a == ((afrr) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableMultiShareCoolRanchPhase3=" + this.a + ")";
    }

    public afrr() {
        this(false);
    }
}
