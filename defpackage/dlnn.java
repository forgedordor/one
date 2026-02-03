package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlnn implements dlnq {
    public final String a;
    public final String b;
    public final boolean c;
    public final fdap d;
    public final fdae e;
    public final dlnl f;

    public dlnn(String str, String str2, boolean z, fdap fdapVar, fdae fdaeVar, dlnl dlnlVar) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = fdapVar;
        this.e = fdaeVar;
        this.f = dlnlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlnn)) {
            return false;
        }
        dlnn dlnnVar = (dlnn) obj;
        return fdbq.f(this.a, dlnnVar.a) && fdbq.f(this.b, dlnnVar.b) && this.c == dlnnVar.c && fdbq.f(this.d, dlnnVar.d) && fdbq.f(this.e, dlnnVar.e) && fdbq.f(this.f, dlnnVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "SearchBox(initialQuery=" + this.a + ", hintText=" + this.b + ", useBodyMedium=" + this.c + ", onTextChange=" + this.d + ", onSearch=" + this.e + ", flags=" + this.f + ")";
    }
}
