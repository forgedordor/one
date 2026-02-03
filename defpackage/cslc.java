package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cslc extends fcyz implements fdat {
    int a;
    final /* synthetic */ csli b;
    final /* synthetic */ csch c;
    final /* synthetic */ String d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cslc(fcxy fcxyVar, csli csliVar, csch cschVar, String str) {
        super(2, fcxyVar);
        this.b = csliVar;
        this.c = cschVar;
        this.d = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cslc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            csli csliVar = this.b;
            if (!csliVar.k()) {
                return csdc.a();
            }
            if (((Boolean) csli.b.e()).booleanValue()) {
                List listA = csdy.a((csea) csliVar.f.b(), this.c.i, null, 2);
                if (!listA.isEmpty()) {
                    Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        if (((csnw) it.next()).a == csdl.g) {
                            return csdc.a();
                        }
                    }
                }
            }
            csch cschVar = this.c;
            List listB = fcva.b(this.d);
            eoeo eoeoVar = eoeo.LINK_CLICK;
            this.a = 1;
            obj = csliVar.j(cschVar, listB, eoeoVar, null, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        csla cslaVar = (csla) obj;
        return cslaVar == null ? csdc.a() : csla.a(cslaVar, null, true, 1);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cslc cslcVar = new cslc(fcxyVar, this.b, this.c, this.d);
        cslcVar.e = obj;
        return cslcVar;
    }
}
