package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaow extends easz {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final eaps f;

    public eaow(String str, int i, int i2, String str2, String str3, eaps eapsVar) {
        if (str == null) {
            throw new NullPointerException("Null attributions");
        }
        this.a = str;
        this.b = i;
        this.c = i2;
        if (str2 == null) {
            throw new NullPointerException("Null photoReference");
        }
        this.d = str2;
        this.e = str3;
        this.f = eapsVar;
    }

    @Override // defpackage.easz
    public final int a() {
        return this.b;
    }

    @Override // defpackage.easz
    public final int b() {
        return this.c;
    }

    @Override // defpackage.easz
    public final eaps c() {
        return this.f;
    }

    @Override // defpackage.easz
    public final String d() {
        return this.a;
    }

    @Override // defpackage.easz
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        String str;
        eaps eapsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof easz) {
            easz easzVar = (easz) obj;
            if (this.a.equals(easzVar.d()) && this.b == easzVar.a() && this.c == easzVar.b() && this.d.equals(easzVar.f()) && ((str = this.e) != null ? str.equals(easzVar.e()) : easzVar.e() == null) && ((eapsVar = this.f) != null ? eapsVar.equals(easzVar.c()) : easzVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.easz
    public final String f() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
        String str = this.e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        eaps eapsVar = this.f;
        return iHashCode2 ^ (eapsVar != null ? eapsVar.hashCode() : 0);
    }

    public final String toString() {
        return "PhotoMetadata{attributions=" + this.a + ", height=" + this.b + ", width=" + this.c + ", photoReference=" + this.d + ", name=" + this.e + ", authorAttributions=" + String.valueOf(this.f) + "}";
    }
}
