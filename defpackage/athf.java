package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class athf {
    public final athk a;
    public final atha b;
    public final fdkf c;

    public athf(athk athkVar, atha athaVar, fdkf fdkfVar) {
        athkVar.getClass();
        this.a = athkVar;
        this.b = athaVar;
        this.c = fdkfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof athf)) {
            return false;
        }
        athf athfVar = (athf) obj;
        return fdbq.f(this.a, athfVar.a) && fdbq.f(this.b, athfVar.b) && fdbq.f(this.c, athfVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PipelineInfo(entryPoint=" + this.a + ", pipelineContext=" + this.b + ", pipelineExecution=" + this.c + ")";
    }
}
