package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ajob extends ajpo {
    private final int a;

    public ajob(int i) {
        this.a = i;
    }

    @Override // defpackage.ajpo
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof ajpo) && this.a == ((ajpo) obj).a();
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "OffsetPagingKey{offset=" + this.a + "}";
    }
}
