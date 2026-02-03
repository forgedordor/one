package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvyy {
    public final djvp a;
    public final String b;
    public final String c;
    public final ekgb d;
    public final dihq e;

    public cvyy(String str, String str2, ekgb ekgbVar, dihq dihqVar) {
        str.getClass();
        this.a = null;
        this.b = str;
        this.c = str2;
        this.d = ekgbVar;
        this.e = dihqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvyy)) {
            return false;
        }
        cvyy cvyyVar = (cvyy) obj;
        djvp djvpVar = cvyyVar.a;
        return fdbq.f(null, null) && fdbq.f(this.b, cvyyVar.b) && fdbq.f(this.c, cvyyVar.c) && fdbq.f(this.d, cvyyVar.d) && fdbq.f(this.e, cvyyVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        dihq dihqVar = this.e;
        return (iHashCode * 31) + (dihqVar == null ? 0 : dihqVar.hashCode());
    }

    public final String toString() {
        return "GroupMembersUiData(joinViaLink=null, membersCounterText=" + this.b + ", headerActionButtonText=" + this.c + ", members=" + this.d + ", groupAddAction=" + this.e + ")";
    }
}
