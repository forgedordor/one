package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.time.Duration;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amqn extends fcyz implements fdat {
    int a;
    final /* synthetic */ amqt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amqn(amqt amqtVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = amqtVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amqn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object next;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarB = this.b.e.b();
            eijuVarB.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ekgb ekgbVar = (ekgb) obj;
        if (ekgbVar.isEmpty()) {
            ((ekrd) amqt.a.j().h("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionSupplier$getAsync$1", "invokeSuspend", 46, "EmergencySessionSupplier.kt")).q("No recipients found for emergency session supplier");
            return fcvp.a;
        }
        ekgbVar.getClass();
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) fcva.N(ekgbVar);
        amqt amqtVar = this.b;
        ekgb ekgbVarZ = amqt.e().z();
        ekgbVarZ.getClass();
        ArrayList<bpei> arrayList = new ArrayList();
        for (Object obj2 : ekgbVarZ) {
            bpei bpeiVar = (bpei) obj2;
            Optional optionalE = resolvedRecipient.g().e();
            if (optionalE.isPresent() && bpeiVar.p().equals(((aubq) optionalE.get()).d) && bpeiVar.n().isAfter(amqtVar.b.f())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        for (bpei bpeiVar2 : arrayList) {
            bpeiVar2.getClass();
            arrayList2.add(amqk.a(bpeiVar2));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj3 : arrayList2) {
            amrb amrbVar = ((amqj) obj3).b;
            Object arrayList3 = linkedHashMap.get(amrbVar);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(amrbVar, arrayList3);
            }
            ((List) arrayList3).add(obj3);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fcwa.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), (amqj) fcva.N((List) entry.getValue()));
        }
        for (amqj amqjVar : linkedHashMap2.values()) {
            amqz amqzVar = amqtVar.d;
            amqjVar.getClass();
            Map map = amqzVar.e;
            synchronized (map) {
                Iterator it = map.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (fdbq.f((amqj) next, amqjVar)) {
                        break;
                    }
                }
                amqj amqjVar2 = (amqj) next;
                if (amqjVar2 != null) {
                    if (fdbq.f(amqjVar.a, amqjVar2.a) && amqjVar.b == amqjVar2.b && amqjVar.c == amqjVar2.c && fdbq.f(amqjVar.d, amqjVar2.d) && fdbq.f(amqjVar.e, amqjVar2.e)) {
                        ((ekrd) amqz.a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/session/EmergencySessionTimeoutTracker", "scheduleSessionTimeout", 69, "EmergencySessionTimeoutTracker.kt")).t("Skipping emergency session timeout tracking. Session is already tracked: %s", amqjVar);
                    } else {
                        fdlr fdlrVar = (fdlr) map.get(amqjVar2);
                        if (fdlrVar != null) {
                            fdlrVar.t(null);
                        }
                        map.remove(amqjVar2);
                    }
                }
                map.put(amqjVar, auvw.k(amqzVar.b, null, null, new amqy(Math.max(0L, Duration.between(((cogw) amqzVar.c.b()).f(), amqjVar.e).toMillis()), amqjVar, amqzVar, null), 3));
            }
        }
        return linkedHashMap2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amqn(this.b, fcxyVar);
    }
}
