package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyxl extends dyyf {
    public final dtah a;
    public final dxxk b;
    public final dyau c;
    private final ejwi d;

    public dyxl(dtah dtahVar, dxxk dxxkVar, dyau dyauVar, ejwi ejwiVar) {
        this.a = dtahVar;
        this.b = dxxkVar;
        this.c = dyauVar;
        this.d = ejwiVar;
    }

    @Override // defpackage.dyyf
    public final dtah a() {
        return this.a;
    }

    @Override // defpackage.dyyf
    public final dxxk b() {
        return this.b;
    }

    @Override // defpackage.dyyf
    public final dyau c() {
        return this.c;
    }

    @Override // defpackage.dyyf
    public final ejwi d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyyf) {
            dyyf dyyfVar = (dyyf) obj;
            if (this.a.equals(dyyfVar.a()) && this.b.equals(dyyfVar.b()) && this.c.equals(dyyfVar.c())) {
                dyyfVar.e();
                if (this.d.equals(dyyfVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ 2040732332;
    }

    public final String toString() {
        return "SimpleVeLogger{vePrimitives=" + this.a.toString() + ", accountConverter=" + this.b.toString() + ", accountsModel=" + this.c.toString() + ", incognitoModel=null, appIdentifier=Optional.absent()}";
    }

    @Override // defpackage.dyyf
    public final void e() {
    }
}
