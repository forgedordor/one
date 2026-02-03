package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbt {
    public final String a;
    public final List b;
    public final fdap c;
    public final dlbs d;

    public dlbt(String str, List list, fdap fdapVar, dlbs dlbsVar) {
        this.a = str;
        this.b = list;
        this.c = fdapVar;
        this.d = dlbsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlbt)) {
            return false;
        }
        dlbt dlbtVar = (dlbt) obj;
        return fdbq.f(this.a, dlbtVar.a) && fdbq.f(this.b, dlbtVar.b) && fdbq.f(this.c, dlbtVar.c) && fdbq.f(this.d, dlbtVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SimBar2UiData(selectedId=" + this.a + ", items=" + this.b + ", onSelected=" + this.c + ", flags=" + this.d + ")";
    }
}
