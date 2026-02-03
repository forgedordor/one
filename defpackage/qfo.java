package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class qfo implements Runnable {
    public final /* synthetic */ qfp a;

    public /* synthetic */ qfo(qfp qfpVar) {
        this.a = qfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qfp qfpVar = this.a;
        if (qfpVar.g != 0) {
            qas qasVarC = qas.c();
            String str = qfp.a;
            qiw qiwVar = qfpVar.d;
            Objects.toString(qiwVar);
            qasVarC.a(str, "Already started work for ".concat(qiwVar.toString()));
            return;
        }
        qfpVar.g = 1;
        qas qasVarC2 = qas.c();
        String str2 = qfp.a;
        qiw qiwVar2 = qfpVar.d;
        Objects.toString(qiwVar2);
        qasVarC2.a(str2, "onAllConstraintsMet for ".concat(qiwVar2.toString()));
        qfu qfuVar = qfpVar.e;
        if (!qfuVar.d.g(qfpVar.l, null)) {
            qfpVar.a();
            return;
        }
        qme qmeVar = qfuVar.c;
        synchronized (qmeVar.e) {
            qas.c().a(qme.a, a.l(qiwVar2, "Starting timer for "));
            qmeVar.a(qiwVar2);
            qmd qmdVar = new qmd(qmeVar, qiwVar2);
            qmeVar.c.put(qiwVar2, qmdVar);
            qmeVar.d.put(qiwVar2, qfpVar);
            qmeVar.b.b(600000L, qmdVar);
        }
    }
}
