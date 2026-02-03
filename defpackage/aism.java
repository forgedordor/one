package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aism extends fcyz implements fdat {
    int a;
    final /* synthetic */ aisn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aism(aisn aisnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aisnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aism) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        aisn aisnVar = this.b;
        this.a = 1;
        Object objB = aisnVar.b(this);
        return objB == fcylVar ? fcylVar : objB;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aism(this.b, fcxyVar);
    }
}
