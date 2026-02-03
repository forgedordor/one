package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aioq {
    public final Map a;
    public final Map b;
    public final eyek c;
    private final aiol d;

    public aioq(aiol aiolVar) {
        emxt emxtVarB;
        emxt emxtVarB2;
        ellf ellfVarB;
        ellf ellfVarB2;
        aiolVar.getClass();
        this.d = aiolVar;
        fcxe fcxeVar = new fcxe();
        for (ainp ainpVar : aiolVar.e) {
            for (aink ainkVar : ainpVar.c) {
                if (ainkVar.b == 1) {
                    ellf ellfVarB3 = ellf.b(((Integer) ainkVar.c).intValue());
                    if (fcxeVar.containsKey(ellfVarB3 == null ? ellf.UNKNOWN_BUGLE_EVENT_TYPE : ellfVarB3)) {
                        if (ainkVar.b != 1 || (ellfVarB = ellf.b(((Integer) ainkVar.c).intValue())) == null) {
                            ellfVarB = ellf.UNKNOWN_BUGLE_EVENT_TYPE;
                        }
                        Objects.toString(ellfVarB);
                        throw new IllegalArgumentException("Multiple QoS tiers found for event type: ".concat(String.valueOf(ellfVarB)));
                    }
                    if (ainkVar.b != 1 || (ellfVarB2 = ellf.b(((Integer) ainkVar.c).intValue())) == null) {
                        ellfVarB2 = ellf.UNKNOWN_BUGLE_EVENT_TYPE;
                    }
                    ellfVarB2.getClass();
                    eyek eyekVarB = eyek.b(ainpVar.b);
                    eyekVarB = eyekVarB == null ? eyek.DEFAULT : eyekVarB;
                    eyekVarB.getClass();
                    fcxeVar.put(ellfVarB2, eyekVarB);
                }
            }
        }
        this.a = fcwa.b(fcxeVar);
        fcxe fcxeVar2 = new fcxe();
        for (ainp ainpVar2 : this.d.e) {
            for (aink ainkVar2 : ainpVar2.c) {
                if (ainkVar2.b == 2) {
                    emxt emxtVarB3 = emxt.b(((Integer) ainkVar2.c).intValue());
                    if (fcxeVar2.containsKey(emxtVarB3 == null ? emxt.UNKNOWN_BUGLE_EVENT_CODE : emxtVarB3)) {
                        if (ainkVar2.b != 2 || (emxtVarB = emxt.b(((Integer) ainkVar2.c).intValue())) == null) {
                            emxtVarB = emxt.UNKNOWN_BUGLE_EVENT_CODE;
                        }
                        Objects.toString(emxtVarB);
                        throw new IllegalArgumentException("Multiple QoS tiers found for event code: ".concat(String.valueOf(emxtVarB)));
                    }
                    if (ainkVar2.b != 2 || (emxtVarB2 = emxt.b(((Integer) ainkVar2.c).intValue())) == null) {
                        emxtVarB2 = emxt.UNKNOWN_BUGLE_EVENT_CODE;
                    }
                    emxtVarB2.getClass();
                    eyek eyekVarB2 = eyek.b(ainpVar2.b);
                    eyekVarB2 = eyekVarB2 == null ? eyek.DEFAULT : eyekVarB2;
                    eyekVarB2.getClass();
                    fcxeVar2.put(emxtVarB2, eyekVarB2);
                }
            }
        }
        this.b = fcwa.b(fcxeVar2);
        evtg evtgVar = this.d.e;
        evtgVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : evtgVar) {
            if (((ainp) obj).c.size() == 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            eyek eyekVarB3 = eyek.b(((ainp) it.next()).b);
            if (eyekVarB3 == null) {
                eyekVarB3 = eyek.DEFAULT;
            }
            arrayList2.add(eyekVarB3);
        }
        this.c = (eyek) ekis.m(arrayList2, eyek.DEFAULT);
    }
}
