package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agai extends IllegalStateException {
    public final String a;
    private final afzu b;
    private final afzy c;
    private final int d;

    public agai(afzu afzuVar, String str, afzy afzyVar, int i) {
        afzuVar.getClass();
        this.b = afzuVar;
        this.a = str;
        this.c = afzyVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agai)) {
            return false;
        }
        agai agaiVar = (agai) obj;
        return fdbq.f(this.b, agaiVar.b) && fdbq.f(this.a, agaiVar.a) && fdbq.f(this.c, agaiVar.c) && this.d == agaiVar.d;
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "IllegalNavigationStateTransitionException(from=" + this.b + ", to=" + this.a + ", target=" + this.c + ", requestId=" + this.d + ")";
    }
}
