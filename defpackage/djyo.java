package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djyo {
    public final boolean a;

    public djyo() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djyo) && this.a == ((djyo) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=" + this.a + ")";
    }

    public djyo(boolean z) {
        this.a = z;
    }

    public /* synthetic */ djyo(byte[] bArr) {
        this(false);
    }
}
