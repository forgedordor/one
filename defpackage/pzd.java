package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pzd {
    public final Executor a;
    public final fcyh b;
    public final Executor c;
    public final qbx d;
    public final qbi e;
    public final lbz f;
    public final String g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final qbj l;
    public final pzf m;

    public pzd(pzb pzbVar) {
        fcyh fcyhVar = pzbVar.b;
        Executor executorA = pzbVar.a;
        if (executorA == null) {
            executorA = null;
            if (fcyhVar != null) {
                fcya fcyaVar = (fcya) fcyhVar.get(fcya.k);
                fdjq fdjqVar = fcyaVar instanceof fdjq ? (fdjq) fcyaVar : null;
                if (fdjqVar != null) {
                    executorA = fdli.a(fdjqVar);
                }
            }
            if (executorA == null) {
                executorA = pzg.a(false);
            }
        }
        this.a = executorA;
        this.b = fcyhVar == null ? pzbVar.a != null ? fdli.b(executorA) : fdkq.a : fcyhVar;
        Executor executor = pzbVar.d;
        this.c = executor == null ? pzg.a(true) : executor;
        this.l = new qbj();
        qbx qbxVar = pzbVar.c;
        this.d = qbxVar == null ? pzu.a : qbxVar;
        qbi qbiVar = pzbVar.e;
        this.e = qbiVar == null ? new qcf() : qbiVar;
        this.h = pzbVar.h;
        this.i = pzbVar.i;
        this.j = pzbVar.j;
        this.k = 20;
        this.f = pzbVar.f;
        this.g = pzbVar.g;
        this.m = new pzf();
    }
}
