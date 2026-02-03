package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtd implements vte, vta {
    public final vvo a;
    private final vup b;

    public vtd(vvo vvoVar, vup vupVar) {
        vvoVar.getClass();
        this.a = vvoVar;
        this.b = vupVar;
    }

    @Override // defpackage.vta
    public final vup b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtd)) {
            return false;
        }
        vtd vtdVar = (vtd) obj;
        return fdbq.f(this.a, vtdVar.a) && fdbq.f(this.b, vtdVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DraftedAttachment.Unresolved(unresolvedAttachment=" + this.a + ", compressionInfo=" + this.b + ")";
    }
}
