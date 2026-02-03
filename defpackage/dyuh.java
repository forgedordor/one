package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyuh extends dyuo {
    public final ejwi a;
    public final ejwi b;
    public final ejwi c;
    public final ejwi d;
    public final ejwi e;
    public final ejwi f;
    public final dyux g;
    public final boolean h;
    public final dyum i;

    public dyuh(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, ejwi ejwiVar5, ejwi ejwiVar6, dyux dyuxVar, boolean z, dyum dyumVar) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = ejwiVar3;
        this.d = ejwiVar4;
        this.e = ejwiVar5;
        this.f = ejwiVar6;
        this.g = dyuxVar;
        this.h = z;
        this.i = dyumVar;
    }

    @Override // defpackage.dyuo
    public final dyun a() {
        return new dyug(this);
    }

    @Override // defpackage.dyuo
    public final dyux b() {
        return this.g;
    }

    @Override // defpackage.dyuo
    public final ejwi c() {
        return this.e;
    }

    @Override // defpackage.dyuo
    public final ejwi d() {
        return this.c;
    }

    @Override // defpackage.dyuo
    public final ejwi e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyuo) {
            dyuo dyuoVar = (dyuo) obj;
            if (this.a.equals(dyuoVar.h()) && this.b.equals(dyuoVar.e()) && this.c.equals(dyuoVar.d()) && this.d.equals(dyuoVar.f()) && this.e.equals(dyuoVar.c()) && this.f.equals(dyuoVar.g()) && this.g.equals(dyuoVar.b()) && this.h == dyuoVar.i() && equals(dyuoVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dyuo
    public final ejwi f() {
        return this.d;
    }

    @Override // defpackage.dyuo
    public final ejwi g() {
        return this.f;
    }

    @Override // defpackage.dyuo
    public final ejwi h() {
        return this.a;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ hashCode();
    }

    @Override // defpackage.dyuo
    public final boolean i() {
        return this.h;
    }

    @Override // defpackage.dyuo
    public final dyum j() {
        return this.i;
    }

    public final String toString() {
        dyum dyumVar = this.i;
        dyux dyuxVar = this.g;
        ejwi ejwiVar = this.f;
        ejwi ejwiVar2 = this.e;
        ejwi ejwiVar3 = this.d;
        ejwi ejwiVar4 = this.c;
        ejwi ejwiVar5 = this.b;
        return "ExpressSignInFeatures{signInWithoutAccountFeature=" + String.valueOf(this.a) + ", disclaimerFeature=" + String.valueOf(ejwiVar5) + ", customHeaderContentFeature=" + String.valueOf(ejwiVar4) + ", logoViewFeature=" + String.valueOf(ejwiVar3) + ", cancelableFeature=" + String.valueOf(ejwiVar2) + ", materialVersion=" + String.valueOf(ejwiVar) + ", secondaryButtonStyleFeature=" + dyuxVar.toString() + ", supportAccountSwitching=" + this.h + ", customContinueButtonTextsFactory=" + dyumVar.toString() + "}";
    }
}
