package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnnn extends dnno {
    public final String a;

    public dnnn(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dnnn) && fdbq.f(this.a, ((dnnn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Search(query=" + this.a + ")";
    }
}
