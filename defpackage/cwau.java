package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwau {
    public final boolean a;
    public final boolean b;

    public cwau() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwau)) {
            return false;
        }
        cwau cwauVar = (cwau) obj;
        return this.a == cwauVar.a && this.b == cwauVar.b;
    }

    public final int hashCode() {
        return (cwat.a(this.a) * 31) + cwat.a(this.b);
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=" + this.a + ", enableShortTitle=" + this.b + ")";
    }

    public cwau(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ cwau(byte[] bArr) {
        this(false, false);
    }
}
