package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmu extends dwpc {
    private final dwqw a;
    private final ekgb b;
    private final ejwi c;
    private final ejwi d;

    public dwmu(dwqw dwqwVar, ekgb ekgbVar, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = dwqwVar;
        this.b = ekgbVar;
        this.c = ejwiVar;
        this.d = ejwiVar2;
    }

    @Override // defpackage.dwpc
    public final dwqw a() {
        return this.a;
    }

    @Override // defpackage.dwpc
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.dwpc
    public final ejwi c() {
        return this.d;
    }

    @Override // defpackage.dwpc
    public final ekgb d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwpc) {
            dwpc dwpcVar = (dwpc) obj;
            if (this.a.equals(dwpcVar.a()) && ekjz.h(this.b, dwpcVar.d()) && this.c.equals(dwpcVar.b()) && this.d.equals(dwpcVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ejwi ejwiVar = this.d;
        ejwi ejwiVar2 = this.c;
        ekgb ekgbVar = this.b;
        return "CloudMessage{message=" + this.a.toString() + ", annotations=" + ekgbVar.toString() + ", needsDeliveryReceipt=" + ejwiVar2.toString() + ", suggestionList=" + ejwiVar.toString() + "}";
    }
}
