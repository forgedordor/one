package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjx extends dyka {
    private final ejwi a;
    private final ekgb b;
    private final ejwi c;

    public dyjx(ejwi ejwiVar, ekgb ekgbVar, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = ekgbVar;
        this.c = ejwiVar2;
    }

    @Override // defpackage.dyka
    public final ejwi a() {
        return this.c;
    }

    @Override // defpackage.dyix
    public final ejwi c() {
        return this.a;
    }

    @Override // defpackage.dyka, defpackage.dyix
    public final ekgb d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dyka) {
            dyka dykaVar = (dyka) obj;
            if (this.a.equals(dykaVar.c()) && ekjz.h(this.b, dykaVar.d()) && this.c.equals(dykaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 2097800333) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "CollapsibleAccountManagementFeatureImpl{commonCards=Optional.absent(), flavorCustomActions=" + this.b.toString() + ", dynamicCards=Optional.absent()}";
    }
}
