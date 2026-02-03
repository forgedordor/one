package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaos extends easv {
    public final eatb a;
    public final eatb b;
    public final eatb c;
    public final eatb d;

    public eaos(eatb eatbVar, eatb eatbVar2, eatb eatbVar3, eatb eatbVar4) {
        if (eatbVar == null) {
            throw new NullPointerException("Null acceptsCreditCards");
        }
        this.a = eatbVar;
        if (eatbVar2 == null) {
            throw new NullPointerException("Null acceptsDebitCards");
        }
        this.b = eatbVar2;
        if (eatbVar3 == null) {
            throw new NullPointerException("Null acceptsCashOnly");
        }
        this.c = eatbVar3;
        if (eatbVar4 == null) {
            throw new NullPointerException("Null acceptsNfc");
        }
        this.d = eatbVar4;
    }

    @Override // defpackage.easv
    public final eatb a() {
        return this.c;
    }

    @Override // defpackage.easv
    public final eatb b() {
        return this.a;
    }

    @Override // defpackage.easv
    public final eatb c() {
        return this.b;
    }

    @Override // defpackage.easv
    public final eatb d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof easv) {
            easv easvVar = (easv) obj;
            if (this.a.equals(easvVar.b()) && this.b.equals(easvVar.c()) && this.c.equals(easvVar.a()) && this.d.equals(easvVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        eatb eatbVar = this.d;
        eatb eatbVar2 = this.c;
        eatb eatbVar3 = this.b;
        return "PaymentOptions{acceptsCreditCards=" + this.a.toString() + ", acceptsDebitCards=" + eatbVar3.toString() + ", acceptsCashOnly=" + eatbVar2.toString() + ", acceptsNfc=" + eatbVar.toString() + "}";
    }
}
