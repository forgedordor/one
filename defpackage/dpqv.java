package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpqv extends fcyz implements fdat {
    final /* synthetic */ dprl a;
    final /* synthetic */ hsf b;
    final /* synthetic */ hsf c;
    final /* synthetic */ hox d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpqv(dprl dprlVar, hsf hsfVar, hsf hsfVar2, hox hoxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dprlVar;
        this.b = hsfVar;
        this.c = hsfVar2;
        this.d = hoxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpqv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (dprg.a(this.b) == 1.0f && ihs.h(dprg.c(this.c), 0L)) {
            hox hoxVar = this.d;
            if (dprg.i(hoxVar)) {
                hoxVar.b(false);
                dprg.f(this.a, "Finished resetting image");
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dpqv(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
