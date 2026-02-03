package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkst implements dksx {
    public final fdae a;
    public final djrr b;
    private final boolean c;
    private final fdae d;
    private final fdae e;
    private final String f;

    /* JADX WARN: Multi-variable type inference failed */
    public dkst() {
        this(null, 0 == true ? 1 : 0, 63);
    }

    @Override // defpackage.dkgq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dkgq
    public final fdae b() {
        return this.d;
    }

    @Override // defpackage.dkgq
    public final fdae c() {
        return this.e;
    }

    @Override // defpackage.dkgq
    public final boolean d() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkst)) {
            return false;
        }
        dkst dkstVar = (dkst) obj;
        if (!fdbq.f(this.a, dkstVar.a) || this.b != dkstVar.b) {
            return false;
        }
        boolean z = dkstVar.c;
        if (!fdbq.f(this.d, dkstVar.d) || !fdbq.f(this.e, dkstVar.e)) {
            return false;
        }
        String str = dkstVar.f;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + 1237) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
    }

    public final String toString() {
        return "Cancelled(onRetryButtonClicked=" + this.a + ", icon=" + this.b + ", isHighlighted=false, onClick=" + this.d + ", onLayout=" + this.e + ", contentDescription=null)";
    }

    public /* synthetic */ dkst(fdae fdaeVar, djrr djrrVar, int i) {
        fdaeVar = (i & 1) != 0 ? new fdae() { // from class: dksq
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        } : fdaeVar;
        djrrVar = (i & 2) != 0 ? djrr.A : djrrVar;
        fdae fdaeVar2 = new fdae() { // from class: dksr
            @Override // defpackage.fdae
            public final Object invoke() {
                return false;
            }
        };
        fdae fdaeVar3 = new fdae() { // from class: dkss
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        fdaeVar.getClass();
        djrrVar.getClass();
        this.a = fdaeVar;
        this.b = djrrVar;
        this.c = false;
        this.d = fdaeVar2;
        this.e = fdaeVar3;
        this.f = null;
    }
}
