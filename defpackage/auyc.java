package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auyc extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ fday d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auyc(fday fdayVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = fdayVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        auyc auycVar = new auyc(this.d, (fcxy) obj3);
        auycVar.b = (fcto) obj;
        auycVar.c = (fcto) obj2;
        return auycVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        Object obj2 = this.b;
        Object obj3 = this.c;
        fday fdayVar = this.d;
        fcto fctoVar = (fcto) obj2;
        Object obj4 = fctoVar.a;
        Object obj5 = fctoVar.b;
        Object obj6 = fctoVar.c;
        fcto fctoVar2 = (fcto) obj3;
        Object obj7 = fctoVar2.a;
        Object obj8 = fctoVar2.b;
        Object obj9 = fctoVar2.c;
        this.b = null;
        this.a = 1;
        Object objH = fdayVar.h(obj4, obj5, obj6, obj7, obj8, obj9, this);
        return objH == fcylVar ? fcylVar : objH;
    }
}
