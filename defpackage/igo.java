package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igo implements igl {
    public boolean a = true;
    public final igr b;
    public final igr c;
    public final igr d;
    public final igr e;
    public final igr f;
    public final igr g;
    public final igr h;
    public final igr i;
    public fdap j;
    public fdap k;

    public igo() {
        igr igrVar = igr.a;
        this.b = igrVar;
        this.c = igrVar;
        this.d = igrVar;
        this.e = igrVar;
        this.f = igrVar;
        this.g = igrVar;
        this.h = igrVar;
        this.i = igrVar;
        this.j = igm.a;
        this.k = ign.a;
    }

    @Override // defpackage.igl
    public final void a(boolean z) {
        this.a = z;
    }

    @Override // defpackage.igl
    public final void b(fdap fdapVar) {
        this.j = fdapVar;
    }

    @Override // defpackage.igl
    public final void c(fdap fdapVar) {
        this.k = fdapVar;
    }

    @Override // defpackage.igl
    public final boolean d() {
        return this.a;
    }
}
