package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmdf {
    public final String a;
    public final Integer b;
    public final Integer c;

    public cmdf(String str, Integer num, Integer num2) {
        this.a = str;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmdf)) {
            return false;
        }
        cmdf cmdfVar = (cmdf) obj;
        return fdbq.f(this.a, cmdfVar.a) && fdbq.f(this.b, cmdfVar.b) && fdbq.f(this.c, cmdfVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "BodyTextWithPackageNameIndices(text=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ")";
    }
}
