package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class caal extends fcyz implements fdat {
    int a;
    final /* synthetic */ caao b;
    final /* synthetic */ evuh c;
    final /* synthetic */ cayy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caal(caao caaoVar, evuh evuhVar, cayy cayyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = caaoVar;
        this.c = evuhVar;
        this.d = cayyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caal) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            caao caaoVar = this.b;
            eiju eijuVarB = caaoVar.c.b(caaoVar.d.a(this.c));
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj != fcylVar) {
            }
        }
        if (i != 1) {
            return obj;
        }
        caao caaoVar2 = this.b;
        efwo efwoVar = (efwo) obj;
        efwoVar.getClass();
        cayy cayyVar = this.d;
        evuh evuhVar = this.c;
        this.a = 2;
        Object objM = caaoVar2.m(efwoVar, cayyVar, evuhVar, this);
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new caal(this.b, this.c, this.d, fcxyVar);
    }
}
