package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afvs {
    public final boolean a;

    public afvs() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afvs) && this.a == ((afvs) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableMultiShareCoolRanchPhase3=" + this.a + ")";
    }

    public afvs(boolean z) {
        this.a = z;
    }

    public /* synthetic */ afvs(byte[] bArr) {
        this(false);
    }
}
