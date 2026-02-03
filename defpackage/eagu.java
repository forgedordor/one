package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eagu implements eagw {
    public final eagt a;
    private final ConcurrentMap b = new ConcurrentHashMap();

    private eagu(eagt eagtVar) {
        this.a = eagtVar;
    }

    public static eagu c() {
        return new eagu(new eags());
    }

    public static eagu d() {
        return new eagu(new eagr());
    }

    @Override // defpackage.eagw
    public final void a(eagd eagdVar) {
        this.b.put(this.a.a(eagdVar), eagdVar);
    }

    public final eagd b(Object obj) {
        if (obj != null) {
            return (eagd) this.b.get(obj);
        }
        return null;
    }
}
