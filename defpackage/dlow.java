package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlow {
    private final fctx a;

    public dlow() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlow) && fdbq.f(this.a, ((dlow) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Flags(unused=" + this.a + ")";
    }

    public /* synthetic */ dlow(byte[] bArr) {
        this.a = fctx.a;
    }
}
