package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmrq extends fcyz implements fdav {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ boolean d;
    final /* synthetic */ dmrt e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmrq(dmrt dmrtVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.e = dmrtVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        dmrq dmrqVar = new dmrq(this.e, (fcxy) obj4);
        dmrqVar.b = (dmrk) obj;
        dmrqVar.c = (Set) obj2;
        dmrqVar.d = zBooleanValue;
        return dmrqVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        boolean z;
        ?? r1;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            z = this.d;
            Object obj3 = this.c;
            obj2 = this.b;
            fctl.b(obj);
            r1 = obj3;
        } else {
            fctl.b(obj);
            obj2 = this.b;
            Object obj4 = this.c;
            boolean z2 = this.d;
            dmrt dmrtVar = this.e;
            this.a = 1;
            Object objInvoke = dmrtVar.m.invoke(this);
            if (objInvoke == fcylVar) {
                return fcylVar;
            }
            z = z2;
            obj = objInvoke;
            r1 = obj4;
        }
        Iterable<dmrk> iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        for (dmrk dmrkVar : iterable) {
            boolean zA = dmrkVar.a((dmrk) obj2);
            String str = dmrkVar.a;
            arrayList.add(new dmrk(str, dmrkVar.b, dmrkVar.c, zA, r1.contains(str)));
        }
        return new dmrw(arrayList, z);
    }
}
