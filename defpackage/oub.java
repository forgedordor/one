package defpackage;

import java.util.Objects;

/* compiled from: PG */
@fcsv
/* loaded from: classes.dex */
public abstract class oub extends opq {
    public oub() {
        super(2);
    }

    @Override // defpackage.opq
    public final Object a(Object obj) {
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // defpackage.opq
    public final Object b(opp oppVar, fcxy fcxyVar) {
        orr orrVar = oppVar.a;
        if (orrVar == orr.a) {
            fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
            fdiuVar.B();
            f(new oua(fdiuVar));
            return fdiuVar.m();
        }
        if (oppVar.b == null) {
            return new opl(fcvo.a, null, null, 0, 0);
        }
        if (orrVar == orr.b) {
            fdiu fdiuVar2 = new fdiu(fcym.c(fcxyVar), 1);
            fdiuVar2.B();
            e(new otz(fdiuVar2));
            return fdiuVar2.m();
        }
        if (orrVar != orr.c) {
            Objects.toString(orrVar);
            throw new IllegalArgumentException("Unsupported type ".concat(orrVar.toString()));
        }
        fdiu fdiuVar3 = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar3.B();
        d(new otz(fdiuVar3));
        return fdiuVar3.m();
    }

    public abstract void d(otx otxVar);

    public abstract void e(otx otxVar);

    public abstract void f(oty otyVar);
}
