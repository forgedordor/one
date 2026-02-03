package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vhm extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ vhr d;
    final /* synthetic */ List e;
    final /* synthetic */ fdae f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vhm(vhr vhrVar, List list, fdae fdaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = vhrVar;
        this.e = list;
        this.f = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vhm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List list;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.c != 0) {
            Object obj3 = this.b;
            Object obj4 = this.a;
            fctl.b(obj);
            list = obj3;
            obj2 = obj4;
        } else {
            fctl.b(obj);
            vhr vhrVar = this.d;
            List list2 = this.e;
            fdua fduaVar = new fdua(vhrVar.h, vhrVar.g, new vhk(vhrVar, list2, null));
            this.a = vhrVar;
            this.b = list2;
            this.c = 1;
            Object objA = fdtc.a(fduaVar, this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            list = list2;
            obj = objA;
            obj2 = vhrVar;
        }
        ((vhr) obj2).e(list, ((Boolean) obj).booleanValue(), this.f);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vhm(this.d, this.e, this.f, fcxyVar);
    }
}
