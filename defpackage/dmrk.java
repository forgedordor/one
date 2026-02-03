package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrk {
    public final String a;
    public final String b;
    public final dmrz c;
    public final boolean d;
    public final boolean e;

    public dmrk(String str, String str2, dmrz dmrzVar, boolean z, boolean z2) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = dmrzVar;
        this.d = z;
        this.e = z2;
    }

    public final boolean a(dmrk dmrkVar) {
        return fdbq.f(this.a, dmrkVar != null ? dmrkVar.a : null) && fdbq.f(this.b, dmrkVar.b) && fdbq.f(this.c, dmrkVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmrk)) {
            return false;
        }
        dmrk dmrkVar = (dmrk) obj;
        return fdbq.f(this.a, dmrkVar.a) && fdbq.f(this.b, dmrkVar.b) && fdbq.f(this.c, dmrkVar.c) && this.d == dmrkVar.d && this.e == dmrkVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dmrz dmrzVar = this.c;
        return (((((iHashCode * 31) + (dmrzVar == null ? 0 : dmrzVar.hashCode())) * 31) + dmrj.a(this.d)) * 31) + dmrj.a(this.e);
    }

    public final String toString() {
        return "CameraEffect(effectId=" + this.a + ", displayName=" + this.b + ", icon=" + this.c + ", isSelected=" + this.d + ", isDownloading=" + this.e + ")";
    }

    public /* synthetic */ dmrk(String str, String str2, dmrz dmrzVar) {
        this(str, str2, dmrzVar, false, false);
    }
}
