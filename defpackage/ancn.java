package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ancn {
    public final String a;

    public ancn(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ancn) && fdbq.f(this.a, ((ancn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MutationId(id=" + this.a + ")";
    }
}
