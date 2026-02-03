package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvp {
    public final long a;
    public final long b;
    public final int c;

    public jvp(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
        if (kjl.b(j) == 0) {
            kfq.b("width cannot be TextUnit.Unspecified");
        }
        if (kjl.b(j2) == 0) {
            kfq.b("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jvp)) {
            return false;
        }
        jvp jvpVar = (jvp) obj;
        return kjl.e(this.a, jvpVar.a) && kjl.e(this.b, jvpVar.b) && jvq.a(this.c, jvpVar.c);
    }

    public final int hashCode() {
        long j = kjl.a;
        return (((kjk.a(this.a) * 31) + kjk.a(this.b)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(width=");
        sb.append((Object) kjl.d(this.a));
        sb.append(", height=");
        sb.append((Object) kjl.d(this.b));
        sb.append(", placeholderVerticalAlign=");
        int i = this.c;
        sb.append((Object) (jvq.a(i, 1) ? "AboveBaseline" : jvq.a(i, 2) ? "Top" : jvq.a(i, 3) ? "Bottom" : jvq.a(i, 4) ? "Center" : jvq.a(i, 5) ? "TextTop" : jvq.a(i, 6) ? "TextBottom" : jvq.a(i, 7) ? "TextCenter" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
