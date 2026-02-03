package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xvo {
    public final ajli a;
    public final boolean b;
    private final ajlh c;

    public xvo(ajlh ajlhVar, ajli ajliVar, boolean z) {
        ajlhVar.getClass();
        this.c = ajlhVar;
        this.a = ajliVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvo)) {
            return false;
        }
        xvo xvoVar = (xvo) obj;
        return fdbq.f(this.c, xvoVar.c) && this.a == xvoVar.a && this.b == xvoVar.b;
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "Constraints(constraints=" + this.c + ", disabledReason=" + this.a + ", isEncrypted=" + this.b + ")";
    }
}
