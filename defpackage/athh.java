package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class athh {
    public final String a;

    public athh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof athh) && fdbq.f(this.a, ((athh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProcessingId(id=" + this.a + ")";
    }
}
