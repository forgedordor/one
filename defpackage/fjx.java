package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fjx {
    private final ezl a;
    private final long b;
    private final boolean c;
    private final int d;

    public fjx(ezl ezlVar, long j, int i, boolean z) {
        this.a = ezlVar;
        this.b = j;
        this.d = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjx)) {
            return false;
        }
        fjx fjxVar = (fjx) obj;
        return this.a == fjxVar.a && ihs.h(this.b, fjxVar.b) && this.d == fjxVar.d && this.c == fjxVar.c;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + ihr.a(this.b)) * 31) + this.d) * 31) + (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append((Object) ihs.g(this.b));
        sb.append(", anchor=");
        int i = this.d;
        sb.append((Object) (i != 1 ? i != 2 ? "Right" : "Middle" : "Left"));
        sb.append(", visible=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
