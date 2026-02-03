package defpackage;

import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebau {
    /* JADX WARN: Multi-variable type inference failed */
    static int a(eayr eayrVar, ejrp ejrpVar) {
        int i = 0;
        int iC = 1;
        for (int i2 = 0; i2 < eayrVar.a().size(); i2++) {
            Integer num = (Integer) eayrVar.a().get(i2);
            int iIntValue = num.intValue();
            ejrn ejrnVar = (ejrn) ejrpVar.d.get(i2);
            int i3 = ejrnVar.c;
            if (i3 == 0) {
                ekfw ekfwVar = new ekfw();
                for (Integer num2 : ekno.a.e(DesugarCollections.unmodifiableMap(ejrnVar.b).keySet())) {
                    num2.intValue();
                    ekfwVar.h(num2);
                }
                ekgb ekgbVarG = ekfwVar.g();
                for (int i4 = 0; i4 < ((ekoe) ekgbVarG).c; i4++) {
                    if (iIntValue == ((Integer) ekgbVarG.get(i4)).intValue()) {
                        iIntValue = i4;
                    }
                }
                throw new ebas(String.format("event_code %s was not found in the dimension's event codes", num));
            }
            if (iIntValue > i3) {
                throw new ebas(String.format("event_code %s is larger than max_event_code %s", num, Integer.valueOf(ejrnVar.c)));
            }
            i += iIntValue * iC;
            iC *= c(ejrnVar);
        }
        return i;
    }

    static int b(List list) {
        Iterator it = list.iterator();
        int iC = 1;
        while (it.hasNext()) {
            iC *= c((ejrn) it.next());
        }
        return iC;
    }

    private static int c(ejrn ejrnVar) {
        int i = ejrnVar.c;
        return i != 0 ? i + 1 : ejrnVar.b.size();
    }
}
