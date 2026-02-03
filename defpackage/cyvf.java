package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyvf extends cyvj {
    private final String a;
    private final ekhx b;
    private final ekhx c;
    private final ekhx d;
    private final ekhx e;
    private final ekhx f;
    private final ekhx g;
    private final ekhx h;
    private final ekhx i;

    public cyvf(String str, ekhx ekhxVar, ekhx ekhxVar2, ekhx ekhxVar3, ekhx ekhxVar4, ekhx ekhxVar5, ekhx ekhxVar6, ekhx ekhxVar7, ekhx ekhxVar8) {
        this.a = str;
        this.b = ekhxVar;
        this.c = ekhxVar2;
        this.d = ekhxVar3;
        this.e = ekhxVar4;
        this.f = ekhxVar5;
        this.g = ekhxVar6;
        this.h = ekhxVar7;
        this.i = ekhxVar8;
    }

    @Override // defpackage.cyvj
    public final ekhx a() {
        return this.d;
    }

    @Override // defpackage.cyvj
    public final ekhx b() {
        return this.c;
    }

    @Override // defpackage.cyvj
    public final ekhx c() {
        return this.h;
    }

    @Override // defpackage.cyvj
    public final ekhx d() {
        return this.e;
    }

    @Override // defpackage.cyvj
    public final ekhx e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyvj) {
            cyvj cyvjVar = (cyvj) obj;
            if (this.a.equals(cyvjVar.i()) && this.b.equals(cyvjVar.g()) && this.c.equals(cyvjVar.b()) && this.d.equals(cyvjVar.a()) && this.e.equals(cyvjVar.d()) && this.f.equals(cyvjVar.f()) && this.g.equals(cyvjVar.h()) && this.h.equals(cyvjVar.c()) && this.i.equals(cyvjVar.e())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cyvj
    public final ekhx f() {
        return this.f;
    }

    @Override // defpackage.cyvj
    public final ekhx g() {
        return this.b;
    }

    @Override // defpackage.cyvj
    public final ekhx h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.cyvj
    public final String i() {
        return this.a;
    }

    public final String toString() {
        ekhx ekhxVar = this.i;
        ekhx ekhxVar2 = this.h;
        ekhx ekhxVar3 = this.g;
        ekhx ekhxVar4 = this.f;
        ekhx ekhxVar5 = this.e;
        ekhx ekhxVar6 = this.d;
        ekhx ekhxVar7 = this.c;
        return "Contact{displayName=" + this.a + ", phones=" + this.b.toString() + ", emails=" + ekhxVar7.toString() + ", addresses=" + ekhxVar6.toString() + ", ims=" + ekhxVar5.toString() + ", organizations=" + ekhxVar4.toString() + ", websites=" + ekhxVar3.toString() + ", events=" + ekhxVar2.toString() + ", notes=" + ekhxVar.toString() + "}";
    }
}
