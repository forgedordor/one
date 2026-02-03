package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qvr {
    static final qwl a = qwl.a("k");

    static List a(qwn qwnVar, qnm qnmVar, float f, qwi qwiVar, boolean z) {
        qwn qwnVar2;
        qnm qnmVar2;
        float f2;
        qwi qwiVar2;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        if (qwnVar.q() == 6) {
            qnmVar.e("Lottie doesn't support expressions.");
            return arrayList;
        }
        qwnVar.i();
        while (qwnVar.o()) {
            if (qwnVar.c(a) != 0) {
                qwnVar.n();
            } else if (qwnVar.q() == 1) {
                qwnVar.h();
                if (qwnVar.q() != 7) {
                    while (qwnVar.o()) {
                        qwn qwnVar3 = qwnVar;
                        qnm qnmVar3 = qnmVar;
                        float f3 = f;
                        qwi qwiVar3 = qwiVar;
                        boolean z3 = z;
                        arrayList.add(qvq.a(qwnVar3, qnmVar3, f3, qwiVar3, true, z3));
                        qwnVar = qwnVar3;
                        qnmVar = qnmVar3;
                        f = f3;
                        qwiVar = qwiVar3;
                        z = z3;
                    }
                    qwnVar2 = qwnVar;
                    qnmVar2 = qnmVar;
                    f2 = f;
                    qwiVar2 = qwiVar;
                    z2 = z;
                } else {
                    qwnVar2 = qwnVar;
                    qnmVar2 = qnmVar;
                    f2 = f;
                    qwiVar2 = qwiVar;
                    z2 = z;
                    arrayList.add(qvq.a(qwnVar2, qnmVar2, f2, qwiVar2, false, z2));
                }
                qwnVar2.j();
                qwnVar = qwnVar2;
                qnmVar = qnmVar2;
                f = f2;
                qwiVar = qwiVar2;
                z = z2;
            } else {
                qwn qwnVar4 = qwnVar;
                arrayList.add(qvq.a(qwnVar4, qnmVar, f, qwiVar, false, z));
                qwnVar = qwnVar4;
            }
        }
        qwnVar.k();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            qxa qxaVar = (qxa) list.get(i2);
            i2++;
            qxa qxaVar2 = (qxa) list.get(i2);
            qxaVar.h = Float.valueOf(qxaVar2.g);
            if (qxaVar.c == null && (obj = qxaVar2.b) != null) {
                qxaVar.c = obj;
                if (qxaVar instanceof qqe) {
                    ((qqe) qxaVar).a();
                }
            }
        }
        qxa qxaVar3 = (qxa) list.get(i);
        if ((qxaVar3.b == null || qxaVar3.c == null) && list.size() > 1) {
            list.remove(qxaVar3);
        }
    }
}
