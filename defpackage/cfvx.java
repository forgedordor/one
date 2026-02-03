package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfvx implements cfvh {
    public final cfws a;
    public final cfuz b;
    private final fdjx c;
    private final String d = "WaitingForNetwork";
    private fdlr e;

    public cfvx(cfws cfwsVar, fdjx fdjxVar, cfuz cfuzVar) {
        this.a = cfwsVar;
        this.c = fdjxVar;
        this.b = cfuzVar;
    }

    @Override // defpackage.cfvh
    public final Object a(fcxy fcxyVar) {
        this.e = auvw.k(this.c, null, null, new cfvw(this, null), 3);
        return fctx.a;
    }

    @Override // defpackage.cfvh
    public final String b() {
        return this.d;
    }

    @Override // defpackage.cfvh
    public final Object c() {
        fdlr fdlrVar = this.e;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.e = null;
        return fctx.a;
    }
}
