package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwc {
    public final String a;
    public final dqxe b;
    public final int c;

    public azwc(String str, int i) {
        this.a = str;
        this.c = i;
        this.b = new dqxl("$V", new Object[]{str});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azwc)) {
            return false;
        }
        azwc azwcVar = (azwc) obj;
        return fdbq.f(this.a, azwcVar.a) && this.c == azwcVar.c;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.c;
    }

    public final String toString() {
        return "TableNameExpression(tableName=" + this.a + ", restoreTable=" + ((Object) Integer.toString(this.c - 1)) + ")";
    }
}
