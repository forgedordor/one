package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class orl extends lvv {
    public final fdjx a;
    public final ouj h;
    public final fdae i;
    public final fdjq j;
    public final fdjq k;
    public oun l;
    public final fdae m;
    private fdlr n;

    public orl(fdjx fdjxVar, Object obj, ouj oujVar, fdae fdaeVar, fdjq fdjqVar, fdjq fdjqVar2) {
        super(new oqo(fdjxVar, fdjqVar, fdjqVar2, oujVar, obj));
        this.a = fdjxVar;
        this.h = oujVar;
        this.i = fdaeVar;
        this.j = fdjqVar;
        this.k = fdjqVar2;
        this.m = new fdae() { // from class: ori
            @Override // defpackage.fdae
            public final Object invoke() {
                this.a.b(true);
                return fctx.a;
            }
        };
        Object objA = a();
        objA.getClass();
        this.l = (oun) objA;
    }

    public final void b(boolean z) {
        fdlr fdlrVar = this.n;
        if (fdlrVar == null || z) {
            if (fdlrVar != null) {
                fdlrVar.t(null);
            }
            this.n = fdil.d(this.a, this.k, null, new ork(this, null), 2);
        }
    }

    @Override // defpackage.lvv
    protected final void h() {
        b(false);
    }
}
