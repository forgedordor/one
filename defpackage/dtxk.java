package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dtxk extends dtyl {
    public final String a;
    public final String b;

    public dtxk(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null action");
        }
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.dtyl
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dtyl
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtyl) {
            dtyl dtylVar = (dtyl) obj;
            if (this.a.equals(dtylVar.a()) && ((str = this.b) != null ? str.equals(dtylVar.b()) : dtylVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ActionInfo{action=" + this.a + ", tag=" + this.b + "}";
    }
}
