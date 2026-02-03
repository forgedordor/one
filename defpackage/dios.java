package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dios {
    public final boolean a;
    private final boolean b;

    public dios() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dios)) {
            return false;
        }
        dios diosVar = (dios) obj;
        return this.a == diosVar.a && this.b == diosVar.b;
    }

    public final int hashCode() {
        return (dior.a(this.a) * 31) + dior.a(this.b);
    }

    public final String toString() {
        return "Flags(enableSwipeToShowTimestamps=" + this.a + ", disableNewTimestampsForTalkback=" + this.b + ")";
    }

    public dios(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public /* synthetic */ dios(byte[] bArr) {
        this(false, false);
    }
}
