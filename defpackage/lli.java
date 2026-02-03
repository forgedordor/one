package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lli extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdat b;
    final /* synthetic */ ljt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lli(fdat fdatVar, ljt ljtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdatVar;
        this.c = ljtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((lli) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        fdat fdatVar = this.b;
        ljt ljtVar = this.c;
        this.a = 1;
        Object objA = fdatVar.a(ljtVar.a, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new lli(this.b, this.c, fcxyVar);
    }
}
