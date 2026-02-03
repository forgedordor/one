package defpackage;

import j$.time.Duration;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eamc {
    public static final eatq a(euul euulVar) {
        ArrayList arrayList = new ArrayList();
        for (euuk euukVar : euulVar.b) {
            evrj evrjVar = euukVar.b;
            if (evrjVar == null) {
                evrjVar = evrj.a;
            }
            arrayList.add(new eaqm(Duration.ofSeconds(evrjVar.b, evrjVar.c), euukVar.c));
        }
        return new earo(ekgb.n(arrayList));
    }
}
