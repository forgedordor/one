package defpackage;

import io.grpc.Status;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drdt {
    public static void a(ekgp ekgpVar) {
        HashSet hashSet = new HashSet();
        ekfe ekfeVar = new ekfe();
        ekqg ekqgVarListIterator = ekgpVar.keySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            ewut ewutVar = (ewut) ekqgVarListIterator.next();
            drdm drdmVar = (drdm) ekgpVar.get(ewutVar);
            if (drdmVar != null) {
                if (drdmVar.b().isEmpty()) {
                    hashSet.add(ewutVar);
                } else {
                    ekgb ekgbVarB = drdmVar.b();
                    int i = ((ekoe) ekgbVarB).c;
                    for (int i2 = 0; i2 < i; i2++) {
                        ekfeVar.t((Throwable) ekgbVarB.get(i2), ewutVar);
                    }
                }
            }
        }
        for (Throwable th : ekfeVar.x()) {
            ekfeVar.c(th);
            if (th instanceof fbtf) {
                ((fbtf) th).a.getCode();
            }
        }
        Status.Code code = Status.Code.OK;
    }
}
