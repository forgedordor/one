package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yrp implements ykp {
    public final amtr a;
    public final boolean b;
    public final String c;
    public final long d;
    private final boolean e;

    public yrp(amtr amtrVar, boolean z, String str, boolean z2, long j) {
        this.a = amtrVar;
        this.b = z;
        this.c = str;
        this.e = z2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yrp)) {
            return false;
        }
        yrp yrpVar = (yrp) obj;
        return fdbq.f(this.a, yrpVar.a) && this.b == yrpVar.b && fdbq.f(this.c, yrpVar.c) && this.e == yrpVar.e && this.d == yrpVar.d;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + yro.a(this.b)) * 31) + this.c.hashCode()) * 31;
        long j = this.d;
        return ((iHashCode + yro.a(this.e)) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BreadcrumbBubbleArgs(content=" + this.a + ", isHighlighted=" + this.b + ", contentDescription=" + this.c + ", enableSwipeToShowTimestamps=" + this.e + ", timestamp=" + this.d + ")";
    }
}
