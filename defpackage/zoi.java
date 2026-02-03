package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zoi {
    public final ajlt a;
    public final ajlt b;

    public zoi(ajlt ajltVar, ajlt ajltVar2) {
        this.a = ajltVar;
        this.b = ajltVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoi)) {
            return false;
        }
        zoi zoiVar = (zoi) obj;
        return fdbq.f(this.a, zoiVar.a) && fdbq.f(this.b, zoiVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ajlt ajltVar = this.b;
        return iHashCode + (ajltVar == null ? 0 : ajltVar.hashCode());
    }

    public final String toString() {
        return "CachedMessage(current=" + this.a + ", prev=" + this.b + ")";
    }
}
