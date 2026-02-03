package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkod {
    public final String a;

    public dkod(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkod) && fdbq.f(this.a, ((dkod) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Text(text=" + this.a + ")";
    }
}
