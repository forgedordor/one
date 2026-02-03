package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afjy extends fcyz implements fdat {
    int a;
    final /* synthetic */ afjz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afjy(afjz afjzVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = afjzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afjy) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        afkc afkcVar = (afkc) this.b.b.b();
        this.a = 1;
        Object objB = afkcVar.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new afjy(this.b, fcxyVar);
    }
}
