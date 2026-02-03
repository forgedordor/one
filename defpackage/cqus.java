package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqus extends cqut {
    private final Integer a;

    public cqus(Integer num) {
        this.a = num;
    }

    @Override // defpackage.cqut, defpackage.cqum
    public final Integer c() {
        return this.a;
    }

    @Override // defpackage.cqum
    public final int e() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqum) {
            cqum cqumVar = (cqum) obj;
            if (cqumVar.e() == 3 && this.a.equals(cqumVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DataSource{resourceId=" + this.a + "}";
    }
}
