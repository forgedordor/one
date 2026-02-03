package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtc implements vte, vsz {
    private final dltd a;
    private final vup b;

    public vtc(dltd dltdVar, vup vupVar) {
        dltdVar.getClass();
        this.a = dltdVar;
        this.b = vupVar;
    }

    @Override // defpackage.vsz
    public final dltd a() {
        return this.a;
    }

    @Override // defpackage.vta
    public final vup b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtc)) {
            return false;
        }
        vtc vtcVar = (vtc) obj;
        return fdbq.f(this.a, vtcVar.a) && fdbq.f(this.b, vtcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DraftedAttachment.Resolved(hugoAttachment=" + this.a + ", compressionInfo=" + this.b + ")";
    }
}
