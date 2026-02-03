package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekhm {
    public static final ekho a(List list) {
        eknz eknzVar = eknz.a;
        Collections.sort(list, new ekcc(ekly.KEY, ekny.a));
        ekfw ekfwVar = new ekfw(list.size());
        ekfw ekfwVar2 = new ekfw(list.size());
        for (int i = 0; i < list.size(); i++) {
            eknz eknzVar2 = (eknz) ((Map.Entry) list.get(i)).getKey();
            if (i > 0) {
                eknz eknzVar3 = (eknz) ((Map.Entry) list.get(i - 1)).getKey();
                if (eknzVar2.j(eknzVar3) && !eknzVar2.e(eknzVar3).k()) {
                    throw new IllegalArgumentException(a.H(eknzVar2, eknzVar3, "Overlapping ranges: range ", " overlaps with entry "));
                }
            }
            ekfwVar.h(eknzVar2);
            ekfwVar2.h(((Map.Entry) list.get(i)).getValue());
        }
        return new ekho(ekfwVar.g(), ekfwVar2.g());
    }

    public static final void b(eknz eknzVar, Object obj, List list) {
        eknzVar.getClass();
        obj.getClass();
        ejwl.f(!eknzVar.k(), "Range must not be empty, but was %s", eknzVar);
        list.add(new ekfo(eknzVar, obj));
    }
}
