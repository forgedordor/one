package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class auxz extends fcyz implements fdav {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ fdaz e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public auxz(fdaz fdazVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.e = fdazVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        auxz auxzVar = new auxz(this.e, (fcxy) obj4);
        auxzVar.b = (fcto) obj;
        auxzVar.c = (fcto) obj2;
        auxzVar.d = obj3;
        return auxzVar.b(fctx.a);
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
        Object obj4 = this.d;
        fdaz fdazVar = this.e;
        fcto fctoVar = (fcto) obj2;
        Object obj5 = fctoVar.a;
        Object obj6 = fctoVar.b;
        Object obj7 = fctoVar.c;
        fcto fctoVar2 = (fcto) obj3;
        Object obj8 = fctoVar2.a;
        Object obj9 = fctoVar2.b;
        Object obj10 = fctoVar2.c;
        this.b = null;
        this.c = null;
        this.a = 1;
        Object objJ = fdazVar.j(obj5, obj6, obj7, obj8, obj9, obj10, obj4, this);
        return objJ == fcylVar ? fcylVar : objJ;
    }
}
