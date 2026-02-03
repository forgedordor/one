package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ango {
    public final anhj a;
    public final int b;
    public final boolean c;
    public final ekgb d;

    public ango(anhj anhjVar, int i, boolean z, ekgb ekgbVar) {
        this.a = anhjVar;
        this.b = i;
        this.c = z;
        this.d = ekgbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ango)) {
            return false;
        }
        ango angoVar = (ango) obj;
        return fdbq.f(this.a, angoVar.a) && this.b == angoVar.b && this.c == angoVar.c && fdbq.f(this.d, angoVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + (true != this.c ? 1237 : 1231)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DefaultReactionState(reaction=" + this.a + ", count=" + this.b + ", hasAnimationEffect=" + this.c + ", reactionsMetadata=" + this.d + ")";
    }
}
