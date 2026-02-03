package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dllt {
    public final String a;
    public final fdae b;

    public dllt(String str, fdae fdaeVar) {
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dllt)) {
            return false;
        }
        dllt dlltVar = (dllt) obj;
        return fdbq.f(this.a, dlltVar.a) && fdbq.f(this.b, dlltVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "TooltipAction(text=" + this.a + ", onClick=" + this.b + ")";
    }
}
