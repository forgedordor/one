package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xzl {
    public final dklq a;
    public final List b;
    public final String c;
    public final List d;

    public xzl(dklq dklqVar, List list, String str, List list2) {
        dklqVar.getClass();
        list.getClass();
        this.a = dklqVar;
        this.b = list;
        this.c = str;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzl)) {
            return false;
        }
        xzl xzlVar = (xzl) obj;
        return fdbq.f(this.a, xzlVar.a) && fdbq.f(this.b, xzlVar.b) && fdbq.f(this.c, xzlVar.c) && fdbq.f(this.d, xzlVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ReplyMetatextUiData(monogram=" + this.a + ", name=" + this.b + ", timestamp=" + this.c + ", extraIcons=" + this.d + ")";
    }
}
