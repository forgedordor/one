package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dynf extends dyng {
    private final ejwi a;
    private final ejwi b;
    private final ejwi c;
    private final ejwi d;

    public dynf(ejwi ejwiVar, ejwi ejwiVar2, ejwi ejwiVar3, ejwi ejwiVar4) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
        this.c = ejwiVar3;
        this.d = ejwiVar4;
    }

    @Override // defpackage.dyjb
    public final ejwi a() {
        return this.d;
    }

    @Override // defpackage.dyjb
    public final ejwi b() {
        return this.c;
    }

    @Override // defpackage.dyjb
    public final ejwi c() {
        return this.a;
    }

    @Override // defpackage.dyjb
    public final ejwi d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyng) {
            dyng dyngVar = (dyng) obj;
            if (this.a.equals(dyngVar.c()) && this.b.equals(dyngVar.d()) && this.c.equals(dyngVar.b()) && this.d.equals(dyngVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "PolicyFooterCustomizerImpl{privacyPolicyClickListener=" + this.a.toString() + ", termsOfServiceClickListener=" + this.b.toString() + ", customItemLabelStringId=Optional.absent(), customItemClickListener=Optional.absent()}";
    }
}
