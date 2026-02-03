package defpackage;

/* compiled from: PG */
@fcsv
/* loaded from: classes4.dex */
public final class dknk implements dknr {
    public final fdae a;
    public final djrr b;
    public final dknj c;

    /* JADX WARN: Multi-variable type inference failed */
    public dknk() {
        this(null, 0 == true ? 1 : 0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dknk)) {
            return false;
        }
        dknk dknkVar = (dknk) obj;
        return fdbq.f(this.a, dknkVar.a) && this.b == dknkVar.b && fdbq.f(this.c, dknkVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Cancelled(onRetryButtonClicked=" + this.a + ", icon=" + this.b + ", flags=" + this.c + ")";
    }

    public /* synthetic */ dknk(fdae fdaeVar, dknj dknjVar, int i) {
        fdaeVar = (i & 1) != 0 ? new fdae() { // from class: dkni
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar;
        djrr djrrVar = (i & 2) != 0 ? djrr.A : null;
        dknjVar = (i & 4) != 0 ? new dknj((byte[]) null) : dknjVar;
        fdaeVar.getClass();
        djrrVar.getClass();
        dknjVar.getClass();
        this.a = fdaeVar;
        this.b = djrrVar;
        this.c = dknjVar;
    }
}
