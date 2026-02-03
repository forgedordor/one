package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnv extends dwqs {
    public final ejwi a;
    public final ejwi b;
    public final ejwi c;
    public final ejwi d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final ejwi i;
    public final int j;

    public dwnv(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4, int i, boolean z, boolean z2, boolean z3, ejwi ejwiVar5, int i2) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = ejwiVar3;
        this.d = ejwiVar4;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = ejwiVar5;
        this.j = i2;
    }

    @Override // defpackage.dwqs
    public final int a() {
        return this.j;
    }

    @Override // defpackage.dwqs
    public final int b() {
        return this.e;
    }

    @Override // defpackage.dwqs
    public final ejwi c() {
        return this.a;
    }

    @Override // defpackage.dwqs
    @Deprecated
    public final ejwi d() {
        return this.b;
    }

    @Override // defpackage.dwqs
    public final ejwi e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwqs) {
            dwqs dwqsVar = (dwqs) obj;
            if (this.a.equals(dwqsVar.c()) && this.b.equals(dwqsVar.d()) && this.c.equals(dwqsVar.g()) && this.d.equals(dwqsVar.e()) && this.e == dwqsVar.b() && this.f == dwqsVar.j() && this.g == dwqsVar.i() && this.h == dwqsVar.h() && this.i.equals(dwqsVar.f()) && this.j == dwqsVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dwqs
    public final ejwi f() {
        return this.i;
    }

    @Override // defpackage.dwqs
    public final ejwi g() {
        return this.c;
    }

    @Override // defpackage.dwqs
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true == this.h ? 1231 : 1237)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j;
    }

    @Override // defpackage.dwqs
    public final boolean i() {
        return this.g;
    }

    @Override // defpackage.dwqs
    public final boolean j() {
        return this.f;
    }

    public final String toString() {
        ejwi ejwiVar = this.i;
        ejwi ejwiVar2 = this.d;
        ejwi ejwiVar3 = this.c;
        ejwi ejwiVar4 = this.b;
        return "Overlay{dismissAction=" + String.valueOf(this.a) + ", displayIcon=" + String.valueOf(ejwiVar4) + ", lighterIcon=" + String.valueOf(ejwiVar3) + ", displayText=" + String.valueOf(ejwiVar2) + ", timeToLiveSec=" + this.e + ", hideSnippetInConversationList=" + this.f + ", hideDismissButton=" + this.g + ", dismissibleByTappingOutside=" + this.h + ", expireTimeStamp=" + String.valueOf(ejwiVar) + ", overlayStyle=" + this.j + "}";
    }
}
