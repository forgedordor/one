package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgyg {
    public final Throwable a;
    public final chhl b;
    public final int c;

    public cgyg(int i, Throwable th) {
        this.c = i;
        this.a = th;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgyg)) {
            return false;
        }
        cgyg cgygVar = (cgyg) obj;
        if (this.c != cgygVar.c || !fdbq.f(this.a, cgygVar.a)) {
            return false;
        }
        chhl chhlVar = cgygVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        Throwable th = this.a;
        return ((this.c * 31) + (th == null ? 0 : th.hashCode())) * 31;
    }

    public final String toString() {
        return "PipelineWorkResult(executionResult=" + ((Object) cgyf.a(this.c)) + ", exception=" + this.a + ", recoveryDescriptor=null)";
    }

    public /* synthetic */ cgyg(int i, Throwable th, int i2) {
        this(i, (i2 & 2) != 0 ? null : th);
    }
}
