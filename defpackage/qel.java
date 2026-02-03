package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qel extends fdbr implements fdae {
    final /* synthetic */ qee a;
    final /* synthetic */ String b;
    final /* synthetic */ qbu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qel(qee qeeVar, String str, qbu qbuVar) {
        super(0);
        this.a = qeeVar;
        this.b = str;
        this.c = qbuVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        qbu qbuVar = this.c;
        qee qeeVar = this.a;
        String str = this.b;
        qek qekVar = new qek(qbuVar, qeeVar, str);
        qjo qjoVarD = qeeVar.e.D();
        List listE = qjoVarD.e(str);
        if (listE.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        qjk qjkVar = (qjk) fcva.P(listE);
        if (qjkVar == null) {
            qekVar.invoke();
        } else {
            String str2 = qjkVar.a;
            qjn qjnVarB = qjoVarD.b(str2);
            if (qjnVarB == null) {
                throw new IllegalStateException(a.d(str, str2, "WorkSpec with ", ", that matches a name \"", "\", wasn't found"));
            }
            if (!qjnVarB.f()) {
                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
            }
            if (qjkVar.b == qbo.f) {
                qjoVarD.f(str2);
                qekVar.invoke();
            } else {
                final qjn qjnVarG = qjn.g(qbuVar.b, str2, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                qcu qcuVar = qeeVar.g;
                qcuVar.getClass();
                final WorkDatabase workDatabase = qeeVar.e;
                workDatabase.getClass();
                pzd pzdVar = qeeVar.d;
                pzdVar.getClass();
                final List list = qeeVar.f;
                list.getClass();
                final Set set = qbuVar.c;
                final String str3 = qjnVarG.c;
                final qjn qjnVarB2 = workDatabase.D().b(str3);
                if (qjnVarB2 == null) {
                    throw new IllegalArgumentException(a.a(str3, "Worker with ", " doesn't exist"));
                }
                if (!qjnVarB2.d.a()) {
                    if (qjnVarB2.f() ^ qjnVarG.f()) {
                        qem qemVar = qem.a;
                        throw new UnsupportedOperationException("Can't update " + ((String) qemVar.invoke(qjnVarB2)) + " Worker to " + ((String) qemVar.invoke(qjnVarG)) + " Worker. Update operation must preserve worker's type.");
                    }
                    final boolean zF = qcuVar.f(str3);
                    if (!zF) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((qcw) it.next()).b(str3);
                        }
                    }
                    workDatabase.p(new Runnable() { // from class: qej
                        /* JADX WARN: Finally extract failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            qjn qjnVar = qjnVarG;
                            qjn qjnVar2 = qjnVarB2;
                            int i = qjnVar2.v;
                            WorkDatabase workDatabase2 = workDatabase;
                            qjo qjoVarD2 = workDatabase2.D();
                            qkn qknVarE = workDatabase2.E();
                            qjn qjnVarG2 = qjn.g(qjnVar, null, qjnVar2.d, null, null, qjnVar2.m, qjnVar2.p, qjnVar2.u, i + 1, qjnVar2.w, qjnVar2.x, 29613053);
                            if (qjnVar.x == 1) {
                                qjnVarG2.w = qjnVar.w;
                                qjnVarG2.x++;
                            }
                            qjn qjnVarA = qla.a(list, qjnVarG2);
                            qkk qkkVar = (qkk) qjoVarD2;
                            pex pexVar = qkkVar.a;
                            pexVar.m();
                            pexVar.n();
                            try {
                                pdl pdlVar = ((qkk) qjoVarD2).c;
                                pkl pklVarD = pdlVar.d();
                                try {
                                    String str4 = qjnVarA.c;
                                    pklVarD.g(1, str4);
                                    pklVarD.e(2, qkr.c(qjnVarA.d));
                                    pklVarD.g(3, qjnVarA.e);
                                    pklVarD.g(4, qjnVarA.f);
                                    pzs pzsVar = qjnVarA.g;
                                    pzs pzsVar2 = pzs.a;
                                    pklVarD.c(5, pzo.a(pzsVar));
                                    pklVarD.c(6, pzo.a(qjnVarA.h));
                                    pklVarD.e(7, qjnVarA.i);
                                    pklVarD.e(8, qjnVarA.j);
                                    pklVarD.e(9, qjnVarA.k);
                                    pklVarD.e(10, qjnVarA.m);
                                    pklVarD.e(11, qkr.a(qjnVarA.n));
                                    pklVarD.e(12, qjnVarA.o);
                                    pklVarD.e(13, qjnVarA.p);
                                    pklVarD.e(14, qjnVarA.q);
                                    pklVarD.e(15, qjnVarA.r);
                                    pklVarD.e(16, qjnVarA.s ? 1L : 0L);
                                    pklVarD.e(17, qkr.b(qjnVarA.t));
                                    pklVarD.e(18, qjnVarA.u);
                                    pklVarD.e(19, qjnVarA.v);
                                    pklVarD.e(20, qjnVarA.w);
                                    pklVarD.e(21, qjnVarA.x);
                                    pklVarD.e(22, qjnVarA.y);
                                    String str5 = qjnVarA.z;
                                    if (str5 == null) {
                                        pklVarD.f(23);
                                    } else {
                                        pklVarD.g(23, str5);
                                    }
                                    Boolean bool = qjnVarA.A;
                                    if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                                        pklVarD.f(24);
                                    } else {
                                        pklVarD.e(24, r7.intValue());
                                    }
                                    pzj pzjVar = qjnVarA.l;
                                    pklVarD.e(25, qkr.k(pzjVar.j));
                                    pklVarD.c(26, qkr.i(pzjVar.b));
                                    pklVarD.e(27, pzjVar.c ? 1L : 0L);
                                    pklVarD.e(28, pzjVar.d ? 1L : 0L);
                                    pklVarD.e(29, pzjVar.e ? 1L : 0L);
                                    pklVarD.e(30, pzjVar.f ? 1L : 0L);
                                    pklVarD.e(31, pzjVar.g);
                                    pklVarD.e(32, pzjVar.h);
                                    pklVarD.c(33, qkr.j(pzjVar.i));
                                    pklVarD.g(34, str4);
                                    pklVarD.a();
                                    pdlVar.f(pklVarD);
                                    ((qkk) qjoVarD2).a.q();
                                    String str6 = str3;
                                    qkkVar.a.o();
                                    qkq qkqVar = (qkq) qknVarE;
                                    pex pexVar2 = qkqVar.a;
                                    pexVar2.m();
                                    pkl pklVarD2 = qkqVar.b.d();
                                    pklVarD2.g(1, str6);
                                    try {
                                        pexVar2.n();
                                        try {
                                            pklVarD2.a();
                                            pexVar2.q();
                                            boolean z = zF;
                                            Set set2 = set;
                                            qkqVar.b.f(pklVarD2);
                                            qknVarE.b(str6, set2);
                                            if (z) {
                                                return;
                                            }
                                            qjoVarD2.l(str6, -1L);
                                            workDatabase2.C().a(str6);
                                        } finally {
                                            ((qkq) qknVarE).a.o();
                                        }
                                    } catch (Throwable th) {
                                        qkqVar.b.f(pklVarD2);
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    pdlVar.f(pklVarD);
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                qkkVar.a.o();
                                throw th3;
                            }
                        }
                    });
                    if (!zF) {
                        qcz.a(pzdVar, workDatabase, list);
                    }
                }
            }
        }
        return fctx.a;
    }
}
