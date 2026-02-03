package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dknj {
    public final boolean a;

    public dknj() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dknj) && this.a == ((dknj) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(useNewUx=" + this.a + ")";
    }

    public dknj(boolean z) {
        this.a = z;
    }

    public /* synthetic */ dknj(byte[] bArr) {
        this(false);
    }
}
