package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yyg {
    public final boolean a;
    public final anho b;

    public yyg(boolean z, anho anhoVar) {
        this.a = z;
        this.b = anhoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyg)) {
            return false;
        }
        yyg yygVar = (yyg) obj;
        return this.a == yygVar.a && fdbq.f(this.b, yygVar.b);
    }

    public final int hashCode() {
        anho anhoVar = this.b;
        return ((true != this.a ? 1237 : 1231) * 31) + (anhoVar == null ? 0 : anhoVar.hashCode());
    }

    public final String toString() {
        return "AsyncFlowParameters(emotifyAvailable=" + this.a + ", selectedReaction=" + this.b + ")";
    }
}
