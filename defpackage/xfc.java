package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xfc extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    final /* synthetic */ xfi e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfc(xfi xfiVar, fcxy fcxyVar) {
        super(5, fcxyVar);
        this.e = xfiVar;
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        xfc xfcVar = new xfc(this.e, (fcxy) obj5);
        xfcVar.a = (cljh) obj;
        xfcVar.b = zBooleanValue;
        xfcVar.c = (aoer) obj3;
        xfcVar.d = (aoff) obj4;
        return xfcVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoer, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List listB;
        fctl.b(obj);
        Object obj2 = this.a;
        boolean z = this.b;
        ?? r1 = this.c;
        Object obj3 = this.d;
        xfi xfiVar = this.e;
        if (!(((aqtu) xfiVar.k.b()).a() ? ((aoff) obj3).a() : ((cljh) obj2).b()) || (r1 != 0 && r1.v())) {
            List listB2 = ((xhv) xfiVar.e.b()).b();
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : listB2) {
                if ((!fdbq.f((xhh) obj4, xhd.a)) | z) {
                    arrayList.add(obj4);
                }
            }
            listB = arrayList;
        } else {
            listB = fcva.b(xhc.a);
        }
        return ((xhv) xfiVar.e.b()).a(listB);
    }
}
