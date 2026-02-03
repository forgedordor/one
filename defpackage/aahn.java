package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aahn {
    public final fdvc a;
    public final fdvc b;
    public final fdvc c;
    public final fdvc d;
    public final fdvc e;
    public final fdap f;
    private final aahm g;

    public aahn(fdvc fdvcVar, fdvc fdvcVar2, fdvc fdvcVar3, fdvc fdvcVar4, fdvc fdvcVar5, fdap fdapVar, aahm aahmVar) {
        fdvcVar2.getClass();
        fdvcVar3.getClass();
        fdvcVar4.getClass();
        fdvcVar5.getClass();
        this.a = fdvcVar;
        this.b = fdvcVar2;
        this.c = fdvcVar3;
        this.d = fdvcVar4;
        this.e = fdvcVar5;
        this.f = fdapVar;
        this.g = aahmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aahn)) {
            return false;
        }
        aahn aahnVar = (aahn) obj;
        return fdbq.f(this.a, aahnVar.a) && fdbq.f(this.b, aahnVar.b) && fdbq.f(this.c, aahnVar.c) && fdbq.f(this.d, aahnVar.d) && fdbq.f(this.e, aahnVar.e) && fdbq.f(this.f, aahnVar.f) && fdbq.f(this.g, aahnVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "TopContentUiData(rbmAppBarUiData=" + this.a + ", topAppBarUiData=" + this.b + ", textResultsBarUiData=" + this.c + ", bannersUiData=" + this.d + ", overrideSystemBack=" + this.e + ", onHeightComputed=" + this.f + ", flags=" + this.g + ")";
    }
}
