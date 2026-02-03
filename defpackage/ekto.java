package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekto {
    private static final ektk a = new ektm();
    private static final ektj b = new ektn();

    public static ektl a(Set set) {
        ekth ekthVar = new ekth(a);
        ekthVar.f = b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ekrz ekrzVar = (ekrz) it.next();
            ekrzVar.getClass();
            if (ekrzVar.b) {
                ektj ektjVar = ekth.b;
                ekwr.a(true, "key must be repeating");
                ekthVar.c.remove(ekrzVar);
                ekthVar.d.put(ekrzVar, ektjVar);
            } else {
                Map map = ekthVar.d;
                ektk ektkVar = ekth.a;
                map.remove(ekrzVar);
                ekthVar.c.put(ekrzVar, ektkVar);
            }
        }
        return new ekti(ekthVar);
    }
}
