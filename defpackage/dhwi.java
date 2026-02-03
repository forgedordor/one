package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhwi extends dhph {
    public final dhvp a;
    public final List b;
    public final List c;

    public dhwi(dhvp dhvpVar, List list, List list2) {
        dhvpVar.getClass();
        this.a = dhvpVar;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhwi)) {
            return false;
        }
        dhwi dhwiVar = (dhwi) obj;
        return fdbq.f(this.a, dhwiVar.a) && fdbq.f(this.b, dhwiVar.b) && fdbq.f(this.c, dhwiVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}
