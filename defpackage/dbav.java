package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbav extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dbbo c;
    final /* synthetic */ dbaw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbav(dbbo dbboVar, dbaw dbawVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dbboVar;
        this.d = dbawVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbav) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            dbbo dbboVar = this.c;
            if (dbboVar instanceof dbbl) {
                dbaw dbawVar = this.d;
                dbai dbaiVar = (dbai) dbawVar.h.b();
                this.a = dbawVar;
                this.b = 1;
                Object objInvoke = dbaiVar.c.invoke(this);
                if (objInvoke != fcylVar) {
                    obj3 = dbawVar;
                    obj = objInvoke;
                    List listB = fcva.b(obj);
                    ekrg ekrgVar = dbaw.a;
                    ((dbaw) obj3).b(listB);
                }
            } else if (dbboVar instanceof dbbk) {
                dbaw dbawVar2 = this.d;
                dbai dbaiVar2 = (dbai) dbawVar2.h.b();
                this.a = dbawVar2;
                this.b = 2;
                Object objInvoke2 = dbaiVar2.b.invoke(this);
                if (objInvoke2 != fcylVar) {
                    obj2 = dbawVar2;
                    obj = objInvoke2;
                    List listB2 = fcva.b(obj);
                    ekrg ekrgVar2 = dbaw.a;
                    ((dbaw) obj2).b(listB2);
                }
            } else {
                this.d.b(fcvo.a);
            }
            return fcylVar;
        }
        if (i != 1) {
            obj2 = this.a;
            fctl.b(obj);
            List listB22 = fcva.b(obj);
            ekrg ekrgVar22 = dbaw.a;
            ((dbaw) obj2).b(listB22);
        } else {
            obj3 = this.a;
            fctl.b(obj);
            List listB3 = fcva.b(obj);
            ekrg ekrgVar3 = dbaw.a;
            ((dbaw) obj3).b(listB3);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dbav(this.c, this.d, fcxyVar);
    }
}
