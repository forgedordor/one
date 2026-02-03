package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duyd extends duyu {
    private final dtns a;
    private final ekgp b;

    public duyd(dtns dtnsVar, ekgp ekgpVar) {
        this.a = dtnsVar;
        this.b = ekgpVar;
    }

    @Override // defpackage.duyu
    public final dtns a() {
        return this.a;
    }

    @Override // defpackage.duyu
    public final ekgp b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof duyu) {
            duyu duyuVar = (duyu) obj;
            if (this.a.equals(duyuVar.a()) && ekmi.m(this.b, duyuVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GroupAndInlineFileMap{group=" + this.a.toString() + ", inlineFileMap=" + ekmi.g(this.b) + "}";
    }
}
