package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsou {
    private final eyax a;
    private final eyax b;
    private final eyax c;

    public dsou(eyax eyaxVar, eyax eyaxVar2, eyax eyaxVar3) {
        this.a = eyaxVar;
        this.b = eyaxVar2;
        this.c = eyaxVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsou)) {
            return false;
        }
        dsou dsouVar = (dsou) obj;
        return fdbq.f(this.a, dsouVar.a) && fdbq.f(this.b, dsouVar.b) && fdbq.f(this.c, dsouVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "PromotionDataColors(backgroundColor=" + this.a + ", titleColor=" + this.b + ", bodyColor=" + this.c + ")";
    }
}
