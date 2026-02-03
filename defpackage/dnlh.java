package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnlh {
    public dnjw a;
    public dnjz b;

    public dnlh() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnlh)) {
            return false;
        }
        dnlh dnlhVar = (dnlh) obj;
        return this.a == dnlhVar.a && this.b == dnlhVar.b;
    }

    public final int hashCode() {
        dnjw dnjwVar = this.a;
        int iHashCode = dnjwVar == null ? 0 : dnjwVar.hashCode();
        dnjz dnjzVar = this.b;
        return (iHashCode * 31) + (dnjzVar != null ? dnjzVar.hashCode() : 0);
    }

    public final String toString() {
        return "ModifierPreferences(gender=" + this.a + ", skinTone=" + this.b + ")";
    }

    public dnlh(dnjw dnjwVar, dnjz dnjzVar) {
        this.a = dnjwVar;
        this.b = dnjzVar;
    }

    public /* synthetic */ dnlh(byte[] bArr) {
        this(null, null);
    }
}
