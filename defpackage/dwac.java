package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwac extends dwaz {
    public final String a;
    public final ejwi b;
    public final ejwi c;
    public final ejwi d;
    public final ejwi e;
    public final ekgb f;
    public final ekgb g;
    public final ejwi h;
    public final ejwi i;
    public final ejwi j;
    private final String k;
    private final ekgp l;

    public dwac(String str, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, String str2, ejwi ejwiVar4, ekgp ekgpVar, ekgb ekgbVar, ekgb ekgbVar2, ejwi ejwiVar5, ejwi ejwiVar6, ejwi ejwiVar7) {
        this.a = str;
        this.b = ejwiVar;
        this.c = ejwiVar2;
        this.d = ejwiVar3;
        this.k = str2;
        this.e = ejwiVar4;
        this.l = ekgpVar;
        this.f = ekgbVar;
        this.g = ekgbVar2;
        this.h = ejwiVar5;
        this.i = ejwiVar6;
        this.j = ejwiVar7;
    }

    @Override // defpackage.dwaz
    public final ejwi a() {
        return this.b;
    }

    @Override // defpackage.dwaz
    public final ejwi b() {
        return this.i;
    }

    @Override // defpackage.dwaz
    public final ejwi c() {
        return this.e;
    }

    @Override // defpackage.dwaz
    public final ejwi d() {
        return this.c;
    }

    @Override // defpackage.dwaz
    public final ejwi e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwaz) {
            dwaz dwazVar = (dwaz) obj;
            if (this.a.equals(dwazVar.l()) && this.b.equals(dwazVar.a()) && this.c.equals(dwazVar.d()) && this.d.equals(dwazVar.g()) && this.k.equals(dwazVar.k()) && this.e.equals(dwazVar.c()) && this.l.equals(dwazVar.j()) && ekjz.h(this.f, dwazVar.h()) && ekjz.h(this.g, dwazVar.i()) && this.h.equals(dwazVar.e()) && this.i.equals(dwazVar.b()) && this.j.equals(dwazVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwaz
    public final ejwi f() {
        return this.j;
    }

    @Override // defpackage.dwaz
    public final ejwi g() {
        return this.d;
    }

    @Override // defpackage.dwaz
    public final ekgb h() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
    }

    @Override // defpackage.dwaz
    public final ekgb i() {
        return this.g;
    }

    @Override // defpackage.dwaz
    public final ekgp j() {
        return this.l;
    }

    @Override // defpackage.dwaz
    public final String k() {
        return this.k;
    }

    @Override // defpackage.dwaz
    public final String l() {
        return this.a;
    }

    public final String toString() {
        ejwi ejwiVar = this.j;
        ejwi ejwiVar2 = this.i;
        ejwi ejwiVar3 = this.h;
        ekgb ekgbVar = this.g;
        ekgb ekgbVar2 = this.f;
        ekgp ekgpVar = this.l;
        ejwi ejwiVar4 = this.e;
        ejwi ejwiVar5 = this.d;
        ejwi ejwiVar6 = this.c;
        return "ProfileInfo{name=" + this.a + ", a11yName=" + String.valueOf(this.b) + ", imageUrl=" + String.valueOf(ejwiVar6) + ", thumbnailData=" + String.valueOf(ejwiVar5) + ", contentType=" + this.k + ", groupInfo=" + String.valueOf(ejwiVar4) + ", metadata=" + ekgpVar.toString() + ", menuItems=" + ekgbVar2.toString() + ", toolbarButtons=" + ekgbVar.toString() + ", lighterUiConfigurations=" + String.valueOf(ejwiVar3) + ", customViewContentModel=" + String.valueOf(ejwiVar2) + ", serverTimestampUs=" + String.valueOf(ejwiVar) + "}";
    }
}
