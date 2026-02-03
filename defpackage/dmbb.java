package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmbb {
    public final List a;
    public final List b;

    public dmbb(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmbb)) {
            return false;
        }
        dmbb dmbbVar = (dmbb) obj;
        return fdbq.f(this.a, dmbbVar.a) && fdbq.f(this.b, dmbbVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "LoadResult(media=" + this.a + ", errors=" + this.b + ")";
    }
}
