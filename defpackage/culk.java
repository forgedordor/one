package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class culk extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ culm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public culk(culm culmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = culmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((culk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            obj2 = this.b;
            objA = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            culm culmVar = this.d;
            objA = culq.a((culo) culp.a.createBuilder());
            this.a = objA;
            this.b = objA;
            this.c = 1;
            obj = fdin.a(eicg.a(culmVar.d), new culg(null, culmVar), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = objA;
        }
        ((culr) obj2).b(((Boolean) obj).booleanValue());
        return ((culr) objA).a();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new culk(this.d, fcxyVar);
    }
}
