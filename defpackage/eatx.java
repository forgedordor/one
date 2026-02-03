package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eatx extends eaux {
    public final Integer a;
    public final Integer b;
    private final easz c;
    private final deem d;

    public eatx(Integer num, Integer num2, easz easzVar, deem deemVar) {
        this.a = num;
        this.b = num2;
        this.c = easzVar;
        this.d = deemVar;
    }

    @Override // defpackage.eaux, defpackage.eanv
    public final deem a() {
        return this.d;
    }

    @Override // defpackage.eaux
    public final easz b() {
        return this.c;
    }

    @Override // defpackage.eaux
    public final Integer c() {
        return this.b;
    }

    @Override // defpackage.eaux
    public final Integer d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        deem deemVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof eaux) {
            eaux eauxVar = (eaux) obj;
            Integer num = this.a;
            if (num != null ? num.equals(eauxVar.d()) : eauxVar.d() == null) {
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(eauxVar.c()) : eauxVar.c() == null) {
                    if (this.c.equals(eauxVar.b()) && ((deemVar = this.d) != null ? deemVar.equals(eauxVar.a()) : eauxVar.a() == null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int iHashCode2 = ((((iHashCode ^ 1000003) * 1000003) ^ (num2 == null ? 0 : num2.hashCode())) * 1000003) ^ this.c.hashCode();
        deem deemVar = this.d;
        return (iHashCode2 * 1000003) ^ (deemVar != null ? deemVar.hashCode() : 0);
    }

    public final String toString() {
        deem deemVar = this.d;
        return "FetchPhotoRequest{maxWidth=" + this.a + ", maxHeight=" + this.b + ", photoMetadata=" + this.c.toString() + ", cancellationToken=" + String.valueOf(deemVar) + "}";
    }
}
