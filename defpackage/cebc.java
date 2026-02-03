package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cebc extends cebg {
    public final etsf a;
    private final String b;

    public cebc(String str, etsf etsfVar) {
        if (str == null) {
            throw new NullPointerException("Null simId");
        }
        this.b = str;
        if (etsfVar == null) {
            throw new NullPointerException("Null configurationType");
        }
        this.a = etsfVar;
    }

    @Override // defpackage.cebg
    public final etsf a() {
        return this.a;
    }

    @Override // defpackage.cebg
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cebg) {
            cebg cebgVar = (cebg) obj;
            if (this.b.equals(cebgVar.b()) && this.a.equals(cebgVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "MobileConfigurationId{simId=" + this.b + ", configurationType=" + this.a.toString() + "}";
    }
}
