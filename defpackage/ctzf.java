package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctzf extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ ctzg d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctzf(ctzg ctzgVar, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = ctzgVar;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ctzf ctzfVar = new ctzf(this.d, (fcxy) obj4);
        ctzfVar.a = (ctxy) obj;
        ctzfVar.b = (cudx) obj2;
        ctzfVar.c = (Map) obj3;
        return ctzfVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ctmo ctmoVar;
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        ?? r1 = this.c;
        ctzg ctzgVar = this.d;
        ctxy ctxyVar = (ctxy) obj2;
        if (!fdbq.f(ctxyVar.a, (String) ctzgVar.c.a().a())) {
            return fcvo.a;
        }
        List<ajpq> list = ctxyVar.b;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (ajpq ajpqVar : list) {
            String strF = ajpqVar.f();
            Pattern pattern = ctxyVar.c;
            int i = 1;
            if (ctzgVar.k.a() && (ctmoVar = (ctmo) r1.get(ajpqVar.b())) != null) {
                i = ctmoVar.a;
            }
            arrayList.add(ctzgVar.g(ajpqVar, "work_contact_".concat(strF), (cudx) obj3, pattern, i));
        }
        return arrayList;
    }
}
