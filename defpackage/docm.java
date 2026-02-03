package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class docm extends fcyz implements fdap {
    int a;
    final /* synthetic */ docn b;
    final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public docm(docn docnVar, Object obj, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = docnVar;
        this.c = obj;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        docn docnVar = this.b;
        Object obj2 = this.c;
        this.a = 1;
        Object objA = docnVar.a.a(obj2, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new docm(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
