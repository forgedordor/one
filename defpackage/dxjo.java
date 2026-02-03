package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxjo extends dxju {
    private final String e;

    public dxjo(String str) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.e = str;
    }

    @Override // defpackage.dxju
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxju) {
            return this.e.equals(((dxju) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GnpHttpHeaderKey{key=" + this.e + "}";
    }
}
