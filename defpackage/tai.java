package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tai {
    public final enoq a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;

    public tai(long j, long j2, long j3, long j4, enoq enoqVar) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.a = enoqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tai)) {
            return false;
        }
        tai taiVar = (tai) obj;
        return this.b == taiVar.b && this.c == taiVar.c && this.d == taiVar.d && this.e == taiVar.e && this.a == taiVar.a;
    }

    public final int hashCode() {
        enoq enoqVar = this.a;
        return (((((((tah.a(this.b) * 31) + tah.a(this.c)) * 31) + tah.a(this.d)) * 31) + tah.a(this.e)) * 31) + (enoqVar == null ? 0 : enoqVar.hashCode());
    }

    public final String toString() {
        return "MessagesVersionCheckResult(targetMessagesVersion=" + this.b + ", sourceMessagesVersion=" + this.c + ", minTargetMessagesVersion=" + this.d + ", minSourceMessagesVersion=" + this.e + ", failureReason=" + this.a + ")";
    }
}
