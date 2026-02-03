package defpackage;

import java.util.List;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public abstract class oqw extends opq {
    public oqw() {
        super(3);
    }

    @Override // defpackage.opq
    public final Object a(Object obj) {
        return d(obj);
    }

    @Override // defpackage.opq
    public final Object b(opp oppVar, fcxy fcxyVar) {
        int iOrdinal = oppVar.a.ordinal();
        if (iOrdinal == 0) {
            oqs oqsVar = new oqs(oppVar.b, oppVar.c);
            fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
            fdiuVar.B();
            i(oqsVar, new oqv(fdiuVar, this));
            return fdiuVar.m();
        }
        if (iOrdinal == 1) {
            Object obj = oppVar.b;
            obj.getClass();
            oqt oqtVar = new oqt(obj, oppVar.d);
            fdiu fdiuVar2 = new fdiu(fcym.c(fcxyVar), 1);
            fdiuVar2.B();
            h(oqtVar, new oqu(fdiuVar2, this));
            return fdiuVar2.m();
        }
        if (iOrdinal != 2) {
            throw new fctg();
        }
        Object obj2 = oppVar.b;
        obj2.getClass();
        oqt oqtVar2 = new oqt(obj2, oppVar.d);
        fdiu fdiuVar3 = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar3.B();
        g(oqtVar2, new oqu(fdiuVar3, this));
        return fdiuVar3.m();
    }

    public abstract Object d(Object obj);

    public final Object e(List list) {
        Object objT = fcva.T(list);
        if (objT != null) {
            return d(objT);
        }
        return null;
    }

    public final Object f(List list) {
        Object objP = fcva.P(list);
        if (objP != null) {
            return d(objP);
        }
        return null;
    }

    public abstract void g(oqt oqtVar, oqq oqqVar);

    public abstract void h(oqt oqtVar, oqq oqqVar);

    public abstract void i(oqs oqsVar, oqr oqrVar);
}
