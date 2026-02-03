package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzns extends dzfw {
    public dzns(ejwi ejwiVar, eygg eyggVar, Context context) {
        super("CrashMetric", ejwiVar, eyggVar, context);
    }

    @Override // defpackage.dzfw
    public final ekhx a(feix feixVar) {
        if ((feixVar.b & 64) == 0) {
            return ekon.a;
        }
        fehu fehuVar = feixVar.i;
        if (fehuVar == null) {
            fehuVar = fehu.a;
        }
        eoin eoinVar = fehuVar.i;
        if (eoinVar == null) {
            eoinVar = eoin.a;
        }
        ekhv ekhvVar = new ekhv();
        eoih eoihVar = eoinVar.e;
        if (eoihVar == null) {
            eoihVar = eoih.a;
        }
        ekhvVar.c(eoihVar.d);
        Iterator<E> it = eoinVar.f.iterator();
        while (it.hasNext()) {
            ekhvVar.c(((eoih) it.next()).d);
        }
        Iterator<E> it2 = (eoinVar.c == 4 ? (eoik) eoinVar.d : eoik.a).b.iterator();
        while (it2.hasNext()) {
            eoih eoihVar2 = ((eoim) it2.next()).c;
            if (eoihVar2 == null) {
                eoihVar2 = eoih.a;
            }
            ekhvVar.c(eoihVar2.d);
        }
        return ekhvVar.g();
    }
}
