package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvn implements vvp, dlti {
    public final vvl a;
    public final dltn b;

    public vvn(vvl vvlVar, dltn dltnVar) {
        dltnVar.getClass();
        this.a = vvlVar;
        this.b = dltnVar;
    }

    @Override // defpackage.vvs
    public final vvl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvn)) {
            return false;
        }
        vvn vvnVar = (vvn) obj;
        return fdbq.f(this.a, vvnVar.a) && fdbq.f(this.b, vvnVar.b);
    }

    @Override // defpackage.dlti
    public final Object fp() {
        return this.b.e();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Resolved(instanceId=" + this.a + ", attachment=" + this.b.fq() + ")";
    }
}
