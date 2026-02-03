package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rfl {
    private static final rfh a = new rfj();
    private final Map b = new HashMap();

    public final synchronized rfi a(Object obj) {
        rfh rfhVar;
        rvi.f(obj);
        Map map = this.b;
        rfhVar = (rfh) map.get(obj.getClass());
        if (rfhVar == null) {
            Iterator it = map.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rfh rfhVar2 = (rfh) it.next();
                if (rfhVar2.b().isAssignableFrom(obj.getClass())) {
                    rfhVar = rfhVar2;
                    break;
                }
            }
        }
        if (rfhVar == null) {
            rfhVar = a;
        }
        return rfhVar.a(obj);
    }

    public final synchronized void b(rfh rfhVar) {
        this.b.put(rfhVar.b(), rfhVar);
    }
}
