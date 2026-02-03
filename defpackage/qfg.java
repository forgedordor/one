package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfg implements qcw, qgk, qcg {
    private static final String b = qas.d("GreedyScheduler");
    Boolean a;
    private final Context c;
    private final qfe e;
    private boolean f;
    private final qcu i;
    private final pzd j;
    private final qgr l;
    private final qfi m;
    private final qec n;
    private final qmg o;
    private final Map d = new HashMap();
    private final Object g = new Object();
    private final qdd h = qdb.b();
    private final Map k = new HashMap();

    public qfg(Context context, pzd pzdVar, qhw qhwVar, qcu qcuVar, qec qecVar, qmg qmgVar) {
        this.c = context;
        qbi qbiVar = pzdVar.e;
        this.e = new qfe(this, qbiVar);
        this.m = new qfi(qbiVar, qecVar);
        this.o = qmgVar;
        this.l = new qgr(qhwVar);
        this.j = pzdVar;
        this.i = qcuVar;
        this.n = qecVar;
    }

    private final void f() {
        this.a = Boolean.valueOf(qlk.a(this.c, this.j));
    }

    private final void g() {
        if (this.f) {
            return;
        }
        this.i.c(this);
        this.f = true;
    }

    @Override // defpackage.qcg
    public final void a(qiw qiwVar, boolean z) {
        fdlr fdlrVar;
        qda qdaVarA = this.h.a(qiwVar);
        if (qdaVarA != null) {
            this.m.a(qdaVarA);
        }
        synchronized (this.g) {
            fdlrVar = (fdlr) this.d.remove(qiwVar);
        }
        if (fdlrVar != null) {
            qas qasVarC = qas.c();
            String str = b;
            Objects.toString(qiwVar);
            qasVarC.a(str, "Stopping tracking for ".concat(qiwVar.toString()));
            fdlrVar.t(null);
        }
        if (z) {
            return;
        }
        synchronized (this.g) {
            this.k.remove(qiwVar);
        }
    }

    @Override // defpackage.qcw
    public final void b(String str) {
        Runnable runnable;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            qas.c();
            Log.i(b, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        qas.c().a(b, "Cancelling work ID ".concat(String.valueOf(str)));
        qfe qfeVar = this.e;
        if (qfeVar != null && (runnable = (Runnable) qfeVar.d.remove(str)) != null) {
            qfeVar.c.a(runnable);
        }
        for (qda qdaVar : this.h.d(str)) {
            this.m.a(qdaVar);
            qea.a(this.n, qdaVar);
        }
    }

    @Override // defpackage.qcw
    public final void c(qjn... qjnVarArr) {
        long jMax;
        if (this.a == null) {
            f();
        }
        if (!this.a.booleanValue()) {
            qas.c();
            Log.i(b, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<qjn> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (qjn qjnVar : qjnVarArr) {
            qiw qiwVarA = qkl.a(qjnVar);
            qdd qddVar = this.h;
            if (!qddVar.e(qiwVarA)) {
                synchronized (this.g) {
                    qiw qiwVarA2 = qkl.a(qjnVar);
                    Map map = this.k;
                    qff qffVar = (qff) map.get(qiwVarA2);
                    if (qffVar == null) {
                        int i = qjnVar.m;
                        qbj qbjVar = this.j.l;
                        qffVar = new qff(i, System.currentTimeMillis());
                        map.put(qiwVarA2, qffVar);
                    }
                    jMax = qffVar.b + (Math.max((qjnVar.m - qffVar.a) - 5, 0) * 30000);
                }
                long jMax2 = Math.max(qjnVar.a(), jMax);
                qbj qbjVar2 = this.j.l;
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (qjnVar.d == qbo.a) {
                    if (jCurrentTimeMillis < jMax2) {
                        qfe qfeVar = this.e;
                        if (qfeVar != null) {
                            String str = qjnVar.c;
                            Map map2 = qfeVar.d;
                            Runnable runnable = (Runnable) map2.remove(str);
                            if (runnable != null) {
                                qfeVar.c.a(runnable);
                            }
                            qfd qfdVar = new qfd(qfeVar, qjnVar);
                            map2.put(str, qfdVar);
                            qfeVar.c.b(jMax2 - System.currentTimeMillis(), qfdVar);
                        }
                    } else if (qjnVar.d()) {
                        pzj pzjVar = qjnVar.l;
                        if (pzjVar.d) {
                            qas.c().a(b, a.h(qjnVar, "Ignoring ", ". Requires device idle."));
                        } else if (pzjVar.b()) {
                            qas.c().a(b, a.h(qjnVar, "Ignoring ", ". Requires ContentUri triggers."));
                        } else {
                            hashSet.add(qjnVar);
                            hashSet2.add(qjnVar.c);
                        }
                    } else if (!qddVar.e(qkl.a(qjnVar))) {
                        qas.c().a(b, "Starting work for ".concat(qjnVar.c));
                        qda qdaVarC = qddVar.c(qjnVar);
                        this.m.b(qdaVarC);
                        this.n.a(qdaVarC);
                    }
                }
            }
        }
        synchronized (this.g) {
            if (!hashSet.isEmpty()) {
                qas.c().a(b, a.v(TextUtils.join(",", hashSet2), "Starting tracking for "));
                for (qjn qjnVar2 : hashSet) {
                    qiw qiwVarA3 = qkl.a(qjnVar2);
                    Map map3 = this.d;
                    if (!map3.containsKey(qiwVarA3)) {
                        map3.put(qiwVarA3, qgu.a(this.l, qjnVar2, this.o.b, this));
                    }
                }
            }
        }
    }

    @Override // defpackage.qcw
    public final boolean d() {
        return false;
    }

    @Override // defpackage.qgk
    public final void e(qjn qjnVar, qga qgaVar) {
        boolean z = qgaVar instanceof qfy;
        qiw qiwVarA = qkl.a(qjnVar);
        if (z) {
            qdd qddVar = this.h;
            if (qddVar.e(qiwVarA)) {
                return;
            }
            qas qasVarC = qas.c();
            String str = b;
            Objects.toString(qiwVarA);
            qasVarC.a(str, "Constraints met: Scheduling work ID ".concat(qiwVarA.toString()));
            qda qdaVarB = qddVar.b(qiwVarA);
            this.m.b(qdaVarB);
            this.n.a(qdaVarB);
            return;
        }
        qas qasVarC2 = qas.c();
        String str2 = b;
        Objects.toString(qiwVarA);
        qasVarC2.a(str2, "Constraints not met: Cancelling work ID ".concat(qiwVarA.toString()));
        qda qdaVarA = this.h.a(qiwVarA);
        if (qdaVarA != null) {
            this.m.a(qdaVarA);
            this.n.c(qdaVarA, ((qfz) qgaVar).a);
        }
    }
}
