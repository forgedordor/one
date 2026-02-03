package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ove extends ovg {
    public final List a;
    public final int b;
    public final int c;

    public ove(List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ove)) {
            return false;
        }
        ove oveVar = (ove) obj;
        return fdbq.f(this.a, oveVar.a) && this.b == oveVar.b && this.c == oveVar.c;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.Prepend loaded ");
        List list = this.a;
        sb.append(list.size());
        sb.append(" items (\n                    |   first item: ");
        sb.append(fcva.P(list));
        sb.append("\n                    |   last item: ");
        sb.append(fcva.T(list));
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.b);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.c);
        sb.append("\n                    |)\n                    |");
        return fdgn.c(sb.toString(), "|");
    }
}
