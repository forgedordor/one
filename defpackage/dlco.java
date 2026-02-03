package defpackage;

/* compiled from: PG */
@fcsv
/* loaded from: classes4.dex */
public final class dlco {
    public final String a;
    public final fdae b;
    public final dlcr c;

    public dlco(dlcr dlcrVar, String str, fdae fdaeVar) {
        this.c = dlcrVar;
        this.a = str;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlco)) {
            return false;
        }
        dlco dlcoVar = (dlco) obj;
        return fdbq.f(this.c, dlcoVar.c) && fdbq.f(this.a, dlcoVar.a) && fdbq.f(this.b, dlcoVar.b);
    }

    public final int hashCode() {
        return (((this.c.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SimChipUiData(simIconUiData=" + this.c + ", carrierName=" + this.a + ", onClick=" + this.b + ")";
    }
}
