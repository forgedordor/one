package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlyn extends dlyp {
    public final Throwable a;

    public dlyn() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlyn) && fdbq.f(this.a, ((dlyn) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "ClosePacket(reason=" + this.a + ")";
    }

    public dlyn(Throwable th) {
        this.a = th;
    }

    public /* synthetic */ dlyn(byte[] bArr) {
        this((Throwable) null);
    }
}
