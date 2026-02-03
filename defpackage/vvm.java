package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvm implements vvp, dlti {
    public final vvl a;
    public final doav b;

    public vvm(vvl vvlVar, doav doavVar) {
        doavVar.getClass();
        this.a = vvlVar;
        this.b = doavVar;
    }

    @Override // defpackage.vvs
    public final vvl a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvm)) {
            return false;
        }
        vvm vvmVar = (vvm) obj;
        return fdbq.f(this.a, vvmVar.a) && fdbq.f(this.b, vvmVar.b);
    }

    @Override // defpackage.dlti
    public final Object fp() {
        return this.b.fp();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Pending.RemoteResolved(instanceId=" + this.a + ", attachment=" + this.b.fq() + ")";
    }
}
