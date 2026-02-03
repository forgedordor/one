package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlkl {
    public final hsf a;
    public final jyq b;
    public final jyq c;
    public final jyq d;
    public final jyq e;
    public final jyq f;
    public final jyq g;
    public final hcr h;

    public dlkl(hsf hsfVar, jyq jyqVar, jyq jyqVar2, jyq jyqVar3, jyq jyqVar4, jyq jyqVar5, jyq jyqVar6, hcr hcrVar) {
        this.a = hsfVar;
        this.b = jyqVar;
        this.c = jyqVar2;
        this.d = jyqVar3;
        this.e = jyqVar4;
        this.f = jyqVar5;
        this.g = jyqVar6;
        this.h = hcrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlkl)) {
            return false;
        }
        dlkl dlklVar = (dlkl) obj;
        return fdbq.f(this.a, dlklVar.a) && fdbq.f(this.b, dlklVar.b) && fdbq.f(this.c, dlklVar.c) && fdbq.f(this.d, dlklVar.d) && fdbq.f(this.e, dlklVar.e) && fdbq.f(this.f, dlklVar.f) && fdbq.f(this.g, dlklVar.g) && fdbq.f(this.h, dlklVar.h);
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "AbcTypography(scalableFontFactor=" + this.a + ", bodyBold=" + this.b + ", bodyExtraLarge=" + this.c + ", bodyMediumItalic=" + this.d + ", labelExtraSmall=" + this.e + ", titleMediumLarge=" + this.f + ", titleSmallCondensed=" + this.g + ", baseTypography=" + this.h + ")";
    }
}
