package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aogl extends aogm {
    private final btzd a;
    private final boolean b;

    public aogl(btzd btzdVar, boolean z) {
        this.a = btzdVar;
        this.b = z;
    }

    @Override // defpackage.aogm
    public final btzd a() {
        return this.a;
    }

    @Override // defpackage.aogm
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aogm) {
            aogm aogmVar = (aogm) obj;
            btzd btzdVar = this.a;
            if (btzdVar != null ? btzdVar.equals(aogmVar.a()) : aogmVar.a() == null) {
                if (this.b == aogmVar.b()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        btzd btzdVar = this.a;
        return (((btzdVar == null ? 0 : btzdVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "CreateSelfProfileResult{profile=" + String.valueOf(this.a) + ", newlyCreated=" + this.b + "}";
    }
}
