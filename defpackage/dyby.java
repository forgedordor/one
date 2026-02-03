package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyby extends dybn {
    public final dxyj a;
    public final dxxk b;
    public final dyau c;
    public final dywb d;
    public final ejwi e;
    public final ejwi f;

    public dyby(dxyj dxyjVar, dxxk dxxkVar, dyau dyauVar, dywb dywbVar, ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = dxyjVar;
        this.b = dxxkVar;
        this.c = dyauVar;
        this.d = dywbVar;
        this.e = ejwiVar;
        this.f = ejwiVar2;
    }

    @Override // defpackage.dybn
    public final dxxk a() {
        return this.b;
    }

    @Override // defpackage.dybn
    public final dxyj b() {
        return this.a;
    }

    @Override // defpackage.dybn
    public final dyau c() {
        return this.c;
    }

    @Override // defpackage.dybn
    public final dywb d() {
        return this.d;
    }

    @Override // defpackage.dybn
    public final ejwi e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dybn) {
            dybn dybnVar = (dybn) obj;
            if (this.a.equals(dybnVar.b()) && this.b.equals(dybnVar.a()) && this.c.equals(dybnVar.c())) {
                dybnVar.g();
                if (this.d.equals(dybnVar.d()) && this.e.equals(dybnVar.e()) && this.f.equals(dybnVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.dybn
    public final ejwi f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * (-721379959)) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        ejwi ejwiVar = this.f;
        ejwi ejwiVar2 = this.e;
        dywb dywbVar = this.d;
        dyau dyauVar = this.c;
        dxxk dxxkVar = this.b;
        return "AccountManagementSpec{avatarImageLoader=" + this.a.toString() + ", accountConverter=" + dxxkVar.toString() + ", accountsModel=" + dyauVar.toString() + ", accountClass=null, oneGoogleEventLogger=" + dywbVar.toString() + ", deactivatedAccountsFeature=" + String.valueOf(ejwiVar2) + ", launcherAppDialogTracker=" + String.valueOf(ejwiVar) + "}";
    }

    @Override // defpackage.dybn
    @Deprecated
    public final void g() {
    }
}
