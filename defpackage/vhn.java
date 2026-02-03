package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vhn extends fcyz implements fdat {
    int a;
    final /* synthetic */ vhr b;
    final /* synthetic */ List c;
    final /* synthetic */ fdae d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhn(vhr vhrVar, List list, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vhrVar;
        this.c = list;
        this.d = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vhn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vhr vhrVar = this.b;
            List list = this.c;
            this.a = 1;
            obj = vhrVar.c(list, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.d.invoke();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vhn(this.b, this.c, this.d, fcxyVar);
    }
}
