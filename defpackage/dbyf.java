package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbyf extends dbyw {
    public final eyen a;
    private final int b;

    public dbyf(int i, eyen eyenVar) {
        this.b = i;
        this.a = eyenVar;
    }

    @Override // defpackage.dbyw
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dbyw
    public final eyen b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dbyw) {
            dbyw dbywVar = (dbyw) obj;
            if (this.b == dbywVar.a() && this.a.equals(dbywVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ComplianceProductData{productId=" + this.b + ", productIdOrigin=" + this.a.toString() + "}";
    }
}
