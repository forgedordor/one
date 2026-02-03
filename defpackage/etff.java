package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etff implements etfh {
    public final etfe a;
    private final ConcurrentMap b = new ConcurrentHashMap();

    private etff(etfe etfeVar) {
        this.a = etfeVar;
    }

    public static etff c() {
        return new etff(new etfd());
    }

    static etff d() {
        return new etff(new etfc());
    }

    @Override // defpackage.etfh
    public final void a(etee eteeVar) {
        this.b.put(this.a.a(eteeVar), eteeVar);
    }

    public final etee b(Object obj) {
        if (obj != null) {
            return (etee) this.b.get(obj);
        }
        return null;
    }
}
