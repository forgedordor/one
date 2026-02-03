package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfub {
    public final fdlr a;
    private final cfvn b;

    public cfub(cfvn cfvnVar, fdlr fdlrVar) {
        fdlrVar.getClass();
        this.b = cfvnVar;
        this.a = fdlrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfub)) {
            return false;
        }
        cfub cfubVar = (cfub) obj;
        return fdbq.f(this.b, cfubVar.b) && fdbq.f(this.a, cfubVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "Connection(request=" + this.b + ", launchFlowJob=" + this.a + ")";
    }
}
