package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovb extends ovg {
    public final int a;
    public final List b;
    public final int c;
    public final int d;

    public ovb(int i, List list, int i2, int i3) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ovb)) {
            return false;
        }
        ovb ovbVar = (ovb) obj;
        return this.a == ovbVar.a && fdbq.f(this.b, ovbVar.b) && this.c == ovbVar.c && this.d == ovbVar.d;
    }

    public final int hashCode() {
        return this.a + this.b.hashCode() + this.c + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Append loaded ");
        List list = this.b;
        sb.append(list.size());
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.a);
        sb.append("\n                    |   first item: ");
        sb.append(fcva.P(list));
        sb.append("\n                    |   last item: ");
        sb.append(fcva.T(list));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.d);
        sb.append("\n                    |)\n                    |");
        return fdgn.c(sb.toString(), "|");
    }
}
