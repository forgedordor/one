package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dayp {
    public final dloh a;
    public final fdvc b;
    public final fdvc c;
    public final fdvc d;
    public final fdvc e;
    public final fdvc f;
    public final fdpl g;
    public final dayo h;

    public dayp(dloh dlohVar, fdvc fdvcVar, fdvc fdvcVar2, fdvc fdvcVar3, fdvc fdvcVar4, fdvc fdvcVar5, fdpl fdplVar, dayo dayoVar) {
        fdplVar.getClass();
        this.a = dlohVar;
        this.b = fdvcVar;
        this.c = fdvcVar2;
        this.d = fdvcVar3;
        this.e = fdvcVar4;
        this.f = fdvcVar5;
        this.g = fdplVar;
        this.h = dayoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dayp)) {
            return false;
        }
        dayp daypVar = (dayp) obj;
        return fdbq.f(this.a, daypVar.a) && fdbq.f(this.b, daypVar.b) && fdbq.f(this.c, daypVar.c) && fdbq.f(this.d, daypVar.d) && fdbq.f(this.e, daypVar.e) && fdbq.f(this.f, daypVar.f) && fdbq.f(this.g, daypVar.g) && fdbq.f(this.h, daypVar.h);
    }

    public final int hashCode() {
        dloh dlohVar = this.a;
        return ((((((((((((((dlohVar == null ? 0 : dlohVar.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "WelcomeScreenUiData(topAppBarUiData=" + this.a + ", accountSelectionState=" + this.b + ", welcomeAccountScreenUiData=" + this.c + ", featureUpsellUiDataFlow=" + this.d + ", onClickContinue=" + this.e + ", noticeUiData=" + this.f + ", finished=" + this.g + ", flags=" + this.h + ")";
    }
}
