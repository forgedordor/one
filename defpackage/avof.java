package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avof extends avpq {
    public final String a;

    public avof(String str) {
        if (str == null) {
            throw new NullPointerException("Null destinationKey");
        }
        this.a = str;
    }

    @Override // defpackage.avpq
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof avpq) {
            return this.a.equals(((avpq) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CacheKey{destinationKey=" + this.a + "}";
    }
}
