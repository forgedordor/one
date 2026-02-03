package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxuf extends bxwt {
    private final bxut a;
    private final ekgb b;
    private final ekgb c;
    private final ekgb d;
    private final ekgb e;
    private final ekgb f;
    private final ekgb g;
    private final bxut h;

    public bxuf(bxut bxutVar, ekgb ekgbVar, ekgb ekgbVar2, ekgb ekgbVar3, ekgb ekgbVar4, ekgb ekgbVar5, ekgb ekgbVar6, bxut bxutVar2) {
        this.a = bxutVar;
        this.b = ekgbVar;
        this.c = ekgbVar2;
        this.d = ekgbVar3;
        this.e = ekgbVar4;
        this.f = ekgbVar5;
        this.g = ekgbVar6;
        this.h = bxutVar2;
    }

    @Override // defpackage.bxwt
    public final bxut a() {
        return this.a;
    }

    @Override // defpackage.bxwt
    public final bxut b() {
        return this.h;
    }

    @Override // defpackage.bxwt
    public final ekgb c() {
        return this.g;
    }

    @Override // defpackage.bxwt
    public final ekgb d() {
        return this.c;
    }

    @Override // defpackage.bxwt
    public final ekgb e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxwt) {
            bxwt bxwtVar = (bxwt) obj;
            if (this.a.equals(bxwtVar.a()) && ekjz.h(this.b, bxwtVar.g()) && ekjz.h(this.c, bxwtVar.d()) && ekjz.h(this.d, bxwtVar.h()) && ekjz.h(this.e, bxwtVar.e()) && ekjz.h(this.f, bxwtVar.f()) && ekjz.h(this.g, bxwtVar.c()) && this.h.equals(bxwtVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bxwt
    public final ekgb f() {
        return this.f;
    }

    @Override // defpackage.bxwt
    public final ekgb g() {
        return this.b;
    }

    @Override // defpackage.bxwt
    public final ekgb h() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        bxut bxutVar = this.h;
        ekgb ekgbVar = this.g;
        ekgb ekgbVar2 = this.f;
        ekgb ekgbVar3 = this.e;
        ekgb ekgbVar4 = this.d;
        ekgb ekgbVar5 = this.c;
        ekgb ekgbVar6 = this.b;
        return "SearchResults{conversations=" + this.a.toString() + ", messageIds=" + ekgbVar6.toString() + ", images=" + ekgbVar5.toString() + ", videos=" + ekgbVar4.toString() + ", links=" + ekgbVar3.toString() + ", locations=" + ekgbVar2.toString() + ", contacts=" + ekgbVar.toString() + ", starredTexts=" + bxutVar.toString() + "}";
    }
}
