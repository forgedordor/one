package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dby extends fcyz implements fdat {
    final /* synthetic */ dbl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dby(dbl dblVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dblVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dby) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dbl dblVar = this.a;
        if (dblVar.f.isEmpty()) {
            dblVar.b.i.b(dblVar.a);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dby(this.a, fcxyVar);
    }
}
