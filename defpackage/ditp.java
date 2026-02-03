package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ditp {
    public final ditl a;
    public final fdae b;
    public final disb c;

    public ditp(disb disbVar, ditl ditlVar, fdae fdaeVar) {
        ditlVar.getClass();
        this.c = disbVar;
        this.a = ditlVar;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ditp)) {
            return false;
        }
        ditp ditpVar = (ditp) obj;
        return fdbq.f(this.c, ditpVar.c) && this.a == ditpVar.a && fdbq.f(this.b, ditpVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BannerUiData(content=" + this.c + ", state=" + this.a + ", onExpandClicked=" + this.b + ")";
    }
}
