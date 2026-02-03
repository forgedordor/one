package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkbn implements djvp {
    public final Set a;
    public final List b;
    public final fdap c;

    public dkbn(Set set, List list, fdap fdapVar) {
        set.getClass();
        this.a = set;
        this.b = list;
        this.c = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkbn)) {
            return false;
        }
        dkbn dkbnVar = (dkbn) obj;
        return fdbq.f(this.a, dkbnVar.a) && fdbq.f(this.b, dkbnVar.b) && fdbq.f(this.c, dkbnVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SelectListItemUiData(selectedIds=" + this.a + ", items=" + this.b + ", onClick=" + this.c + ")";
    }
}
