package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlsu {
    public final String a;

    public dlsu(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlsu) && fdbq.f(this.a, ((dlsu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AccountName(value=" + this.a + ")";
    }
}
