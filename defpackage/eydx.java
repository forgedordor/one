package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eydx extends evsn implements eydy {
    public static final eydx a;
    private static volatile evuo e;
    public String b = "";
    public evtg c;
    public evtg d;
    private int f;

    static {
        eydx eydxVar = new eydx();
        a = eydxVar;
        evsn.registerDefaultInstance(eydx.class, eydxVar);
    }

    private eydx() {
        emptyBooleanList();
        emptyLongList();
        this.c = evsn.emptyProtobufList();
        this.d = emptyProtobufList();
        evqs evqsVar = evqs.b;
        emptyDoubleList();
    }

    @Override // defpackage.eydy
    public final int a() {
        return this.c.size();
    }

    @Override // defpackage.eydy
    public final String b() {
        return this.b;
    }

    @Override // defpackage.eydy
    public final List c() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eydy
    public final String d() {
        return (String) this.c.get(0);
    }

    @Override // defpackage.evsn
    protected final Object dynamicMethod(evsm evsmVar, Object obj, Object obj2) {
        evuo evsgVar;
        int iOrdinal = evsmVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(a, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0002\u0000\u0001ဈ\u0000\u0004\u001a\u0005\u001b", new Object[]{"f", "b", "c", "d", eyea.class});
        }
        if (iOrdinal == 3) {
            return new eydx();
        }
        if (iOrdinal == 4) {
            return new eydw();
        }
        if (iOrdinal == 5) {
            return a;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        evuo evuoVar = e;
        if (evuoVar != null) {
            return evuoVar;
        }
        synchronized (eydx.class) {
            evsgVar = e;
            if (evsgVar == null) {
                evsgVar = new evsg(a);
                e = evsgVar;
            }
        }
        return evsgVar;
    }
}
