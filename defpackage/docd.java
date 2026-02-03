package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class docd extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ List c;
    final /* synthetic */ docj d;
    final /* synthetic */ dqaf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public docd(List list, docj docjVar, dqaf dqafVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = list;
        this.d = docjVar;
        this.e = dqafVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((docd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ArrayList arrayList;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            arrayList = obj2;
        } else {
            fctl.b(obj);
            List list = this.c;
            ArrayList arrayList2 = new ArrayList(fcva.p(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new dqac((String) it.next()));
            }
            fcyh fcyhVarHE = this.d.aY().hE();
            docc doccVar = new docc(this.e, arrayList2, null);
            this.a = arrayList2;
            this.b = 1;
            obj = fdin.a(fcyhVarHE, doccVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            arrayList = arrayList2;
        }
        dqaf dqafVar = this.e;
        arrayList.getClass();
        dqafVar.e = arrayList;
        dndw.b((List) obj, dqafVar.e.size(), dqafVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new docd(this.c, this.d, this.e, fcxyVar);
    }
}
