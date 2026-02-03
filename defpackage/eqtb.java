package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqtb {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static ermp a(erml ermlVar) {
        ermm ermmVar = (ermm) ermp.a.createBuilder();
        int i = ermlVar.b;
        ermmVar.copyOnWrite();
        ((ermp) ermmVar.instance).b = i;
        for (ermk ermkVar : ermlVar.c) {
            ermn ermnVar = (ermn) ermo.a.createBuilder();
            erme ermeVar = ermkVar.c;
            if (ermeVar == null) {
                ermeVar = erme.a;
            }
            String str = ermeVar.b;
            ermnVar.copyOnWrite();
            ermo ermoVar = (ermo) ermnVar.instance;
            str.getClass();
            ermoVar.b = str;
            int iB = ermf.b(ermkVar.d);
            if (iB == 0) {
                iB = 1;
            }
            ermnVar.copyOnWrite();
            ((ermo) ermnVar.instance).c = ermf.a(iB);
            ermy ermyVarB = ermy.b(ermkVar.f);
            if (ermyVarB == null) {
                ermyVarB = ermy.UNRECOGNIZED;
            }
            ermnVar.copyOnWrite();
            ((ermo) ermnVar.instance).e = ermyVarB.a();
            int i2 = ermkVar.e;
            ermnVar.copyOnWrite();
            ((ermo) ermnVar.instance).d = i2;
            ermo ermoVar2 = (ermo) ermnVar.build();
            ermmVar.copyOnWrite();
            ermp ermpVar = (ermp) ermmVar.instance;
            ermoVar2.getClass();
            evtg evtgVar = ermpVar.c;
            if (!evtgVar.c()) {
                ermpVar.c = evsn.mutableCopy(evtgVar);
            }
            ermpVar.c.add(ermoVar2);
        }
        return (ermp) ermmVar.build();
    }
}
