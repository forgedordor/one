package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class carh {
    public final String a;
    public final int b;

    public carh(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof carh)) {
            return false;
        }
        carh carhVar = (carh) obj;
        return fdbq.f(this.a, carhVar.a) && this.b == carhVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "StageNameAndDurationData(stageName=" + this.a + ", stageDuration=" + this.b + ")";
    }
}
