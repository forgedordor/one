package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cubq {
    public final fdvc a;
    public final fdae b;

    public cubq(fdvc fdvcVar, fdae fdaeVar) {
        this.a = fdvcVar;
        this.b = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cubq)) {
            return false;
        }
        cubq cubqVar = (cubq) obj;
        return fdbq.f(this.a, cubqVar.a) && fdbq.f(this.b, cubqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ToastUiData(text=" + this.a + ", onToastShown=" + this.b + ")";
    }
}
