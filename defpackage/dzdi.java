package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdi extends dzdo {
    public final dzdu a;
    public final dzdh b;

    public dzdi(dzdu dzduVar, dzdh dzdhVar) {
        this.a = dzduVar;
        this.b = dzdhVar;
    }

    @Override // defpackage.dzdo
    public final dzdh a() {
        return this.b;
    }

    @Override // defpackage.dzdo
    public final dzdu b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzdo) {
            dzdo dzdoVar = (dzdo) obj;
            if (this.a.equals(dzdoVar.b()) && this.b.equals(dzdoVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        dzdh dzdhVar = this.b;
        return "Configuration{tooltipModel=" + this.a.toString() + ", anchorViewProvider=" + dzdhVar.toString() + "}";
    }
}
