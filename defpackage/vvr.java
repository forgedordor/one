package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vvr implements vvs, dlti {
    public final dltd a;
    public final vvq b;
    public final vvl c;

    public vvr(dltd dltdVar, vvq vvqVar) {
        dltdVar.getClass();
        this.a = dltdVar;
        this.b = vvqVar;
        this.c = vvqVar.a;
    }

    public static /* synthetic */ vvr b(vvr vvrVar, vvq vvqVar) {
        return new vvr(vvrVar.a, vvqVar);
    }

    @Override // defpackage.vvs
    public final vvl a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvr)) {
            return false;
        }
        vvr vvrVar = (vvr) obj;
        return fdbq.f(this.a, vvrVar.a) && fdbq.f(this.b, vvrVar.b);
    }

    @Override // defpackage.dlti
    public final Object fp() {
        return this.a.fp();
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Processed(attachment=" + this.a.fq() + ", metadata=" + this.b + ")";
    }
}
