package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejah extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdat c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejah(fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ejah) c(obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            obj2 = this.b;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            Object obj3 = this.b;
            fdat fdatVar = this.c;
            this.a = 1;
            Object objA = fdatVar.a(obj3, this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            obj2 = obj3;
            obj = objA;
        }
        return ((Boolean) obj).booleanValue() ? obj2 : ejai.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ejah ejahVar = new ejah(this.c, fcxyVar);
        ejahVar.b = obj;
        return ejahVar;
    }
}
