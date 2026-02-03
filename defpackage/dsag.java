package defpackage;

import j$.time.Duration;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsag {
    public static final Duration a(ethr ethrVar, etjv etjvVar) {
        Object next;
        ethrVar.getClass();
        etjvVar.getClass();
        evtg evtgVar = ethrVar.c;
        evtgVar.getClass();
        Iterator<E> it = evtgVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            etjv etjvVarB = etjv.b(((ethp) next).c);
            if (etjvVarB == null) {
                etjvVarB = etjv.UNRECOGNIZED;
            }
            if (etjvVarB.equals(etjvVar)) {
                break;
            }
        }
        ethp ethpVar = (ethp) next;
        if (ethpVar != null) {
            evrj evrjVar = ethpVar.d;
            if (evrjVar == null) {
                evrjVar = evrj.a;
            }
            if (evrjVar != null) {
                return evxd.c(evrjVar);
            }
        }
        evrj evrjVar2 = ethrVar.d;
        if (evrjVar2 == null) {
            evrjVar2 = evrj.a;
        }
        if (evwy.a(evrjVar2, evwy.a) <= 0) {
            return null;
        }
        evrj evrjVar3 = ethrVar.d;
        if (evrjVar3 == null) {
            evrjVar3 = evrj.a;
        }
        evrjVar3.getClass();
        return evxd.c(evrjVar3);
    }
}
