package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agau implements afzx {
    public final String a;
    public final adx b;
    public final Object c;
    public final kun d;

    public agau(String str, adx adxVar, Object obj, kun kunVar) {
        str.getClass();
        adxVar.getClass();
        this.a = str;
        this.b = adxVar;
        this.c = obj;
        this.d = kunVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agau)) {
            return false;
        }
        agau agauVar = (agau) obj;
        return fdbq.f(this.a, agauVar.a) && fdbq.f(this.b, agauVar.b) && fdbq.f(this.c, agauVar.c) && fdbq.f(this.d, agauVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Object obj = this.c;
        int iHashCode2 = ((iHashCode * 31) + (obj == null ? 0 : obj.hashCode())) * 31;
        kun kunVar = this.d;
        return iHashCode2 + (kunVar != null ? kunVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityResult(key=" + this.a + ", contract=" + this.b + ", input=" + this.c + ", options=" + this.d + ")";
    }

    public /* synthetic */ agau(String str, adx adxVar, Object obj) {
        this(str, adxVar, obj, null);
    }
}
