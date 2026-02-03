package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwut extends dwvp {
    private final dwsu a;
    private final String b;
    private final evqs c;
    private final int d;
    private final int e;
    private final String f;

    public dwut(dwsu dwsuVar, String str, evqs evqsVar, int i, int i2, String str2) {
        this.a = dwsuVar;
        this.b = str;
        this.c = evqsVar;
        this.d = i;
        this.e = i2;
        this.f = str2;
    }

    @Override // defpackage.dwvp
    public final int a() {
        return this.e;
    }

    @Override // defpackage.dwvp
    public final int b() {
        return this.d;
    }

    @Override // defpackage.dwvp
    public final dwsu c() {
        return this.a;
    }

    @Override // defpackage.dwvp
    public final evqs d() {
        return this.c;
    }

    @Override // defpackage.dwvp
    public final String e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwvp) {
            dwvp dwvpVar = (dwvp) obj;
            if (this.a.equals(dwvpVar.c()) && ((str = this.b) != null ? str.equals(dwvpVar.f()) : dwvpVar.f() == null) && this.c.equals(dwvpVar.d()) && this.d == dwvpVar.b() && this.e == dwvpVar.a() && this.f.equals(dwvpVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwvp
    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((((((((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        evqs evqsVar = this.c;
        return "ImageElement{mediaId=" + this.a.toString() + ", localURI=" + this.b + ", thumbnail=" + evqsVar.toString() + ", width=" + this.d + ", height=" + this.e + ", imageDescription=" + this.f + "}";
    }
}
