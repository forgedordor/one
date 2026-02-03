package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vxo extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ vzk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vxo(vzk vzkVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.d = vzkVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vxo vxoVar = new vxo(this.d, (fcxy) obj3);
        vxoVar.b = (ajlj) obj;
        vxoVar.c = (vwu) obj2;
        return vxoVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        int i;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            obj2 = (vwu) this.b;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            ajlj ajljVar = (ajlj) this.b;
            Object obj3 = this.c;
            fdpl fdplVarB = vzk.b(vzk.a(ajljVar, (vwu) obj3, new waf(false, false, false)), new fdpu(new vzo(false, null)));
            this.b = obj3;
            this.a = 1;
            obj = fdtc.a(fdplVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = obj3;
        }
        vzv vzvVar = (vzv) obj;
        if (fdbq.f(vzvVar, vzp.a)) {
            i = 20;
        } else if (fdbq.f(vzvVar, vzq.a)) {
            i = ((vwu) obj2).c.h ? 40 : 30;
        } else if (vzvVar instanceof vzs) {
            i = 11;
        } else {
            if (!(vzvVar instanceof vzt) && !(vzvVar instanceof vzr)) {
                throw new fctg();
            }
            i = 10;
        }
        return new vzx(i);
    }
}
