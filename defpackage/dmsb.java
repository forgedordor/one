package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmsb {
    public final String a;
    public final dmrz b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final fdap f;

    public dmsb(String str, dmrz dmrzVar, boolean z, boolean z2, boolean z3, fdap fdapVar) {
        this.a = str;
        this.b = dmrzVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmsb)) {
            return false;
        }
        dmsb dmsbVar = (dmsb) obj;
        return fdbq.f(this.a, dmsbVar.a) && fdbq.f(this.b, dmsbVar.b) && this.c == dmsbVar.c && this.d == dmsbVar.d && this.e == dmsbVar.e && fdbq.f(this.f, dmsbVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dmrz dmrzVar = this.b;
        return ((((((((iHashCode + (dmrzVar == null ? 0 : dmrzVar.hashCode())) * 31) + dmsa.a(this.c)) * 31) + dmsa.a(this.d)) * 31) + dmsa.a(this.e)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "EffectUiData(displayName=" + this.a + ", icon=" + this.b + ", isSelected=" + this.c + ", isInitializing=" + this.d + ", isDownloading=" + this.e + ", onSelect=" + this.f + ")";
    }
}
