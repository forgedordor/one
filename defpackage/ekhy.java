package defpackage;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekhy extends ekha {
    public final ekib a() {
        Map map = this.a;
        if (map == null) {
            return ekdz.a;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return ekdz.a;
        }
        ekgi ekgiVar = new ekgi(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            ekhx ekhxVarO = ekhx.o(((ekhv) entry.getValue()).g());
            if (!ekhxVarO.isEmpty()) {
                ekgiVar.i(key, ekhxVarO);
                size += ekhxVarO.size();
            }
        }
        return new ekib(ekgiVar.c(), size);
    }

    public final void b(Object obj, Object obj2) {
        super.l(obj, obj2);
    }

    public final void c(Map.Entry entry) {
        super.h(entry);
    }

    public final void d(Object obj, Object... objArr) {
        super.j(obj, Arrays.asList(objArr));
    }

    @Override // defpackage.ekha
    public final ekfm e(int i) {
        return ekhx.i(i);
    }

    @Override // defpackage.ekha
    public final int k(Iterable iterable) {
        if (iterable instanceof Set) {
            return Math.max(4, ((Set) iterable).size());
        }
        return 4;
    }
}
