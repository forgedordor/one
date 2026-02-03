package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyak {
    public final lvj a;
    public final ejwi b;
    public final ejwi c;

    public dyak(lvj lvjVar, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = lvjVar;
        this.b = ejwiVar;
        this.c = ejwiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyak)) {
            return false;
        }
        dyak dyakVar = (dyak) obj;
        return fdbq.f(this.a, dyakVar.a) && fdbq.f(this.b, dyakVar.b) && fdbq.f(this.c, dyakVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 2040732332) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ObservableAccountInformation(lifecycleOwner=" + this.a + ", countDecorationGenerator=" + this.b + ", criticalAlertFeature=" + this.c + ")";
    }
}
