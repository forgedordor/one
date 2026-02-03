package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxme extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dxmj e;
    final /* synthetic */ dxly f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxme(dxmj dxmjVar, dxly dxlyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = dxmjVar;
        this.f = dxlyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxme) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        feav feavVar;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        if (this.d != 0) {
            obj2 = this.c;
            Object obj4 = this.b;
            Object obj5 = this.a;
            fctl.b(obj);
            obj3 = obj4;
            feavVar = obj5;
        } else {
            fctl.b(obj);
            dxmj dxmjVar = this.e;
            eksp ekspVar = dxmj.a;
            dxly dxlyVar = this.f;
            feav feavVar2 = dxmjVar.g;
            this.a = feavVar2;
            this.b = dxmjVar;
            this.c = dxlyVar;
            this.d = 1;
            if (feavVar2.b(this) == fcylVar) {
                return fcylVar;
            }
            obj2 = dxlyVar;
            obj3 = dxmjVar;
            feavVar = feavVar2;
        }
        try {
            eksp ekspVar2 = dxmj.a;
            return (fdkf) ((dxmj) obj3).f.remove(obj2);
        } finally {
            feavVar.d();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxme(this.e, this.f, fcxyVar);
    }
}
