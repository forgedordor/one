package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amov extends fcyz implements fdat {
    int a;
    final /* synthetic */ ampa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amov(ampa ampaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = ampaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amov) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ampa ampaVar = this.b;
            fdkf[] fdkfVarArr = {auvw.e(ampaVar.b.b()), auvw.e(ampaVar.c.b())};
            this.a = 1;
            obj = fdii.b(fdkfVarArr, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        if (obj2 == null || !(obj2 instanceof ampn) || obj3 == null || !(obj3 instanceof eupd)) {
            return false;
        }
        ampn ampnVar = (ampn) obj2;
        double d = ampnVar.c;
        double d2 = ampnVar.d;
        double d3 = ampnVar.e;
        ekhv ekhvVar = new ekhv();
        ekgb ekgbVar = ((eupd) obj3).a;
        for (int i2 = 0; i2 < ((ekoe) ekgbVar).c; i2++) {
            eupa eupaVar = (eupa) ekgbVar.get(i2);
            if (eupaVar.b.a(d, d2, d3)) {
                ekhvVar.c(eupaVar.a);
            }
        }
        ekhvVar.g().getClass();
        return Boolean.valueOf(!r13.isEmpty());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amov(this.b, fcxyVar);
    }
}
