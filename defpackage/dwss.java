package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwss extends dwsv {
    private final dwsu a;
    private final String b;
    private final ejwi c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public dwss(dwsu dwsuVar, String str, ejwi ejwiVar, int i, int i2, int i3, int i4) {
        this.a = dwsuVar;
        this.b = str;
        this.c = ejwiVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // defpackage.dwsv
    public final int a() {
        return this.g;
    }

    @Override // defpackage.dwsv
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dwsv
    public final int c() {
        return this.f;
    }

    @Override // defpackage.dwsv
    public final int d() {
        return this.d;
    }

    @Override // defpackage.dwsv
    public final dwsu e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwsv) {
            dwsv dwsvVar = (dwsv) obj;
            dwsu dwsuVar = this.a;
            if (dwsuVar != null ? dwsuVar.equals(dwsvVar.e()) : dwsvVar.e() == null) {
                String str = this.b;
                if (str != null ? str.equals(dwsvVar.g()) : dwsvVar.g() == null) {
                    if (this.c.equals(dwsvVar.f()) && this.d == dwsvVar.d() && this.e == dwsvVar.b() && this.f == dwsvVar.c() && this.g == dwsvVar.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dwsv
    public final ejwi f() {
        return this.c;
    }

    @Override // defpackage.dwsv
    public final String g() {
        return this.b;
    }

    public final int hashCode() {
        dwsu dwsuVar = this.a;
        int iHashCode = dwsuVar == null ? 0 : dwsuVar.hashCode();
        String str = this.b;
        return ((((((((((((iHashCode ^ 1000003) * 1000003) ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g;
    }

    public final String toString() {
        ejwi ejwiVar = this.c;
        return "PhotoData{mediaId=" + String.valueOf(this.a) + ", localURI=" + this.b + ", thumbnail=" + ejwiVar.toString() + ", width=" + this.d + ", height=" + this.e + ", size=" + this.f + ", downloadStatus=" + this.g + "}";
    }
}
