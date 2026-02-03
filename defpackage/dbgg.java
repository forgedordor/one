package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbgg extends dbgl {
    public final dbgk a;
    public final String b;

    public dbgg(dbgk dbgkVar, String str) {
        if (dbgkVar == null) {
            throw new NullPointerException("Null state");
        }
        this.a = dbgkVar;
        this.b = str;
    }

    @Override // defpackage.dbgl
    public final dbgk a() {
        return this.a;
    }

    @Override // defpackage.dbgl
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dbgl) {
            dbgl dbglVar = (dbgl) obj;
            if (this.a.equals(dbglVar.a()) && ((str = this.b) != null ? str.equals(dbglVar.b()) : dbglVar.b() == null)) {
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
        return "EffectLoadingState{state=" + this.a.toString() + ", errorString=" + this.b + "}";
    }
}
