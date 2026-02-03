package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djfn {
    public final List a;
    public final Integer b;
    public final fdap c;

    public djfn(List list, Integer num, fdap fdapVar) {
        list.getClass();
        this.a = list;
        this.b = num;
        this.c = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof djfn)) {
            return false;
        }
        djfn djfnVar = (djfn) obj;
        return fdbq.f(this.a, djfnVar.a) && fdbq.f(this.b, djfnVar.b) && fdbq.f(this.c, djfnVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ComposeRowSimSelectorUiData(sims=" + this.a + ", selected=" + this.b + ", onSelect=" + this.c + ")";
    }
}
