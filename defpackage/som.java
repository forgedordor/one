package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class som extends snp {
    private final Object a;
    private final sor b;

    public som(Object obj, sor sorVar) {
        if (obj == null) {
            throw new NullPointerException("Null getService");
        }
        this.a = obj;
        this.b = sorVar;
    }

    @Override // defpackage.snp
    public final sor a() {
        return this.b;
    }

    @Override // defpackage.snp
    public final Object b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof snp) {
            snp snpVar = (snp) obj;
            if (this.a.equals(snpVar.b()) && this.b.equals(snpVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        sor sorVar = this.b;
        return "InferenceServiceContext{getService=" + this.a.toString() + ", disconnectSignal=" + sorVar.toString() + "}";
    }
}
