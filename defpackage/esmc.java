package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esmc extends esmu {
    private final String a;
    private final esmt b;

    public esmc(String str, esmt esmtVar) {
        this.a = str;
        this.b = esmtVar;
    }

    @Override // defpackage.esmu
    public final esmt a() {
        return this.b;
    }

    @Override // defpackage.esmu
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esmu) {
            esmu esmuVar = (esmu) obj;
            if (this.a.equals(esmuVar.b())) {
                esmuVar.c();
                esmt esmtVar = this.b;
                if (esmtVar != null ? esmtVar.equals(esmuVar.a()) : esmuVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        esmt esmtVar = this.b;
        return (iHashCode * (-721379959)) ^ (esmtVar == null ? 0 : esmtVar.hashCode());
    }

    public final String toString() {
        return "GrpcMethodConfig{service=" + this.a + ", method=null, grpcRetryConfig=" + String.valueOf(this.b) + "}";
    }

    @Override // defpackage.esmu
    public final void c() {
    }
}
