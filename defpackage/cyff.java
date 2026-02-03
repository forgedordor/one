package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyff extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ cyfu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyff(List list, cyfu cyfuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = list;
        this.d = cyfuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cyff) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List list;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            list = obj2;
        } else {
            fctl.b(obj);
            List list2 = this.c;
            cyfu cyfuVar = this.d;
            this.a = list2;
            this.b = 1;
            Object objA = cyfuVar.b.a(this);
            if (objA == fcylVar) {
                return fcylVar;
            }
            list = list2;
            obj = objA;
        }
        list.addAll((Collection) obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cyff(this.c, this.d, fcxyVar);
    }
}
