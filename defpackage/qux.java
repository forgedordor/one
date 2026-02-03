package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qux {
    private static final qwl a = qwl.a("k", "x", "y");

    public static qtc a(qwn qwnVar, qnm qnmVar) {
        ArrayList arrayList = new ArrayList();
        if (qwnVar.q() == 1) {
            qwnVar.h();
            while (qwnVar.o()) {
                qwn qwnVar2 = qwnVar;
                qnm qnmVar2 = qnmVar;
                arrayList.add(new qqe(qnmVar2, qvq.a(qwnVar2, qnmVar2, qwz.a(), qvv.a, qwnVar.q() == 3, false)));
                qwnVar = qwnVar2;
                qnmVar = qnmVar2;
            }
            qwnVar.j();
            qvr.b(arrayList);
        } else {
            arrayList.add(new qxa(qvp.c(qwnVar, qwz.a())));
        }
        return new qtc(arrayList);
    }

    static qtk b(qwn qwnVar, qnm qnmVar) {
        qwnVar.i();
        boolean z = false;
        qtc qtcVarA = null;
        qsz qszVarB = null;
        qsz qszVarB2 = null;
        while (qwnVar.q() != 4) {
            int iC = qwnVar.c(a);
            if (iC == 0) {
                qtcVarA = a(qwnVar, qnmVar);
            } else if (iC != 1) {
                if (iC != 2) {
                    qwnVar.m();
                    qwnVar.n();
                } else if (qwnVar.q() == 6) {
                    qwnVar.n();
                    z = true;
                } else {
                    qszVarB2 = qva.b(qwnVar, qnmVar);
                }
            } else if (qwnVar.q() == 6) {
                qwnVar.n();
                z = true;
            } else {
                qszVarB = qva.b(qwnVar, qnmVar);
            }
        }
        qwnVar.k();
        if (z) {
            qnmVar.e("Lottie doesn't support expressions.");
        }
        return qtcVarA != null ? qtcVarA : new qtg(qszVarB, qszVarB2);
    }
}
