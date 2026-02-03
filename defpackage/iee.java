package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iee {
    public final int a;
    public final jqh b;
    public final int c;
    private final long d;

    public iee(int i, long j, int i2, jqh jqhVar) {
        this.a = i;
        this.d = j;
        this.c = i2;
        this.b = jqhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iee)) {
            return false;
        }
        iee ieeVar = (iee) obj;
        return this.a == ieeVar.a && this.d == ieeVar.d && this.c == ieeVar.c && fdbq.f(this.b, ieeVar.b);
    }

    public final int hashCode() {
        jqh jqhVar = this.b;
        int iHashCode = jqhVar == null ? 0 : jqhVar.hashCode();
        long j = this.d;
        return (((((this.a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c) * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append((Object) (this.c != 1 ? "VIEW_DISAPPEAR" : "VIEW_APPEAR"));
        sb.append(", structureCompat=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
