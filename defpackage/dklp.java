package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dklp {
    public final int a;

    public dklp(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dklp) && this.a == ((dklp) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Flags(groupMessageMonogramSizeDp=" + this.a + ")";
    }

    public dklp() {
        this(24);
    }
}
