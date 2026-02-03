package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceob extends cepp {
    public final String a;
    public final String b;

    public ceob(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.cepp
    public final String a() {
        return this.b;
    }

    @Override // defpackage.cepp
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cepp) {
            cepp ceppVar = (cepp) obj;
            String str = this.a;
            if (str != null ? str.equals(ceppVar.b()) : ceppVar.b() == null) {
                String str2 = this.b;
                if (str2 != null ? str2.equals(ceppVar.a()) : ceppVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RpcRuntimeMetric{timeCounterName=" + this.a + ", statusCounterName=" + this.b + "}";
    }
}
