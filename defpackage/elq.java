package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class elq {
    private final elu a;
    private final int b;
    private final int c;
    private final elo d;
    private final ely e;

    public elq(elu eluVar, int i, int i2, elo eloVar, ely elyVar) {
        this.a = eluVar;
        this.b = i;
        this.c = i2;
        this.d = eloVar;
        this.e = elyVar;
    }

    public abstract elp a(int i, eln[] elnVarArr, List list, int i2);

    public final int b(int i) {
        ely elyVar = this.e;
        int i2 = elyVar.h;
        eqp eqpVar = elyVar.a.c;
        elw elwVar = elw.a;
        emx emxVarA = eqpVar.a(i);
        ((eko) emxVarA.c).a.a(elwVar, Integer.valueOf(i - emxVarA.a));
        return 1;
    }

    public final long c(int i, int i2) {
        return kik.d(fddu.f(this.a.a[i], 0));
    }

    public final elp d(int i) {
        int i2;
        elx elxVarC = this.e.c(i);
        List list = elxVarC.b;
        int size = list.size();
        if (size != 0) {
            i2 = elxVarC.a + size == this.b ? 0 : this.c;
        } else {
            size = 0;
            i2 = 0;
        }
        eln[] elnVarArr = new eln[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long j = ((eki) list.get(i4)).a;
            eln elnVarD = this.d.d(elxVarC.a + i4, c(i3, 1), i3, 1, i2);
            i3++;
            elnVarArr[i4] = elnVarD;
        }
        return a(i, elnVarArr, list, i2);
    }
}
