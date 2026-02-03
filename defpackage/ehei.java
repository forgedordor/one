package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehei implements eheg, ehej {
    private final fcsu a;
    private final Map b;
    private final Map c;
    private final eheh d;
    private final ehff e;

    public ehei(ejwi ejwiVar, ehff ehffVar, fcsu fcsuVar, Map map, Map map2) {
        ehffVar.getClass();
        fcsuVar.getClass();
        map2.getClass();
        this.e = ehffVar;
        this.a = fcsuVar;
        this.b = map;
        this.c = map2;
        this.d = (eheh) ((ejwt) ejwiVar).a;
    }

    private final ListenableFuture h(String str, boolean z) {
        ehde ehdeVar = (ehde) this.c.get(str);
        if (ehdeVar == null) {
            Log.w("ConfigurationUpdater", "No Mendel package registered for ".concat(String.valueOf(str)));
            return eork.i(null);
        }
        int iOrdinal = ehdeVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw new fctg();
                    }
                }
            }
            return this.d.b(str, z);
        }
        return ((ehfz) this.a.b()).a(str, z);
    }

    private final ListenableFuture i(boolean z) {
        ekhx ekhxVarKeySet = ((ekgp) this.b).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : ekhxVarKeySet) {
            k();
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.e.a((String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(fcva.p(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(h((String) it2.next(), z));
        }
        return ehge.a(arrayList3);
    }

    private final ListenableFuture j(String str, efwo efwoVar) {
        ehff ehffVar = this.e;
        Map map = this.c;
        String strA = ehffVar.a(str);
        ehde ehdeVar = (ehde) map.get(strA);
        if (ehdeVar == ehde.d || ehdeVar == ehde.b) {
            return this.d.c(strA, efwoVar);
        }
        throw new IllegalStateException(a.m(ehdeVar, strA, "Package ", " was not a user package. Instead was "));
    }

    private static final void k() {
        Boolean bool = true;
        bool.getClass();
    }

    @Override // defpackage.eheg
    public final ListenableFuture a(String str) {
        str.getClass();
        Map map = this.c;
        String strA = this.e.a(str);
        ehde ehdeVar = (ehde) map.get(strA);
        if (ehdeVar == ehde.c || ehdeVar == ehde.a) {
            return ((ehfz) this.a.b()).a(strA, true);
        }
        throw new IllegalStateException(a.m(ehdeVar, strA, "Package ", " was not a device package. Instead was "));
    }

    @Override // defpackage.eheg
    public final ListenableFuture b(String str, efwo efwoVar) {
        return j(str, efwoVar);
    }

    @Override // defpackage.eheg
    public final ListenableFuture c(String str) {
        return h(this.e.a(str), true);
    }

    @Override // defpackage.eheg
    public final ListenableFuture d(efwo efwoVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((ekgp) this.b).entrySet()) {
            ehde ehdeVar = (ehde) entry.getValue();
            if (ehdeVar == ehde.d || ehdeVar == ehde.b) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            k();
            arrayList.add(obj);
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(this.e.a((String) it.next()));
        }
        ArrayList arrayList3 = new ArrayList(fcva.p(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(j((String) it2.next(), efwoVar));
        }
        return ehge.a(arrayList3);
    }

    @Override // defpackage.eheg
    public final ListenableFuture e() {
        return i(true);
    }

    @Override // defpackage.ehej
    public final ListenableFuture f(String str) {
        return h(this.e.a(str), false);
    }

    @Override // defpackage.ehej
    public final ListenableFuture g() {
        return i(false);
    }
}
