package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyam extends dyao {
    public final lcj a;
    public final dywb b;
    public final exbg c;
    public final dyyb d;
    public final dxxj e;
    public final dxxj f;
    public final dyqd g;
    private final ejwi h;
    private final ejwi i;

    public dyam(lcj lcjVar, dywb dywbVar, exbg exbgVar, dyyb dyybVar, dxxj dxxjVar, dxxj dxxjVar2, ejwi ejwiVar, ejwi ejwiVar2, dyqd dyqdVar) {
        this.a = lcjVar;
        this.b = dywbVar;
        this.c = exbgVar;
        this.d = dyybVar;
        this.e = dxxjVar;
        this.f = dxxjVar2;
        this.h = ejwiVar;
        this.i = ejwiVar2;
        this.g = dyqdVar;
    }

    @Override // defpackage.dyao
    public final lcj a() {
        return this.a;
    }

    @Override // defpackage.dyao
    public final dxxj b() {
        return this.e;
    }

    @Override // defpackage.dyao
    public final dxxj c() {
        return this.f;
    }

    @Override // defpackage.dyao
    public final dyqd d() {
        return this.g;
    }

    @Override // defpackage.dyao
    public final dywb e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyao) {
            dyao dyaoVar = (dyao) obj;
            if (this.a.equals(dyaoVar.a()) && this.b.equals(dyaoVar.e()) && this.c.equals(dyaoVar.i()) && this.d.equals(dyaoVar.f()) && this.e.equals(dyaoVar.b()) && this.f.equals(dyaoVar.c()) && this.h.equals(dyaoVar.h()) && this.i.equals(dyaoVar.g()) && this.g.equals(dyaoVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dyao
    public final dyyb f() {
        return this.d;
    }

    @Override // defpackage.dyao
    public final ejwi g() {
        return this.i;
    }

    @Override // defpackage.dyao
    public final ejwi h() {
        return this.h;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode();
    }

    @Override // defpackage.dyao
    public final exbg i() {
        return this.c;
    }

    public final String toString() {
        dyqd dyqdVar = this.g;
        ejwi ejwiVar = this.i;
        ejwi ejwiVar2 = this.h;
        dxxj dxxjVar = this.f;
        dxxj dxxjVar2 = this.e;
        dyyb dyybVar = this.d;
        exbg exbgVar = this.c;
        dywb dywbVar = this.b;
        return "PolicyFooterSpec{accountSupplier=" + this.a.toString() + ", eventLogger=" + dywbVar.toString() + ", logContext=" + exbgVar.toString() + ", visualElements=" + dyybVar.toString() + ", privacyPolicyClickListener=" + dxxjVar2.toString() + ", termsOfServiceClickListener=" + dxxjVar.toString() + ", customItemLabelStringId=" + String.valueOf(ejwiVar2) + ", customItemClickListener=" + String.valueOf(ejwiVar) + ", clickRunnables=" + dyqdVar.toString() + "}";
    }
}
