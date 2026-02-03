package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqjn extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cqjy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqjn(cqjy cqjyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cqjyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqjn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            cqjy cqjyVar = this.c;
            cqkx cqkxVar = (cqkx) cqjyVar.f.b();
            this.a = cqjyVar;
            this.b = 1;
            Object objA = cqkxVar.a(this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            obj2 = cqjyVar;
            obj = objA;
        }
        cbpt cbptVar = (cbpt) obj;
        ekrg ekrgVar = cqjy.a;
        cqjy cqjyVar2 = (cqjy) obj2;
        cqjyVar2.j(cbptVar.c);
        cqjyVar2.h(cbptVar.d);
        cqjyVar2.e(cbptVar.e);
        cqjyVar2.g(cbptVar.f);
        cqjyVar2.i(cbptVar.g);
        cqjyVar2.f(cbptVar.h);
        cqjyVar2.m(cbptVar.i);
        if ((cbptVar.b & 128) != 0) {
            cqjyVar2.k(cbptVar.j);
        }
        if ((cbptVar.b & 256) != 0) {
            cqjyVar2.l(cbptVar.k);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cqjn(this.c, fcxyVar);
    }
}
