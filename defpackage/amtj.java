package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amtj extends amuo {
    private final String a;
    private final boolean b;
    private final String c;
    private final ekgb d;

    public amtj(String str, boolean z, String str2, ekgb ekgbVar) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = ekgbVar;
    }

    @Override // defpackage.amuo, defpackage.amwf
    public final ekgb a() {
        return this.d;
    }

    @Override // defpackage.amwf
    public final String c() {
        return this.a;
    }

    @Override // defpackage.amuo, defpackage.amwi
    public final String d() {
        return this.c;
    }

    @Override // defpackage.amwi
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof amuo) {
            amuo amuoVar = (amuo) obj;
            if (this.a.equals(amuoVar.c()) && this.b == amuoVar.e() && ((str = this.c) != null ? str.equals(amuoVar.d()) : amuoVar.d() == null) && ekjz.h(this.d, amuoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.c;
        return (((((iHashCode * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "BugleTextWithSubjectContent{text=" + this.a + ", isUrgent=" + this.b + ", subject=" + this.c + ", annotations=" + this.d.toString() + "}";
    }
}
