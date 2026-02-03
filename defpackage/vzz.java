package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vzz {
    public final djrr a;
    public final int b;
    public final Integer c;
    public final vzy d;
    public final Integer e;

    public vzz(djrr djrrVar, int i, Integer num, vzy vzyVar, Integer num2) {
        djrrVar.getClass();
        this.a = djrrVar;
        this.b = i;
        this.c = num;
        this.d = vzyVar;
        this.e = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzz)) {
            return false;
        }
        vzz vzzVar = (vzz) obj;
        return this.a == vzzVar.a && this.b == vzzVar.b && fdbq.f(this.c, vzzVar.c) && this.d == vzzVar.d && fdbq.f(this.e, vzzVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.c;
        int iHashCode2 = (((iHashCode + this.b) * 31) + (num == null ? 0 : num.hashCode())) * 31;
        vzy vzyVar = this.d;
        int iHashCode3 = (iHashCode2 + (vzyVar == null ? 0 : vzyVar.hashCode())) * 31;
        Integer num2 = this.e;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        return "SendIconData(icon=" + this.a + ", contentDescription=" + this.b + ", label=" + this.c + ", disabled=" + this.d + ", contentDescriptionWithProfile=" + this.e + ")";
    }

    public /* synthetic */ vzz(djrr djrrVar, int i, Integer num, Integer num2, int i2) {
        this(djrrVar, i, (i2 & 4) != 0 ? null : num, (vzy) null, (i2 & 16) != 0 ? null : num2);
    }
}
