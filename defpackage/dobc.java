package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobc {
    public static final doas a(doaz doazVar) {
        if (doazVar.c == 200) {
            return doar.a;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final doaz b(doav doavVar) {
        doaw doawVar = (doaw) doaz.a.createBuilder();
        doawVar.getClass();
        String strE = doavVar.e();
        doawVar.copyOnWrite();
        doaz doazVar = (doaz) doawVar.instance;
        doazVar.b |= 1;
        doazVar.e = strE;
        String strD = doavVar.d();
        doawVar.copyOnWrite();
        doaz doazVar2 = (doaz) doawVar.instance;
        doazVar2.b |= 2;
        doazVar2.f = strD;
        String strF = doavVar.f();
        doawVar.copyOnWrite();
        doaz doazVar3 = (doaz) doawVar.instance;
        doazVar3.b |= 4;
        doazVar3.g = strF;
        Iterable iterableC = doavVar.c();
        ArrayList arrayList = new ArrayList(fcva.p(iterableC, 10));
        Iterator it = iterableC.iterator();
        while (it.hasNext()) {
            arrayList.add(donf.a((dohq) it.next()));
        }
        donb donbVarE = donc.e(arrayList);
        doawVar.copyOnWrite();
        doaz doazVar4 = (doaz) doawVar.instance;
        doazVar4.h = donbVarE;
        doazVar4.b |= 8;
        if (doavVar.a() instanceof doar) {
            doax doaxVar = (doax) doay.a.createBuilder();
            doaxVar.getClass();
            evsn evsnVarBuild = doaxVar.build();
            evsnVarBuild.getClass();
            doawVar.copyOnWrite();
            doaz doazVar5 = (doaz) doawVar.instance;
            doazVar5.d = (doay) evsnVarBuild;
            doazVar5.c = BasePaymentResult.ERROR_REQUEST_FAILED;
        }
        evsn evsnVarBuild2 = doawVar.build();
        evsnVarBuild2.getClass();
        return (doaz) evsnVarBuild2;
    }

    public static final void c(final doba dobaVar, doaz doazVar) {
        String str = doazVar.e;
        str.getClass();
        dobaVar.d(str);
        String str2 = doazVar.f;
        str2.getClass();
        dobaVar.c(str2);
        String str3 = doazVar.g;
        str3.getClass();
        dobaVar.f(str3);
        donb donbVar = doazVar.h;
        if (donbVar == null) {
            donbVar = donb.a;
        }
        donbVar.getClass();
        fdap fdapVar = new fdap() { // from class: dobb
            /* JADX WARN: Type inference failed for: r9v0, types: [dltc, doas, java.lang.Object] */
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                dona donaVar = (dona) obj;
                donaVar.getClass();
                ?? A = dobaVar.a();
                A.getClass();
                domz domzVarB = domz.b(donaVar.c);
                if (domzVarB == null) {
                    domzVarB = domz.UNRECOGNIZED;
                }
                domzVarB.getClass();
                doin doinVarA = donc.a(domzVarB);
                String str4 = donaVar.d;
                str4.getClass();
                dohm dohmVar = (dohm) dogi.c(str4);
                String str5 = donaVar.e;
                str5.getClass();
                return new doau(doinVarA, dohmVar, str5, donaVar.g, donaVar.h, donaVar.i, A);
            }
        };
        evtg<dona> evtgVar = donbVar.b;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(evtgVar, 10));
        for (dona donaVar : evtgVar) {
            donaVar.getClass();
            arrayList.add(fdapVar.invoke(donaVar));
        }
        dobaVar.e(arrayList);
    }
}
