package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzhb {
    public final Object a;
    public final byiv b;

    public bzhb(Object obj, byiv byivVar) {
        this.a = obj;
        this.b = byivVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzhb)) {
            return false;
        }
        bzhb bzhbVar = (bzhb) obj;
        return fdbq.f(this.a, bzhbVar.a) && fdbq.f(this.b, bzhbVar.b);
    }

    public final int hashCode() {
        return (fctk.a(this.a) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "InsertionResultWithRequest(insertionResult=" + fctk.b(this.a) + ", cmsBackupParameters=" + this.b + ")";
    }
}
