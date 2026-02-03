package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djzh implements djvp, dijt {
    public final String a;
    public final djrr b;
    public final Integer c;
    public final List d;
    public final boolean e;

    public djzh(String str, djrr djrrVar, Integer num, List list, boolean z) {
        list.getClass();
        this.a = str;
        this.b = djrrVar;
        this.c = num;
        this.d = list;
        this.e = z;
    }

    @Override // defpackage.dijt
    public final /* bridge */ /* synthetic */ String a() {
        return null;
    }

    @Override // defpackage.dijt
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djzh)) {
            return false;
        }
        djzh djzhVar = (djzh) obj;
        return fdbq.f(this.a, djzhVar.a) && this.b == djzhVar.b && fdbq.f(this.c, djzhVar.c) && fdbq.f(this.d, djzhVar.d) && this.e == djzhVar.e;
    }

    @Override // defpackage.dijt
    public final List f() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        djrr djrrVar = this.b;
        int iHashCode2 = (iHashCode + (djrrVar == null ? 0 : djrrVar.hashCode())) * 31;
        Integer num = this.c;
        return ((((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "InfoListItemUiData(text=" + this.a + ", icon=" + this.b + ", iconTint=" + this.c + ", annotations=" + this.d + ", isError=" + this.e + ")";
    }

    public /* synthetic */ djzh(String str, djrr djrrVar, List list, boolean z, int i) {
        this(str, (i & 2) != 0 ? null : djrrVar, (Integer) null, (i & 8) != 0 ? fcvo.a : list, ((i & 16) == 0) & z);
    }
}
