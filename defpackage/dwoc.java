package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwoc extends dwrh {
    private final String a;
    private final ejwi b;
    private final ejwi c;
    private final dwjr d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;

    public dwoc(String str, ejwi ejwiVar, ejwi ejwiVar2, dwjr dwjrVar, int i, int i2, int i3, boolean z) {
        this.a = str;
        this.b = ejwiVar;
        this.c = ejwiVar2;
        this.d = dwjrVar;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = z;
    }

    @Override // defpackage.dwrh
    public final int a() {
        return this.f;
    }

    @Override // defpackage.dwrh
    public final int b() {
        return this.g;
    }

    @Override // defpackage.dwrh
    public final int c() {
        return this.e;
    }

    @Override // defpackage.dwrh
    public final dwjr d() {
        return this.d;
    }

    @Override // defpackage.dwrh
    public final ejwi e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwrh) {
            dwrh dwrhVar = (dwrh) obj;
            if (this.a.equals(dwrhVar.g()) && this.b.equals(dwrhVar.e()) && this.c.equals(dwrhVar.f()) && this.d.equals(dwrhVar.d()) && this.e == dwrhVar.c() && this.f == dwrhVar.a() && this.g == dwrhVar.b() && this.h == dwrhVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwrh
    public final ejwi f() {
        return this.c;
    }

    @Override // defpackage.dwrh
    public final String g() {
        return this.a;
    }

    @Override // defpackage.dwrh
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        return (((((((iHashCode * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        dwjr dwjrVar = this.d;
        ejwi ejwiVar = this.c;
        return "RichCardButton{text=" + this.a + ", a11yText=" + String.valueOf(this.b) + ", lighterIcon=" + String.valueOf(ejwiVar) + ", action=" + dwjrVar.toString() + ", textColor=" + this.e + ", backgroundColor=" + this.f + ", borderColor=" + this.g + ", enabled=" + this.h + "}";
    }
}
