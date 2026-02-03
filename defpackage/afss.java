package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afss {
    public final String a;
    public final djyu b;
    public final String c;

    public afss(String str, djyu djyuVar, String str2) {
        str.getClass();
        this.a = str;
        this.b = djyuVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afss)) {
            return false;
        }
        afss afssVar = (afss) obj;
        return fdbq.f(this.a, afssVar.a) && fdbq.f(this.b, afssVar.b) && fdbq.f(this.c, afssVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ContactUiData(id=" + this.a + ", itemUiData=" + this.b + ", header=" + this.c + ")";
    }
}
