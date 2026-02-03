package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnnt {
    public final dnmj a;
    private final List b;

    public dnnt(dnmj dnmjVar, List list) {
        this.a = dnmjVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnnt)) {
            return false;
        }
        dnnt dnntVar = (dnnt) obj;
        return fdbq.f(this.a, dnntVar.a) && fdbq.f(this.b, dnntVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Result(emojiSet=" + this.a + ", searchTerms=" + this.b + ")";
    }
}
