package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afwb extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ afwu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwb(afwu afwuVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = afwuVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        afwb afwbVar = new afwb(this.c, (fcxy) obj3);
        afwbVar.a = (afvb) obj;
        afwbVar.b = (afmy) obj2;
        return afwbVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [afmy, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        ?? r0 = this.b;
        afwu afwuVar = this.c;
        afvb afvbVar = (afvb) obj2;
        if (!fdbq.f(afvbVar.a, (String) afwuVar.e.a().a())) {
            return fcvo.a;
        }
        List<ajpq> list = afvbVar.b;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (ajpq ajpqVar : list) {
            String strF = ajpqVar.f();
            arrayList.add(afwuVar.b(ajpqVar, "corp_contact_".concat(strF), r0, afvbVar.c));
        }
        return arrayList;
    }
}
