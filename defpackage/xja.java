package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xja implements xjb {
    private final Exception a;

    public xja() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xja)) {
            return false;
        }
        Exception exc = ((xja) obj).a;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return a.h(null, "Rejected(exception=", ")");
    }

    public /* synthetic */ xja(byte[] bArr) {
        this.a = null;
    }
}
