package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abgl {
    private final String a;
    private final long b;

    public abgl(String str) throws NumberFormatException {
        this.a = str;
        long j = -1;
        if (str != null && !fdgn.H(str)) {
            try {
                j = Long.parseLong(fdgn.t(str, "cid:") ? fdgn.q(str, "cid:", "") : str);
            } catch (NumberFormatException unused) {
            }
        }
        this.b = j;
    }

    public final String a() {
        return b() ? "" : String.valueOf(this.b);
    }

    public final boolean b() {
        return this.a == null || this.b < 0;
    }

    public final String toString() {
        String str = this.a;
        return (str == null || b()) ? "" : !fdgn.t(str, "cid") ? "cid:".concat(str) : str;
    }
}
