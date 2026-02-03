package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dstn extends fcyz implements fdat {
    final /* synthetic */ dsto a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dstn(dsto dstoVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dstoVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dstn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        List listA = this.a.a.a();
        listA.getClass();
        ekfe ekfeVar = new ekfe(listA.size(), 1);
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ekfeVar.t((String) it.next(), dxwd.b);
        }
        return new dxvz(ekfeVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dstn(this.a, fcxyVar);
    }
}
