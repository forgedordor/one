package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovc extends ovg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ovc(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ovc)) {
            return false;
        }
        ovc ovcVar = (ovc) obj;
        return this.a == ovcVar.a && this.b == ovcVar.b && this.c == ovcVar.c && this.d == ovcVar.d;
    }

    public final int hashCode() {
        return this.a + this.b + this.c + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropAppend dropped ");
        int i = this.b;
        sb.append(i);
        sb.append(" items (\n                    |   startIndex: ");
        sb.append(this.a);
        sb.append("\n                    |   dropCount: ");
        sb.append(i);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.c);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.d);
        sb.append("\n                    |)\n                    |");
        return fdgn.c(sb.toString(), "|");
    }
}
