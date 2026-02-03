package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class znq {
    public final List a;
    public final int b;
    public final int c;

    public znq(List list, int i, int i2) {
        list.getClass();
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof znq)) {
            return false;
        }
        znq znqVar = (znq) obj;
        return fdbq.f(this.a, znqVar.a) && this.b == znqVar.b && this.c == znqVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "LoadResultInternal(list=" + this.a + ", itemsBefore=" + this.b + ", itemsAfter=" + this.c + ")";
    }
}
