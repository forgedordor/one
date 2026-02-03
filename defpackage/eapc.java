package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eapc extends eatn {
    public final easl a;
    public final easl b;

    public eapc(easl easlVar, easl easlVar2) {
        this.a = easlVar;
        this.b = easlVar2;
    }

    @Override // defpackage.eatn
    public final easl a() {
        return this.b;
    }

    @Override // defpackage.eatn
    public final easl b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eatn) {
            eatn eatnVar = (eatn) obj;
            easl easlVar = this.a;
            if (easlVar != null ? easlVar.equals(eatnVar.b()) : eatnVar.b() == null) {
                easl easlVar2 = this.b;
                if (easlVar2 != null ? easlVar2.equals(eatnVar.a()) : eatnVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        easl easlVar = this.a;
        int iHashCode = easlVar == null ? 0 : easlVar.hashCode();
        easl easlVar2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (easlVar2 != null ? easlVar2.hashCode() : 0);
    }

    public final String toString() {
        easl easlVar = this.b;
        return "PriceRange{startPrice=" + String.valueOf(this.a) + ", endPrice=" + String.valueOf(easlVar) + "}";
    }
}
