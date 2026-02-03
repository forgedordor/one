package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhyq extends dhph {
    public final dhvp a;
    public final String b;
    public final List c;
    public final List d;

    public dhyq(dhvp dhvpVar, String str, List list, List list2) {
        this.a = dhvpVar;
        this.b = str;
        this.c = list;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhyq)) {
            return false;
        }
        dhyq dhyqVar = (dhyq) obj;
        return fdbq.f(this.a, dhyqVar.a) && fdbq.f(this.b, dhyqVar.b) && fdbq.f(this.c, dhyqVar.c) && fdbq.f(this.d, dhyqVar.d);
    }

    public final int hashCode() {
        dhvp dhvpVar = this.a;
        int iHashCode = dhvpVar == null ? 0 : dhvpVar.hashCode();
        String str = this.b;
        return (((((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
