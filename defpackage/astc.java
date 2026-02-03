package defpackage;

import android.util.LruCache;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class astc implements assu {
    private final fcsu a;

    public astc(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    @Override // defpackage.assu
    public final eiju a(aubq aubqVar) {
        return eijx.e(Optional.ofNullable((asts) ((LruCache) this.a.b()).get(aubqVar)));
    }

    @Override // defpackage.assu
    public final eiju b(Iterable iterable) {
        LruCache lruCache = (LruCache) this.a.b();
        HashMap map = new HashMap();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aubq aubqVar = (aubq) it.next();
            asts astsVar = (asts) lruCache.get(aubqVar);
            if (astsVar != null) {
                map.put(aubqVar, astsVar);
            }
        }
        return eijx.e(map);
    }

    @Override // defpackage.assu
    public final eiju c(Map map) {
        Map.EL.forEach(map, new BiConsumer() { // from class: astb
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                this.a.e((aubq) obj, (asts) obj2);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        return eijx.e(null);
    }

    @Override // defpackage.assu
    public final eiju d(aubq aubqVar, asts astsVar) {
        e(aubqVar, astsVar);
        return eijx.e(null);
    }

    public final void e(aubq aubqVar, asts astsVar) {
        fcsu fcsuVar = this.a;
        asts astsVar2 = (asts) ((LruCache) fcsuVar.b()).get(aubqVar);
        if (astsVar2 == null || astsVar2.b().compareTo(astsVar.b()) <= 0) {
            ((LruCache) fcsuVar.b()).put(aubqVar, astsVar);
        }
    }
}
