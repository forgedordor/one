package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcx {
    public final boolean a;

    public djcx(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djcx) && this.a == ((djcx) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(increaseMaxComposeRowHeight=" + this.a + ")";
    }

    public djcx() {
        this(false);
    }
}
