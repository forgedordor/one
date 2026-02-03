package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dcf implements dbs, ixd {
    public static final fctc a = fctd.b(3, dbu.a);
    public final fdjx b;
    public boolean c;
    public ivy f;
    public ivy g;
    private final /* synthetic */ ixd j;
    public final hox d = new hpl(false, hsi.a);
    private final fdae k = new dbx(this);
    public final fdap e = new dce(this);
    public final iac h = new iac();
    public final cuz i = new cuz((byte[]) null);

    public dcf(ixd ixdVar, fdjx fdjxVar) {
        this.j = ixdVar;
        this.b = fdjxVar;
    }

    @Override // defpackage.dbs
    public final boolean a() {
        return ((Boolean) this.d.a()).booleanValue();
    }

    @Override // defpackage.dbs
    public final dbr b(Object obj, hml hmlVar) {
        hmlVar.v(799702514);
        boolean zD = hmlVar.D(obj);
        hmw hmwVar = (hmw) hmlVar;
        Object objS = hmwVar.S();
        if (zD || objS == hmk.a) {
            objS = new dbr(obj);
            hmwVar.af(objS);
        }
        dbr dbrVar = (dbr) objS;
        hmwVar.ab();
        return dbrVar;
    }

    @Override // defpackage.dbs
    public final ics c(ics icsVar, dbr dbrVar, cyg cygVar, dap dapVar, dar darVar, dcg dcgVar, dba dbaVar, dbo dboVar, dch dchVar) {
        return icj.g(icj.g(icsVar, new dcd(dbrVar, cygVar.a(), dbz.a, this, dboVar, dchVar, dcgVar)), new dcc(cygVar, dapVar, darVar, dbrVar, dbaVar));
    }

    public final ivy d() {
        ivy ivyVar = this.g;
        if (ivyVar != null) {
            return ivyVar;
        }
        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
    }

    @Override // defpackage.ixd
    public final ivy dX(ivy ivyVar) {
        return this.j.dX(ivyVar);
    }

    @Override // defpackage.ixd
    public final long dY(ivy ivyVar, ivy ivyVar2) {
        return this.j.dY(ivyVar, ivyVar2);
    }

    public final void f() {
        if (this.c) {
            return;
        }
        dbv.a().c(this, this.e, this.k);
    }

    public final void g(dbl dblVar, fdap fdapVar, fdae fdaeVar) {
        if (this.c) {
            return;
        }
        dbv.a().c(dblVar, fdapVar, fdaeVar);
    }
}
