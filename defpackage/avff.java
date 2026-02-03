package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avff extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ avgc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avff(fcxy fcxyVar, List list, avgc avgcVar) {
        super(2, fcxyVar);
        this.b = list;
        this.c = avgcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avff) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
            try {
                fctl.b(obj);
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(closeable, th);
                    throw th2;
                }
            }
        } else {
            fctl.b(obj);
            fdjx fdjxVar = (fdjx) this.d;
            eieu eieuVarA = eiiy.a("Cp2DataService#queryContacts");
            try {
                List list = this.b;
                Object objE = avbs.h.e();
                objE.getClass();
                List<List> listAa = fcva.aa(list, ((Number) objE).intValue());
                ArrayList arrayList = new ArrayList(fcva.p(listAa, 10));
                for (List list2 : listAa) {
                    avgc avgcVar = this.c;
                    ehvv ehvvVarF = avgc.F(list2, avef.a);
                    fcyi fcyiVar = fcyi.a;
                    arrayList.add(fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new avfh(null, avgcVar, ehvvVarF, list2)));
                }
                this.d = eieuVarA;
                this.a = 1;
                obj = fdii.a(arrayList, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarA;
            } catch (Throwable th3) {
                th = th3;
                closeable = eieuVarA;
                throw th;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((Iterable) obj).iterator();
        while (it.hasNext()) {
            fcva.y(arrayList2, fcva.ao((List) it.next()));
        }
        fczl.a(closeable, null);
        return arrayList2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avff avffVar = new avff(fcxyVar, this.b, this.c);
        avffVar.d = obj;
        return avffVar;
    }
}
