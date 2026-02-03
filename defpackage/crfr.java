package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crfr extends fcyz implements fdat {
    int a;
    final /* synthetic */ crgd b;
    final /* synthetic */ ejjv c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crfr(fcxy fcxyVar, crgd crgdVar, ejjv ejjvVar) {
        super(2, fcxyVar);
        this.b = crgdVar;
        this.c = ejjvVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crfr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            agkr agkrVar = (agkr) this.b.l.b();
            this.a = 1;
            obj = agkrVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        crgd crgdVar = this.b;
        agkm agkmVar = (agkm) obj;
        cqbd cqbdVarD = crgdVar.n.d();
        cqbdVarD.I("createSmartReplyLibFromConfigAsync");
        cqbdVarD.r();
        ekfw ekfwVar = new ekfw();
        if (agkmVar != null) {
            ekfwVar.h(agkmVar);
        }
        return crgdVar.c(this.c, ekfwVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crfr crfrVar = new crfr(fcxyVar, this.b, this.c);
        crfrVar.d = obj;
        return crfrVar;
    }
}
