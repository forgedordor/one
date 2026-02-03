package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qfa {
    public final qjn a;
    public final Context b;
    public final String c;
    public final pzd d;
    public final WorkDatabase e;
    public final qjo f;
    public final qid g;
    public final String h;
    public final qmg i;
    public final fdlt j;
    private final qcd k;
    private final qhx l;
    private final List m;

    public qfa(qep qepVar) {
        qjn qjnVar = qepVar.d;
        this.a = qjnVar;
        this.b = qepVar.f;
        String str = qjnVar.c;
        this.c = str;
        this.k = qepVar.g;
        this.i = qepVar.h;
        this.d = qepVar.a;
        this.l = qepVar.b;
        WorkDatabase workDatabase = qepVar.c;
        this.e = workDatabase;
        this.f = workDatabase.D();
        this.g = workDatabase.x();
        List list = qepVar.e;
        this.m = list;
        this.h = "Work [ id=" + str + ", tags={ " + fcva.aF(list, ",", null, null, null, 62) + " } ]";
        this.j = new fdlt(null);
    }

    public final qiw a() {
        return qkl.a(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qfa.b(fcxy):java.lang.Object");
    }

    public final void c(int i) {
        qjo qjoVar = this.f;
        qbo qboVar = qbo.a;
        String str = this.c;
        qjoVar.m(qboVar, str);
        qjoVar.h(str, System.currentTimeMillis());
        qjoVar.g(str, this.a.x);
        qjoVar.l(str, -1L);
        qjoVar.j(str, i);
    }

    public final void d() {
        qjo qjoVar = this.f;
        String str = this.c;
        qjoVar.h(str, System.currentTimeMillis());
        qjoVar.m(qbo.a, str);
        qkk qkkVar = (qkk) qjoVar;
        pex pexVar = qkkVar.a;
        pexVar.m();
        pkl pklVarD = qkkVar.g.d();
        pklVarD.g(1, str);
        try {
            pexVar.n();
            try {
                pklVarD.a();
                pexVar.q();
                qkkVar.g.f(pklVarD);
                qjoVar.g(str, this.a.x);
                pex pexVar2 = qkkVar.a;
                pexVar2.m();
                pkl pklVarD2 = qkkVar.e.d();
                pklVarD2.g(1, str);
                try {
                    pexVar2.n();
                    try {
                        pklVarD2.a();
                        pexVar2.q();
                        qkkVar.e.f(pklVarD2);
                        qjoVar.l(str, -1L);
                    } finally {
                    }
                } catch (Throwable th) {
                    qkkVar.e.f(pklVarD2);
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            qkkVar.g.f(pklVarD);
            throw th2;
        }
    }

    public final void e(qap qapVar) {
        String str = this.c;
        List listI = fcva.i(str);
        while (!listI.isEmpty()) {
            String str2 = (String) fcva.u(listI);
            qjo qjoVar = this.f;
            if (qjoVar.a(str2) != qbo.f) {
                qjoVar.m(qbo.d, str2);
            }
            listI.addAll(this.g.a(str2));
        }
        pzs pzsVar = ((qam) qapVar).a;
        pzsVar.getClass();
        qjo qjoVar2 = this.f;
        qjoVar2.g(str, this.a.x);
        qjoVar2.i(str, pzsVar);
    }
}
