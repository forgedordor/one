package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctnc implements ctnf {
    public final String a;

    public ctnc(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctnc) && fdbq.f(this.a, ((ctnc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Header(value=" + this.a + ")";
    }
}
