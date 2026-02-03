package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmw extends dwpf {
    public final dwpk a;
    public final ejwi b;
    public final ejwi c;
    public final ejwi d;
    public final ejwi e;
    public final boolean f;
    public final long g;
    public final ekgb h;
    public final ekgb i;
    public final ejwi j;
    public final ejwi k;
    public final long l;

    public dwmw(dwpk dwpkVar, ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, boolean z, long j, ekgb ekgbVar, ekgb ekgbVar2, ejwi ejwiVar5, ejwi ejwiVar6, long j2) {
        this.a = dwpkVar;
        this.b = ejwiVar;
        this.c = ejwiVar2;
        this.d = ejwiVar3;
        this.e = ejwiVar4;
        this.f = z;
        this.g = j;
        this.h = ekgbVar;
        this.i = ekgbVar2;
        this.j = ejwiVar5;
        this.k = ejwiVar6;
        this.l = j2;
    }

    @Override // defpackage.dwpf
    public final long a() {
        return this.g;
    }

    @Override // defpackage.dwpf
    public final long b() {
        return this.l;
    }

    @Override // defpackage.dwpf
    public final dwpe c() {
        return new dwmv(this);
    }

    @Override // defpackage.dwpf
    public final dwpk d() {
        return this.a;
    }

    @Override // defpackage.dwpf
    public final ejwi e() {
        return this.c;
    }

    @Override // defpackage.dwpf
    public final ejwi f() {
        return this.e;
    }

    @Override // defpackage.dwpf
    public final ejwi g() {
        return this.d;
    }

    @Override // defpackage.dwpf
    public final ejwi h() {
        return this.k;
    }

    @Override // defpackage.dwpf
    public final ejwi i() {
        return this.b;
    }

    @Override // defpackage.dwpf
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        ejwi ejwiVar = this.k;
        ejwi ejwiVar2 = this.j;
        ekgb ekgbVar = this.i;
        ekgb ekgbVar2 = this.h;
        ejwi ejwiVar3 = this.e;
        ejwi ejwiVar4 = this.d;
        ejwi ejwiVar5 = this.c;
        ejwi ejwiVar6 = this.b;
        return "Contact{contactId=" + this.a.toString() + ", name=" + String.valueOf(ejwiVar6) + ", a11yName=" + String.valueOf(ejwiVar5) + ", imageUrl=" + String.valueOf(ejwiVar4) + ", image=" + String.valueOf(ejwiVar3) + ", isImageStale=" + this.f + ", expirationTimeMillis=" + this.g + ", menuItems=" + ekgbVar2.toString() + ", toolbarButtons=" + ekgbVar.toString() + ", customViewContentModel=" + String.valueOf(ejwiVar2) + ", lighterUiConfigurations=" + String.valueOf(ejwiVar) + ", serverTimestampUs=" + this.l + "}";
    }
}
