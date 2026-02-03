package defpackage;

import com.google.android.gms.kids.IndividualContactRequest;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdog extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ cdoj c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdog(fcxy fcxyVar, List list, cdoj cdojVar) {
        super(2, fcxyVar);
        this.b = list;
        this.c = cdojVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cdog) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        String strP;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        List<alqm> list = this.b;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        for (alqm alqmVar : list) {
            if (this.c.h.a()) {
                strP = cdmm.b(alqmVar);
            } else {
                alqmVar.getClass();
                strP = alqmVar.p(true);
                if (strP == null) {
                    strP = "";
                }
            }
            arrayList.add(cdoj.c(strP));
        }
        IndividualContactRequest[] individualContactRequestArr = (IndividualContactRequest[]) arrayList.toArray(new IndividualContactRequest[0]);
        cdoj cdojVar = this.c;
        Object objB = cdojVar.b.b();
        objB.getClass();
        fcyh fcyhVarA = eicg.a((fcyh) objB);
        cdoh cdohVar = new cdoh(null, cdojVar, individualContactRequestArr);
        this.a = 1;
        Object objA = fdin.a(fcyhVarA, cdohVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cdog cdogVar = new cdog(fcxyVar, this.b, this.c);
        cdogVar.d = obj;
        return cdogVar;
    }
}
