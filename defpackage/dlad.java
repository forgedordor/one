package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlad {
    public final String a;
    public final fdae b;

    public dlad(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlad)) {
            return false;
        }
        dlad dladVar = (dlad) obj;
        return fdbq.f(this.a, dladVar.a) && fdbq.f(this.b, dladVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AlertCardButton(text=" + this.a + ", onClick=" + this.b + ")";
    }
}
