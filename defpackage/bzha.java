package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzha {
    public final Object a;
    public final bzbz b;

    public bzha(Object obj, bzbz bzbzVar) {
        this.a = obj;
        this.b = bzbzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzha)) {
            return false;
        }
        bzha bzhaVar = (bzha) obj;
        return fdbq.f(this.a, bzhaVar.a) && fdbq.f(this.b, bzhaVar.b);
    }

    public final int hashCode() {
        return (fctk.a(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InsertionResultWithContext(insertionResult=" + fctk.b(this.a) + ", loggingContext=" + this.b + ")";
    }
}
