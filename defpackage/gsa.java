package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsa {
    public final eve a;
    public final eve b;
    public final eve c;
    public final eve d;
    public final eve e;
    public final eve f;
    public final eve g;
    public final eve h;

    public gsa(eve eveVar, eve eveVar2, eve eveVar3, eve eveVar4, eve eveVar5, eve eveVar6, eve eveVar7, eve eveVar8) {
        this.a = eveVar;
        this.b = eveVar2;
        this.c = eveVar3;
        this.d = eveVar4;
        this.e = eveVar5;
        this.f = eveVar6;
        this.g = eveVar7;
        this.h = eveVar8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsa)) {
            return false;
        }
        gsa gsaVar = (gsa) obj;
        return fdbq.f(this.a, gsaVar.a) && fdbq.f(this.b, gsaVar.b) && fdbq.f(this.c, gsaVar.c) && fdbq.f(this.d, gsaVar.d) && fdbq.f(this.e, gsaVar.e) && fdbq.f(this.f, gsaVar.f) && fdbq.f(this.g, gsaVar.g) && fdbq.f(this.h, gsaVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gsa() {
        this(grz.a, grz.b, grz.c, grz.d, grz.f, grz.e, grz.g, grz.h);
        eve eveVar = grz.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gsa(byte[] bArr) {
        this(grz.a, grz.b, grz.c, grz.d, grz.f, grz.e, grz.g, grz.h);
        eve eveVar = grz.a;
    }
}
