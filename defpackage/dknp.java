package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknp {
    public final boolean a;

    public dknp() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dknp) && this.a == ((dknp) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableProgressBarAnimation=" + this.a + ")";
    }

    public dknp(boolean z) {
        this.a = z;
    }

    public /* synthetic */ dknp(byte[] bArr) {
        this(false);
    }
}
