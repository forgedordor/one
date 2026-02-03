package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejql {
    String e = null;
    int c = -1;
    int d = -1;
    int a = -1;
    int b = -1;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ejql)) {
            return false;
        }
        ejql ejqlVar = (ejql) obj;
        return this.e.equals(ejqlVar.e) && this.c == ejqlVar.c && this.d == ejqlVar.d && this.a == ejqlVar.a && this.b == ejqlVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.e.hashCode() + (this.c << 24);
        int i = this.d << 20;
        return iHashCode + i + (this.a << 16) + (this.b << 12);
    }

    public final String toString() {
        return String.format("[Replacement value=[%s], truncate at %d, skip to %d, whitespaces: (%d, %d)]", this.e, Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
