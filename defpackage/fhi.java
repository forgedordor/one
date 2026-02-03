package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fhi {
    public String a;
    public boolean b = false;
    public fgm c = null;
    private final String d;

    public fhi(String str, String str2) {
        this.d = str;
        this.a = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhi)) {
            return false;
        }
        fhi fhiVar = (fhi) obj;
        return fdbq.f(this.d, fhiVar.d) && fdbq.f(this.a, fhiVar.a) && this.b == fhiVar.b && fdbq.f(this.c, fhiVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() * 31) + this.a.hashCode();
        int i = true != this.b ? 1237 : 1231;
        fgm fgmVar = this.c;
        return (((iHashCode * 31) + i) * 31) + (fgmVar == null ? 0 : fgmVar.hashCode());
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.c + ", isShowingSubstitution=" + this.b + ')';
    }
}
