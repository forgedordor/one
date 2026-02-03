package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlnp implements dlnq {
    public final String a;
    public final String b;
    public final dkri c;
    public final boolean d;
    public final dlmg e;
    public final dlnl f;
    public final fdae g;
    private final boolean h;

    public /* synthetic */ dlnp(String str, String str2, dkri dkriVar, boolean z, dlmg dlmgVar, dlnl dlnlVar, fdae fdaeVar, int i) {
        dlnlVar = (i & 64) != 0 ? new dlnl(0, false, 3) : dlnlVar;
        int i2 = i & 32;
        int i3 = i & 4;
        int i4 = i & 2;
        boolean z2 = (i & 16) == 0;
        dlmgVar = i2 != 0 ? null : dlmgVar;
        boolean z3 = z & z2;
        dkriVar = i3 != 0 ? null : dkriVar;
        str2 = i4 != 0 ? null : str2;
        fdaeVar = (i & 128) != 0 ? null : fdaeVar;
        str.getClass();
        dlnlVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = dkriVar;
        this.h = false;
        this.d = z3;
        this.e = dlmgVar;
        this.f = dlnlVar;
        this.g = fdaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlnp)) {
            return false;
        }
        dlnp dlnpVar = (dlnp) obj;
        if (!fdbq.f(this.a, dlnpVar.a) || !fdbq.f(this.b, dlnpVar.b) || !fdbq.f(this.c, dlnpVar.c)) {
            return false;
        }
        boolean z = dlnpVar.h;
        return this.d == dlnpVar.d && fdbq.f(this.e, dlnpVar.e) && fdbq.f(this.f, dlnpVar.f) && fdbq.f(this.g, dlnpVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        dkri dkriVar = this.c;
        int iHashCode3 = (((((iHashCode2 + (dkriVar == null ? 0 : dkriVar.hashCode())) * 31) + dlno.a(false)) * 31) + dlno.a(this.d)) * 31;
        dlmg dlmgVar = this.e;
        int iHashCode4 = (((iHashCode3 + (dlmgVar == null ? 0 : dlmgVar.hashCode())) * 31) + this.f.hashCode()) * 31;
        fdae fdaeVar = this.g;
        return iHashCode4 + (fdaeVar != null ? fdaeVar.hashCode() : 0);
    }

    public final String toString() {
        return "Title(title=" + this.a + ", subtitle=" + this.b + ", monogram=" + this.c + ", autoFitTitle=false, highlight=" + this.d + ", tooltip=" + this.e + ", flags=" + this.f + ", onClick=" + this.g + ")";
    }
}
