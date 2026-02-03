package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esvn extends esvz {
    private final ekrq a;
    private final String b;

    public esvn(ekrq ekrqVar, String str) {
        this.a = ekrqVar;
        this.b = str;
    }

    @Override // defpackage.esvz
    public final ekrq a() {
        return this.a;
    }

    @Override // defpackage.esvz
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof esvz) {
            esvz esvzVar = (esvz) obj;
            if (this.a.equals(esvzVar.a()) && ((str = this.b) != null ? str.equals(esvzVar.b()) : esvzVar.b() == null)) {
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
        return "MessageAndLogSite{logSite=" + this.a.toString() + ", message=" + this.b + "}";
    }
}
