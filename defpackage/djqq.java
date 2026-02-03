package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqq implements djqd {
    private final fdae a;
    private final fctc b;

    public djqq(fdae fdaeVar) {
        this.a = fdaeVar;
        this.b = fctd.b(3, fdaeVar);
    }

    @Override // defpackage.djqd
    public final djqp a() {
        return (djqp) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djqq) && fdbq.f(this.a, ((djqq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LazyFavoriteUiData(initializer=" + this.a + ")";
    }
}
