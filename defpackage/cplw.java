package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cplw extends cptk {
    private final evqs a;

    public cplw(evqs evqsVar) {
        this.a = evqsVar;
    }

    @Override // defpackage.cptk
    public final evqs a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cptk)) {
            return false;
        }
        cptk cptkVar = (cptk) obj;
        evqs evqsVar = this.a;
        return evqsVar == null ? cptkVar.a() == null : evqsVar.equals(cptkVar.a());
    }

    public final int hashCode() {
        evqs evqsVar = this.a;
        return (evqsVar == null ? 0 : evqsVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "CmsMessageCalculatedPartData{thumbnailData=" + String.valueOf(this.a) + "}";
    }
}
