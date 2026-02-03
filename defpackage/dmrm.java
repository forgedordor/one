package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmrm {
    public final String a = "camera";
    public final dmsn b;
    public final ujq c;

    public dmrm(dmsn dmsnVar, ujq ujqVar) {
        this.b = dmsnVar;
        this.c = ujqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmrm)) {
            return false;
        }
        dmrm dmrmVar = (dmrm) obj;
        return fdbq.f(this.a, dmrmVar.a) && fdbq.f(this.b, dmrmVar.b) && fdbq.f(this.c, dmrmVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) - 2095793070) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CameraEffectsConfiguration(categoryName=" + this.a + ", effectsFilter=" + this.b + ", performanceLogger=" + this.c + ")";
    }
}
