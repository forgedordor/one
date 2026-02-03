package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgyi {
    public final cgxv a;
    public final Object b;

    public cgyi(cgxv cgxvVar, Object obj) {
        this.a = cgxvVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgyi)) {
            return false;
        }
        cgyi cgyiVar = (cgyi) obj;
        return fdbq.f(this.a, cgyiVar.a) && fdbq.f(this.b, cgyiVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "PipelineExecutionParameters(pipelineEntry=" + this.a + ", subject=" + this.b + ")";
    }
}
