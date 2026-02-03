package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzsp extends dzsq {
    private final ejwi a;
    private final ejwi b;

    public dzsp(ejwi ejwiVar, ejwi ejwiVar2) {
        this.a = ejwiVar;
        this.b = ejwiVar2;
    }

    @Override // defpackage.dzsq
    public final ejwi d() {
        return this.b;
    }

    @Override // defpackage.dzsq
    public final ejwi e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzsq) {
            dzsq dzsqVar = (dzsq) obj;
            dzsqVar.f();
            if (this.a.equals(dzsqVar.e()) && this.b.equals(dzsqVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 395873938;
    }

    public final String toString() {
        return "StartupConfigurations{enablement=DEFAULT, metricExtensionProvider=Optional.absent(), customTimestampProvider=Optional.absent()}";
    }

    @Override // defpackage.dzsq
    public final void f() {
    }
}
