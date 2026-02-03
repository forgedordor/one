package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovd extends ovg {
    public final int a;
    public final int b;
    public final int c;

    public ovd(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ovd)) {
            return false;
        }
        ovd ovdVar = (ovd) obj;
        return this.a == ovdVar.a && this.b == ovdVar.b && this.c == ovdVar.c;
    }

    public final int hashCode() {
        return this.a + this.b + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingDataEvent.DropPrepend dropped ");
        int i = this.a;
        sb.append(i);
        sb.append(" items (\n                    |   dropCount: ");
        sb.append(i);
        sb.append("\n                    |   newPlaceholdersBefore: ");
        sb.append(this.b);
        sb.append("\n                    |   oldPlaceholdersBefore: ");
        sb.append(this.c);
        sb.append("\n                    |)\n                    |");
        return fdgn.c(sb.toString(), "|");
    }
}
