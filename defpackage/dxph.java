package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dxph extends fcyz implements fdat {
    final /* synthetic */ dxpk a;
    final /* synthetic */ dxha b;
    final /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxph(dxpk dxpkVar, dxha dxhaVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dxpkVar;
        this.b = dxhaVar;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dxph) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dxha dxhaVar = this.b;
        boolean zA = dxhaVar.a();
        boolean zB = dxhaVar.b();
        List list = this.c;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((dxvi) it.next()).b()) {
                    z = false;
                    break;
                }
            }
        }
        dxpk dxpkVar = this.a;
        return dxpkVar.e.a(new dxng(zA, zB, z));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dxph(this.a, this.b, this.c, fcxyVar);
    }
}
