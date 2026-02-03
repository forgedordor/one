package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xho implements xhq {
    private final Exception a;

    public xho() {
        this((char[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xho)) {
            return false;
        }
        Exception exc = ((xho) obj).a;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return a.h(null, "Rejected(exception=", ")");
    }

    public xho(byte[] bArr) {
        this.a = null;
    }

    public /* synthetic */ xho(char[] cArr) {
        this((byte[]) null);
    }
}
