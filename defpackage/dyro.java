package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyro extends dyru {
    public final dytx a;
    public final dyud b;
    public final boolean c = true;
    private final ejwi d;

    public dyro(dytx dytxVar, dyud dyudVar, ejwi ejwiVar, boolean z) {
        this.a = dytxVar;
        this.b = dyudVar;
        this.d = ejwiVar;
    }

    @Override // defpackage.dyru
    public final dytx a() {
        return this.a;
    }

    @Override // defpackage.dyru
    public final dyud b() {
        return this.b;
    }

    @Override // defpackage.dyru
    public final ejwi c() {
        return this.d;
    }

    @Override // defpackage.dyru
    public final boolean d() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyru) {
            dyru dyruVar = (dyru) obj;
            if (this.a.equals(dyruVar.a()) && this.b.equals(dyruVar.b()) && this.d.equals(dyruVar.c())) {
                dyruVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 1231;
    }

    public final String toString() {
        return "ExpressSignInDialogConfiguration{expressSignInManager=" + this.a.toString() + ", expressSignInSpec=" + this.b.toString() + ", modelUpdater=Optional.absent(), dismissOnTouchOutside=true}";
    }
}
