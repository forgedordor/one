package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yce {
    public final oxm a;

    public yce(oxm oxmVar) {
        oxmVar.getClass();
        this.a = oxmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yce) && fdbq.f(this.a, ((yce) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LazyPagingWrapper(items=" + this.a + ")";
    }
}
