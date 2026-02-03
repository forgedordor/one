package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dydk extends dycy {
    public final dycw a;
    public final dycw b;
    public final dycw c;

    public dydk(dycw dycwVar, dycw dycwVar2, dycw dycwVar3) {
        this.a = dycwVar;
        this.b = dycwVar2;
        this.c = dycwVar3;
    }

    @Override // defpackage.dycy
    public final dycw a() {
        return this.c;
    }

    @Override // defpackage.dycy
    public final dycw b() {
        return this.a;
    }

    @Override // defpackage.dycy
    public final dycw c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dycy) {
            dycy dycyVar = (dycy) obj;
            if (this.a.equals(dycyVar.b()) && this.b.equals(dycyVar.c()) && this.c.equals(dycyVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        dycw dycwVar = this.c;
        dycw dycwVar2 = this.b;
        return "AccountMenuClickListeners{myAccountClickListener=" + this.a.toString() + ", useAnotherAccountClickListener=" + dycwVar2.toString() + ", manageAccountsClickListener=" + dycwVar.toString() + "}";
    }
}
