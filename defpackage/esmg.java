package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esmg extends esnm {
    private final String a;

    public esmg(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.a = str;
    }

    @Override // defpackage.esnm
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esnm) {
            return this.a.equals(((esnm) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "HttpHeaderKey{key=" + this.a + "}";
    }
}
