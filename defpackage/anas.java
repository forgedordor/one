package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class anas extends ancx {
    private final int a;

    public anas(int i) {
        this.a = i;
    }

    @Override // defpackage.ancx
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ancx) && this.a == ((ancx) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "OffsetPagingKey{offset=" + this.a + "}";
    }
}
