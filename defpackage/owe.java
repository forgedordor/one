package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owe {
    public final List a;
    public final Integer b;
    public final int c;
    private final ouv d;

    public owe(List list, Integer num, ouv ouvVar, int i) {
        this.a = list;
        this.b = num;
        this.d = ouvVar;
        this.c = i;
    }

    public final owb a(int i) {
        List list = this.a;
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((owb) it.next()).b.isEmpty()) {
                int size = i - this.c;
                int i2 = 0;
                while (i2 < fcva.e(list) && size > fcva.e(((owb) list.get(i2)).b)) {
                    size -= ((owb) list.get(i2)).b.size();
                    i2++;
                }
                return size < 0 ? (owb) fcva.N(list) : (owb) list.get(i2);
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof owe)) {
            return false;
        }
        owe oweVar = (owe) obj;
        return fdbq.f(this.a, oweVar.a) && fdbq.f(this.b, oweVar.b) && fdbq.f(this.d, oweVar.d) && this.c == oweVar.c;
    }

    public final int hashCode() {
        Integer num = this.b;
        return this.a.hashCode() + (num != null ? num.hashCode() : 0) + this.d.hashCode() + this.c;
    }

    public final String toString() {
        return "PagingState(pages=" + this.a + ", anchorPosition=" + this.b + ", config=" + this.d + ", leadingPlaceholderCount=" + this.c + ')';
    }
}
