package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehav extends ehck {
    private final Object a;

    public ehav(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null data");
        }
        this.a = obj;
    }

    @Override // defpackage.ehck, defpackage.ehcl
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehck) {
            return this.a.equals(((ehck) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Success{data=" + this.a.toString() + "}";
    }
}
