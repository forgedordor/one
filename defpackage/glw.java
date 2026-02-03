package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glw {
    public final long a;
    public final lsz b;

    public glw(long j, lsz lszVar) {
        this.a = j;
        this.b = lszVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glw)) {
            return false;
        }
        glw glwVar = (glw) obj;
        return ihs.h(this.a, glwVar.a) && fdbq.f(this.b, glwVar.b);
    }

    public final int hashCode() {
        return (ihr.a(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PointNRound(o=" + ((Object) ihs.g(this.a)) + ", r=" + this.b + ')';
    }
}
