package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qig {
    public final String a;
    public final Long b;

    public qig(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qig)) {
            return false;
        }
        qig qigVar = (qig) obj;
        return fdbq.f(this.a, qigVar.a) && fdbq.f(this.b, qigVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
